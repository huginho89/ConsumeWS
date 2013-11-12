
package mx.omnitracs.maya.client.services.rest.sei;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listVehicleActivityPositionResponseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listVehicleActivityPositionResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sei.rest.services.client.maya.omnitracs.mx/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="vehicles" type="{http://sei.rest.services.client.maya.omnitracs.mx/}vehicleActivityPositionResponseDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listVehicleActivityPositionResponseDTO", propOrder = {
    "vehicles"
})
public class ListVehicleActivityPositionResponseDTO
    extends ResponseDTO
{

    @XmlElement(nillable = true)
    protected List<VehicleActivityPositionResponseDTO> vehicles;

    /**
     * Gets the value of the vehicles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleActivityPositionResponseDTO }
     * 
     * 
     */
    public List<VehicleActivityPositionResponseDTO> getVehicles() {
        if (vehicles == null) {
            vehicles = new ArrayList<VehicleActivityPositionResponseDTO>();
        }
        return this.vehicles;
    }

}
