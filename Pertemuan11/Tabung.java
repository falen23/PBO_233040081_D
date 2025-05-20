package Pertemuan11;

public class Tabung extends  Bentuk {
    private int Tinggi;

    public Tabung() {
        super(0);
    }
    public Tabung(int Jari2, int Tinggi) {
        super(Jari2);
        this.Tinggi = Tinggi;
    }



    @Override
    public double luas() {
        return 2*PHI*Jari2*(Jari2*Tinggi);
    }

    public int getTinggi() {
        return Tinggi;
    }
    public void setTinggi(int Tinggi) {
        this.Tinggi = Tinggi;
    }

}
