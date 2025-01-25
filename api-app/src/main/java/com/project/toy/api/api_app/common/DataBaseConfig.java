package com.project.toy.api.api_app.common;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {

    @Bean(name="datasource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource datasource() {
        return DataSourceBuilder.create().build();
    }
    
}
