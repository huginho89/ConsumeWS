
package mx.omnitracs.maya.client.services.rest.sei;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleActivityPositionResponseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleActivityPositionResponseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://sei.rest.services.client.maya.omnitracs.mx/}responseDTO">
 *       &lt;sequence>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="positions" type="{http://sei.rest.services.client.maya.omnitracs.mx/}positionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleActivityPositionResponseDTO", propOrder = {
    "alias",
    "idUnit",
    "positions",
    "unitModel",
    "unitPlate",
    "vehicleType"
})
public class VehicleActivityPositionResponseDTO
    extends ResponseDTO
{

    protected String alias;
    protected Integer idUnit;
    @XmlElement(nillable = true)
    protected List<PositionDTO> positions;
    protected String unitModel;
    protected String unitPlate;
    protected String vehicleType;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the idUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUnit() {
        return idUnit;
    }

    /**
     * Sets the value of the idUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUnit(Integer value) {
        this.idUnit = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionDTO }
     * 
     * 
     */
    public List<PositionDTO> getPositions() {
        if (positions == null) {
            positions = new ArrayList<PositionDTO>();
        }
        return this.positions;
    }

    /**
     * Gets the value of the unitModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitModel() {
        return unitModel;
    }

    /**
     * Sets the value of the unitModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitModel(String value) {
        this.unitModel = value;
    }

    /**
     * Gets the value of the unitPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPlate() {
        return unitPlate;
    }

    /**
     * Sets the value of the unitPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPlate(String value) {
        this.unitPlate = value;
    }

    /**
     * Gets the value of the vehicleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * Sets the value of the vehicleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

}
