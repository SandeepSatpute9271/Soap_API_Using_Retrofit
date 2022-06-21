package com.app.soapapiwithretrofit.api.models.response;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "soap12:Body", strict = false)
public class ResponseBody {

    @Element(name = "CapitalCityResponse",required = false)
    private ResponseData capitalCityResponse;

    public ResponseData getCapitalCityResponse() {
        return capitalCityResponse;
    }

    public void setCapitalCityResponse(ResponseData capitalCityResponse) {
        this.capitalCityResponse = capitalCityResponse;
    }

    @Override
    public String toString() {
        return "ResponseBody{" +
                "capitalCityResponse=" + capitalCityResponse +
                '}';
    }
}
