package com.app.soapapiwithretrofit.api.models.request;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */


import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(name = Constants.METHOD_NAME, strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class RequestData {
    @Element(name = "sCountryISOCode", required = false)
    private String sCountryISOCode;

    public String getsCountryISOCode() {
        return sCountryISOCode;
    }

    public void setsCountryISOCode(String sCountryISOCode) {
        this.sCountryISOCode = sCountryISOCode;
    }
}
