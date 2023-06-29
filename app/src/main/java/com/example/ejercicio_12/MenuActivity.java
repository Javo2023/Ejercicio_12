package com.example.ejercicio_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.ejercicio_12.databinding.ActivityMainBinding;
import com.example.ejercicio_12.databinding.ActivityMenuBinding;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String>listaDeMenus = new ArrayList<>();

        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de calabacin");






    }
}