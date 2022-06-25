package com.app.soapapiwithretrofit.api.models.request;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

@Root(name = "Body", strict = false)
public class RequestBodyListOfContinentsByName {

    @Inject
    RequestBodyListOfContinentsByName(){}

    @Element(name = "ListOfContinentsByName",required = false)
    private RequestDataListOfContinentsByName requestDataListOfContinentsByName;

    public RequestDataListOfContinentsByName getRequestDataListOfContinentsByName() {
        return requestDataListOfContinentsByName;
    }

    public void setRequestDataListOfContinentsByName(RequestDataListOfContinentsByName requestDataListOfContinentsByName) {
        this.requestDataListOfContinentsByName = requestDataListOfContinentsByName;
    }
}
