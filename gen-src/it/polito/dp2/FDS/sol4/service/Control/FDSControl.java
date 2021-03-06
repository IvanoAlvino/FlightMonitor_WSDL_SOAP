
package it.polito.dp2.FDS.sol4.service.Control;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FDSControl", targetNamespace = "http://www.example.org/FDSControl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FDSControl {


    /**
     * 
     * @param flightNumber
     * @param date
     * @return
     *     returns boolean
     * @throws InstanceNotFoundMessage
     * @throws ServiceUnavaibleMessage
     * @throws InstanceYetBoardedError
     */
    @WebMethod(operationName = "BoardingInstance", action = "http://www.example.org/FDSControl/BoardingInstance")
    @WebResult(name = "returnValue", targetNamespace = "")
    @RequestWrapper(localName = "BoardingInstance", targetNamespace = "http://www.example.org/FDSControl/", className = "it.polito.dp2.FDS.sol4.service.Control.BoardingInstanceRequest")
    @ResponseWrapper(localName = "BoardingInstanceResponse", targetNamespace = "http://www.example.org/FDSControl/", className = "it.polito.dp2.FDS.sol4.service.Control.BoardinInstanceResponseType")
    public boolean boardingInstance(
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber,
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date)
        throws InstanceNotFoundMessage, InstanceYetBoardedError, ServiceUnavaibleMessage
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.service.Control.RegisterPassengerResponseType
     * @throws RegiterInstanceNotFoundError
     * @throws RegisterPassengerNotFoundErrorMessage
     * @throws ServiceUnavaibleMessage
     * @throws InstanceNotBookedFault
     */
    @WebMethod(operationName = "RegisterPassenger", action = "http://www.example.org/FDSControl/RegisterPassenger")
    @WebResult(name = "RegisterPassengerResponse", targetNamespace = "http://www.example.org/FDSControl/", partName = "parameters")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    public RegisterPassengerResponseType registerPassenger(
        @WebParam(name = "RegisterPassengerRequest", targetNamespace = "http://www.example.org/FDSControl/", partName = "parameters")
        RegisterPassengerRequestType parameters)
        throws InstanceNotBookedFault, RegisterPassengerNotFoundErrorMessage, RegiterInstanceNotFoundError, ServiceUnavaibleMessage
    ;

    /**
     * 
     * @param flightNumber
     * @param date
     * @return
     *     returns java.util.List<it.polito.dp2.FDS.sol4.service.xsdpack.PassengerReaderType>
     * @throws InstanceNotFoundMessage
     * @throws ServiceUnavaibleMessage
     */
    @WebMethod(action = "http://www.example.org/FDSControl/getPassengers")
    @WebResult(name = "Passengers", targetNamespace = "")
    @RequestWrapper(localName = "getPassengers", targetNamespace = "http://www.example.org/FDSControl/", className = "it.polito.dp2.FDS.sol4.service.Control.GetPassengersRequestType")
    @ResponseWrapper(localName = "getPassengersResponse", targetNamespace = "http://www.example.org/FDSControl/", className = "it.polito.dp2.FDS.sol4.service.Control.GetPassengersResponseType")
    public List<PassengerReaderType> getPassengers(
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber)
        throws InstanceNotFoundMessage, ServiceUnavaibleMessage
    ;

}
