package Pertemuan14.Tugas2;

public class BankAccount {
    private final String accountNumber; // Tidak bisa diubah setelah konstruktor
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit sebesar " + amount + " berhasil.");
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    // Final method: tidak boleh di-override oleh subclass
    public final void displayAccountInfo() {
        System.out.println("Nomor Rekening: " + accountNumber);
        System.out.println("Saldo: Rp " + balance);
    }
}
