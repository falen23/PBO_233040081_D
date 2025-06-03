package Pertemuan14.Tugas2;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("1234567890", 2.5);
        sa.deposit(1000000);
        sa.displaySavingsInfo(); // Menampilkan info + bunga
    }
}
