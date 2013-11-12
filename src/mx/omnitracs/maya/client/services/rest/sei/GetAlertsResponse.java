
package mx.omnitracs.maya.client.services.rest.sei;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAlertsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAlertsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://sei.rest.services.client.maya.omnitracs.mx/}vehicleActivityAlertResponseDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAlertsResponse", propOrder = {
    "_return"
})
public class GetAlertsResponse {

    @XmlElement(name = "return")
    protected VehicleActivityAlertResponseDTO _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleActivityAlertResponseDTO }
     *     
     */
    public VehicleActivityAlertResponseDTO getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleActivityAlertResponseDTO }
     *     
     */
    public void setReturn(VehicleActivityAlertResponseDTO value) {
        this._return = value;
    }

}
