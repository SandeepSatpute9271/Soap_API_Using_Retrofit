package com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

@Root(name = "Body", strict = false)
public class RequestBodyListOfCurrenciesByCode {

    @Inject
    RequestBodyListOfCurrenciesByCode(){}

    @Element(name = "ListOfCurrenciesByCode",required = false)
    private RequestDataListOfCurrenciesByCode requestDataListOfCurrenciesByCode;

    public RequestDataListOfCurrenciesByCode getRequestDataListOfCurrenciesByCode() {
        return requestDataListOfCurrenciesByCode;
    }

    public void setRequestDataListOfCurrenciesByCode(RequestDataListOfCurrenciesByCode requestDataListOfCurrenciesByCode) {
        this.requestDataListOfCurrenciesByCode = requestDataListOfCurrenciesByCode;
    }
}
