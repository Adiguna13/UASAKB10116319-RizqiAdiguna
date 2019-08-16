package com.example.uasakb10116319;


import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import com.example.uasakb10116319.presenter.pagerAdapter;
import com.example.uasakb10116319.view.friendsFragment;
import com.example.uasakb10116319.view.kontakFragment;
import com.example.uasakb10116319.view.profilFragment;

import io.realm.Realm;






/*
    Tanggal Pengerjaan  : Sabtu 14 Agustus 2019
    NIM                 : 10116319
    Nama                : Rizqi Adiguna
    Kelas               : IF-7
 */



public class MainActivity extends AppCompatActivity implements profilFragment.OnFragmentInteractionListener, kontakFragment.OnFragmentInteractionListener, friendsFragment.OnFragmentInteractionListener{
    public static final String EXTRA_MESSAGE="com.example.utsakb10116319.EXTRA_MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        Button buttonTambah = (Button) findViewById(R.id.tambah);

        Button buttonLoad = (Button) findViewById(R.id.tampil);

        Realm.init(this);
        realm = Realm.getDefaultInstance();
        */

        /*
        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TambahActivity.class);
                startActivity(i);
            }
        });

        */

        /*
        buttonLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoadActivity.class);
                startActivity(i);
            }
        });
        */

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Profil"));
        tabLayout.addTab(tabLayout.newTab().setText("Kontak"));
        tabLayout.addTab(tabLayout.newTab().setText("Friends"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        final pagerAdapter adapter = new pagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        }
        );



    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void OpenIg (View view){
        String url = "https://instagram.com/adiguna13?igshid=19ztz5nr9jx89";
        Intent bukaIg = new Intent(Intent.ACTION_VIEW);
        bukaIg.setData(Uri.parse(url));
        startActivity(bukaIg);
    }

    public void Telp (View view){
        String no = "089632644938";
        Intent panggil = new Intent(Intent.ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel", no, null));
        startActivity(panggil);
    }

    public void OpenEmail (View view){
        String url = "mailto:adigunarizqi@gmail.com";
        Intent bukaEmail = new Intent(Intent.ACTION_VIEW);
        bukaEmail.setData(Uri.parse(url));
        startActivity(bukaEmail);
    }

    public void logout (View view){
        Preferences.clearLoggedInUser(getBaseContext());
        startActivity(new Intent(getBaseContext(), LoginActivity.class));
        finish();
    }

    public void tambah (View view){
        Intent i = new Intent(MainActivity.this, TambahActivity.class);
        startActivity(i);
    }

    public void tampil (View view){
        Intent i = new Intent(MainActivity.this, LoadActivity.class);
        startActivity(i);
    }

}
