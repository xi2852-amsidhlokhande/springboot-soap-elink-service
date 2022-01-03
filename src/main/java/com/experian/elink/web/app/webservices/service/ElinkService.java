package com.experian.elink.web.app.webservices.service;

import com.experian.elink.web.app.webservices.model.ElinkIssueRequest;
import com.experian.elink.web.app.webservices.model.ElinkIssueResponse;
import com.experian.elink.web.app.webservices.model.ElinkRequest;
import com.experian.elink.web.app.webservices.model.ElinkResponse;

public interface ElinkService {
    ElinkResponse saveElinkResponse(ElinkRequest elinkRequest);

    ElinkIssueResponse saveElinkIssueResponse(ElinkIssueRequest elinkIssueRequest);
}
