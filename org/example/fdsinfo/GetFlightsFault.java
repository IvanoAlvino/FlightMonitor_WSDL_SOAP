
package org.example.fdsinfo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "getFlightsFault", targetNamespace = "http://www.example.org/FDSInfo/")
public class GetFlightsFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private GetFlightsFaultType faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public GetFlightsFault(String message, GetFlightsFaultType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public GetFlightsFault(String message, GetFlightsFaultType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.example.fdsinfo.GetFlightsFaultType
     */
    public GetFlightsFaultType getFaultInfo() {
        return faultInfo;
    }

}
