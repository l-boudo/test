/**
 * PointEtatContractuelCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.enedis.www.sge.b2b.dictionnaire.v5_0.ds;

public class PointEtatContractuelCodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PointEtatContractuelCodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ECRAC = "ECRAC";
    public static final java.lang.String _INACCE = "INACCE";
    public static final java.lang.String _ECRES = "ECRES";
    public static final java.lang.String _IMPRO = "IMPRO";
    public static final java.lang.String _RESIL = "RESIL";
    public static final java.lang.String _SERVC = "SERVC";
    public static final PointEtatContractuelCodeType ECRAC = new PointEtatContractuelCodeType(_ECRAC);
    public static final PointEtatContractuelCodeType INACCE = new PointEtatContractuelCodeType(_INACCE);
    public static final PointEtatContractuelCodeType ECRES = new PointEtatContractuelCodeType(_ECRES);
    public static final PointEtatContractuelCodeType IMPRO = new PointEtatContractuelCodeType(_IMPRO);
    public static final PointEtatContractuelCodeType RESIL = new PointEtatContractuelCodeType(_RESIL);
    public static final PointEtatContractuelCodeType SERVC = new PointEtatContractuelCodeType(_SERVC);
    public java.lang.String getValue() { return _value_;}
    public static PointEtatContractuelCodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PointEtatContractuelCodeType enumeration = (PointEtatContractuelCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PointEtatContractuelCodeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PointEtatContractuelCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.enedis.fr/sge/b2b/dictionnaire/v5.0/ds", "PointEtatContractuelCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
