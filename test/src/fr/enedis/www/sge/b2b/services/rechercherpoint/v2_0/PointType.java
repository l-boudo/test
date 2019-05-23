/**
 * PointType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.services.rechercherpoint.v2_0;

public class PointType  implements java.io.Serializable {
    private fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.AdresseAfnorType adresseInstallationNormalisee;

    private java.lang.String[] matricule;

    private java.lang.String[] numeroSerie;

    private fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.StructureComptageType typeComptage;

    private fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.PointEtatContractuelType etatContractuel;

    private java.lang.String nomClientFinalOuDenominationSociale;

    private java.lang.String id;  // attribute

    public PointType() {
    }

    public PointType(
           fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.AdresseAfnorType adresseInstallationNormalisee,
           java.lang.String[] matricule,
           java.lang.String[] numeroSerie,
           fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.StructureComptageType typeComptage,
           fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.PointEtatContractuelType etatContractuel,
           java.lang.String nomClientFinalOuDenominationSociale,
           java.lang.String id) {
           this.adresseInstallationNormalisee = adresseInstallationNormalisee;
           this.matricule = matricule;
           this.numeroSerie = numeroSerie;
           this.typeComptage = typeComptage;
           this.etatContractuel = etatContractuel;
           this.nomClientFinalOuDenominationSociale = nomClientFinalOuDenominationSociale;
           this.id = id;
    }


    /**
     * Gets the adresseInstallationNormalisee value for this PointType.
     * 
     * @return adresseInstallationNormalisee
     */
    public fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.AdresseAfnorType getAdresseInstallationNormalisee() {
        return adresseInstallationNormalisee;
    }


    /**
     * Sets the adresseInstallationNormalisee value for this PointType.
     * 
     * @param adresseInstallationNormalisee
     */
    public void setAdresseInstallationNormalisee(fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.AdresseAfnorType adresseInstallationNormalisee) {
        this.adresseInstallationNormalisee = adresseInstallationNormalisee;
    }


    /**
     * Gets the matricule value for this PointType.
     * 
     * @return matricule
     */
    public java.lang.String[] getMatricule() {
        return matricule;
    }


    /**
     * Sets the matricule value for this PointType.
     * 
     * @param matricule
     */
    public void setMatricule(java.lang.String[] matricule) {
        this.matricule = matricule;
    }

    public java.lang.String getMatricule(int i) {
        return this.matricule[i];
    }

    public void setMatricule(int i, java.lang.String _value) {
        this.matricule[i] = _value;
    }


    /**
     * Gets the numeroSerie value for this PointType.
     * 
     * @return numeroSerie
     */
    public java.lang.String[] getNumeroSerie() {
        return numeroSerie;
    }


    /**
     * Sets the numeroSerie value for this PointType.
     * 
     * @param numeroSerie
     */
    public void setNumeroSerie(java.lang.String[] numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public java.lang.String getNumeroSerie(int i) {
        return this.numeroSerie[i];
    }

    public void setNumeroSerie(int i, java.lang.String _value) {
        this.numeroSerie[i] = _value;
    }


    /**
     * Gets the typeComptage value for this PointType.
     * 
     * @return typeComptage
     */
    public fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.StructureComptageType getTypeComptage() {
        return typeComptage;
    }


    /**
     * Sets the typeComptage value for this PointType.
     * 
     * @param typeComptage
     */
    public void setTypeComptage(fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.StructureComptageType typeComptage) {
        this.typeComptage = typeComptage;
    }


    /**
     * Gets the etatContractuel value for this PointType.
     * 
     * @return etatContractuel
     */
    public fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.PointEtatContractuelType getEtatContractuel() {
        return etatContractuel;
    }


    /**
     * Sets the etatContractuel value for this PointType.
     * 
     * @param etatContractuel
     */
    public void setEtatContractuel(fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc.PointEtatContractuelType etatContractuel) {
        this.etatContractuel = etatContractuel;
    }


    /**
     * Gets the nomClientFinalOuDenominationSociale value for this PointType.
     * 
     * @return nomClientFinalOuDenominationSociale
     */
    public java.lang.String getNomClientFinalOuDenominationSociale() {
        return nomClientFinalOuDenominationSociale;
    }


    /**
     * Sets the nomClientFinalOuDenominationSociale value for this PointType.
     * 
     * @param nomClientFinalOuDenominationSociale
     */
    public void setNomClientFinalOuDenominationSociale(java.lang.String nomClientFinalOuDenominationSociale) {
        this.nomClientFinalOuDenominationSociale = nomClientFinalOuDenominationSociale;
    }


    /**
     * Gets the id value for this PointType.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this PointType.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PointType)) return false;
        PointType other = (PointType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adresseInstallationNormalisee==null && other.getAdresseInstallationNormalisee()==null) || 
             (this.adresseInstallationNormalisee!=null &&
              this.adresseInstallationNormalisee.equals(other.getAdresseInstallationNormalisee()))) &&
            ((this.matricule==null && other.getMatricule()==null) || 
             (this.matricule!=null &&
              java.util.Arrays.equals(this.matricule, other.getMatricule()))) &&
            ((this.numeroSerie==null && other.getNumeroSerie()==null) || 
             (this.numeroSerie!=null &&
              java.util.Arrays.equals(this.numeroSerie, other.getNumeroSerie()))) &&
            ((this.typeComptage==null && other.getTypeComptage()==null) || 
             (this.typeComptage!=null &&
              this.typeComptage.equals(other.getTypeComptage()))) &&
            ((this.etatContractuel==null && other.getEtatContractuel()==null) || 
             (this.etatContractuel!=null &&
              this.etatContractuel.equals(other.getEtatContractuel()))) &&
            ((this.nomClientFinalOuDenominationSociale==null && other.getNomClientFinalOuDenominationSociale()==null) || 
             (this.nomClientFinalOuDenominationSociale!=null &&
              this.nomClientFinalOuDenominationSociale.equals(other.getNomClientFinalOuDenominationSociale()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getAdresseInstallationNormalisee() != null) {
            _hashCode += getAdresseInstallationNormalisee().hashCode();
        }
        if (getMatricule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatricule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatricule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroSerie() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumeroSerie());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumeroSerie(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTypeComptage() != null) {
            _hashCode += getTypeComptage().hashCode();
        }
        if (getEtatContractuel() != null) {
            _hashCode += getEtatContractuel().hashCode();
        }
        if (getNomClientFinalOuDenominationSociale() != null) {
            _hashCode += getNomClientFinalOuDenominationSociale().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PointType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "PointType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("id");
        attrField.setXmlName(new javax.xml.namespace.QName("", "id"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "PointIdType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresseInstallationNormalisee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adresseInstallationNormalisee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc", "AdresseAfnorType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matricule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matricule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "Chaine255Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "Chaine255Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeComptage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeComptage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc", "StructureComptageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etatContractuel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "etatContractuel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc", "PointEtatContractuelType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomClientFinalOuDenominationSociale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomClientFinalOuDenominationSociale"));
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
