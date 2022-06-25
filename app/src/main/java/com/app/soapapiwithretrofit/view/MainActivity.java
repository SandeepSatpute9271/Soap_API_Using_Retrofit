package com.app.soapapiwithretrofit.view;
/* Created by Sandeep(Techno Learning) on 16,June,2022
        */
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.app.soapapiwithretrofit.R;
import com.app.soapapiwithretrofit.api.models.request.EnvelopeListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.request.RequestBody;
import com.app.soapapiwithretrofit.api.models.request.RequestBodyListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.request.RequestData;
import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.request.RequestDataListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode.EnvelopeListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode.RequestBodyListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.request.listofcurrenciesbycode.RequestDataListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode.EnvelopeListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode.RequestBodyListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.request.listoflanguagesbycode.RequestDataListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.api.models.response.ResponseDataListOfContinentsByName;
import com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode.ResponseDataListOfCurrenciesByCode;
import com.app.soapapiwithretrofit.api.models.response.listofcurrenciesbycode.tCurrency;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.ResponseDataListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.ResponseEnvelopeListOfLanguagesByCode;
import com.app.soapapiwithretrofit.api.models.response.listoflanguagesbycode.tContinentLang;
import com.app.soapapiwithretrofit.api.models.response.tContinent;
import com.app.soapapiwithretrofit.utils.Utils;
import com.app.soapapiwithretrofit.viewmodel.MainViewModel;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private ProgressDialog pDialog;
    private TextView tvCapital;
    private EditText etCountry;
    private static String TAG = MainActivity.class.getSimpleName();

    @Inject
    Envelope envelope;
    @Inject
    RequestBody body;
    @Inject
    RequestData data;

    @Inject
    EnvelopeListOfContinentsByName envelopeListOfContinentsByName;
    @Inject
    RequestBodyListOfContinentsByName bodyListOfContinentsByName;
    @Inject
    RequestDataListOfContinentsByName dataListOfContinentsByName;

    @Inject
    EnvelopeListOfLanguagesByCode envelopeListOfLanguagesByCode;
    @Inject
    RequestBodyListOfLanguagesByCode bodyListOfLanguagesByCode;
    @Inject
    RequestDataListOfLanguagesByCode dataListOfLanguagesByCode;

    @Inject
    EnvelopeListOfCurrenciesByCode envelopeListOfCurrenciesByCode;
    @Inject
    RequestBodyListOfCurrenciesByCode bodyListOfCurrenciesByCode;
    @Inject
    RequestDataListOfCurrenciesByCode dataListOfCurrenciesByCode;

    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        initViews();
    }

    private void initViews() {
        tvCapital = findViewById(R.id.tvCapital);
        etCountry = findViewById(R.id.etCountry);
        etCountry.setText("IN");
    }

    public void CallApi(View view) {
        if(etCountry.getText().toString().trim().equals("")){
            Toast.makeText(this, "Please enter country name", Toast.LENGTH_SHORT).show();
        }else{
            getCapital(etCountry.getText().toString().trim());
            tvCapital.setText("");
        }
    }

    private void getCapital(String textToConvert) {
        showProgressBar();
        data.setsCountryISOCode(textToConvert);
        body.setRequestData(data);
        envelope.setBody(body);
        long start = System.currentTimeMillis();
        mainViewModel.getCapitalCity(envelope).observe(this, new Observer<ResponseData>() {
            @Override
            public void onChanged(ResponseData responseData) {
                if (responseData!=null) {
                    calculateTimeOfExecution(start, "CapitalCity");
                    hideProgressDialog();
                    if (Utils.hasValue(responseData.getCapitalCityResult())) {
                        long end = System.currentTimeMillis();
                        long elapsedTime = end - start;
                        Log.e(TAG,"Retrofit: Time Taken In milli sec:"+elapsedTime+" for Input "+etCountry.getText().toString().trim());
                        tvCapital.setText(responseData.getCapitalCityResult());
                    }
                }
            }
        });
    }

    private void getListOfContinentsByName() {
        showProgressBar();
        long start = System.currentTimeMillis();
        bodyListOfContinentsByName.setRequestDataListOfContinentsByName(dataListOfContinentsByName);
        envelopeListOfContinentsByName.setRequestBodyListOfContinentsByName(bodyListOfContinentsByName);
        mainViewModel.getListOfContinentsByName(envelopeListOfContinentsByName).observe(this, new Observer<ResponseDataListOfContinentsByName>() {
            @Override
            public void onChanged(ResponseDataListOfContinentsByName responseData) {
                if (responseData!=null) {
                    calculateTimeOfExecution(start, "ListOfContinentsByName");
                    hideProgressDialog();
                        String resp="";
                        for(tContinent tc: responseData.tContinent){
                            resp = resp+ tc.getsName()+" "+tc.getsCode()+"\n";
                        }
                        tvCapital.setText(resp);
                }
            }
        });
    }

    private void getListOfLanguagesByCode() {
        showProgressBar();
        long start = System.currentTimeMillis();
        bodyListOfLanguagesByCode.setRequestDataListOfLanguagesByCode(dataListOfLanguagesByCode);
        envelopeListOfLanguagesByCode.setRequestBodyListOfLanguagesByCode(bodyListOfLanguagesByCode);
        mainViewModel.getListOfLanguagesByCodee(envelopeListOfLanguagesByCode).observe(this, new Observer<ResponseDataListOfLanguagesByCode>() {
            @Override
            public void onChanged(ResponseDataListOfLanguagesByCode responseData) {
                if (responseData!=null) {
                    calculateTimeOfExecution(start, "ListOfContinentsByName");
                    hideProgressDialog();
                    String resp="";
                    for(tContinentLang tc: responseData.tContinent){
                        resp = resp+ tc.getsName()+" "+tc.getsISOCode()+"\n";
                    }
                    tvCapital.setText(resp);
                }
            }
        });
    }

    private void getListOfCurrenciesByCode() {
        showProgressBar();
        long start = System.currentTimeMillis();
        bodyListOfCurrenciesByCode.setRequestDataListOfCurrenciesByCode(dataListOfCurrenciesByCode);
        envelopeListOfCurrenciesByCode.setRequestBodyListOfCurrenciesByCode(bodyListOfCurrenciesByCode);
        mainViewModel.getListOfCurrenciesByCode(envelopeListOfCurrenciesByCode).observe(this, new Observer<ResponseDataListOfCurrenciesByCode>() {
            @Override
            public void onChanged(ResponseDataListOfCurrenciesByCode responseData) {
                if (responseData!=null) {
                    calculateTimeOfExecution(start, "ListOfContinentsByName");
                    hideProgressDialog();
                    String resp="";
                    for(tCurrency tc: responseData.tCurrencies){
                        resp = resp+ tc.getsName()+" "+tc.getsISOCode()+"\n";
                    }
                    tvCapital.setText(resp);
                }
            }
        });
    }

    private void showProgressBar() {
        pDialog = Utils.showProgressBar(this);
        tvCapital.setText("Loading...");
    }

    private void calculateTimeOfExecution(long start, String methodName) {
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        Log.e(TAG,"Retrofit: Time Taken to execute "+methodName+" In milli sec:"+elapsedTime+" for Input "+etCountry.getText().toString().trim());

    }


    protected void hideProgressDialog() {
        if (pDialog!=null) {
            pDialog.dismiss();
        }
    }

    public void getListOfContinentsByName(View view) {
        getListOfContinentsByName();
    }

    public void getListOfLanguagesByCode(View view) {
        getListOfLanguagesByCode();
    }

    public void getListOfCurrenciesByCode(View view) {
        getListOfCurrenciesByCode();
    }
}