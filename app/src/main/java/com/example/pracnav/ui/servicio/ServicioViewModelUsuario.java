package com.example.pracnav.ui.servicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServicioViewModelUsuario extends ViewModel {

    private MutableLiveData<String> mText;

    public ServicioViewModelUsuario() {
        mText = new MutableLiveData<>();
        mText.setValue("This is servicio fragment usuario");
    }

    public LiveData<String> getText() {
        return mText;
    }
}