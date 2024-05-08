# Simple Banking System

Sebuah sistem perbankan sederhana berbasis baris perintah di mana pengguna dapat mendaftar akun baru, mengirim uang, menyimpan uang, memeriksa informasi akun mereka, dan keluar dari sistem.

## Deskripsi

Proyek ini merupakan sistem perbankan dasar yang diimplementasikan dalam antarmuka baris perintah (CLI). Pengguna dapat melakukan berbagai operasi perbankan seperti mendaftar akun baru, mengirim uang ke akun lain, menyimpan uang, memeriksa informasi akun, dan keluar dari sistem.

## Cara Menggunakan

Untuk menggunakan sistem perbankan ini, cukup jalankan programnya di terminal atau command prompt Anda. Ikuti petunjuk untuk menavigasi melalui berbagai opsi menu dan melakukan operasi perbankan.

## Contoh Penggunaan

Berikut adalah contoh interaksi dengan sistem perbankan:



```plaintext
**untuk menu no.1 (daftar registrasi)**
+----------------------------------------+
| Silahkan pilih program yang anda mau   |
| 1.Registrasi Akun Baru                 |
| 2.Mengirim Uang                        |
| 3.Menyimpan Uang                       |
| 4.Mengecek Informasi rekening pribadi  |
| 5.Keluar                               |
+----------------------------------------+
Kode anda : 1
**isi data untuk registrasi**
masukan nama anda : Richard Fajar Christian
masukan alamat anda : Medan
masukan nomor telepon : 081224566966
masukan saldo awazl : 100000
Akun bank berhasil dibuat.
silahkan menikmati layanan yang kami sediakan
berikut data registrasi anda
===================================================
Nama                :Richard Fajar Christian
Alamat              :Medan
Nomor Hp            :081224566966
Nomor Akun          :5882712
saldo               :Rp.100000
Tanggal Registrasi  :2024-05-08T21:16:13.920784800
===================================================
**(untuk opsi apakah ingin keluar dari program atau memakai fitur lainnya)**
apakah mau menggunakan menu lain 1 = ya 2 = tidak ?
2
Sampai Jumpa

** untuk menu no.2 ataupun transfer **

Kode anda : 2
**masukan nomor akun penerima dan pengirim serta jumlah uang yang akan dikirim**
Nomor Akun Pengirim: 9739440
Nomor Akun Penerima: 2243974
Jumlah Uang yang Akan Ditransfer: 50000

Transaksi Berhasil
=======================================
Nomor Akun Pengirim : 9739440
Nama Akun Pengirim  : Richard Fajar Christian

Nomor Akun Penerima : 2243974
Nama Akun penerima  : Ishhin Sulaimman
Jumlah Transfer     : Rp.50000
Waktu Transaksi     : 2024-05-08T21:22:10.809207100
=======================================

**untuk menu no.3 ataupun Deposit**
**masukan nomor akun dan jumlah deposit**
Masukkan nomor Anda: 9739440
Masukkan jumlah uang yang akan disimpan: 10000000
Deposit Successful.
=======================================
Nomor Akun      : 9739440
Saldo Anda      : Rp. 10050000
Waktu Transaksi : 1715178264545
=======================================

**untuk menu no.4 ataupun menampilkan info nasabah**
**masukan nomor akun yang sudah diberikan saat registrasi akun**
Masukan nomor akun anda : 9739440
Berikut data registrasi anda:
=======================================================
Nama                : Richard Fajar Christian
Alamat              : Medan
Nomor Telepon       : 081224566966
Nomor Akun          : 9739440
Saldo               : Rp.10050000
Tanggal Registrasi  : 2024-05-08T21:20:48.966974200
=========================================================






