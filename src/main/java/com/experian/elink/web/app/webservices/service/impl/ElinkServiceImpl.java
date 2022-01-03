package com.experian.elink.web.app.webservices.service.impl;

import com.experian.elink.web.app.webservices.model.ElinkIssueRequest;
import com.experian.elink.web.app.webservices.model.ElinkIssueResponse;
import com.experian.elink.web.app.webservices.model.ElinkRequest;
import com.experian.elink.web.app.webservices.model.ElinkResponse;
import com.experian.elink.web.app.webservices.service.ElinkService;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Slf4j
public class ElinkServiceImpl implements ElinkService {
    private final static Map<String, ElinkRequest> ELINK_REQUEST_MAP = new HashMap<>();

    @Override
    public ElinkResponse saveElinkResponse(ElinkRequest elinkRequest) {
        log.info("saveElinkResponse method from ElinkServiceImpl class is called ");
        ElinkRequest.REQUESTBODY requestBody = Optional.of(elinkRequest.getREQUESTBODY())
                .orElseThrow(() -> new RuntimeException("RequestBody must not be null"));
        log.info("Saving ElinkRequest with ApplicationId {}  and request {}", requestBody.getAPPLICATIONID(), requestBody.toString());
        ELINK_REQUEST_MAP.put(requestBody.getAPPLICATIONID(), elinkRequest);
        ElinkResponse.HEADER header = new ElinkResponse.HEADER();
        header.setTYPE("RESPONSE");
        header.setSTGUNQREFID(new BigInteger("21042000091618989628739"));
        header.setRESPONSETS(new XMLGregorianCalendarImpl());

        ElinkResponse.RESPONSEBODY responseBody = new ElinkResponse.RESPONSEBODY();
        responseBody.setACKNOWLEDGEMENTID(new BigInteger("21042000091618989628739"));

        ElinkResponse elinkResponse = new ElinkResponse();
        elinkResponse.setHEADER(header);
        elinkResponse.setRESPONSEBODY(responseBody);
        return elinkResponse;
    }

    @Override
    public ElinkIssueResponse saveElinkIssueResponse(ElinkIssueRequest elinkIssueRequest) {
        log.info("saveElinkIssueResponse method from ElinkServiceImpl class is called ");
        return new ElinkIssueResponse();
    }
}
