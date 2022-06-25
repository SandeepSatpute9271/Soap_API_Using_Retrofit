package com.app.soapapiwithretrofit.viewmodel;/*
 * Created by Sandeep(Techno Learning) on 21,June,2022
 */

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.request.EnvelopeListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode.EnvelopeListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode.EnvelopeListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.api.models.response.ResponseDataListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode.ResponseDataListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.ResponseDataListOfLanguagesByCode;
import com.app.soapapiwithretrofit.repository.Repository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class MainViewModel extends ViewModel {
    Repository repository;

    @Inject
    public MainViewModel(Repository repository){
        this.repository = repository;
    }

    public MutableLiveData<ResponseData> getCapitalCity(Envelope envelope){
        return repository.getCapital(envelope);
    }

    public MutableLiveData<ResponseDataListOfContinentsByName> getListOfContinentsByName(EnvelopeListOfContinentsByName envelope){
        return repository.getListOfContinentsByName(envelope);
    }

    public MutableLiveData<ResponseDataListOfLanguagesByCode> getListOfLanguagesByCodee(EnvelopeListOfLanguagesByCode envelope){
        return repository.getListOfLanguagesByCode(envelope);
    }

    public MutableLiveData<ResponseDataListOfCurrenciesByCode> getListOfCurrenciesByCode(EnvelopeListOfCurrenciesByCode envelope){
        return repository.getListOfCurrenciesByCode(envelope);
    }
}
