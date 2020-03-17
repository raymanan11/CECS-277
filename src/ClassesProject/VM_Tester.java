package ClassesProject;

public class VM_Tester {
    public static void main(String[] args) {
        VendingInput vendingInput = new VendingInput();

        Customer customer = new Customer("Raymond");
        Operator operator = new Operator("Jackie Chan");

        vendingInput.currentUser(operator);
        vendingInput.vending();

        vendingInput.currentUser(customer);
        vendingInput.vending();

        vendingInput.currentUser(operator);
        vendingInput.vending();
    }
}
