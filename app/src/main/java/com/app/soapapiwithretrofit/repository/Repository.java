package com.app.soapapiwithretrofit.repository;/*
 * Created by Sandeep(Techno Learning) on 21,June,2022
 */

import androidx.lifecycle.MutableLiveData;

import com.app.soapapiwithretrofit.api.api.ApiService;
import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.request.EnvelopeListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode.EnvelopeListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode.EnvelopeListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.api.models.response.ResponseDataListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.response.ResponseEnvelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseEnvelopeListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode.ResponseDataListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode.ResponseEnvelopeListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.ResponseDataListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.ResponseEnvelopeListOfLanguagesByCode;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Repository {
    private ApiService apiService;

    @Inject
    public Repository(ApiService apiService) {
        this.apiService = apiService;
    }

    public MutableLiveData<ResponseData> getCapital(Envelope envelope){
        Call<ResponseEnvelope> responseEnvelopeCall
                = apiService.getCapital(envelope);
        final MutableLiveData<ResponseData> responseDataMutableLiveData = new MutableLiveData<>();
        responseEnvelopeCall.enqueue(new Callback<ResponseEnvelope>() {
            @Override
            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
                ResponseData data = ((ResponseEnvelope)response.body())
                        .getBody().getCapitalCityResponse();
                responseDataMutableLiveData.postValue(data);
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                responseDataMutableLiveData.postValue(null);
            }
        });
        return  responseDataMutableLiveData;
    }

    public MutableLiveData<ResponseDataListOfContinentsByName> getListOfContinentsByName(EnvelopeListOfContinentsByName envelope){
        Call<ResponseEnvelopeListOfContinentsByName> responseEnvelopeCall
                = apiService.getListOfContinentsByName(envelope);
        final MutableLiveData<ResponseDataListOfContinentsByName> responseDataMutableLiveData = new MutableLiveData<>();
        responseEnvelopeCall.enqueue(new Callback<ResponseEnvelopeListOfContinentsByName>() {
            @Override
            public void onResponse(Call<ResponseEnvelopeListOfContinentsByName> call, Response<ResponseEnvelopeListOfContinentsByName> response) {
                ResponseDataListOfContinentsByName data = ((ResponseEnvelopeListOfContinentsByName)response.body())
                        .getBody().getResponseDataListOfContinentsByName();
                responseDataMutableLiveData.postValue(data);
            }

            @Override
            public void onFailure(Call<ResponseEnvelopeListOfContinentsByName> call, Throwable t) {
                responseDataMutableLiveData.postValue(null);
            }
        });
        return  responseDataMutableLiveData;
    }

    public MutableLiveData<ResponseDataListOfLanguagesByCode> getListOfLanguagesByCode(EnvelopeListOfLanguagesByCode envelope){
        Call<ResponseEnvelopeListOfLanguagesByCode> responseEnvelopeCall
                = apiService.getListOfLanguagesByCode(envelope);
        final MutableLiveData<ResponseDataListOfLanguagesByCode> responseDataMutableLiveData = new MutableLiveData<>();
        responseEnvelopeCall.enqueue(new Callback<ResponseEnvelopeListOfLanguagesByCode>() {
            @Override
            public void onResponse(Call<ResponseEnvelopeListOfLanguagesByCode> call, Response<ResponseEnvelopeListOfLanguagesByCode> response) {
                ResponseDataListOfLanguagesByCode data = ((ResponseEnvelopeListOfLanguagesByCode)response.body())
                        .getBody().getResponseDataListOfLanguagesByCode();
                responseDataMutableLiveData.postValue(data);
            }

            @Override
            public void onFailure(Call<ResponseEnvelopeListOfLanguagesByCode> call, Throwable t) {
                responseDataMutableLiveData.postValue(null);
            }
        });
        return  responseDataMutableLiveData;
    }

    public MutableLiveData<ResponseDataListOfCurrenciesByCode> getListOfCurrenciesByCode(EnvelopeListOfCurrenciesByCode envelope){
        Call<ResponseEnvelopeListOfCurrenciesByCode> responseEnvelopeCall
                = apiService.getListOfCurrenciesByCode(envelope);
        final MutableLiveData<ResponseDataListOfCurrenciesByCode> responseDataMutableLiveData = new MutableLiveData<>();
        responseEnvelopeCall.enqueue(new Callback<ResponseEnvelopeListOfCurrenciesByCode>() {
            @Override
            public void onResponse(Call<ResponseEnvelopeListOfCurrenciesByCode> call, Response<ResponseEnvelopeListOfCurrenciesByCode> response) {
                ResponseDataListOfCurrenciesByCode data = ((ResponseEnvelopeListOfCurrenciesByCode)response.body())
                        .getBody().getResponseDataListOfCurrenciesByCode();
                responseDataMutableLiveData.postValue(data);
            }

            @Override
            public void onFailure(Call<ResponseEnvelopeListOfCurrenciesByCode> call, Throwable t) {
                responseDataMutableLiveData.postValue(null);
            }
        });
        return  responseDataMutableLiveData;
    }
}
