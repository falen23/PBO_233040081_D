package Pertemuan5;

public class Matakuliah
{
    private String Kode;
    private String Nama;
    private String index;
    private int sks;
    private String dosenPengampu;

    //konstruktor

    public Matakuliah(String kode, String Nama, String index, int sks,String dosenPengampu)
    {
        super();
        this.Kode = kode;
        this.Nama = Nama;
        this.index = index;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public double nilainIndex()
    {
        switch (this.index) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0;
        }
    }

    public String display()

        {
        return Kode + " _ " + Nama + " _ " + index + " _ " + dosenPengampu;
        }

    void setSks(int sks) {
        this.sks = sks;
    }
    public String getdosenPengampu() {
        return dosenPengampu;
    }

    public void setDosenPengampu(String dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    public int getSks() {
        return sks;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }
}
