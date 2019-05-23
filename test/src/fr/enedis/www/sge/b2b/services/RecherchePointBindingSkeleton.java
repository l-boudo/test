/**
 * RecherchePointBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.services;

public class RecherchePointBindingSkeleton implements fr.enedis.www.sge.b2b.services.RecherchePointPortType, org.apache.axis.wsdl.Skeleton {
    private fr.enedis.www.sge.b2b.services.RecherchePointPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteres"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "CriteresType"), fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.CriteresType.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "loginUtilisateur"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "UtilisateurLoginType"), fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.UtilisateurLoginType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rechercherPoint", _params, new javax.xml.namespace.QName("", "points"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "PointsType"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "rechercherPoint"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rechercherPoint") == null) {
            _myOperations.put("rechercherPoint", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rechercherPoint")).add(_oper);
        _fault = new org.apache.axis.description.FaultDesc();
        _fault.setName("erreur");
        _fault.setQName(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "erreur"));
        _fault.setClassName("fr.enedis.www.sge.b2b.technique.v1_0.ErreurType");
        _fault.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "ErreurType"));
        _oper.addFault(_fault);
    }

    public RecherchePointBindingSkeleton() {
        this.impl = new fr.enedis.www.sge.b2b.services.RecherchePointBindingImpl();
    }

    public RecherchePointBindingSkeleton(fr.enedis.www.sge.b2b.services.RecherchePointPortType impl) {
        this.impl = impl;
    }
    public fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.PointType[] rechercherPoint(fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.CriteresType criteres, fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.UtilisateurLoginType loginUtilisateur) throws java.rmi.RemoteException, fr.enedis.www.sge.b2b.technique.v1_0.ErreurType
    {
        fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.PointType[] ret = impl.rechercherPoint(criteres, loginUtilisateur);
        return ret;
    }

}
