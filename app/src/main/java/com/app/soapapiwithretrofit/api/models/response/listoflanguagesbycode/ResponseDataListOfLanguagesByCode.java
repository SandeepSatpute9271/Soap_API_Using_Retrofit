package com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode;

import com.app.soapapiwithretrofit.utils.Constants;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

@Root(name = "ListOfLanguagesByCodeResponse", strict = false)
@Namespace(reference = Constants.NAMESPACE)
public class ResponseDataListOfLanguagesByCode {

    @ElementList(name = "ListOfLanguagesByCodeResult", required = false)
    public List<tContinentLang> tContinent;
}
