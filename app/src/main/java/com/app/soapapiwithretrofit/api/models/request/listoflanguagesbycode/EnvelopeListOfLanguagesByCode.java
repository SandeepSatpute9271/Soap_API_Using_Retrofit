package com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode;

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
public class EnvelopeListOfLanguagesByCode {

    @Inject
    EnvelopeListOfLanguagesByCode(){

    }

    @Element(name = "Body", required = false)
    private RequestBodyListOfLanguagesByCode requestBodyListOfLanguagesByCode;

    public RequestBodyListOfLanguagesByCode getRequestBodyListOfLanguagesByCode() {
        return requestBodyListOfLanguagesByCode;
    }

    public void setRequestBodyListOfLanguagesByCode(RequestBodyListOfLanguagesByCode requestBodyListOfLanguagesByCode) {
        this.requestBodyListOfLanguagesByCode = requestBodyListOfLanguagesByCode;
    }
}
