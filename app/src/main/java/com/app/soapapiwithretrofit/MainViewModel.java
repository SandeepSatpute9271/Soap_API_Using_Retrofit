package com.app.soapapiwithretrofit;/*
 * Created by Sandeep(Techno Learning) on 21,June,2022
 */

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.repository.Repository;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class MainViewModel extends ViewModel {
    protected MutableLiveData<ResponseData> responseLiveData =  new MutableLiveData<>();
    Repository repository;

    @Inject
    public MainViewModel(Repository repository){
        this.repository = repository;
    }

    MutableLiveData<ResponseData> getCapitalCity(Envelope envelope){
        //responseLiveData.setValue(repository.getCapital(envelope).getValue());
        return repository.getCapital(envelope);
    }
}
