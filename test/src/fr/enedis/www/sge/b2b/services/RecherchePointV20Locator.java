/**
 * RecherchePointV20Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.services;

public class RecherchePointV20Locator extends org.apache.axis.client.Service implements fr.enedis.www.sge.b2b.services.RecherchePointV20 {

    public RecherchePointV20Locator() {
    }


    public RecherchePointV20Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RecherchePointV20Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RecherchePointPort
    private java.lang.String RecherchePointPort_address = "https://sge-homologation-b2b.enedis.fr/RecherchePoint/v2.0";

    public java.lang.String getRecherchePointPortAddress() {
        return RecherchePointPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RecherchePointPortWSDDServiceName = "RecherchePointPort";

    public java.lang.String getRecherchePointPortWSDDServiceName() {
        return RecherchePointPortWSDDServiceName;
    }

    public void setRecherchePointPortWSDDServiceName(java.lang.String name) {
        RecherchePointPortWSDDServiceName = name;
    }

    public fr.enedis.www.sge.b2b.services.RecherchePointPortType getRecherchePointPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RecherchePointPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRecherchePointPort(endpoint);
    }

    public fr.enedis.www.sge.b2b.services.RecherchePointPortType getRecherchePointPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.enedis.www.sge.b2b.services.RecherchePointBindingStub _stub = new fr.enedis.www.sge.b2b.services.RecherchePointBindingStub(portAddress, this);
            _stub.setPortName(getRecherchePointPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRecherchePointPortEndpointAddress(java.lang.String address) {
        RecherchePointPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.enedis.www.sge.b2b.services.RecherchePointPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.enedis.www.sge.b2b.services.RecherchePointBindingStub _stub = new fr.enedis.www.sge.b2b.services.RecherchePointBindingStub(new java.net.URL(RecherchePointPort_address), this);
                _stub.setPortName(getRecherchePointPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RecherchePointPort".equals(inputPortName)) {
            return getRecherchePointPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services", "RecherchePointV2.0");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services", "RecherchePointPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RecherchePointPort".equals(portName)) {
            setRecherchePointPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
