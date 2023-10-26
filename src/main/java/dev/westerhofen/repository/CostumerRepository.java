package dev.westerhofen.repository;

import dev.westerhofen.entity.Customer;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CostumerRepository implements PanacheRepository <Customer> {
    
}
