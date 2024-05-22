package com.example.CurdThroughElasicSearchClient.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String address;
	
	private String email;
	
	@Field(type = FieldType.Nested, includeInParent = true)
	private List<Book> puschasedBooks;
	
	//We’ll mark the Book field as FieldType.Nested. This allows us to define the Book class separately
	//but still have the individual instances of book embedded in an customer document when it’s indexed in Elasticsearch
	
	
	
	
	
	

}

