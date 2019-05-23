/**
 * InfoDemandeurType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.technique.v1_0;

public class InfoDemandeurType  implements java.io.Serializable {
    private java.lang.String loginDemandeur;

    private java.lang.String appelDemandeurId;

    private java.lang.String referenceDemandeur;

    private java.lang.String referenceDemandeurGroupee;

    public InfoDemandeurType() {
    }

    public InfoDemandeurType(
           java.lang.String loginDemandeur,
           java.lang.String appelDemandeurId,
           java.lang.String referenceDemandeur,
           java.lang.String referenceDemandeurGroupee) {
           this.loginDemandeur = loginDemandeur;
           this.appelDemandeurId = appelDemandeurId;
           this.referenceDemandeur = referenceDemandeur;
           this.referenceDemandeurGroupee = referenceDemandeurGroupee;
    }


    /**
     * Gets the loginDemandeur value for this InfoDemandeurType.
     * 
     * @return loginDemandeur
     */
    public java.lang.String getLoginDemandeur() {
        return loginDemandeur;
    }


    /**
     * Sets the loginDemandeur value for this InfoDemandeurType.
     * 
     * @param loginDemandeur
     */
    public void setLoginDemandeur(java.lang.String loginDemandeur) {
        this.loginDemandeur = loginDemandeur;
    }


    /**
     * Gets the appelDemandeurId value for this InfoDemandeurType.
     * 
     * @return appelDemandeurId
     */
    public java.lang.String getAppelDemandeurId() {
        return appelDemandeurId;
    }


    /**
     * Sets the appelDemandeurId value for this InfoDemandeurType.
     * 
     * @param appelDemandeurId
     */
    public void setAppelDemandeurId(java.lang.String appelDemandeurId) {
        this.appelDemandeurId = appelDemandeurId;
    }


    /**
     * Gets the referenceDemandeur value for this InfoDemandeurType.
     * 
     * @return referenceDemandeur
     */
    public java.lang.String getReferenceDemandeur() {
        return referenceDemandeur;
    }


    /**
     * Sets the referenceDemandeur value for this InfoDemandeurType.
     * 
     * @param referenceDemandeur
     */
    public void setReferenceDemandeur(java.lang.String referenceDemandeur) {
        this.referenceDemandeur = referenceDemandeur;
    }


    /**
     * Gets the referenceDemandeurGroupee value for this InfoDemandeurType.
     * 
     * @return referenceDemandeurGroupee
     */
    public java.lang.String getReferenceDemandeurGroupee() {
        return referenceDemandeurGroupee;
    }


    /**
     * Sets the referenceDemandeurGroupee value for this InfoDemandeurType.
     * 
     * @param referenceDemandeurGroupee
     */
    public void setReferenceDemandeurGroupee(java.lang.String referenceDemandeurGroupee) {
        this.referenceDemandeurGroupee = referenceDemandeurGroupee;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoDemandeurType)) return false;
        InfoDemandeurType other = (InfoDemandeurType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginDemandeur==null && other.getLoginDemandeur()==null) || 
             (this.loginDemandeur!=null &&
              this.loginDemandeur.equals(other.getLoginDemandeur()))) &&
            ((this.appelDemandeurId==null && other.getAppelDemandeurId()==null) || 
             (this.appelDemandeurId!=null &&
              this.appelDemandeurId.equals(other.getAppelDemandeurId()))) &&
            ((this.referenceDemandeur==null && other.getReferenceDemandeur()==null) || 
             (this.referenceDemandeur!=null &&
              this.referenceDemandeur.equals(other.getReferenceDemandeur()))) &&
            ((this.referenceDemandeurGroupee==null && other.getReferenceDemandeurGroupee()==null) || 
             (this.referenceDemandeurGroupee!=null &&
              this.referenceDemandeurGroupee.equals(other.getReferenceDemandeurGroupee())));
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
        if (getLoginDemandeur() != null) {
            _hashCode += getLoginDemandeur().hashCode();
        }
        if (getAppelDemandeurId() != null) {
            _hashCode += getAppelDemandeurId().hashCode();
        }
        if (getReferenceDemandeur() != null) {
            _hashCode += getReferenceDemandeur().hashCode();
        }
        if (getReferenceDemandeurGroupee() != null) {
            _hashCode += getReferenceDemandeurGroupee().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoDemandeurType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "InfoDemandeurType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginDemandeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginDemandeur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appelDemandeurId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appelDemandeurId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceDemandeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceDemandeur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceDemandeurGroupee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceDemandeurGroupee"));
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

}
