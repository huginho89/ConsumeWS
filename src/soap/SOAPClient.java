/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soap;

import java.util.List;
import javax.xml.ws.WebServiceFeature;
import mx.omnitracs.maya.client.services.rest.sei.ListVehicleActivityPositionResponseDTO;
import mx.omnitracs.maya.client.services.rest.sei.VehicleActivityPositionResponseDTO;
import mx.omnitracs.maya.client.services.rest.sei.VehicleActivityRequestDTO;
import mx.omnitracs.maya.client.services.rest.sei.impl.IVehicleActivityWebService;
import mx.omnitracs.maya.client.services.rest.sei.impl.VehicleActivityWebServiceService;

/**
 *
 * @author Victor Garcia
 */
public class SOAPClient {
    public static void main(String[] args) {
     
VehicleActivityWebServiceService as = new VehicleActivityWebServiceService();
        IVehicleActivityWebService vehicleActivityWebServicePort = as.getVehicleActivityWebServicePort();

		      //IVehicleActivityWebService a = new IVehicleActivityWebService();        
                      VehicleActivityRequestDTO request = new VehicleActivityRequestDTO();
                      request.setClientCode("mx054e0");  
                      request.setEndDate("2013-11-11 12:00:00");
                      request.setPassword("chrono07");
                      request.setStartDate("2013-08-01 12:00:00");
                      request.setUserName("mramos");                      
        ListVehicleActivityPositionResponseDTO positions = vehicleActivityWebServicePort.getPositions(request);
        List<VehicleActivityPositionResponseDTO> vehicles = positions.getVehicles();
        System.out.print(vehicles.size());
		
 
		
 
    }
}
