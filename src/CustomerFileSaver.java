public class CustomerFileSaver implements CustomerSaver {
    Customer[] customers;

    public void save(Customer customer) {
        for (int i = 0; i < 10; i++) {
            this.customers[i]=customer;
        }

    }
}
