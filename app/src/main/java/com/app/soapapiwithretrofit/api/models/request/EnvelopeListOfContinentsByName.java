package com.app.soapapiwithretrofit.api.models.request;

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
public class EnvelopeListOfContinentsByName {

    @Inject
    EnvelopeListOfContinentsByName(){

    }

    @Element(name = "Body", required = false)
    private RequestBodyListOfContinentsByName requestBodyListOfContinentsByName;

    public RequestBodyListOfContinentsByName getRequestBodyListOfContinentsByName() {
        return requestBodyListOfContinentsByName;
    }

    public void setRequestBodyListOfContinentsByName(RequestBodyListOfContinentsByName requestBodyListOfContinentsByName) {
        this.requestBodyListOfContinentsByName = requestBodyListOfContinentsByName;
    }
}
