
package mx.omnitracs.maya.client.services.rest.sei;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleActivityAlertResponseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleActivityAlertResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sei.rest.services.client.maya.omnitracs.mx/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="alertsActivity" type="{http://sei.rest.services.client.maya.omnitracs.mx/}vehicleActivityAlertDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vehicleActivity" type="{http://sei.rest.services.client.maya.omnitracs.mx/}vehicleActivityPositionResponseDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleActivityAlertResponseDTO", propOrder = {
    "alertsActivity",
    "vehicleActivity"
})
public class VehicleActivityAlertResponseDTO
    extends ResponseDTO
{

    @XmlElement(nillable = true)
    protected List<VehicleActivityAlertDTO> alertsActivity;
    @XmlElement(nillable = true)
    protected List<VehicleActivityPositionResponseDTO> vehicleActivity;

    /**
     * Gets the value of the alertsActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertsActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertsActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleActivityAlertDTO }
     * 
     * 
     */
    public List<VehicleActivityAlertDTO> getAlertsActivity() {
        if (alertsActivity == null) {
            alertsActivity = new ArrayList<VehicleActivityAlertDTO>();
        }
        return this.alertsActivity;
    }

    /**
     * Gets the value of the vehicleActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleActivityPositionResponseDTO }
     * 
     * 
     */
    public List<VehicleActivityPositionResponseDTO> getVehicleActivity() {
        if (vehicleActivity == null) {
            vehicleActivity = new ArrayList<VehicleActivityPositionResponseDTO>();
        }
        return this.vehicleActivity;
    }

}
