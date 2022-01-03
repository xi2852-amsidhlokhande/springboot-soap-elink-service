package com.experian.elink.web.app.webservices.endpoint;

import com.experian.elink.web.app.webservices.model.ElinkIssueRequest;
import com.experian.elink.web.app.webservices.model.ElinkIssueResponse;
import com.experian.elink.web.app.webservices.model.ElinkRequest;
import com.experian.elink.web.app.webservices.model.ElinkResponse;
import com.experian.elink.web.app.webservices.service.ElinkService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@RequiredArgsConstructor
@Slf4j
public class ElinkEndpoint {

    private static final String NAMESPACE = "http://com/experian/elink/web/app/webservices/model";
    private final ElinkService elinkService;

    @PayloadRoot(namespace = NAMESPACE, localPart = "ElinkRequest")
    @ResponsePayload
    public ElinkResponse saveElinkRequest(@RequestPayload ElinkRequest elinkRequest) {
        log.info("saveElinkRequest method of ElinkEndpoint");
        return elinkService.saveElinkResponse(elinkRequest);
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "ElinkIssueRequest")
    @ResponsePayload
    public ElinkIssueResponse saveElinkIssueRequest(@RequestPayload ElinkIssueRequest elinkIssueRequest) {
        log.info("saveElinkIssueRequest method of ElinkEndpoint");
        return elinkService.saveElinkIssueResponse(elinkIssueRequest);
    }

}
