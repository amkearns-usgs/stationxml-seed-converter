//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//


package edu.iris.dmc.fdsn.station.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NominalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NominalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="NOMINAL"/>
 *     &lt;enumeration value="CALCULATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NominalType")
@XmlEnum
public enum NominalType {

    NOMINAL,
    CALCULATED;

    public String value() {
        return name();
    }

    public static NominalType fromValue(String v) {
        return valueOf(v);
    }

}
