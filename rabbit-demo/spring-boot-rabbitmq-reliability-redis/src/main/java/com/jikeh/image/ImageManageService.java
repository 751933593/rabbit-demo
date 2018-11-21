package com.jikeh.image;

import java.lang.Exception;

public interface ImageManageService extends java.rmi.Remote {
    public CaseImageExt getImageInfo(String id, String customerNo, String companyNo, String caseNo) throws java.rmi.RemoteException, java.lang.Exception;
    public byte[] getImage(String id, String customerNo, String companyNo, String caseNo) throws java.rmi.RemoteException, java.lang.Exception;
    public String getImageList(String customerNo, String companyNo, String caseNo, String cutTag) throws java.rmi.RemoteException, Exception;
}
