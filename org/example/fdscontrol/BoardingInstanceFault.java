
package org.example.fdscontrol;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BoardingInstanceFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "boardingInstanceFault"
})
@XmlRootElement(name = "BoardingInstanceFault")
public class BoardingInstanceFault {

    @XmlElement(name = "BoardingInstanceFault", required = true)
    protected String boardingInstanceFault;

    /**
     * Obtiene el valor de la propiedad boardingInstanceFault.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingInstanceFault() {
        return boardingInstanceFault;
    }

    /**
     * Define el valor de la propiedad boardingInstanceFault.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingInstanceFault(String value) {
        this.boardingInstanceFault = value;
    }

}
