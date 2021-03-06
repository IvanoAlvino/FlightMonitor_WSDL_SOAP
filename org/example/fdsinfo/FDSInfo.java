
package org.example.fdsinfo;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.example.fdsinfo_schema.AircraftType;
import org.example.fdsinfo_schema.FlightInstanceReaderType;
import org.example.fdsinfo_schema.FlightMonitorType;
import org.example.fdsinfo_schema.FlightReaderType;
import org.example.fdsinfo_schema.PassengerReaderType;
import org.example.fdsinfo_schema.StatusType;
import org.example.fdsinfo_schema.TimeType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FDSInfo", targetNamespace = "http://www.example.org/FDSInfo/")
@XmlSeeAlso({
    org.example.fdsinfo.ObjectFactory.class,
    org.example.fdsinfo_schema.ObjectFactory.class
})
public interface FDSInfo {


    /**
     * 
     * @param model
     * @return
     *     returns java.util.List<org.example.fdsinfo_schema.AircraftType>
     * @throws GetAircraftsFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getAircrafts")
    @WebResult(name = "Aircrafts", targetNamespace = "")
    @RequestWrapper(localName = "getAircrafts", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetAircraftsRequestType")
    @ResponseWrapper(localName = "getAircraftsResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetAircraftsResponseType")
    public List<AircraftType> getAircrafts(
        @WebParam(name = "model", targetNamespace = "")
        String model)
        throws GetAircraftsFault
    ;

    /**
     * 
     * @param destination
     * @param departure
     * @param time
     * @return
     *     returns java.util.List<org.example.fdsinfo_schema.FlightReaderType>
     * @throws GetFlightsParamErr
     * @throws GetFlightsFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getFlights")
    @WebResult(name = "Flights", targetNamespace = "")
    @RequestWrapper(localName = "getFlights", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetFlightsRequestType")
    @ResponseWrapper(localName = "getFlightsResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetFlightsResponseType")
    public List<FlightReaderType> getFlights(
        @WebParam(name = "Departure", targetNamespace = "")
        String departure,
        @WebParam(name = "Destination", targetNamespace = "")
        String destination,
        @WebParam(name = "Time", targetNamespace = "")
        TimeType time)
        throws GetFlightsFault, GetFlightsParamErr
    ;

    /**
     * 
     * @param date
     * @param flightNumber
     * @param status
     * @return
     *     returns java.util.List<org.example.fdsinfo_schema.FlightInstanceReaderType>
     * @throws GetInstancesFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getInstances")
    @WebResult(name = "FlightInstances", targetNamespace = "")
    @RequestWrapper(localName = "getInstances", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetInstancesRequestType")
    @ResponseWrapper(localName = "getInstancesResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetInstancesResponseType")
    public List<FlightInstanceReaderType> getInstances(
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber,
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "status", targetNamespace = "")
        StatusType status)
        throws GetInstancesFault
    ;

    /**
     * 
     * @param date
     * @param flightNumber
     * @return
     *     returns java.util.List<org.example.fdsinfo_schema.PassengerReaderType>
     * @throws GetPassengersFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getPassengers")
    @WebResult(name = "Passengers", targetNamespace = "")
    @RequestWrapper(localName = "getPassengers", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetPassengersType")
    @ResponseWrapper(localName = "getPassengersResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetPassengersResponseType")
    public List<PassengerReaderType> getPassengers(
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber)
        throws GetPassengersFault
    ;

    /**
     * 
     * @param date
     * @param name
     * @param flightNumber
     * @return
     *     returns java.util.List<org.example.fdsinfo_schema.PassengerReaderType>
     * @throws GetPassengerFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getPassenger")
    @WebResult(name = "Passenger", targetNamespace = "")
    @RequestWrapper(localName = "getPassenger", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetPassengerRequestType")
    @ResponseWrapper(localName = "getPassengerResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetPassengerResponseType")
    public List<PassengerReaderType> getPassenger(
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date,
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber,
        @WebParam(name = "name", targetNamespace = "")
        String name)
        throws GetPassengerFault
    ;

    /**
     * 
     * @param flightNumber
     * @return
     *     returns org.example.fdsinfo_schema.FlightReaderType
     * @throws GetFlightFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getFlight")
    @WebResult(name = "Flight", targetNamespace = "")
    @RequestWrapper(localName = "getFlight", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetFlightRequestType")
    @ResponseWrapper(localName = "getFlightResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetFlightResponseType")
    public FlightReaderType getFlight(
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber)
        throws GetFlightFault
    ;

    /**
     * 
     * @param date
     * @param flightNumber
     * @return
     *     returns org.example.fdsinfo_schema.FlightInstanceReaderType
     * @throws GetInstanceFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getI")
    @WebResult(name = "FlightInstance", targetNamespace = "")
    @RequestWrapper(localName = "getInstance", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetInstanceRequestType")
    @ResponseWrapper(localName = "getInstanceResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetInstanceResponseType")
    public FlightInstanceReaderType getInstance(
        @WebParam(name = "flightNumber", targetNamespace = "")
        String flightNumber,
        @WebParam(name = "date", targetNamespace = "")
        XMLGregorianCalendar date)
        throws GetInstanceFault
    ;

    /**
     * 
     * @return
     *     returns org.example.fdsinfo_schema.FlightMonitorType
     * @throws GetAllFault
     */
    @WebMethod(action = "http://www.example.org/FDSInfo/getAll")
    @WebResult(name = "FlightMonitor", targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetAllRequestType")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://www.example.org/FDSInfo/", className = "org.example.fdsinfo.GetAllResponseType")
    public FlightMonitorType getAll()
        throws GetAllFault
    ;

}
