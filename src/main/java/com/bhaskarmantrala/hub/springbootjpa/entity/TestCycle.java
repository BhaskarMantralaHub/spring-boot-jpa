package com.bhaskarmantrala.hub.springbootjpa.entity;

import com.bhaskarmantrala.hub.springbootjpa.model.TestResult;
import com.bhaskarmantrala.hub.springbootjpa.model.TestCycleModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author venkata.mantrala
 */
@Entity(name = "TestCycle")
@Data
public class TestCycle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cycle;
    private TestResult result;
    private Integer passPercentage;
    private Integer numberOfTests;

    public TestCycle(TestCycleModel testCycleModel) {
        this.result = testCycleModel.getResult();
        this.passPercentage = testCycleModel.getPassPercentage();
        this.numberOfTests = testCycleModel.getNumberOfTests();
    }

    public TestCycle() {

    }
}
