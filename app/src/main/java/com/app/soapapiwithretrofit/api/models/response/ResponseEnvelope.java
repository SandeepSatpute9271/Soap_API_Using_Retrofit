package com.app.soapapiwithretrofit.api.models.response;

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
public class ResponseEnvelope {

    @Element(name = "Body", required = false)
    private ResponseBody body;

    public ResponseBody getBody() {
        return body;
    }

    public void setBody(ResponseBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ResponseEnvelope{" +
                "body=" + body +
                '}';
    }
}
