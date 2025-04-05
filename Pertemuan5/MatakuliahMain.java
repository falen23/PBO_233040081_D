package Pertemuan5;

public class MatakuliahMain
{
    public static void main(String[] args) {

        //create objek matakuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemograman 1", "A", 3, "FAJAR DARMAWAN, ST., M.KOM");
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemograman 2", "BC", 3, "DR. IR Leony Lidya, MT");
        Matakuliah mk3 = new Matakuliah("003", "Algoritma Berorientasi Objek", "B", 3, "Siroj Nur Ulum, S.T., M.T.");

        // Tampilkan Daptar Matakuliah
        System.out.println("--- Daptar Matakuliah ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
    }
}
