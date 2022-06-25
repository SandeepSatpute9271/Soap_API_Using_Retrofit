package com.app.soapapiwithretrofit.api.models.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "soap12:Body", strict = false)
public class ResponseBodyListOfContinentsByName {

    @Element(name = "ListOfContinentsByNameResponse",required = false)
    private ResponseDataListOfContinentsByName responseDataListOfContinentsByName;

    public ResponseDataListOfContinentsByName getResponseDataListOfContinentsByName() {
        return responseDataListOfContinentsByName;
    }

    public void setResponseDataListOfContinentsByName(ResponseDataListOfContinentsByName responseDataListOfContinentsByName) {
        this.responseDataListOfContinentsByName = responseDataListOfContinentsByName;
    }
}
