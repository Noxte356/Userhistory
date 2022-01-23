public class CustomerMemorySaver implements CustomerSaver {
    Customer[] customers;
    public CustomerMemorySaver() {
        this.customers = customers;
        customers = new Customer[10];
    }
    public void save(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            this.customers[i]=customer;
        }
    }
}
