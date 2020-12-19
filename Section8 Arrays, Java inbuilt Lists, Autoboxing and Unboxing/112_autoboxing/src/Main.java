public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank("Credit Agricole");
        bank.addBranch("Essert");
        bank.addCustomer("Essert", "BrunoM", 20000);
        bank.addCustomer("Essert", "JulienM", 10000);
        bank.addCustomer("Essert", "SylvainM", 5000);

        bank.addBranch("Ronchamps");
        bank.addCustomer("Ronchamps", "SophieM", 15000);

        bank.addCustomerTransaction("Essert", "BrunoM", 2000);
        bank.addCustomerTransaction("Essert", "JulienM", 1000);
        bank.addCustomerTransaction("Essert", "SylvainM", 500);

        bank.listCustomers("Essert", true);
        bank.listCustomers("Ronchamps", true);
    }
}
