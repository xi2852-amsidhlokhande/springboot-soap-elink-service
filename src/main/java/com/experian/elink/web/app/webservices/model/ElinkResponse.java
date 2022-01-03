//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.02 at 10:43:28 AM IST 
//


package com.experian.elink.web.app.webservices.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HEADER"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="STG_UNQ_REF_ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="REQUEST_TS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="RESPONSE_TS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESPONSE_BODY"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ACKNOWLEDGEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Errors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "responsebody",
    "errors"
})
@XmlRootElement(name = "ElinkResponse", namespace = "http://com/experian/elink/web/app/webservices/model")
public class ElinkResponse {

    @XmlElement(name = "HEADER", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
    protected ElinkResponse.HEADER header;
    @XmlElement(name = "RESPONSE_BODY", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
    protected ElinkResponse.RESPONSEBODY responsebody;
    @XmlElement(name = "Errors", namespace = "http://com/experian/elink/web/app/webservices/model")
    protected ElinkResponse.Errors errors;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link ElinkResponse.HEADER }
     *     
     */
    public ElinkResponse.HEADER getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElinkResponse.HEADER }
     *     
     */
    public void setHEADER(ElinkResponse.HEADER value) {
        this.header = value;
    }

    /**
     * Gets the value of the responsebody property.
     * 
     * @return
     *     possible object is
     *     {@link ElinkResponse.RESPONSEBODY }
     *     
     */
    public ElinkResponse.RESPONSEBODY getRESPONSEBODY() {
        return responsebody;
    }

    /**
     * Sets the value of the responsebody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElinkResponse.RESPONSEBODY }
     *     
     */
    public void setRESPONSEBODY(ElinkResponse.RESPONSEBODY value) {
        this.responsebody = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ElinkResponse.Errors }
     *     
     */
    public ElinkResponse.Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElinkResponse.Errors }
     *     
     */
    public void setErrors(ElinkResponse.Errors value) {
        this.errors = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "errorMessage"
    })
    public static class Errors {

        @XmlElement(name = "ErrorMessage", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
        protected String errorMessage;

        /**
         * Gets the value of the errorMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * Sets the value of the errorMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrorMessage(String value) {
            this.errorMessage = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="STG_UNQ_REF_ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="REQUEST_TS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="RESPONSE_TS" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stgunqrefid",
        "type",
        "requestts",
        "responsets"
    })
    public static class HEADER {

        @XmlElement(name = "STG_UNQ_REF_ID", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger stgunqrefid;
        @XmlElement(name = "TYPE", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
        protected String type;
        @XmlElement(name = "REQUEST_TS", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar requestts;
        @XmlElement(name = "RESPONSE_TS", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar responsets;

        /**
         * Gets the value of the stgunqrefid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSTGUNQREFID() {
            return stgunqrefid;
        }

        /**
         * Sets the value of the stgunqrefid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSTGUNQREFID(BigInteger value) {
            this.stgunqrefid = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPE() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPE(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the requestts property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getREQUESTTS() {
            return requestts;
        }

        /**
         * Sets the value of the requestts property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setREQUESTTS(XMLGregorianCalendar value) {
            this.requestts = value;
        }

        /**
         * Gets the value of the responsets property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getRESPONSETS() {
            return responsets;
        }

        /**
         * Sets the value of the responsets property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setRESPONSETS(XMLGregorianCalendar value) {
            this.responsets = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ACKNOWLEDGEMENT_ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "acknowledgementid"
    })
    public static class RESPONSEBODY {

        @XmlElement(name = "ACKNOWLEDGEMENT_ID", namespace = "http://com/experian/elink/web/app/webservices/model", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger acknowledgementid;

        /**
         * Gets the value of the acknowledgementid property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getACKNOWLEDGEMENTID() {
            return acknowledgementid;
        }

        /**
         * Sets the value of the acknowledgementid property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setACKNOWLEDGEMENTID(BigInteger value) {
            this.acknowledgementid = value;
        }

    }

}