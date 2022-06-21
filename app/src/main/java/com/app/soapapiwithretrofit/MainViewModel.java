package com.app.soapapiwithretrofit;/*
 * Created by Sandeep(Techno Learning) on 21,June,2022
 */

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.repository.Repository;


//@HiltViewModel
public class MainViewModel extends ViewModel {
    private MutableLiveData<ResponseData> responseLiveData =  new MutableLiveData<>();

    Repository repository;

    //@Inject
    public MainViewModel(){
        this.repository = new Repository();
    }

    MutableLiveData<ResponseData> getCapitalCity(Envelope envelope){
        return repository.getCapital(envelope);
    }
}
