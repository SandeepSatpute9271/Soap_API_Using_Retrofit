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
import com.app.soapapiwithretrofit.api.models.request.RequestBody;
import com.app.soapapiwithretrofit.api.models.request.RequestData;
import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
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
        pDialog = Utils.showProgressBar(this);
        data.setsCountryISOCode(textToConvert);
        body.setRequestData(data);
        envelope.setBody(body);

        long start = System.currentTimeMillis();

        mainViewModel.getCapitalCity(envelope).observe(this, new Observer<ResponseData>() {
            @Override
            public void onChanged(ResponseData responseData) {
                if (responseData!=null) {
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

    protected void hideProgressDialog() {
        if (pDialog!=null) {
            pDialog.dismiss();
        }
    }

}