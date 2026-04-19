package pewarisan;

class Orang {
    String nama;
    int umur;
        this.nama = nama;
        this.umur = umur;
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("umur: " + umur);
    }
}

class Mahasiswa extends Orang {
    String nim;
    void tampilkanNim() {
        System.out.println("NIM: " + nim);
    }
}
class Dosen extends Orang {
    String nidn;
    void tampilkanNidn() {
        System.out.println("NIDN: " + nidn);
    }
}