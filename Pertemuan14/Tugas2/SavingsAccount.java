package Pertemuan14.Tugas2;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    // ERROR: Cannot override the final method from BankAccount
//    @Override
//    menambahkan informasi tambahan tanpa mengubah method final
    public void displaySavingsInfo() {
        super.displayAccountInfo(); // Panggil method final dari superclass
        System.out.println("Bunga: " + interestRate + "%");
    }
}


