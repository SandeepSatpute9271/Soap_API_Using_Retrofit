package com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode;

import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "ListOfCurrenciesByCodeResponse", strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class ResponseDataListOfCurrenciesByCode {

    @ElementList(name = "ListOfCurrenciesByCodeResult", required = false)
    public List<tCurrency> tCurrencies;
}
