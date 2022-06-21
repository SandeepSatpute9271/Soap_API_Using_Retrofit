package com.app.soapapiwithretrofit.api.models.response;

import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "CapitalCityResponse", strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class ResponseData {

    @Element(name = "CapitalCityResult", required = false)
    private String capitalCityResult;

    public String getCapitalCityResult() {
        return capitalCityResult;
    }

    public void setCapitalCityResult(String capitalCityResult) {
        this.capitalCityResult = capitalCityResult;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "capitalCityResult='" + capitalCityResult + '\'' +
                '}';
    }
}
