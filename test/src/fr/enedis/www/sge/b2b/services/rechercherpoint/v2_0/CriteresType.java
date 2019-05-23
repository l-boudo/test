/**
 * CriteresType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0;

public class CriteresType  implements java.io.Serializable {
    private fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.AdresseInstallationType adresseInstallation;

    private java.lang.String numSiret;

    private java.lang.String matriculeOuNumeroSerie;

    private fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.DomaineTensionCodeType domaineTensionAlimentationCode;

    private java.lang.String nomClientFinalOuDenominationSociale;

    private fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.ClientFinalCategorieCodeType categorieClientFinalCode;

    private java.lang.Boolean rechercheHorsPerimetre;

    public CriteresType() {
    }

    public CriteresType(
           fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.AdresseInstallationType adresseInstallation,
           java.lang.String numSiret,
           java.lang.String matriculeOuNumeroSerie,
           fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.DomaineTensionCodeType domaineTensionAlimentationCode,
           java.lang.String nomClientFinalOuDenominationSociale,
           fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.ClientFinalCategorieCodeType categorieClientFinalCode,
           java.lang.Boolean rechercheHorsPerimetre) {
           this.adresseInstallation = adresseInstallation;
           this.numSiret = numSiret;
           this.matriculeOuNumeroSerie = matriculeOuNumeroSerie;
           this.domaineTensionAlimentationCode = domaineTensionAlimentationCode;
           this.nomClientFinalOuDenominationSociale = nomClientFinalOuDenominationSociale;
           this.categorieClientFinalCode = categorieClientFinalCode;
           this.rechercheHorsPerimetre = rechercheHorsPerimetre;
    }


    /**
     * Gets the adresseInstallation value for this CriteresType.
     * 
     * @return adresseInstallation
     */
    public fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.AdresseInstallationType getAdresseInstallation() {
        return adresseInstallation;
    }


    /**
     * Sets the adresseInstallation value for this CriteresType.
     * 
     * @param adresseInstallation
     */
    public void setAdresseInstallation(fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0.AdresseInstallationType adresseInstallation) {
        this.adresseInstallation = adresseInstallation;
    }


    /**
     * Gets the numSiret value for this CriteresType.
     * 
     * @return numSiret
     */
    public java.lang.String getNumSiret() {
        return numSiret;
    }


    /**
     * Sets the numSiret value for this CriteresType.
     * 
     * @param numSiret
     */
    public void setNumSiret(java.lang.String numSiret) {
        this.numSiret = numSiret;
    }


    /**
     * Gets the matriculeOuNumeroSerie value for this CriteresType.
     * 
     * @return matriculeOuNumeroSerie
     */
    public java.lang.String getMatriculeOuNumeroSerie() {
        return matriculeOuNumeroSerie;
    }


    /**
     * Sets the matriculeOuNumeroSerie value for this CriteresType.
     * 
     * @param matriculeOuNumeroSerie
     */
    public void setMatriculeOuNumeroSerie(java.lang.String matriculeOuNumeroSerie) {
        this.matriculeOuNumeroSerie = matriculeOuNumeroSerie;
    }


    /**
     * Gets the domaineTensionAlimentationCode value for this CriteresType.
     * 
     * @return domaineTensionAlimentationCode
     */
    public fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.DomaineTensionCodeType getDomaineTensionAlimentationCode() {
        return domaineTensionAlimentationCode;
    }


    /**
     * Sets the domaineTensionAlimentationCode value for this CriteresType.
     * 
     * @param domaineTensionAlimentationCode
     */
    public void setDomaineTensionAlimentationCode(fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.DomaineTensionCodeType domaineTensionAlimentationCode) {
        this.domaineTensionAlimentationCode = domaineTensionAlimentationCode;
    }


    /**
     * Gets the nomClientFinalOuDenominationSociale value for this CriteresType.
     * 
     * @return nomClientFinalOuDenominationSociale
     */
    public java.lang.String getNomClientFinalOuDenominationSociale() {
        return nomClientFinalOuDenominationSociale;
    }


    /**
     * Sets the nomClientFinalOuDenominationSociale value for this CriteresType.
     * 
     * @param nomClientFinalOuDenominationSociale
     */
    public void setNomClientFinalOuDenominationSociale(java.lang.String nomClientFinalOuDenominationSociale) {
        this.nomClientFinalOuDenominationSociale = nomClientFinalOuDenominationSociale;
    }


    /**
     * Gets the categorieClientFinalCode value for this CriteresType.
     * 
     * @return categorieClientFinalCode
     */
    public fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.ClientFinalCategorieCodeType getCategorieClientFinalCode() {
        return categorieClientFinalCode;
    }


    /**
     * Sets the categorieClientFinalCode value for this CriteresType.
     * 
     * @param categorieClientFinalCode
     */
    public void setCategorieClientFinalCode(fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds.ClientFinalCategorieCodeType categorieClientFinalCode) {
        this.categorieClientFinalCode = categorieClientFinalCode;
    }


    /**
     * Gets the rechercheHorsPerimetre value for this CriteresType.
     * 
     * @return rechercheHorsPerimetre
     */
    public java.lang.Boolean getRechercheHorsPerimetre() {
        return rechercheHorsPerimetre;
    }


    /**
     * Sets the rechercheHorsPerimetre value for this CriteresType.
     * 
     * @param rechercheHorsPerimetre
     */
    public void setRechercheHorsPerimetre(java.lang.Boolean rechercheHorsPerimetre) {
        this.rechercheHorsPerimetre = rechercheHorsPerimetre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteresType)) return false;
        CriteresType other = (CriteresType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adresseInstallation==null && other.getAdresseInstallation()==null) || 
             (this.adresseInstallation!=null &&
              this.adresseInstallation.equals(other.getAdresseInstallation()))) &&
            ((this.numSiret==null && other.getNumSiret()==null) || 
             (this.numSiret!=null &&
              this.numSiret.equals(other.getNumSiret()))) &&
            ((this.matriculeOuNumeroSerie==null && other.getMatriculeOuNumeroSerie()==null) || 
             (this.matriculeOuNumeroSerie!=null &&
              this.matriculeOuNumeroSerie.equals(other.getMatriculeOuNumeroSerie()))) &&
            ((this.domaineTensionAlimentationCode==null && other.getDomaineTensionAlimentationCode()==null) || 
             (this.domaineTensionAlimentationCode!=null &&
              this.domaineTensionAlimentationCode.equals(other.getDomaineTensionAlimentationCode()))) &&
            ((this.nomClientFinalOuDenominationSociale==null && other.getNomClientFinalOuDenominationSociale()==null) || 
             (this.nomClientFinalOuDenominationSociale!=null &&
              this.nomClientFinalOuDenominationSociale.equals(other.getNomClientFinalOuDenominationSociale()))) &&
            ((this.categorieClientFinalCode==null && other.getCategorieClientFinalCode()==null) || 
             (this.categorieClientFinalCode!=null &&
              this.categorieClientFinalCode.equals(other.getCategorieClientFinalCode()))) &&
            ((this.rechercheHorsPerimetre==null && other.getRechercheHorsPerimetre()==null) || 
             (this.rechercheHorsPerimetre!=null &&
              this.rechercheHorsPerimetre.equals(other.getRechercheHorsPerimetre())));
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
        if (getAdresseInstallation() != null) {
            _hashCode += getAdresseInstallation().hashCode();
        }
        if (getNumSiret() != null) {
            _hashCode += getNumSiret().hashCode();
        }
        if (getMatriculeOuNumeroSerie() != null) {
            _hashCode += getMatriculeOuNumeroSerie().hashCode();
        }
        if (getDomaineTensionAlimentationCode() != null) {
            _hashCode += getDomaineTensionAlimentationCode().hashCode();
        }
        if (getNomClientFinalOuDenominationSociale() != null) {
            _hashCode += getNomClientFinalOuDenominationSociale().hashCode();
        }
        if (getCategorieClientFinalCode() != null) {
            _hashCode += getCategorieClientFinalCode().hashCode();
        }
        if (getRechercheHorsPerimetre() != null) {
            _hashCode += getRechercheHorsPerimetre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteresType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "CriteresType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresseInstallation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresseInstallation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "AdresseInstallationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSiret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numSiret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matriculeOuNumeroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matriculeOuNumeroSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domaineTensionAlimentationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domaineTensionAlimentationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "DomaineTensionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomClientFinalOuDenominationSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomClientFinalOuDenominationSociale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categorieClientFinalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categorieClientFinalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "ClientFinalCategorieCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechercheHorsPerimetre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rechercheHorsPerimetre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
