package com.jikeh.util;

import com.jikeh.image.*;
import com.jikeh.model.CaseInfo;

import javax.xml.rpc.ServiceException;
import java.io.File;
import java.io.IOException;
import java.lang.Exception;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

public class Test{

    private final String IMG_NAME = "影像名";

    /**
     *
     * @param path
     * @param caseInfo
     * @param parameterImageUrl
     * @return
     * 文件地址，案件号，接口地址
     * 测试接口地址image.url=http://192.168.160.184/GM-SCP-Image/imageManageService?wsdl
     */
    public int img(String path, CaseInfo caseInfo, String parameterImageUrl) {
        int t = 0;
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.mkdirs(); // 创建文件夹
            }
            // ImageManageServiceImplService为接口；ImageManageServiceImplServiceLocator为接口实现类
            ImageManageServiceImplService webservice = new ImageManageServiceImplServiceLocator();
            // 设置要使用的接口服务地址:多用于动态调用不同服务 器上的接口

            URL portAddress = new URL(parameterImageUrl);

            ImageManageService client = webservice.getImageManageServiceImplPort(portAddress);
            // 通过赔案号获取影像ID的xml报文信息
            String imageXml = client.getImageList("4", "50", caseInfo.getCaseNo(), "0");
            List<String> imageList = ImageListUtil
                    .getImageXmlListFromImageListXml(imageXml);
            for (String s : imageList) {
                String imageImageId = ImageListUtil.getImageIdFromImageXml(s);
                // 获取影像信息
                byte[] byt = client.getImage(imageImageId + "", "1", "1", IMG_NAME);

                t = 1;
                ImgErToFileUtil.saveToImgByByte(byt, path, imageImageId+ ".jpg");
            }

        } catch (Exception e) {
            return t;
        }
        return t;
    }

}
