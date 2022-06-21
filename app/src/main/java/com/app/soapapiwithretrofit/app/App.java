package com.app.soapapiwithretrofit.app;/*
 * Created by Sandeep(Techno Learning) on 21,June,2022
 */

import android.app.Application;

import dagger.hilt.android.HiltAndroidApp;


@HiltAndroidApp
public class App extends Application {




    // @Singleton
    //    @Provides
    //    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
    //        .addConverterFactory(GsonConverterFactory.create())
    //        .baseUrl(BASE_URL)
    //        .client(okHttpClient)
    //        .build()
    //
    //    @Singleton
    //    @Provides
    //    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
    //
    //    @Singleton
    //    @Provides
    //    fun providesRepository(apiService: ApiService) = Repository(apiService)
}
