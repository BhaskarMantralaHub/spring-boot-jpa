package com.bhaskarmantrala.hub.springbootjpa.rest;

import com.bhaskarmantrala.hub.springbootjpa.config.TestReportingConfig;
import com.bhaskarmantrala.hub.springbootjpa.entity.TestCycle;
import com.bhaskarmantrala.hub.springbootjpa.model.TestCycleModel;
import com.bhaskarmantrala.hub.springbootjpa.services.TestReportingImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author venkata.mantrala
 */
@RestController
@RequestMapping("/test-data")
public class TestReportingController {

    @Autowired
    TestReportingConfig dbConfiguration;

    @Autowired
    TestReportingImpl testDataImpl;

    @GetMapping("/findAll")
    public ResponseEntity<List<TestCycle>> init() {
        return new ResponseEntity<>(testDataImpl.findAllResults(), HttpStatus.OK);
    }


    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody @Valid TestCycleModel testData) {
        testDataImpl.saveTestData(testData);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
