package Pertemuan11;

public abstract class Bentuk {
    protected  double PHI = 3.14;
    protected int Jari2;

    public Bentuk(int Jari2)
    {
        super();
        this.Jari2 = Jari2;
    }
    public abstract double luas();

    public int getjari2() {
        return Jari2;
    }

    public void setjari2(int Jari2) {
        this.Jari2 = Jari2;
    }

}
