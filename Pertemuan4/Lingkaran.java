package Pertemuan4;
public class Lingkaran {

    double jari;
    private  final static double phi = 3.14;

    public Lingkaran(double jari) {
        this.jari = jari;

    }


    public double HitungJari() {
        return phi * jari * jari;
    }

    public void SetJari(double jari) {
        this.jari = jari;
    }

    public double Getjari()  { return jari; }

    public static void main(String[] args) {
//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari());
//        l2.SetJari(10);
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari());

//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari());
//        System.out.println(l3.Getjari());
//        l2 = l3;
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari());
//        System.out.println(l3.Getjari());

//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari());
//        System.out.println(l3.Getjari());
//        l2 = null; //l2 tidak lagi mereferensi ke objek Lingkaran
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari()); //Error
//        System.out.println(l3.Getjari());

//        Lingkaran l1 = new Lingkaran(5);
//        Lingkaran l2 = l1;
//        Lingkaran l3 = new Lingkaran(7);
//        System.out.println(l1.Getjari());
//        System.out.println(l2.Getjari());
//        System.out.println(l3.Getjari());
//        l2 = null;
//        System.out.println(l1.Getjari());
//        if (l2 != null) System.out.println(l2.Getjari());
//        System.out.println(l3.Getjari());

        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        Lingkaran l3 = new Lingkaran(7);
        System.out.println(l1.Getjari());
        System.out.println(l2.Getjari());
        System.out.println(l3.Getjari());
        l1 = null;
        l2 = null;
        l3 = null;











    }



}
