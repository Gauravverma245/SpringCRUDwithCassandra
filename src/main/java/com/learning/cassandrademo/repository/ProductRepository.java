package com.learning.cassandrademo.repository;

import com.learning.cassandrademo.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CassandraRepository<Product, Integer> {
}
