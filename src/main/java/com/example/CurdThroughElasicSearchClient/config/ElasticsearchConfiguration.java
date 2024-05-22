package com.example.CurdThroughElasicSearchClient.config;


import org.elasticsearch.client.RestHighLevelClient;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.CurdThroughElasicSearchClient.repo")
@ComponentScan(basePackages = { "com.example.CurdThroughElasicSearchClient.service" })
public class ElasticsearchConfiguration extends AbstractElasticsearchConfiguration {
//When configuring Elasticsearch in our Java application, we need to define how we connect to the Elasticsearch instance. 
    
	@Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
            .connectedTo("localhost:9200")
            .build();

        return RestClients.create(clientConfiguration)
            .rest();
    }
	
	
//In order to communicate with our Elasticsearch server, we’ll use a simple RestHighLevelClient. 

//and
    
//ElasticsearchOperations bean needed to execute operations on our server is already provided by base class.
}
