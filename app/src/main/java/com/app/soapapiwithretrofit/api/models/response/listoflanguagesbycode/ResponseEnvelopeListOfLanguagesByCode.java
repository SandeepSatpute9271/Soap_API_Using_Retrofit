package com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode;

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
public class ResponseEnvelopeListOfLanguagesByCode {

    @Element(name = "Body", required = false)
    private ResponseBodyListOfLanguagesByCode body;

    public ResponseBodyListOfLanguagesByCode getBody() {
        return body;
    }

    public void setBody(ResponseBodyListOfLanguagesByCode body) {
        this.body = body;
    }
}
