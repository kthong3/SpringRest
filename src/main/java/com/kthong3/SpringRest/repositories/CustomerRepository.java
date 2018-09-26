package com.kthong3.SpringRest.repositories;

import com.kthong3.SpringRest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
