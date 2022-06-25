package com.app.soapapiwithretrofit.api.models.response;/*
 * Created by Sandeep(Techno Learning) on 25,June,2022
 */

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "tContinent")
public class tContinent {
    @Element(name = "sCode", required = false)
    public String sCode;
    @Element(name = "sName", required = false)
    public String sName;

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
