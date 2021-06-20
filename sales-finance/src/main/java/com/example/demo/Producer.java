package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    private static final String JOB_STATUS_TOPIC = "JobStatus";

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void createJob(JobDto job) {
        // Was going to try to use a data object with the template, but to keep it simple,
        // I changed it back to String for the value type
        logger.info(String.format("#### -> Producing message -> %s", job.toString()));
        kafkaTemplate.send(JOB_STATUS_TOPIC, "pending");
    }
}
