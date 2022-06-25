package com.app.soapapiwithretrofit.api.models.request;

/**
 * Created by Sandeep(Techno Learning) on 16,June,2022
 */


import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import javax.inject.Inject;

@Root(name = Constants.METHOD_LIST_OF_Continents_BY_NAME, strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class RequestDataListOfContinentsByName {
    @Inject
    RequestDataListOfContinentsByName(){}
}
