package com.example.ejercicio_12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.ejercicio_12.databinding.ActivityMainBinding;
import com.example.ejercicio_12.databinding.ActivityMenuBinding;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMenuBinding binding = ActivityMenuBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        List<String>listaDeMenus = new ArrayList<>();

        listaDeMenus.add("Pure de calabacin");
        listaDeMenus.add("Pure de papas");
        listaDeMenus.add("Cazuela");
        listaDeMenus.add("Pastel de choclos");
        listaDeMenus.add("Ensaladas surtidas");
        listaDeMenus.add("Carbonada");
        listaDeMenus.add("Tallarines");
        listaDeMenus.add("Arroz con pollo");
        listaDeMenus.add("Bistec a lo pobre");
        listaDeMenus.add("Budin de zapallos");
        listaDeMenus.add("Salmon con agregado");

        ArrayAdapter adapter = new ArrayAdapter (this,android.R.layout.simple_list_item_1,listaDeMenus);
        binding.ListViewMenu.setAdapter(adapter);






    }
}