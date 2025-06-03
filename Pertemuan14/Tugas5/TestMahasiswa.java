package Pertemuan14.Tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("234091", "Andi");
        Mahasiswa m2 = new Mahasiswa("231987", "Budi");
        Mahasiswa m3 = new Mahasiswa("231569", "Citra");

        m1.displayInfo();
        System.out.println();
        m2.displayInfo();
        System.out.println();
        m3.displayInfo();

        System.out.println("\nTotal Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
