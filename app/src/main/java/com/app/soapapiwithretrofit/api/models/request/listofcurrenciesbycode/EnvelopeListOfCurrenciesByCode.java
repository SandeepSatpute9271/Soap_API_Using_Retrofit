package com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "Envelope")
@NamespaceList({
        @Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
})
public class EnvelopeListOfCurrenciesByCode {

    @Inject
    EnvelopeListOfCurrenciesByCode(){

    }

    @Element(name = "Body", required = false)
    private RequestBodyListOfCurrenciesByCode requestBodyListOfCurrenciesByCode;

    public RequestBodyListOfCurrenciesByCode getRequestBodyListOfCurrenciesByCode() {
        return requestBodyListOfCurrenciesByCode;
    }

    public void setRequestBodyListOfCurrenciesByCode(RequestBodyListOfCurrenciesByCode requestBodyListOfCurrenciesByCode) {
        this.requestBodyListOfCurrenciesByCode = requestBodyListOfCurrenciesByCode;
    }
}
