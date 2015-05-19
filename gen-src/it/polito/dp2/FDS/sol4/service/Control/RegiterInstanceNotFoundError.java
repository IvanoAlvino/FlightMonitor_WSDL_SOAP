
package it.polito.dp2.FDS.sol4.service.Control;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "RegisterInstanceNotFoundError", targetNamespace = "http://www.example.org/FDSControl/")
public class RegiterInstanceNotFoundError
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RegisterInstanceNotFoundErrorType faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RegiterInstanceNotFoundError(String message, RegisterInstanceNotFoundErrorType faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RegiterInstanceNotFoundError(String message, RegisterInstanceNotFoundErrorType faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.FDS.sol4.service.Control.RegisterInstanceNotFoundErrorType
     */
    public RegisterInstanceNotFoundErrorType getFaultInfo() {
        return faultInfo;
    }

}
