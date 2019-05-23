/**
 * AdresseInstallationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0;

public class AdresseInstallationType  implements java.io.Serializable {
    private java.lang.String escalierEtEtageEtAppartement;

    private java.lang.String batiment;

    private java.lang.String numeroEtNomVoie;

    private java.lang.String lieuDit;

    private java.lang.String codePostal;

    private java.lang.String codeInseeCommune;

    public AdresseInstallationType() {
    }

    public AdresseInstallationType(
           java.lang.String escalierEtEtageEtAppartement,
           java.lang.String batiment,
           java.lang.String numeroEtNomVoie,
           java.lang.String lieuDit,
           java.lang.String codePostal,
           java.lang.String codeInseeCommune) {
           this.escalierEtEtageEtAppartement = escalierEtEtageEtAppartement;
           this.batiment = batiment;
           this.numeroEtNomVoie = numeroEtNomVoie;
           this.lieuDit = lieuDit;
           this.codePostal = codePostal;
           this.codeInseeCommune = codeInseeCommune;
    }


    /**
     * Gets the escalierEtEtageEtAppartement value for this AdresseInstallationType.
     * 
     * @return escalierEtEtageEtAppartement
     */
    public java.lang.String getEscalierEtEtageEtAppartement() {
        return escalierEtEtageEtAppartement;
    }


    /**
     * Sets the escalierEtEtageEtAppartement value for this AdresseInstallationType.
     * 
     * @param escalierEtEtageEtAppartement
     */
    public void setEscalierEtEtageEtAppartement(java.lang.String escalierEtEtageEtAppartement) {
        this.escalierEtEtageEtAppartement = escalierEtEtageEtAppartement;
    }


    /**
     * Gets the batiment value for this AdresseInstallationType.
     * 
     * @return batiment
     */
    public java.lang.String getBatiment() {
        return batiment;
    }


    /**
     * Sets the batiment value for this AdresseInstallationType.
     * 
     * @param batiment
     */
    public void setBatiment(java.lang.String batiment) {
        this.batiment = batiment;
    }


    /**
     * Gets the numeroEtNomVoie value for this AdresseInstallationType.
     * 
     * @return numeroEtNomVoie
     */
    public java.lang.String getNumeroEtNomVoie() {
        return numeroEtNomVoie;
    }


    /**
     * Sets the numeroEtNomVoie value for this AdresseInstallationType.
     * 
     * @param numeroEtNomVoie
     */
    public void setNumeroEtNomVoie(java.lang.String numeroEtNomVoie) {
        this.numeroEtNomVoie = numeroEtNomVoie;
    }


    /**
     * Gets the lieuDit value for this AdresseInstallationType.
     * 
     * @return lieuDit
     */
    public java.lang.String getLieuDit() {
        return lieuDit;
    }


    /**
     * Sets the lieuDit value for this AdresseInstallationType.
     * 
     * @param lieuDit
     */
    public void setLieuDit(java.lang.String lieuDit) {
        this.lieuDit = lieuDit;
    }


    /**
     * Gets the codePostal value for this AdresseInstallationType.
     * 
     * @return codePostal
     */
    public java.lang.String getCodePostal() {
        return codePostal;
    }


    /**
     * Sets the codePostal value for this AdresseInstallationType.
     * 
     * @param codePostal
     */
    public void setCodePostal(java.lang.String codePostal) {
        this.codePostal = codePostal;
    }


    /**
     * Gets the codeInseeCommune value for this AdresseInstallationType.
     * 
     * @return codeInseeCommune
     */
    public java.lang.String getCodeInseeCommune() {
        return codeInseeCommune;
    }


    /**
     * Sets the codeInseeCommune value for this AdresseInstallationType.
     * 
     * @param codeInseeCommune
     */
    public void setCodeInseeCommune(java.lang.String codeInseeCommune) {
        this.codeInseeCommune = codeInseeCommune;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdresseInstallationType)) return false;
        AdresseInstallationType other = (AdresseInstallationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.escalierEtEtageEtAppartement==null && other.getEscalierEtEtageEtAppartement()==null) || 
             (this.escalierEtEtageEtAppartement!=null &&
              this.escalierEtEtageEtAppartement.equals(other.getEscalierEtEtageEtAppartement()))) &&
            ((this.batiment==null && other.getBatiment()==null) || 
             (this.batiment!=null &&
              this.batiment.equals(other.getBatiment()))) &&
            ((this.numeroEtNomVoie==null && other.getNumeroEtNomVoie()==null) || 
             (this.numeroEtNomVoie!=null &&
              this.numeroEtNomVoie.equals(other.getNumeroEtNomVoie()))) &&
            ((this.lieuDit==null && other.getLieuDit()==null) || 
             (this.lieuDit!=null &&
              this.lieuDit.equals(other.getLieuDit()))) &&
            ((this.codePostal==null && other.getCodePostal()==null) || 
             (this.codePostal!=null &&
              this.codePostal.equals(other.getCodePostal()))) &&
            ((this.codeInseeCommune==null && other.getCodeInseeCommune()==null) || 
             (this.codeInseeCommune!=null &&
              this.codeInseeCommune.equals(other.getCodeInseeCommune())));
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
        if (getEscalierEtEtageEtAppartement() != null) {
            _hashCode += getEscalierEtEtageEtAppartement().hashCode();
        }
        if (getBatiment() != null) {
            _hashCode += getBatiment().hashCode();
        }
        if (getNumeroEtNomVoie() != null) {
            _hashCode += getNumeroEtNomVoie().hashCode();
        }
        if (getLieuDit() != null) {
            _hashCode += getLieuDit().hashCode();
        }
        if (getCodePostal() != null) {
            _hashCode += getCodePostal().hashCode();
        }
        if (getCodeInseeCommune() != null) {
            _hashCode += getCodeInseeCommune().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdresseInstallationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "AdresseInstallationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalierEtEtageEtAppartement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escalierEtEtageEtAppartement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batiment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batiment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEtNomVoie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroEtNomVoie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lieuDit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lieuDit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codePostal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codePostal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeInseeCommune");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codeInseeCommune"));
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
