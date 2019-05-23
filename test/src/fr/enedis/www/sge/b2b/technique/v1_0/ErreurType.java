/**
 * ErreurType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.technique.v1_0;

public class ErreurType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private fr.enedis.www.sge.b2b.technique.v1_0.ResultatType resultat;

    private fr.enedis.www.sge.b2b.technique.v1_0.InfoFonctionnellesType infoFonctionnelles;

    private fr.enedis.www.sge.b2b.technique.v1_0.InfoDemandeurType infoDemandeur;

    private java.lang.String commentaire;

    public ErreurType() {
    }

    public ErreurType(
           fr.enedis.www.sge.b2b.technique.v1_0.ResultatType resultat,
           fr.enedis.www.sge.b2b.technique.v1_0.InfoFonctionnellesType infoFonctionnelles,
           fr.enedis.www.sge.b2b.technique.v1_0.InfoDemandeurType infoDemandeur,
           java.lang.String commentaire) {
        this.resultat = resultat;
        this.infoFonctionnelles = infoFonctionnelles;
        this.infoDemandeur = infoDemandeur;
        this.commentaire = commentaire;
    }


    /**
     * Gets the resultat value for this ErreurType.
     * 
     * @return resultat
     */
    public fr.enedis.www.sge.b2b.technique.v1_0.ResultatType getResultat() {
        return resultat;
    }


    /**
     * Sets the resultat value for this ErreurType.
     * 
     * @param resultat
     */
    public void setResultat(fr.enedis.www.sge.b2b.technique.v1_0.ResultatType resultat) {
        this.resultat = resultat;
    }


    /**
     * Gets the infoFonctionnelles value for this ErreurType.
     * 
     * @return infoFonctionnelles
     */
    public fr.enedis.www.sge.b2b.technique.v1_0.InfoFonctionnellesType getInfoFonctionnelles() {
        return infoFonctionnelles;
    }


    /**
     * Sets the infoFonctionnelles value for this ErreurType.
     * 
     * @param infoFonctionnelles
     */
    public void setInfoFonctionnelles(fr.enedis.www.sge.b2b.technique.v1_0.InfoFonctionnellesType infoFonctionnelles) {
        this.infoFonctionnelles = infoFonctionnelles;
    }


    /**
     * Gets the infoDemandeur value for this ErreurType.
     * 
     * @return infoDemandeur
     */
    public fr.enedis.www.sge.b2b.technique.v1_0.InfoDemandeurType getInfoDemandeur() {
        return infoDemandeur;
    }


    /**
     * Sets the infoDemandeur value for this ErreurType.
     * 
     * @param infoDemandeur
     */
    public void setInfoDemandeur(fr.enedis.www.sge.b2b.technique.v1_0.InfoDemandeurType infoDemandeur) {
        this.infoDemandeur = infoDemandeur;
    }


    /**
     * Gets the commentaire value for this ErreurType.
     * 
     * @return commentaire
     */
    public java.lang.String getCommentaire() {
        return commentaire;
    }


    /**
     * Sets the commentaire value for this ErreurType.
     * 
     * @param commentaire
     */
    public void setCommentaire(java.lang.String commentaire) {
        this.commentaire = commentaire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErreurType)) return false;
        ErreurType other = (ErreurType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultat==null && other.getResultat()==null) || 
             (this.resultat!=null &&
              this.resultat.equals(other.getResultat()))) &&
            ((this.infoFonctionnelles==null && other.getInfoFonctionnelles()==null) || 
             (this.infoFonctionnelles!=null &&
              this.infoFonctionnelles.equals(other.getInfoFonctionnelles()))) &&
            ((this.infoDemandeur==null && other.getInfoDemandeur()==null) || 
             (this.infoDemandeur!=null &&
              this.infoDemandeur.equals(other.getInfoDemandeur()))) &&
            ((this.commentaire==null && other.getCommentaire()==null) || 
             (this.commentaire!=null &&
              this.commentaire.equals(other.getCommentaire())));
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
        if (getResultat() != null) {
            _hashCode += getResultat().hashCode();
        }
        if (getInfoFonctionnelles() != null) {
            _hashCode += getInfoFonctionnelles().hashCode();
        }
        if (getInfoDemandeur() != null) {
            _hashCode += getInfoDemandeur().hashCode();
        }
        if (getCommentaire() != null) {
            _hashCode += getCommentaire().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErreurType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "ErreurType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "ResultatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoFonctionnelles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoFonctionnelles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "InfoFonctionnellesType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoDemandeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infoDemandeur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "InfoDemandeurType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentaire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentaire"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
