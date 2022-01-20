public class CustomerFileSaver implements CustomerSaver {
    Customer[] customers;

    public CustomerFileSaver() {
        this.customers = customers;
        customers = new Customer[100];
    }

    public void save(Customer customer) {
        Customer[] customers = new Customer[100];
        for (int i = 0; i < customers.length; i++) {
            customers[i]=customer;
        }
    }
}
