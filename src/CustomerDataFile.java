public class CustomerDataFile implements CustomerSaver {
    Customer[] customers;

    public CustomerDataFile() {
        this.customers = customers;
        customers = new Customer[10];
    }

    public void save(Customer customer) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i]==null)
            customers[i]=customer;

        }
    }

    public void get(){
        for (int c = 0; c < customers.length; c++) {
            System.out.println(customers[c]);
        }

    }
}
