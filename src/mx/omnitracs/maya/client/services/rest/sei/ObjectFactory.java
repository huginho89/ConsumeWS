
package mx.omnitracs.maya.client.services.rest.sei;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.omnitracs.maya.client.services.rest.sei package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPositions_QNAME = new QName("http://sei.rest.services.client.maya.omnitracs.mx/", "getPositions");
    private final static QName _GetGeofenceVisits_QNAME = new QName("http://sei.rest.services.client.maya.omnitracs.mx/", "getGeofenceVisits");
    private final static QName _GetPositionsResponse_QNAME = new QName("http://sei.rest.services.client.maya.omnitracs.mx/", "getPositionsResponse");
    private final static QName _GetGeofenceVisitsResponse_QNAME = new QName("http://sei.rest.services.client.maya.omnitracs.mx/", "getGeofenceVisitsResponse");
    private final static QName _GetAlerts_QNAME = new QName("http://sei.rest.services.client.maya.omnitracs.mx/", "getAlerts");
    private final static QName _GetAlertsResponse_QNAME = new QName("http://sei.rest.services.client.maya.omnitracs.mx/", "getAlertsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.omnitracs.maya.client.services.rest.sei
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAlerts }
     * 
     */
    public GetAlerts createGetAlerts() {
        return new GetAlerts();
    }

    /**
     * Create an instance of {@link GetAlertsResponse }
     * 
     */
    public GetAlertsResponse createGetAlertsResponse() {
        return new GetAlertsResponse();
    }

    /**
     * Create an instance of {@link GetPositions }
     * 
     */
    public GetPositions createGetPositions() {
        return new GetPositions();
    }

    /**
     * Create an instance of {@link GetGeofenceVisits }
     * 
     */
    public GetGeofenceVisits createGetGeofenceVisits() {
        return new GetGeofenceVisits();
    }

    /**
     * Create an instance of {@link GetPositionsResponse }
     * 
     */
    public GetPositionsResponse createGetPositionsResponse() {
        return new GetPositionsResponse();
    }

    /**
     * Create an instance of {@link GetGeofenceVisitsResponse }
     * 
     */
    public GetGeofenceVisitsResponse createGetGeofenceVisitsResponse() {
        return new GetGeofenceVisitsResponse();
    }

    /**
     * Create an instance of {@link VehicleActivityAlertResponseDTO }
     * 
     */
    public VehicleActivityAlertResponseDTO createVehicleActivityAlertResponseDTO() {
        return new VehicleActivityAlertResponseDTO();
    }

    /**
     * Create an instance of {@link VehicleActivityRequestDTO }
     * 
     */
    public VehicleActivityRequestDTO createVehicleActivityRequestDTO() {
        return new VehicleActivityRequestDTO();
    }

    /**
     * Create an instance of {@link PositionDTO }
     * 
     */
    public PositionDTO createPositionDTO() {
        return new PositionDTO();
    }

    /**
     * Create an instance of {@link ResponseDTO }
     * 
     */
    public ResponseDTO createResponseDTO() {
        return new ResponseDTO();
    }

    /**
     * Create an instance of {@link VehicleActivityAlertDTO }
     * 
     */
    public VehicleActivityAlertDTO createVehicleActivityAlertDTO() {
        return new VehicleActivityAlertDTO();
    }

    /**
     * Create an instance of {@link ListVehicleActivityPositionResponseDTO }
     * 
     */
    public ListVehicleActivityPositionResponseDTO createListVehicleActivityPositionResponseDTO() {
        return new ListVehicleActivityPositionResponseDTO();
    }

    /**
     * Create an instance of {@link AlertCustomerDTO }
     * 
     */
    public AlertCustomerDTO createAlertCustomerDTO() {
        return new AlertCustomerDTO();
    }

    /**
     * Create an instance of {@link VehicleActivityPositionResponseDTO }
     * 
     */
    public VehicleActivityPositionResponseDTO createVehicleActivityPositionResponseDTO() {
        return new VehicleActivityPositionResponseDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.rest.services.client.maya.omnitracs.mx/", name = "getPositions")
    public JAXBElement<GetPositions> createGetPositions(GetPositions value) {
        return new JAXBElement<GetPositions>(_GetPositions_QNAME, GetPositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeofenceVisits }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.rest.services.client.maya.omnitracs.mx/", name = "getGeofenceVisits")
    public JAXBElement<GetGeofenceVisits> createGetGeofenceVisits(GetGeofenceVisits value) {
        return new JAXBElement<GetGeofenceVisits>(_GetGeofenceVisits_QNAME, GetGeofenceVisits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.rest.services.client.maya.omnitracs.mx/", name = "getPositionsResponse")
    public JAXBElement<GetPositionsResponse> createGetPositionsResponse(GetPositionsResponse value) {
        return new JAXBElement<GetPositionsResponse>(_GetPositionsResponse_QNAME, GetPositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeofenceVisitsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.rest.services.client.maya.omnitracs.mx/", name = "getGeofenceVisitsResponse")
    public JAXBElement<GetGeofenceVisitsResponse> createGetGeofenceVisitsResponse(GetGeofenceVisitsResponse value) {
        return new JAXBElement<GetGeofenceVisitsResponse>(_GetGeofenceVisitsResponse_QNAME, GetGeofenceVisitsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlerts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.rest.services.client.maya.omnitracs.mx/", name = "getAlerts")
    public JAXBElement<GetAlerts> createGetAlerts(GetAlerts value) {
        return new JAXBElement<GetAlerts>(_GetAlerts_QNAME, GetAlerts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAlertsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sei.rest.services.client.maya.omnitracs.mx/", name = "getAlertsResponse")
    public JAXBElement<GetAlertsResponse> createGetAlertsResponse(GetAlertsResponse value) {
        return new JAXBElement<GetAlertsResponse>(_GetAlertsResponse_QNAME, GetAlertsResponse.class, null, value);
    }

}
