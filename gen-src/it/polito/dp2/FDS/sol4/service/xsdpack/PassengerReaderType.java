//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.19 at 10:54:48 AM CEST 
//


package it.polito.dp2.FDS.sol4.service.xsdpack;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passengerReaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passengerReaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.example.org/FDSInfo_schema/}stringType"/>
 *         &lt;element name="seatID" type="{http://www.example.org/FDSInfo_schema/}seatType"/>
 *         &lt;element name="boarded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passengerReaderType", propOrder = {
    "name",
    "seatID",
    "boarded"
})
public class PassengerReaderType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String seatID;
    protected boolean boarded;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the seatID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatID() {
        return seatID;
    }

    /**
     * Sets the value of the seatID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatID(String value) {
        this.seatID = value;
    }

    /**
     * Gets the value of the boarded property.
     * 
     */
    public boolean isBoarded() {
        return boarded;
    }

    /**
     * Sets the value of the boarded property.
     * 
     */
    public void setBoarded(boolean value) {
        this.boarded = value;
    }

}
