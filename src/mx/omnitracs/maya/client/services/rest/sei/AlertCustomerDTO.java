
package mx.omnitracs.maya.client.services.rest.sei;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertCustomerDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alertCustomerDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alertType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idalert" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://sei.rest.services.client.maya.omnitracs.mx/}positionDTO" minOccurs="0"/>
 *         &lt;element name="relevantInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertCustomerDTO", propOrder = {
    "alertType",
    "date",
    "idalert",
    "location",
    "position",
    "relevantInfo"
})
public class AlertCustomerDTO {

    protected String alertType;
    protected String date;
    protected long idalert;
    protected String location;
    protected PositionDTO position;
    protected String relevantInfo;

    /**
     * Gets the value of the alertType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * Sets the value of the alertType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertType(String value) {
        this.alertType = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the idalert property.
     * 
     */
    public long getIdalert() {
        return idalert;
    }

    /**
     * Sets the value of the idalert property.
     * 
     */
    public void setIdalert(long value) {
        this.idalert = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDTO }
     *     
     */
    public PositionDTO getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDTO }
     *     
     */
    public void setPosition(PositionDTO value) {
        this.position = value;
    }

    /**
     * Gets the value of the relevantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevantInfo() {
        return relevantInfo;
    }

    /**
     * Sets the value of the relevantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevantInfo(String value) {
        this.relevantInfo = value;
    }

}
