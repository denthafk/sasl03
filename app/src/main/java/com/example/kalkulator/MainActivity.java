package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText angka1, angka2;
    TextView tvHasil;
    Button bttambah, btkurang, btkali, btbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = (EditText) findViewById(R.id.pertama);
        angka2 = (EditText) findViewById(R.id.kedua);
        tvHasil = (TextView) findViewById(R.id.hasil);
        bttambah = (Button) findViewById(R.id.btn_tambah);
        btkurang = (Button) findViewById(R.id.btn_kurang);
        btkali = (Button) findViewById(R.id.btn_kali);
        btbagi = (Button) findViewById(R.id.btn_bagi);

        bttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah = "";
                if (view.getId() == bttambah.getId()) {
                    int x1 = Integer.parseInt(angka1.getText().toString());
                    int x2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = x1 + x2;
                    jumlah = String.valueOf(hasil);
                    tvHasil.setText(jumlah);
                }
            }
        });

        btkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah = "";
                if (view.getId() == btkurang.getId()) {
                    int x1 = Integer.parseInt(angka1.getText().toString());
                    int x2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = x1 - x2;
                    jumlah = String.valueOf(hasil);
                    tvHasil.setText(jumlah);
                }
            }
        });

        btkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah = "";
                if (view.getId() == btkali.getId()) {
                    int x1 = Integer.parseInt(angka1.getText().toString());
                    int x2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = x1 * x2;
                    jumlah = String.valueOf(hasil);
                    tvHasil.setText(jumlah);
                }
            }
        });

        btbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jumlah = "";
                if (view.getId() == btbagi.getId()) {
                    int x1 = Integer.parseInt(angka1.getText().toString());
                    int x2 = Integer.parseInt(angka2.getText().toString());
                    int hasil = x1 / x2;
                    jumlah = String.valueOf(hasil);
                    tvHasil.setText(jumlah);
                }
            }
        });
    }
}