package com.bhaskarmantrala.hub.springbootjpa.config;

import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author venkata.mantrala
 */
@Configuration
@PropertySource({"classpath:application.properties", "classpath:h2.properties"})
@Data
@EnableJpaRepositories(basePackages = "com.bhaskarmantrala.hub.springbootjpa.repository")
public class TestReportingConfig {
}
