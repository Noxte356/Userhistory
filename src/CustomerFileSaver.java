public class CustomerFileSaver implements CustomerSaver {
    Customer[] customers;

    public CustomerFileSaver() {
        this.customers = customers;
        customers = new Customer[10];
    }

    public void save(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            customers[i]=customer;
        }
    }
}
