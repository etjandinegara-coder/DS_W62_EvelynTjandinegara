1. Program yang pertama untuk mengeluarkan surat yang akan dikirmkan sesuai dengan prioritas dan berapa lama durasinya sesuai dengan antrian.

Example:

Input:
3
P1 2 1
P3 1 3
P2 3 1

Output:
1 P3 | P1 P2 | 
2 P3 | P1 P2 | 
3 | P2 P3 | P1 
4 | | P1 P2 P3 


2. Program akan melihat urutan operasi dengan add yang ditandai angka 1 dan take out yang ditandai dengan angka 2. Jadi output nya akan tentukan 'tidak ada' , 'tidak yakin' , 'stack' , 'queue' , dan 'priority queue' sesuai dengan urutan operasi yang ditemui. 
Kalau 'tidak ada' berarti tidak ada angka yang tersimpan
Kalau 'tidak yakin' berarti ada angka yang tersimpan, tapi dia tidak yakin itu termasuk stack atau queue
Kalau 'stack' berarti dia menggunakan prinsip LIFO, yang terakhir masuk yang akan keluar pertama
Sedangkan 'queue' artinya dia menggunakan prinsip FIFO.
Dan 'priority queue' artinya akan keluar dari nilai yang paling besar

Example:

Input:
2
1 47
2 47
1 60
1 16
2 16
2 60
1 85
2 85
1 78
1 69
1 31
1 54

17
1 15
2 15
1 26
2 26
1 17
1 49
2 17
2 49
1 19
2 19
1 64
1 100
2 64
1 13
2 100
1 30
2 13

17
1 49
1 2
1 29
1 44
2 49
2 44
1 47
2 47
2 29
2 2
1 63
1 99
2 99
2 63
1 64
1 64
2 64

16
1 66
1 81
2 81
2 66
1 41
1 57

2 57
2 41
1 16
2 16
1 35
2 35
1 91
2 91
1 74
1 64

19
1 42
1 42
1 42
1 42
2 42
1 42
2 42
2 42
1 42
2 42
1 42
2 42
1 42
2 42
2 42
1 42
1 42
1 42
1 42

Output:
Stack
Queue
Priority Queue
Tidak yakin
Tidak yakin


3. Program ini adalah simulasi proses respin mahasiswa yang sedang melakukan antrian untuk konsultasi. Jadi input an baris pertama kita masukkan jumlah siswa dalam antrian. Kemudian di baris kedua ialah nama mahasiswa dengan spasi. Kemudian yang baris tegia berisi angka-angka kesempatan mereka untuk melakukan respin.

Output yang keluar bisa try again artinya dia masuk lagi ke dalam antrian dan get out artinya dia akan keluar dari antrian. 

Example:

Input:
3
Aristo Inno Vergo
2 1 2

Output:
Aristo|Try Again|1
Inno|Get Out|0
Vergo|Try Again|1
Aristo|Get Out|0
Vergo|Get Out|0


4. Program ini untuk mengatur antrian berdasarkan jumlah uang yang dimiliki untuk masuk ke dalam wahana. Jadi program akan membaca jumlah pengunjung lalu membaca nama dan jumlah uang mereka. Jika ada 'jeff' kita perlu hapus dari antrian sesuai instruksi soal. Mereka akan di urutkan berdasarkan uang yang terbesar hingga terkecil. 

Example:

Input:
