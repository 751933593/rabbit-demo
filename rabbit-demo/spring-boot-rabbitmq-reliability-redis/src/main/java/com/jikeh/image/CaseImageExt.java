/**
 * CaseImageExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jikeh.image;

public class CaseImageExt  extends CaseImage  implements java.io.Serializable {
    private byte[] imageData;

    public CaseImageExt() {
    }

    public CaseImageExt(
           String fileId,
           String imageName,
           String imageExtend,
           String finishDate,
           String imageType,
           String fileCutType,
           String fileMarkType,
           String imageFlag,
           byte[] imageData) {
        super(
            fileId,
            imageName,
            imageExtend,
            finishDate,
            imageType,
            fileCutType,
            fileMarkType,
            imageFlag);
        this.imageData = imageData;
    }


    /**
     * Gets the imageData value for this CaseImageExt.
     * 
     * @return imageData
     */
    public byte[] getImageData() {
        return imageData;
    }


    /**
     * Sets the imageData value for this CaseImageExt.
     * 
     * @param imageData
     */
    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CaseImageExt)) return false;
        CaseImageExt other = (CaseImageExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.imageData==null && other.getImageData()==null) || 
             (this.imageData!=null &&
              java.util.Arrays.equals(this.imageData, other.getImageData())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getImageData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getImageData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseImageExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.scp.gm.com/", "caseImageExt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
