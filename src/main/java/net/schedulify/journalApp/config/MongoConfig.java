package net.schedulify.journalApp.config;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig {

    private final String mongoUri = "mongodb://localhost:27017/journaldb"; // Hardcoded URI

    @Bean
    public MongoClient mongoClient() {
        return MongoClients.create(new ConnectionString(mongoUri));
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "journaldb"); // Hardcoded database name
    }
}
