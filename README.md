# Ping Utility Application

Program aplikasi Java untuk melakukan ping ke multiple host dengan fitur statistik dan export hasil.

## 📋 Deskripsi
Program ini dibuat untuk memenuhi tugas Pemrograman Lanjut yang memungkinkan pengguna untuk melakukan ping ke beberapa host sekaligus dan mengumpulkan data statistiknya.

## ✨ Fitur
* Ping multiple host secara bersamaan
* Menampilkan statistik response time
* Menghitung packet loss
* Export hasil ke CSV
* Processing secara paralel

## 🛠️ Teknologi yang Digunakan
* Java
* Git untuk version control
* VSCode sebagai IDE

## 💻 Cara Penggunaan

### Prerequisites
* Java Development Kit (JDK) 8+
* Git (opsional)
* VSCode atau IDE lainnya

### Instalasi
1. Clone repository (jika menggunakan Git):
```bash
git clone [url-repository-anda]
```

2. Atau download sebagai ZIP dan extract

3. Buka folder proyek di VSCode

### Menjalankan Program
1. Compile semua file Java:
```bash
javac tugas4/*.java
```

2. Jalankan program utama:
```bash
java tugas4.SimplePingAfterRefactor
```

## 📁 Struktur Proyek
```
ping-utility/
├── src/
│   └── tugas4/
│       ├── PingResult.java
│       ├── SimplePingAfterRefactor.java
│       └── [file lainnya]
└── README.md
```

## 📝 Contoh Output
```
Reachable Hosts:
Host: www.google.com
IP Address: 142.250.190.78
Status: Reachable

Host: www.github.com
IP Address: 140.82.121.3
Status: Reachable
```

## 👤 Author
[koyim anjay mabar]
* NIM: [202310370311286]
* Kelas: [Kelas D]

## 📚 Referensi
* [Dokumentasi Java](https://docs.oracle.com/en/java/)
* [Modul Praktikum Pemrograman Lanjut]