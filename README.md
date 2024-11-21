# PA_PBO_Kelompok 7
## Sistem Antrian BPJS di Rumah Sakit Samarinda

## Anggota Kelompok 7
|          **Nama**          |     **NIM**     |
|----------------------------|-----------------|
| LISA NAFRATHILOYA          | 2309116006      |
| REYFALDHO ALFARAZEL        | 2309116007      |
| ALYA RIZQI RAMADHANI       | 2309116008      |
| HANA ANASTASYA WARDAH      | 2309116012      |
| NELY OKTAVIA REDECA        | 2309116024      |


## 📌 Deskripsi Studi Kasus
**Sistem Informasi Antrian Pasien BPJS** merupakan aplikasi Java yang dirancang untuk mengatasi masalah antrian pasien yang tidak efisien di Rumah Sakit Samarinda. Masalah ini menyebabkan waktu tunggu lama, estimasi waktu pelayanan yang tidak pasti, serta kurangnya informasi real-time. Hal tersebut berdampak negatif pada tingkat kepuasan pasien dan kelancaran operasional rumah sakit. Sistem ini hadir sebagai solusi untuk menyediakan pengelolaan antrian yang lebih terstruktur dan modern.

Mengacu pada Peraturan Presiden No. 12 Tahun 2013 dan penelitian terkait, pelayanan kesehatan yang berkualitas harus berpusat pada kebutuhan pasien. Namun, sistem antrian manual sering memicu penumpukan pasien, memperlambat proses birokrasi, dan meningkatkan risiko kesehatan. Oleh karena itu, aplikasi ini diharapkan dapat mendukung peningkatan kualitas layanan rumah sakit secara keseluruhan.

### Tujuan Pengembangan Aplikasi
**- Meningkatkan Efisiensi Pelayanan:** Mengurangi waktu tunggu pasien dengan pengelolaan antrian yang lebih terorganisir.

**- Menyediakan Estimasi Waktu Pelayanan:** Memberikan informasi real-time terkait estimasi waktu bagi pasien yang menunggu.

**- Mempermudah Pengelolaan Antrian:** Mengoptimalkan proses pendaftaran, pencatatan, dan prioritas pasien secara digital.

**- Meningkatkan Kepuasan Pasien:** Dengan layanan yang cepat, akurat, dan transparan, pasien merasa lebih dihargai.

**- Mengurangi Risiko Kesehatan:** Menghindari penumpukan pasien di area tunggu yang dapat meningkatkan risiko penyebaran penyakit.

### Fitur Utama
**- Manajemen Antrian:** Memungkinkan pengguna untuk menambah, mengubah, dan menghapus data pasien dalam antrian.

**- Sorting Berdasarkan Jenis Penyakit:** Mengatur prioritas pasien berdasarkan tingkat keparahan penyakit.

**- Pencarian Data:** Menyediakan fitur pencarian cepat untuk menemukan informasi pasien.

**- Jadwal Pelayanan:** Memberikan estimasi waktu pelayanan berdasarkan jadwal yang telah diatur.

### Teknologi
**- Java:** Bahasa pemrograman utama yang digunakan untuk pengembangan aplikasi.
  
**- NetBeans IDE:** Lingkungan pengembangan terpadu untuk membangun dan mengelola proyek.
  
**- MySQL:** Sistem manajemen basis data untuk menyimpan informasi pasien dan antrian.

### Struktur Projek
**- src:** Direktori yang berisi source code Java, termasuk paket Controller, Database, Model, dan View.
  
**- dist:** Direktori yang berisi file JAR yang dapat dijalankan serta library pihak ketiga yang dibutuhkan.
  
**- nbproject:** Berisi file konfigurasi proyek yang spesifik untuk NetBeans.
  
**- antrian_pasien.sql:** Skrip SQL yang menyediakan struktur basis data, termasuk tabel dan relasi yang diperlukan untuk aplikasi ini.

### Cara Menjalankan
Untuk menjalankan aplikasi ini, gunakan file JAR yang tersedia di direktori dist. Pastikan semua library yang terdapat di dist/lib telah termasuk dalam classpath aplikasi. Aplikasi ini dirancang untuk meningkatkan efisiensi pengelolaan antrian, kepuasan pasien, dan kualitas pelayanan rumah sakit sesuai dengan standar pelayanan publik.

## 📌 FLOWCHART
Aplikasi Sistem Analis Antrian BPJS. Kelompok kami membuat sebuah alur diagram atau yang dibasa dikenal dengan sebutan flowchart. Flowchart digunakan untuk menjelaskan alur dari sebuah program. Berikut adalah flowchart dari Aplikasi Sistem Analis Antrian BPJS:

![FC Sistem Antrian BPJS-Page-1 drawio](https://github.com/user-attachments/assets/e40b809c-22af-4de0-99c3-440d627dfc6e)

## 📌 USECASE DIAGRAM
Salah satu jenis diagram dalam Unified Modeling Language (UML) yang digunakan untuk menggambarkan interaksi antara pengguna (aktor) dan sistem yang akan dikembangkan. Diagram ini berfokus pada fungsi-fungsi yang disediakan oleh sistem (use case) dan hubungan antara aktor dengan fungsi-fungsi tersebut.

![USE CASE DIAGRAM PA drawio (9)](https://github.com/user-attachments/assets/c5dd28fd-6ee2-4ba6-bcb6-a9c8920cd4a4)

## 📌 ACTIVITY DIAGRAM
Salah satu diagram dalam Unified Modeling Language (UML) yang digunakan untuk menggambarkan alur kerja (workflow) atau proses bisnis dalam sebuah sistem. Diagram ini fokus pada urutan aktivitas yang dilakukan dalam suatu proses, baik secara linier maupun bercabang.

Komponen Utama Activity Diagram:
![activity diagram pbo pa](https://github.com/user-attachments/assets/b7fab713-8751-49ef-8cb0-fed580910a2e)

## 📌 ERD
Rancangan ERD untuk database mencakup struktur tabel, hubungan antar tabel, dan skema penyimpanan data. Database menggunakan MySQL dan menyimpan informasi tentang data pasien, kategori penyakit, data dokter dan juga jadwal pelayanan.
### Logical
![Logical_PAPBOO](https://github.com/user-attachments/assets/26f2a15c-02f5-435c-9b45-c186d385a99f)
### Relational
![Relational_PA PBO](https://github.com/user-attachments/assets/feaf97c5-a173-4999-a85d-71441351ff35)
Erdish
1.	Setiap satu dan hanya satu data pasien harus dimiliki oleh satu dan hanya satu penyakit, dan setiap satu dan hanya satu penyakit harus memiliki satu dan hanya satu data pasien.
2.	Setiap satu dan hanya satu data pasien harus menerima satu atau banyak antrian, dan setiap satu atau banyak antrian harus diterima oleh satu dan hanya satu data pasien.
3.	Setiap satu dan hanya satu penyakit harus memiliki satu atau banyak jadwal pelayanan, dan setiap satu atau banyak jadwal pelayanan harus dimiliki oleh satu dan hanya satu penyakit.
4.	Setiap satu dan hanya satu antrian harus menjadwalkan satu dan hanya satu jadwal pelayanan, dan setiap satu dan hanya satu jadwal pelayanan harus dijadwalkan oleh satu dan hanya satu antrian.
5.	Setiap satu dan hanya satu jadwal pelayanan harus dihubungkan oleh satu dan hanya satu data dokter, dan setiap satu dan hanya satu data dokter harus menghubungkan satu dan hanya satu jadwal pelayanan.
6.	Setiap satu dan hanya satu data dokter harus diakses oleh satu dan hanya satu user, dan setiap satu dan hanya satu user harus mengakses satu dan hanya satu data dokter.

## OUTPUT

   
