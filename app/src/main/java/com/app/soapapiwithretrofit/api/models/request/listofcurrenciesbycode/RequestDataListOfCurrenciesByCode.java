package com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */


import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

@Root(name = Constants.METHOD_LIST_OF_CURR_BY_CODE, strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class RequestDataListOfCurrenciesByCode {
    @Inject
    RequestDataListOfCurrenciesByCode(){}
}
