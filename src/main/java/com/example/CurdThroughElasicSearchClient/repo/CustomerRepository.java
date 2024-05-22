package com.example.CurdThroughElasicSearchClient.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.CurdThroughElasicSearchClient.model.Customer;

public interface CustomerRepository extends ElasticsearchRepository<Customer, Integer> {

// we’ll use the paging feature in our custom search methods

	Page<Customer> findByName(String name, Pageable pageable);

	@Query("{\"bool\": {\"must\": [{\"match\": {\"customers.name\": \"?0\"}}]}}")
	Page<Customer> findByNameUsingCustomQuery(String name, Pageable pageable);
}
