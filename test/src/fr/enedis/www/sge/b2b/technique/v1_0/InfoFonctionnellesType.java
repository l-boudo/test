/**
 * InfoFonctionnellesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.technique.v1_0;

public class InfoFonctionnellesType  implements java.io.Serializable {
    private java.lang.String pointId;

    private java.lang.String affaireId;

    public InfoFonctionnellesType() {
    }

    public InfoFonctionnellesType(
           java.lang.String pointId,
           java.lang.String affaireId) {
           this.pointId = pointId;
           this.affaireId = affaireId;
    }


    /**
     * Gets the pointId value for this InfoFonctionnellesType.
     * 
     * @return pointId
     */
    public java.lang.String getPointId() {
        return pointId;
    }


    /**
     * Sets the pointId value for this InfoFonctionnellesType.
     * 
     * @param pointId
     */
    public void setPointId(java.lang.String pointId) {
        this.pointId = pointId;
    }


    /**
     * Gets the affaireId value for this InfoFonctionnellesType.
     * 
     * @return affaireId
     */
    public java.lang.String getAffaireId() {
        return affaireId;
    }


    /**
     * Sets the affaireId value for this InfoFonctionnellesType.
     * 
     * @param affaireId
     */
    public void setAffaireId(java.lang.String affaireId) {
        this.affaireId = affaireId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoFonctionnellesType)) return false;
        InfoFonctionnellesType other = (InfoFonctionnellesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pointId==null && other.getPointId()==null) || 
             (this.pointId!=null &&
              this.pointId.equals(other.getPointId()))) &&
            ((this.affaireId==null && other.getAffaireId()==null) || 
             (this.affaireId!=null &&
              this.affaireId.equals(other.getAffaireId())));
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
        if (getPointId() != null) {
            _hashCode += getPointId().hashCode();
        }
        if (getAffaireId() != null) {
            _hashCode += getAffaireId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoFonctionnellesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "InfoFonctionnellesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pointId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pointId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("affaireId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "affaireId"));
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
