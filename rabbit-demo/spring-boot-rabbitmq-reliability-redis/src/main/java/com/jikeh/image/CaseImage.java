/**
 * CaseImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jikeh.image;

public class CaseImage  implements java.io.Serializable {
    private String fileId;

    private String imageName;

    private String imageExtend;

    private String finishDate;

    private String imageType;

    private String fileCutType;

    private String fileMarkType;

    private String imageFlag;

    public CaseImage() {
    }

    public CaseImage(
           String fileId,
           String imageName,
           String imageExtend,
           String finishDate,
           String imageType,
           String fileCutType,
           String fileMarkType,
           String imageFlag) {
           this.fileId = fileId;
           this.imageName = imageName;
           this.imageExtend = imageExtend;
           this.finishDate = finishDate;
           this.imageType = imageType;
           this.fileCutType = fileCutType;
           this.fileMarkType = fileMarkType;
           this.imageFlag = imageFlag;
    }


    /**
     * Gets the fileId value for this CaseImage.
     * 
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }


    /**
     * Sets the fileId value for this CaseImage.
     * 
     * @param fileId
     */
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }


    /**
     * Gets the imageName value for this CaseImage.
     * 
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }


    /**
     * Sets the imageName value for this CaseImage.
     * 
     * @param imageName
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }


    /**
     * Gets the imageExtend value for this CaseImage.
     * 
     * @return imageExtend
     */
    public String getImageExtend() {
        return imageExtend;
    }


    /**
     * Sets the imageExtend value for this CaseImage.
     * 
     * @param imageExtend
     */
    public void setImageExtend(String imageExtend) {
        this.imageExtend = imageExtend;
    }


    /**
     * Gets the finishDate value for this CaseImage.
     * 
     * @return finishDate
     */
    public String getFinishDate() {
        return finishDate;
    }


    /**
     * Sets the finishDate value for this CaseImage.
     * 
     * @param finishDate
     */
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }


    /**
     * Gets the imageType value for this CaseImage.
     * 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this CaseImage.
     * 
     * @param imageType
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the fileCutType value for this CaseImage.
     * 
     * @return fileCutType
     */
    public String getFileCutType() {
        return fileCutType;
    }


    /**
     * Sets the fileCutType value for this CaseImage.
     * 
     * @param fileCutType
     */
    public void setFileCutType(String fileCutType) {
        this.fileCutType = fileCutType;
    }


    /**
     * Gets the fileMarkType value for this CaseImage.
     * 
     * @return fileMarkType
     */
    public String getFileMarkType() {
        return fileMarkType;
    }


    /**
     * Sets the fileMarkType value for this CaseImage.
     * 
     * @param fileMarkType
     */
    public void setFileMarkType(String fileMarkType) {
        this.fileMarkType = fileMarkType;
    }


    /**
     * Gets the imageFlag value for this CaseImage.
     * 
     * @return imageFlag
     */
    public String getImageFlag() {
        return imageFlag;
    }


    /**
     * Sets the imageFlag value for this CaseImage.
     * 
     * @param imageFlag
     */
    public void setImageFlag(String imageFlag) {
        this.imageFlag = imageFlag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CaseImage)) return false;
        CaseImage other = (CaseImage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fileId==null && other.getFileId()==null) || 
             (this.fileId!=null &&
              this.fileId.equals(other.getFileId()))) &&
            ((this.imageName==null && other.getImageName()==null) || 
             (this.imageName!=null &&
              this.imageName.equals(other.getImageName()))) &&
            ((this.imageExtend==null && other.getImageExtend()==null) || 
             (this.imageExtend!=null &&
              this.imageExtend.equals(other.getImageExtend()))) &&
            ((this.finishDate==null && other.getFinishDate()==null) || 
             (this.finishDate!=null &&
              this.finishDate.equals(other.getFinishDate()))) &&
            ((this.imageType==null && other.getImageType()==null) || 
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.fileCutType==null && other.getFileCutType()==null) || 
             (this.fileCutType!=null &&
              this.fileCutType.equals(other.getFileCutType()))) &&
            ((this.fileMarkType==null && other.getFileMarkType()==null) || 
             (this.fileMarkType!=null &&
              this.fileMarkType.equals(other.getFileMarkType()))) &&
            ((this.imageFlag==null && other.getImageFlag()==null) || 
             (this.imageFlag!=null &&
              this.imageFlag.equals(other.getImageFlag())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFileId() != null) {
            _hashCode += getFileId().hashCode();
        }
        if (getImageName() != null) {
            _hashCode += getImageName().hashCode();
        }
        if (getImageExtend() != null) {
            _hashCode += getImageExtend().hashCode();
        }
        if (getFinishDate() != null) {
            _hashCode += getFinishDate().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getFileCutType() != null) {
            _hashCode += getFileCutType().hashCode();
        }
        if (getFileMarkType() != null) {
            _hashCode += getFileMarkType().hashCode();
        }
        if (getImageFlag() != null) {
            _hashCode += getImageFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CaseImage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.scp.gm.com/", "caseImage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageExtend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageExtend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finishDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finishDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileCutType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileCutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileMarkType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileMarkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imageFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
