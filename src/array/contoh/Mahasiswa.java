package array.contoh;

public class Mahasiswa {
    int no, angkatan;
    String nama, kelas;

    public Mahasiswa(int no, int angkatan, String nama, String kelas) {
        this.no = no;
        this.angkatan = angkatan;
        this.nama = nama;
        this.kelas = kelas;
    }

    public int getNo() {
        return no;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }
    
    
}
