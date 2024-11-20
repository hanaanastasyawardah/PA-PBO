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


## Deskripsi Studi Kasus

Rumah Sakit Samarinda menghadapi masalah antrian pasien BPJS yang tidak efisien, menyebabkan waktu tunggu lama, estimasi waktu yang tidak pasti, dan kurangnya informasi real-time. Masalah ini memengaruhi kepuasan pasien dan kelancaran pelayanan.

Mengacu pada Perpres No. 12 Tahun 2013 dan penelitian terkait, kualitas layanan yang baik harus fokus pada kebutuhan pasien. Namun, sistem antrian manual sering menimbulkan penumpukan pasien dan memperburuk birokrasi, berpotensi meningkatkan risiko kesehatan.

Proyek ini bertujuan mengembangkan sistem antrian berbasis komputer menggunakan Java NetBeans, dengan fitur:

Pemantauan status antrian.
Estimasi waktu tunggu.
Notifikasi antrian.
Sistem ini diharapkan mampu meningkatkan efisiensi, kepuasan pasien, dan kualitas pelayanan sesuai standar pelayanan publik dan tujuan pemerintah dalam jaminan kesehatan.

## FLOWCHRAT
![FLOWCHART PA PBO drawio](https://github.com/user-attachments/assets/71392499-a09f-4367-9178-124e685afe15)

## USECASE DIAGRAM
![USE CASE DIAGRAM PA drawio (9)](https://github.com/user-attachments/assets/c5dd28fd-6ee2-4ba6-bcb6-a9c8920cd4a4)

## ACTIVITY DIAGRAM
![activity diagram pbo pa](https://github.com/user-attachments/assets/b7fab713-8751-49ef-8cb0-fed580910a2e)

## ERD
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

   
