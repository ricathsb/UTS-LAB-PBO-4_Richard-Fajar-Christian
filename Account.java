/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo22;

import java.time.LocalDateTime;

/**
 *
 * @author ricat
 */
public class Account{
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private int saldo;
    private int nomorAkun;
    private LocalDateTime tanggalRegistrasi;

    public Account(String nama, String alamat, String nomorTelepon, int saldo, int nomorAkun, LocalDateTime tanggalRegistrasi) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.saldo = saldo;
        this.nomorAkun = nomorAkun;
        this.tanggalRegistrasi = tanggalRegistrasi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getNomorAkun() {
        return nomorAkun;
    }

    public void setNomorAkun(int nomorAkun) {
        this.nomorAkun = nomorAkun;
    }

    public LocalDateTime getTanggalRegistrasi() {
        return tanggalRegistrasi;
    }

    public void setTanggalRegistrasi(LocalDateTime tanggalRegistrasi) {
        this.tanggalRegistrasi = tanggalRegistrasi;
    }

}
