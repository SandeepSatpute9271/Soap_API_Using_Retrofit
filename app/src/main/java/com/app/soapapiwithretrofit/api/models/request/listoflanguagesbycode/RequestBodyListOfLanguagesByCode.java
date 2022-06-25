package com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

@Root(name = "Body", strict = false)
public class RequestBodyListOfLanguagesByCode {

    @Inject
    RequestBodyListOfLanguagesByCode(){}

    @Element(name = "ListOfLanguagesByCode",required = false)
    private RequestDataListOfLanguagesByCode requestDataListOfLanguagesByCode;

    public RequestDataListOfLanguagesByCode getRequestDataListOfLanguagesByCode() {
        return requestDataListOfLanguagesByCode;
    }

    public void setRequestDataListOfLanguagesByCode(RequestDataListOfLanguagesByCode requestDataListOfLanguagesByCode) {
        this.requestDataListOfLanguagesByCode = requestDataListOfLanguagesByCode;
    }
}
