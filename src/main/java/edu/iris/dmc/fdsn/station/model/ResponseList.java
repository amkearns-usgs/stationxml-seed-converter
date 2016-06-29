//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.05 at 01:15:36 PM PST 
//


package edu.iris.dmc.fdsn.station.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response: list of frequency, amplitude and phase values. Corresponds
 * 				to SEED blockette 55. 
 * 
 * <p>Java class for ResponseListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fdsn.org/xml/station/1}BaseFilterType">
 *       &lt;sequence>
 *         &lt;element name="ResponseListElement" type="{http://www.fdsn.org/xml/station/1}ResponseListElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseListType", propOrder = {
    "responseListElement"
})
public class ResponseList
    extends BaseFilter
{

    @XmlElement(name = "ResponseListElement")
    protected List<ResponseListElement> responseListElement;

    /**
     * Gets the value of the responseListElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseListElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseListElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseListElement }
     * 
     * 
     */
    public List<ResponseListElement> getResponseListElement() {
        if (responseListElement == null) {
            responseListElement = new ArrayList<ResponseListElement>();
        }
        return this.responseListElement;
    }

}
