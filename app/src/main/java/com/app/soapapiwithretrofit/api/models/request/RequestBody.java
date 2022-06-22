package com.app.soapapiwithretrofit.api.models.request;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

@Root(name = "Body", strict = false)
public class RequestBody {

    @Inject
    RequestBody(){

    }

    @Element(name = "CapitalCity",required = false)
    private RequestData requestData;

    public RequestData getRequestData() {
        return requestData;
    }

    public void setRequestData(RequestData requestData) {
        this.requestData = requestData;
    }
}
