package com.example.uasakb10116319;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;
import io.realm.RealmResults;

public class LoadActivity extends AppCompatActivity {

    /*
    Tanggal Pengerjaan  : Sabtu 16 Agustus 2019
    NIM                 : 10116319
    Nama                : Rizqi Adiguna
    Kelas               : IF-7
 */


    Realm realm;
    EditText nim,nama,kelas,telepon,email,sosmed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);

        Button buttonKembali = (Button) findViewById(R.id.kembali);


        TextView textView = findViewById(R.id.textView);
        Realm realm = Realm.getDefaultInstance();
        RealmResults <Teman> results1 = realm.where(Teman.class).findAll();
        String text = "";
        for (Teman c:results1){
            text = text+c.getNim()+"\n";
            text = text+c.getNama()+"\n";
            text = text+c.getKelas()+"\n";
            text = text+c.getTelepon()+"\n";
            text = text+c.getEmail()+"\n";
            text = text+c.getSosmed()+"\n";
        }
        textView.setText(text);


        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoadActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
