package com.springboot.app.springbatchpoc1.job;

import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CSVToDBConfig {

    @Autowired
    private JobRepository jobRepository;
}
