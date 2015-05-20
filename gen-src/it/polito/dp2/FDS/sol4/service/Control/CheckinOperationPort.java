
package it.polito.dp2.FDS.sol4.service.Control;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CheckinOperationPort", targetNamespace = "http://www.example.org/FDSControl/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CheckinOperationPort {


    /**
     * 
     * @param passenger
     * @param seat
     * @param name
     * @param aircraft
     * @param delay
     * @param flightNumber
     * @param date
     * @param gate
     * @throws ServiceUnavaibleMessage
     * @throws PassengerAlreadyCheckinFault
     * @throws InstanceNotFoundMessage
     */
    @WebMethod(operationName = "CheckInOperation", action = "http://www.example.org/FDSControl/CheckInOperation")
    @RequestWrapper(localName = "CheckInOperation", targetNamespace = "http://www.example.org/FDSControl/", className = "it.polito.dp2.FDS.sol4.service.Control.CheckInOperationRequestType")
    @ResponseWrapper(localName = "CheckInOperationResponse", targetNamespace = "http://www.example.org/FDSControl/", className = "it.polito.dp2.FDS.sol4.service.Control.CheckinOperationResponseType")
    public void checkInOperation(
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber,
        @WebParam(name = "Aircraft", targetNamespace = "")
        String aircraft,
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "passenger", targetNamespace = "")
        String passenger,
        @WebParam(name = "name", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> name,
        @WebParam(name = "seat", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> seat,
        @WebParam(name = "gate", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<String> gate,
        @WebParam(name = "delay", targetNamespace = "", mode = WebParam.Mode.OUT)
        Holder<BigInteger> delay)
        throws InstanceNotFoundMessage, PassengerAlreadyCheckinFault, ServiceUnavaibleMessage
    ;

}
