package Pertemuan4;

public class MainLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        System.out.println(l1.Getjari());
        System.out.println(l2.Getjari());
        ubahJari2(l2);
        System.out.println(l1.Getjari());
        System.out.println(l2.Getjari());
    }

    public static void ubahJari2(Lingkaran obj) {
        obj.SetJari(4);
    }
}
