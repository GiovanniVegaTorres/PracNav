package com.example.pracnav.ui.servicio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.pracnav.R;

public class ServicioJardinero extends Fragment {

    private ServicioViewModelJardinero servicioViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        servicioViewModel =
                new ViewModelProvider(this).get(ServicioViewModelJardinero.class);
        View root = inflater.inflate(R.layout.fragment_servicio_jardinero, container, false);
        final TextView textView = root.findViewById(R.id.text_servicio);
        servicioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}