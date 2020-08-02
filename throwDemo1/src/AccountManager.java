public class AccountManager {
    private double balance; // Kişinin banka hesabındaki para miktarı.

    // balance değişkenin encapsulation ulaşmak için balance sağ tıklayıp refactor deyip encapsulate fields gelip set tikini kaldırıp refactor diyoruz.
    public void deposit(double amount) { // Hesaba yatırılan para miktarı.
        balance = getBalance() + amount;
    }

    public void withdraw(double amount) throws Exception { // Hesaptan çekilen para miktarı.
        if (balance >= amount) {
            balance = getBalance() - amount;
        } else {
            //System.out.println("Hesaptan para çekilemedi.Bakiye yetersiz.");
            throw new Exception("Bakiye yetersiz"); //Üsteki throws Exception bu satırdaki yazdığımız kodun kızması üzerine ampul ile gerçekleştirdik.
        }
    }

    public double getBalance() {
        return balance;
    }
}
