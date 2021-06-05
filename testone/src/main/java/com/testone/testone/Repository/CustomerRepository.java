package com.testone.testone.Repository;

import com.testone.testone.Models.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel,Long> {
}
