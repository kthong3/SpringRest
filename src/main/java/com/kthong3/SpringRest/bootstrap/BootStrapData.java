package com.kthong3.SpringRest.bootstrap;

import com.kthong3.SpringRest.domain.Customer;
import com.kthong3.SpringRest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customer Data");

        Customer c1 = new Customer();
        c1.setFirstName("Daenarys");
        c1.setLastName("Targaryen");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("Jon");
        c2.setLastName("Snow");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("Tyrion");
        c3.setLastName("Lannister");
        customerRepository.save(c3);

        System.out.println("Customers Saved: " + customerRepository.count());
    }
}
