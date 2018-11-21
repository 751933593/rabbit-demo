/**
 * ImageManageServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jikeh.image;

public class ImageManageServiceImplServiceLocator extends org.apache.axis.client.Service implements  ImageManageServiceImplService {

    public ImageManageServiceImplServiceLocator() {
    }


    public ImageManageServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImageManageServiceImplServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImageManageServiceImplPort
    private String ImageManageServiceImplPort_address = "http://192.168.160.134:80/GM-SCP-Image/imageManageService";

    public String getImageManageServiceImplPortAddress() {
        return ImageManageServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String ImageManageServiceImplPortWSDDServiceName = "ImageManageServiceImplPort";

    public String getImageManageServiceImplPortWSDDServiceName() {
        return ImageManageServiceImplPortWSDDServiceName;
    }

    public void setImageManageServiceImplPortWSDDServiceName(String name) {
        ImageManageServiceImplPortWSDDServiceName = name;
    }

    public  ImageManageService getImageManageServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImageManageServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImageManageServiceImplPort(endpoint);
    }

    public  ImageManageService getImageManageServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
             ImageManageServiceImplServiceSoapBindingStub _stub = new  ImageManageServiceImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getImageManageServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImageManageServiceImplPortEndpointAddress(String address) {
        ImageManageServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ImageManageService.class.isAssignableFrom(serviceEndpointInterface)) {
                ImageManageServiceImplServiceSoapBindingStub _stub = new  ImageManageServiceImplServiceSoapBindingStub(new java.net.URL(ImageManageServiceImplPort_address), this);
                _stub.setPortName(getImageManageServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ImageManageServiceImplPort".equals(inputPortName)) {
            return getImageManageServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.webservice.scp.gm.com/", "ImageManageServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.webservice.scp.gm.com/", "ImageManageServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("ImageManageServiceImplPort".equals(portName)) {
            setImageManageServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
