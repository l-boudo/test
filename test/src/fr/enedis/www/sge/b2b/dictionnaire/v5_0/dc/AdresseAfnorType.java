/**
 * AdresseAfnorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.dictionnaire.v5_0.dc;

public class AdresseAfnorType  implements java.io.Serializable {
    private java.lang.String ligne1;

    private java.lang.String ligne2;

    private java.lang.String ligne3;

    private java.lang.String ligne4;

    private java.lang.String ligne5;

    private java.lang.String ligne6;

    private java.lang.String ligne7;

    public AdresseAfnorType() {
    }

    public AdresseAfnorType(
           java.lang.String ligne1,
           java.lang.String ligne2,
           java.lang.String ligne3,
           java.lang.String ligne4,
           java.lang.String ligne5,
           java.lang.String ligne6,
           java.lang.String ligne7) {
           this.ligne1 = ligne1;
           this.ligne2 = ligne2;
           this.ligne3 = ligne3;
           this.ligne4 = ligne4;
           this.ligne5 = ligne5;
           this.ligne6 = ligne6;
           this.ligne7 = ligne7;
    }


    /**
     * Gets the ligne1 value for this AdresseAfnorType.
     * 
     * @return ligne1
     */
    public java.lang.String getLigne1() {
        return ligne1;
    }


    /**
     * Sets the ligne1 value for this AdresseAfnorType.
     * 
     * @param ligne1
     */
    public void setLigne1(java.lang.String ligne1) {
        this.ligne1 = ligne1;
    }


    /**
     * Gets the ligne2 value for this AdresseAfnorType.
     * 
     * @return ligne2
     */
    public java.lang.String getLigne2() {
        return ligne2;
    }


    /**
     * Sets the ligne2 value for this AdresseAfnorType.
     * 
     * @param ligne2
     */
    public void setLigne2(java.lang.String ligne2) {
        this.ligne2 = ligne2;
    }


    /**
     * Gets the ligne3 value for this AdresseAfnorType.
     * 
     * @return ligne3
     */
    public java.lang.String getLigne3() {
        return ligne3;
    }


    /**
     * Sets the ligne3 value for this AdresseAfnorType.
     * 
     * @param ligne3
     */
    public void setLigne3(java.lang.String ligne3) {
        this.ligne3 = ligne3;
    }


    /**
     * Gets the ligne4 value for this AdresseAfnorType.
     * 
     * @return ligne4
     */
    public java.lang.String getLigne4() {
        return ligne4;
    }


    /**
     * Sets the ligne4 value for this AdresseAfnorType.
     * 
     * @param ligne4
     */
    public void setLigne4(java.lang.String ligne4) {
        this.ligne4 = ligne4;
    }


    /**
     * Gets the ligne5 value for this AdresseAfnorType.
     * 
     * @return ligne5
     */
    public java.lang.String getLigne5() {
        return ligne5;
    }


    /**
     * Sets the ligne5 value for this AdresseAfnorType.
     * 
     * @param ligne5
     */
    public void setLigne5(java.lang.String ligne5) {
        this.ligne5 = ligne5;
    }


    /**
     * Gets the ligne6 value for this AdresseAfnorType.
     * 
     * @return ligne6
     */
    public java.lang.String getLigne6() {
        return ligne6;
    }


    /**
     * Sets the ligne6 value for this AdresseAfnorType.
     * 
     * @param ligne6
     */
    public void setLigne6(java.lang.String ligne6) {
        this.ligne6 = ligne6;
    }


    /**
     * Gets the ligne7 value for this AdresseAfnorType.
     * 
     * @return ligne7
     */
    public java.lang.String getLigne7() {
        return ligne7;
    }


    /**
     * Sets the ligne7 value for this AdresseAfnorType.
     * 
     * @param ligne7
     */
    public void setLigne7(java.lang.String ligne7) {
        this.ligne7 = ligne7;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdresseAfnorType)) return false;
        AdresseAfnorType other = (AdresseAfnorType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ligne1==null && other.getLigne1()==null) || 
             (this.ligne1!=null &&
              this.ligne1.equals(other.getLigne1()))) &&
            ((this.ligne2==null && other.getLigne2()==null) || 
             (this.ligne2!=null &&
              this.ligne2.equals(other.getLigne2()))) &&
            ((this.ligne3==null && other.getLigne3()==null) || 
             (this.ligne3!=null &&
              this.ligne3.equals(other.getLigne3()))) &&
            ((this.ligne4==null && other.getLigne4()==null) || 
             (this.ligne4!=null &&
              this.ligne4.equals(other.getLigne4()))) &&
            ((this.ligne5==null && other.getLigne5()==null) || 
             (this.ligne5!=null &&
              this.ligne5.equals(other.getLigne5()))) &&
            ((this.ligne6==null && other.getLigne6()==null) || 
             (this.ligne6!=null &&
              this.ligne6.equals(other.getLigne6()))) &&
            ((this.ligne7==null && other.getLigne7()==null) || 
             (this.ligne7!=null &&
              this.ligne7.equals(other.getLigne7())));
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
        if (getLigne1() != null) {
            _hashCode += getLigne1().hashCode();
        }
        if (getLigne2() != null) {
            _hashCode += getLigne2().hashCode();
        }
        if (getLigne3() != null) {
            _hashCode += getLigne3().hashCode();
        }
        if (getLigne4() != null) {
            _hashCode += getLigne4().hashCode();
        }
        if (getLigne5() != null) {
            _hashCode += getLigne5().hashCode();
        }
        if (getLigne6() != null) {
            _hashCode += getLigne6().hashCode();
        }
        if (getLigne7() != null) {
            _hashCode += getLigne7().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdresseAfnorType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/dc", "AdresseAfnorType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ligne7");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ligne7"));
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
