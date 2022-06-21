package com.app.soapapiwithretrofit;
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

import com.app.soapapiwithretrofit.api.ApiClient;
import com.app.soapapiwithretrofit.api.models.request.RequestBody;
import com.app.soapapiwithretrofit.api.models.request.RequestData;
import com.app.soapapiwithretrofit.api.models.request.Envelope;
import com.app.soapapiwithretrofit.api.models.response.ResponseData;
import com.app.soapapiwithretrofit.api.models.response.ResponseEnvelope;
import com.app.soapapiwithretrofit.utils.Utils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private ProgressDialog pDialog;
    private TextView tvCapital;
    private EditText etCountry;
    private String tag = MainActivity.class.getSimpleName();

    //@Inject
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        tvCapital = findViewById(R.id.tvCapital);
        etCountry = findViewById(R.id.etCountry);
        etCountry.setText("IN");
    }

    public void CallApi(View view) {
        if(etCountry.getText().toString().trim().equals("")){
            Toast.makeText(this, "Please enter Country name", Toast.LENGTH_SHORT).show();
        }else{
            getCapital(etCountry.getText().toString().trim());
            tvCapital.setText("");
        }
    }

    private void getCapital(String textToConvert) {
        pDialog = Utils.showProgressBar(this);

        Envelope envelope = new Envelope();
        RequestBody body = new RequestBody();
        RequestData data = new RequestData();
        data.setsCountryISOCode(textToConvert);
        body.setRequestData(data);
        envelope.setBody(body);

        mainViewModel.getCapitalCity(envelope).observe(this, new Observer<ResponseData>() {
            @Override
            public void onChanged(ResponseData responseData) {
                if (responseData!=null) {
                    hideProgressDialog();
                    if (Utils.hasValue(responseData.getCapitalCityResult())) {
                        tvCapital.setText(responseData.getCapitalCityResult());
                    }
                }
            }
        });

//        Call<ResponseEnvelope> responseEnvelopeCall
//                = ApiClient.getApi().getCapital(envelope);
//        responseEnvelopeCall.enqueue(new Callback<ResponseEnvelope>() {
//            @Override
//            public void onResponse(Call<ResponseEnvelope> call, Response<ResponseEnvelope> response) {
//                if (response!=null) {
//                    hideProgressDialog();
//                    ResponseData data = ((ResponseEnvelope)response.body())
//                            .getBody().getCapitalCityResponse();
//                    if (Utils.hasValue(data.getCapitalCityResult())) {
//                        tvCapital.setText(data.getCapitalCityResult());
//                    }
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseEnvelope> call, Throwable t) {
//                hideProgressDialog();
//                t.printStackTrace();
//            }
//        });
    }

    protected void hideProgressDialog() {
        if (pDialog!=null) {
            pDialog.dismiss();
        }
    }

}