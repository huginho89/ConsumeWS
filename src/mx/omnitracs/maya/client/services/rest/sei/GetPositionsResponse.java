
package mx.omnitracs.maya.client.services.rest.sei;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositionsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://sei.rest.services.client.maya.omnitracs.mx/}listVehicleActivityPositionResponseDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositionsResponse", propOrder = {
    "_return"
})
public class GetPositionsResponse {

    @XmlElement(name = "return")
    protected ListVehicleActivityPositionResponseDTO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ListVehicleActivityPositionResponseDTO }
     *     
     */
    public ListVehicleActivityPositionResponseDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListVehicleActivityPositionResponseDTO }
     *     
     */
    public void setReturn(ListVehicleActivityPositionResponseDTO value) {
        this._return = value;
    }

}
