
package mx.omnitracs.maya.client.services.rest.sei;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleActivityAlertDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleActivityAlertDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alerts" type="{http://sei.rest.services.client.maya.omnitracs.mx/}alertCustomerDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="unitModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unitPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleActivityAlertDTO", propOrder = {
    "alerts",
    "alias",
    "idUnit",
    "unitModel",
    "unitPlate",
    "vehicleType"
})
public class VehicleActivityAlertDTO {

    @XmlElement(nillable = true)
    protected List<AlertCustomerDTO> alerts;
    protected String alias;
    protected Integer idUnit;
    protected String unitModel;
    protected String unitPlate;
    protected String vehicleType;

    /**
     * Gets the value of the alerts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alerts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlerts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCustomerDTO }
     * 
     * 
     */
    public List<AlertCustomerDTO> getAlerts() {
        if (alerts == null) {
            alerts = new ArrayList<AlertCustomerDTO>();
        }
        return this.alerts;
    }

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
