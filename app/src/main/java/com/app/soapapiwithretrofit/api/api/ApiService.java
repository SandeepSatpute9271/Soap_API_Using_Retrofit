package com.app.soapapiwithretrofit.api.api;

import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.request.EnvelopeListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode.EnvelopeListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode.EnvelopeListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.ResponseEnvelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseEnvelopeListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode.ResponseEnvelopeListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.ResponseEnvelopeListOfLanguagesByCode;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 *  Created by Sandeep(Techno Learning) on 16,June,2022
 */

public interface ApiService {
    @Headers({"Content-Type: application/soap+xml", "charset: utf-8", "Content-Length: length"})
    @POST("/websamples.countryinfo/CountryInfoService.wso")
    Call<ResponseEnvelope> getCapital(@Body Envelope body);

    @Headers({"Content-Type: application/soap+xml", "charset: utf-8", "Content-Length: length"})
    @POST("/websamples.countryinfo/CountryInfoService.wso")
    Call<ResponseEnvelopeListOfContinentsByName> getListOfContinentsByName(@Body EnvelopeListOfContinentsByName envelopeListOfContinentsByName);

    @Headers({"Content-Type: application/soap+xml", "charset: utf-8", "Content-Length: length"})
    @POST("/websamples.countryinfo/CountryInfoService.wso")
    Call<ResponseEnvelopeListOfLanguagesByCode> getListOfLanguagesByCode(@Body EnvelopeListOfLanguagesByCode envelopeListOfLanguagesByCode);


    @Headers({"Content-Type: application/soap+xml", "charset: utf-8", "Content-Length: length"})
    @POST("/websamples.countryinfo/CountryInfoService.wso")
    Call<ResponseEnvelopeListOfCurrenciesByCode> getListOfCurrenciesByCode(@Body EnvelopeListOfCurrenciesByCode envelopeListOfCurrenciesByCode);


}