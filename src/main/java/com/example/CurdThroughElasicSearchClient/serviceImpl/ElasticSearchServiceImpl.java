package com.example.CurdThroughElasicSearchClient.serviceImpl;

import org.elasticsearch.client.ElasticsearchClient;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CurdThroughElasicSearchClient.model.Customer;
import com.example.CurdThroughElasicSearchClient.repo.CustomerRepository;
import com.example.CurdThroughElasicSearchClient.service.ElasticSearchService;

@Service
public class ElasticSearchServiceImpl implements ElasticSearchService {

	@Autowired
	private ElasticsearchClient elasticsearchClient;

	private final String indexName = "customers";

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer cust) {

		Customer customer = customerRepository.save(cust);
		return customer;
	}

}
