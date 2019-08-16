package com.example.uasakb10116319;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;
/*
    Tanggal Pengerjaan  : Sabtu 16 Agustus 2019
    NIM                 : 10116319
    Nama                : Rizqi Adiguna
    Kelas               : IF-7
 */
public class TambahActivity extends AppCompatActivity {


    Realm realm;
    EditText nim,nama,kelas,telepon,email,sosmed;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);


        Button buttonTambah2 = (Button) findViewById(R.id.tambah2);
        nim = findViewById(R.id.nim);
        nama = findViewById(R.id.nama);
        kelas = findViewById(R.id.kelas);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        sosmed = findViewById(R.id.sosmed);

        Realm.init(this);
        realm = Realm.getDefaultInstance();



        buttonTambah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                realm.beginTransaction();
                Teman teman = realm.createObject(Teman.class,nim.getText().toString());
                teman.setNim(nim.getText().toString());
                teman.setNama(nama.getText().toString());
                teman.setKelas(kelas.getText().toString());
                teman.setTelepon(telepon.getText().toString());
                teman.setEmail(email.getText().toString());
                teman.setSosmed(sosmed.getText().toString());
                realm.commitTransaction();


                Intent i = new Intent(TambahActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

    }
}
