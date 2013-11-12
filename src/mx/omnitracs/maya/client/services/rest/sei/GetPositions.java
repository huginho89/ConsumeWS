
package mx.omnitracs.maya.client.services.rest.sei;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPositions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPositions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://sei.rest.services.client.maya.omnitracs.mx/}vehicleActivityRequestDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPositions", propOrder = {
    "request"
})
public class GetPositions {

    protected VehicleActivityRequestDTO request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleActivityRequestDTO }
     *     
     */
    public VehicleActivityRequestDTO getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleActivityRequestDTO }
     *     
     */
    public void setRequest(VehicleActivityRequestDTO value) {
        this.request = value;
    }

}
