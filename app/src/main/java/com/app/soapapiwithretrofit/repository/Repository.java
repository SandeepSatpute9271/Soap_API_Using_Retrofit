package com.app.soapapiwithretrofit.repository;/*
 * Created by Sandeep(Techno Learning) on 21,June,2022
 */

import androidx.lifecycle.MutableLiveData;

import com.app.soapapiwithretrofit.api.ApiClient;
import com.app.soapapiwithretrofit.api.api.ApiService;
import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.api.models.response.ResponseEnvelope;
import com.app.soapapiwithretrofit.utils.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Repository {
    private ApiService apiService;
    //@Inject
    public Repository() {
        this.apiService = ApiClient.getApi();
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
                responseDataMutableLiveData.setValue(data);
            }

            @Override
            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
                responseDataMutableLiveData.setValue(null);
            }
        });
        return  responseDataMutableLiveData;
    }
}
