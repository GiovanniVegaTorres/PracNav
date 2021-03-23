package com.example.pracnav.ui.servicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServicioViewModelJardinero extends ViewModel {

    private MutableLiveData<String> mText;

    public ServicioViewModelJardinero() {
        mText = new MutableLiveData<>();
        mText.setValue("This is servicio fragment jardinero");
    }

    public LiveData<String> getText() {
        return mText;
    }
}