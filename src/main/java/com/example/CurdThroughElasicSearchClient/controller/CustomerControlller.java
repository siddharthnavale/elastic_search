package com.example.CurdThroughElasicSearchClient.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CurdThroughElasicSearchClient.dto.ResponseDto;
import com.example.CurdThroughElasicSearchClient.model.Customer;
import com.example.CurdThroughElasicSearchClient.service.ElasticSearchService;

@RestController
@RequestMapping("/customer")
public class CustomerControlller {

	@Autowired
	private ElasticSearchService elasticSearchService;

	// @Autowired
	// private ElasticSearchService elasticSearchService;

	@PostMapping
	public ResponseEntity<?> addCustomer(@RequestBody Customer cust) {

		Customer customer = elasticSearchService.addCustomer(cust);

		return new ResponseEntity<ResponseDto>(new ResponseDto("Customer Added Succesfullly", customer), HttpStatus.OK);
	}
}
