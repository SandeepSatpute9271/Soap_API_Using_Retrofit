package com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "soap12:Body", strict = false)
public class ResponseBodyListOfLanguagesByCode {

    @Element(name = "ListOfLanguagesByCodeResponse",required = false)
    private ResponseDataListOfLanguagesByCode responseDataListOfLanguagesByCode;

    public ResponseDataListOfLanguagesByCode getResponseDataListOfLanguagesByCode() {
        return responseDataListOfLanguagesByCode;
    }

    public void setResponseDataListOfLanguagesByCode(ResponseDataListOfLanguagesByCode responseDataListOfLanguagesByCode) {
        this.responseDataListOfLanguagesByCode = responseDataListOfLanguagesByCode;
    }
}
