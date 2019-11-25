package com.krishna.topic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import android.widget.Button;
import android.widget.EditText;
import android.widget.AutoCompleteTextView;


public class MainActivity extends AppCompatActivity {

    Spinner spinCountry;
    Button btnsave;
    EditText etName;
    AutoCompleteTextView autoCompleteTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinCountry=findViewById(R.id.spinCountry)
        btnsave=findViewById(R.id.btnsave);
        etName=findViewById(R.id.etname);
        autoCompleteTextView= findViewById(R.id.autocompletetextview);


        string countries[]={"Nepal","India","China","USA","Canada"};

    Arrayadapter adapter= new ArrayAdapter<>(this),
            android.R.layout.simple_expandable_list_item_1,
        countries
};

    spinCountry.setAdapter(adapter);


