package com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode;/*
 * Created by Sandeep(Techno Learning) on 25,June,2022
 */

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "tContinent")
public
class tContinentLang {
    @Element(name = "sISOCode", required = false)
    public String sISOCode;
    @Element(name = "sName", required = false)
    public String sName;

    public String getsISOCode() {
        return sISOCode;
    }

    public void setsISOCode(String sISOCode) {
        this.sISOCode = sISOCode;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
