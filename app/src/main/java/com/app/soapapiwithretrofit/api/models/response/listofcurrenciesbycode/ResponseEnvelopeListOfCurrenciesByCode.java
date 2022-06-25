package com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.NamespaceList;
import org.simpleframework.xml.Root;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "Envelope")
@NamespaceList({
        @Namespace(reference = "http://schemas.xmlsoap.org/soap/envelope/")
})
public class ResponseEnvelopeListOfCurrenciesByCode {

    @Element(name = "Body", required = false)
    private ResponseBodyListOfCurrenciesByCode body;

    public ResponseBodyListOfCurrenciesByCode getBody() {
        return body;
    }

    public void setBody(ResponseBodyListOfCurrenciesByCode body) {
        this.body = body;
    }
}
