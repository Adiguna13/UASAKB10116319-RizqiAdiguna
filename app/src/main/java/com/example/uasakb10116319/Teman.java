package com.example.uasakb10116319;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/*
    Tanggal Pengerjaan  : Sabtu 16 Agustus 2019
    NIM                 : 10116319
    Nama                : Rizqi Adiguna
    Kelas               : IF-7
 */

public class Teman extends RealmObject {

    @PrimaryKey
    private String nim;
    @Required
    private String nama;
    @Required
    private String Kelas;
    @Required
    private String Telepon;
    @Required
    private String Email;
    @Required
    private String Sosmed;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String telepon) {
        Telepon = telepon;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSosmed() {
        return Sosmed;
    }

    public void setSosmed(String Sosmed) {
        Sosmed = Sosmed;
    }
}
