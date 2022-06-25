package com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "soap12:Body", strict = false)
public class ResponseBodyListOfCurrenciesByCode {

    @Element(name = "ListOfCurrenciesByCodeResponse",required = false)
    private ResponseDataListOfCurrenciesByCode responseDataListOfCurrenciesByCode;

    public ResponseDataListOfCurrenciesByCode getResponseDataListOfCurrenciesByCode() {
        return responseDataListOfCurrenciesByCode;
    }

    public void setResponseDataListOfCurrenciesByCode(ResponseDataListOfCurrenciesByCode responseDataListOfCurrenciesByCode) {
        this.responseDataListOfCurrenciesByCode = responseDataListOfCurrenciesByCode;
    }
}
