package com.app.soapapiwithretrofit.api.models.response;

import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "ListOfContinentsByNameResponse", strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class ResponseDataListOfContinentsByName {

    @ElementList(name = "ListOfContinentsByNameResult", required = false)
    public List<tContinent> tContinent;
}
