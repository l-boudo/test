/**
 * RecherchePointPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.services;

public interface RecherchePointPortType extends java.rmi.Remote {
    public fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.PointType[] rechercherPoint(fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.CriteresType criteres, fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.UtilisateurLoginType loginUtilisateur) throws java.rmi.RemoteException, fr.enedis.www.sge.b2b.technique.v1_0.ErreurType;
}
