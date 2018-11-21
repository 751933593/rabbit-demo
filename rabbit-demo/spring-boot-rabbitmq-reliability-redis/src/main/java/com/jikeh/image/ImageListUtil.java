package com.jikeh.image;
import com.ximpleware.XPathParseException;
import com.ximpleware.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.ximpleware.AutoPilot;
import com.ximpleware.EOFException;
import com.ximpleware.EncodingException;
import com.ximpleware.EntityException;
import com.ximpleware.FastLongBuffer;
import com.ximpleware.NavException;
import com.ximpleware.VTDGen;
import com.ximpleware.VTDNav;
import com.ximpleware.XPathEvalException;

import jodd.jerry.Jerry;
import jodd.jerry.JerryFunction;
import jodd.lagarto.dom.LagartoDOMBuilder;

/**
 * 影像列表工具
 * 
 * @author yockii
 *
 */
public class ImageListUtil {
	public static final int PAGE_SIZE = 4;
	public static final String XPAHT_IMAGETYPE_FROM_FILECUTTYPE = "/IMAGE/FILECUTTYPE";
	public static final String XPAHT_IMAGETYPE_FROM_IMAGEXML = "/IMAGE/IMAGETYPE";
	public static final String XPAHT_IMAGEID_FROM_IMAGEXML = "/IMAGE/FILEID";
	public static final String XPAHT_IMAGENAME_FROM_IMAGEXML = "/IMAGE/FILENAME";
	public static final String XPAHT_IMAGE = "/IMAGELIST/IMAGES/IMAGE";
	
	
	public static String getFileCutType(String imageXml){
		Jerry.JerryParser jp = Jerry.jerry();
		((LagartoDOMBuilder)jp.getDOMBuilder()).enableXmlMode();
		Jerry doc = jp.parse(imageXml);
		Jerry j = doc.$("FILECUTTYPE");
		String fileCutType = j.text();
		return fileCutType == null ? "" : fileCutType;
	}

	public static String getImageType(String imageXml){
		Jerry.JerryParser jp = Jerry.jerry();
		((LagartoDOMBuilder)jp.getDOMBuilder()).enableXmlMode();
		Jerry doc = jp.parse(imageXml);
		Jerry j = doc.$("IMAGETYPE");
		String imageType = j.text();
		return imageType == null ? "" : imageType;
	}
	
	public static String getImageType1(String imageXml) throws EncodingException, EOFException,
			EntityException, ParseException, XPathParseException {
		VTDGen vg = new VTDGen();
		vg.setDoc(imageXml.getBytes());
		vg.parse(false);
		VTDNav vn = vg.getNav();
		AutoPilot ap = new AutoPilot(vn);
		ap.selectXPath(XPAHT_IMAGETYPE_FROM_IMAGEXML);
		return ap.evalXPathToString();
	}

	public static String getImageIdFromImageXml(String imageXml){
		Jerry.JerryParser jp = Jerry.jerry();
		((LagartoDOMBuilder)jp.getDOMBuilder()).enableXmlMode();
		Jerry doc = jp.parse(imageXml);
		Jerry j = doc.$("FILEID");
		String imageId = j.text();
		return imageId == null ? "" : imageId;
	}
	
	public static String getImageIdFromImageXml1(String imageXml) throws EncodingException, EOFException,
			EntityException, ParseException, XPathParseException {
		VTDGen vg = new VTDGen();
		vg.setDoc(imageXml.getBytes());
		vg.parse(false);
		VTDNav vn = vg.getNav();
		AutoPilot ap = new AutoPilot(vn);
		ap.selectXPath(XPAHT_IMAGEID_FROM_IMAGEXML);
		return ap.evalXPathToString();
	}

	public static List<String> getImageXmlListFromImageListXml(String imageListXml){
		Jerry.JerryParser jp = Jerry.jerry();
		((LagartoDOMBuilder)jp.getDOMBuilder()).enableXmlMode();
		Jerry doc = jp.parse(imageListXml);
		final List<String> r = new ArrayList<String>();
		doc.$("IMAGE").each(new JerryFunction() {
			public Boolean onNode(Jerry $this, int index) {
				r.add($this.htmlAll(true));
				return true;
			}
		});
		return r;
	}
	
	public static List<String> getImageXmlListFromImageListXml1(String imageListXml) throws EncodingException,
			EOFException, EntityException, ParseException, XPathParseException, XPathEvalException,
			NavException {
		VTDGen vg = new VTDGen();
		byte[] bs = imageListXml.getBytes();
		vg.setDoc(bs);
		vg.parse(false);
		VTDNav vn = vg.getNav();
		AutoPilot ap = new AutoPilot(vn);
		ap.selectXPath(XPAHT_IMAGE);

		List<String> r = new ArrayList<String>();
		while (ap.evalXPath() != -1) {
			StringBuffer bf = new StringBuffer();
			FastLongBuffer flb = new FastLongBuffer(PAGE_SIZE);
			flb.append(vn.getElementFragment());
			int size = flb.size();
			if (size > 0) {
				for (int i = 0; i < size; i++) {
					bf.append(new String(bs, flb.lower32At(i), flb.upper32At(i)));
				}
			}
			r.add(bf.toString());
		}
		return r;
	}

	public static String getImageNameFromImageXml(String imageXml){
		Jerry.JerryParser jp = Jerry.jerry();
		((LagartoDOMBuilder)jp.getDOMBuilder()).enableXmlMode();
		Jerry doc = jp.parse(imageXml);
		Jerry j = doc.$("FILENAME");
		String imageName = j.text();
		return imageName == null ? "" : imageName;
	}
	
	public static String getImageNameFromImageXml1(String imageXml) throws EncodingException, EOFException,
			EntityException, ParseException, XPathParseException {
		VTDGen vg = new VTDGen();
		vg.setDoc(imageXml.getBytes());
		vg.parse(false);
		VTDNav vn = vg.getNav();
		AutoPilot ap = new AutoPilot(vn);
		ap.selectXPath(XPAHT_IMAGENAME_FROM_IMAGEXML);
		return ap.evalXPathToString();
	}

	public static void main(String[] args) {
		String imageListXml = "<?XML VERSION=\"1.0\" ENCODING=\"UTF-8\"?><IMAGELIST>  <CUSTOMERNO>22</CUSTOMERNO>  <BRANCHNO>22</BRANCHNO>  <BUSINESSNO>1</BUSINESSNO>  <CASENO>22220112011510300010001</CASENO>  <IMAGES>    <IMAGE>      <FILEID>1140</FILEID>      <IMAGETYPE>1</IMAGETYPE>      <IMAGESORT>0</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1141</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>1</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1142</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>2</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1143</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>3</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1144</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>4</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1145</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>5</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1146</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>6</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1147</FILEID>      <IMAGETYPE>2</IMAGETYPE>      <IMAGESORT>7</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1148</FILEID>      <IMAGETYPE>3</IMAGETYPE>      <IMAGESORT>8</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1149</FILEID>      <IMAGETYPE>3</IMAGETYPE>      <IMAGESORT>9</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1150</FILEID>      <IMAGETYPE>3</IMAGETYPE>      <IMAGESORT>10</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1151</FILEID>      <IMAGETYPE>3</IMAGETYPE>      <IMAGESORT>11</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1152</FILEID>      <IMAGETYPE>4</IMAGETYPE>      <IMAGESORT>12</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1153</FILEID>      <IMAGETYPE>4</IMAGETYPE>      <IMAGESORT>13</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1154</FILEID>      <IMAGETYPE>4</IMAGETYPE>      <IMAGESORT>14</IMAGESORT>    </IMAGE>    <IMAGE>      <FILEID>1155</FILEID>      <IMAGETYPE>4</IMAGETYPE>      <IMAGESORT>15</IMAGESORT>    </IMAGE>  </IMAGES></IMAGELIST>";
		List<String> imageList = getImageXmlListFromImageListXml(imageListXml);
		String imageType = getImageType(imageList.get(0));
		String imageImageId = getImageIdFromImageXml(imageList.get(0));
		String fileCutType = getFileCutType("[<IMAGE><FILEID>1078595</FILEID><FILENAME>002016012113465384000</FILENAME><EXTNAME>jpg</EXTNAME><IMAGETYPE>1</IMAGETYPE><FILECUTTYPE>0</FILECUTTYPE></IMAGE>]");
		System.out.println(fileCutType);
		System.out.println(imageType);
		System.out.println(imageImageId);
	}
}
