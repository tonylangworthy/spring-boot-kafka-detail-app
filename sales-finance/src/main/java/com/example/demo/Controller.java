package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class Controller {

    private final Logger logger = LoggerFactory.getLogger(Controller.class);

    private Producer producer;

    @Autowired
    public Controller(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("")
    public void createJob(@RequestBody JobDto jobDto) {
        logger.info(jobDto.toString());
        producer.createJob(jobDto);
    }
}
