/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo22;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ricat
 */
public class BankAccount {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    
    private String nama,alamat,nomor_telepon;
    private int saldo,nomor_akun;
    private LocalDateTime tanggal_registrasi = LocalDateTime.now();
    int kode,menu;
    
    public void mainmenu () {
        do {
            System.out.println("+----------------------------------------+");
            System.out.println("| Silahkan pilih program yang anda mau   |");
            System.out.println("| 1.Registrasi Akun Baru                 |");
            System.out.println("| 2.Mengirim Uang                        |");
            System.out.println("| 3.Menyimpan Uang                       |");
            System.out.println("| 4.Mengecek Informasi rekening pribadi  |");
            System.out.println("| 5.Keluar                               |");
            System.out.println("+----------------------------------------+");

            System.out.print("Kode anda : ");
            kode = scanner.nextInt();
        
        
        
            if (kode == 1) {
                RegistrasiAkunBaru();
            } else if (kode == 2) {
                Transfer();
            } else if (kode == 3) {
                TopUp();
            } else if (kode == 4) {
                ShowDescription();
            } else if (kode == 5) {
            }
        }
        while (!(kode >= 1 && kode <= 5));
        
    }
    //Method untuk registrasi        
    private void RegistrasiAkunBaru(){   
        System.out.print("masukan nama anda : ");
        nama = scanner.nextLine();
        nama = scanner.nextLine();
        
        System.out.print("masukan alamat anda : ");
        alamat = scanner.nextLine();
        
        System.out.print("masukan nomor telepon : ");
        nomor_telepon = scanner.nextLine();
        
        System.out.print("masukan saldo awazl : ");
        saldo = scanner.nextInt();
        
        nomor_akun = random.nextInt(9000000) + 1000000;
        
         Account newAccount = new Account(nama, alamat, nomor_telepon, saldo, nomor_akun, LocalDateTime.now());
         accounts.put(nomor_akun, newAccount);
        
        System.out.println("Akun bank berhasil dibuat.");
        System.out.println("silahkan menikmati layanan yang kami sediakan");
        
        System.out.println("berikut data registrasi anda");
        
        System.out.println("===================================================");
        System.out.println("Nama                :"+nama);
        System.out.println("Alamat              :"+alamat);
        System.out.println("Nomor Hp            :"+nomor_telepon);
        System.out.println("Nomor Akun          :"+nomor_akun);
        System.out.println("saldo               : "+saldo);
        System.out.println("Tanggal Registrasi  :"+tanggal_registrasi);
        System.out.println("===================================================");
        
        closing();
        
    }
    //Method untuk transfer
    private void Transfer () {
        System.out.print("Nomor Akun Pengirim: ");
        int nomorAkunPengirim = scanner.nextInt();
        
         if (!accounts.containsKey(nomorAkunPengirim)) {
            System.out.println("Nomor akun pengirim tidak valid.");
            return;
        }
        
        System.out.print("Nomor Akun Penerima: ");
        int nomorAkunPenerima = scanner.nextInt();

        
        if (!accounts.containsKey(nomorAkunPenerima)) {
            System.out.println("Nomor akun penerima tidak valid.");
            return;
        }
        
        System.out.print("Jumlah Uang yang Akan Ditransfer: ");
        int jumlahTransfer = scanner.nextInt();
        
        Account pengirim = accounts.get(nomorAkunPengirim);
        
        if (pengirim.getSaldo() < jumlahTransfer) {
            System.out.println("Saldo tidak mencukupi untuk melakukan transfer.");
            return;
        }
     
        Account penerima = accounts.get(nomorAkunPenerima);
        pengirim.setSaldo(pengirim.getSaldo() - jumlahTransfer);
        penerima.setSaldo(penerima.getSaldo() + jumlahTransfer);

        System.out.println("\nTransaksi Berhasil");
        System.out.println("=======================================");
        System.out.println("Nomor Akun Pengirim : " + nomorAkunPengirim);
        System.out.println("Nama Akun Pengirim  : " + pengirim.getNama());
        System.out.println("");
        System.out.println("Nomor Akun Penerima : " + nomorAkunPenerima);
        System.out.println("Nama Akun penerima  : " + penerima.getNama());
        System.out.println("Jumlah Transfer     : Rp." + jumlahTransfer);
        System.out.println("Waktu Transaksi     : " + LocalDateTime.now());
        System.out.println("=======================================");
        closing();
        
    }
    //Method untuk deposit
    public void TopUp() {
        System.out.print("Masukkan nomor Anda: ");
        int nomorAkun = scanner.nextInt();
        System.out.print("Masukkan jumlah uang yang akan disimpan: ");
        int jumlahUang = scanner.nextInt();

        Account account = accounts.get(nomorAkun);
        if (account != null) {
            int saldoAwal = account.getSaldo();
            int saldoAkhir = saldoAwal + jumlahUang;
            account.setSaldo(saldoAkhir);
            long waktuTransaksi = System.currentTimeMillis();

            System.out.println("Deposit Successful.");
            System.out.println("=======================================");
            System.out.println("Nomor Akun      : " + account.getNomorAkun());
            System.out.println("Saldo Anda      : Rp. " + saldoAkhir);
            System.out.println("Waktu Transaksi : " + waktuTransaksi);
            System.out.println("=======================================");
        } else {
            System.out.println("Akun dengan nomor " + nomorAkun + " tidak ditemukan.");
        }
        closing();
    }
    //Method untuk menampilkan deskripsi
     private void ShowDescription() {
    System.out.print("Masukan nomor akun anda : ");
     int nomorAkun = scanner.nextInt();
    boolean found = false;
    
    for (Account account : accounts.values()) {
        if (account.getNomorAkun() == nomorAkun) {
            System.out.println("Berikut data registrasi anda:");
            System.out.println("=======================================================");
            System.out.println("Nama                : " + account.getNama());
            System.out.println("Alamat              : " + account.getAlamat());
            System.out.println("Nomor Telepon       : " + account.getNomorTelepon());
            System.out.println("Nomor Akun          : " + account.getNomorAkun());
            System.out.println("Saldo               : " + account.getSaldo());
            System.out.println("Tanggal Registrasi  : " + account.getTanggalRegistrasi());
            System.out.println("=========================================================");
            found = true;
            break; 
        }
    }
    if (!found) {
        System.out.println("Akun dengan nomor " + nomorAkun + " tidak ditemukan.");
    }
    
    closing();
}
     
    public void closing () {
         System.out.println("apakah mau menggunakan menu lain 1 = ya 2 = tidak ?");
        menu = scanner.nextInt();
        if (menu == 1) {
            mainmenu();
        } else {
           System.out.println("Sampai Jumpa");
        }
    }
 
    
    
    
    
    
    
    
    
    
}
