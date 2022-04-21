package com.bhaskarmantrala.hub.springbootjpa.services;

import com.bhaskarmantrala.hub.springbootjpa.entity.TestCycle;
import com.bhaskarmantrala.hub.springbootjpa.model.TestCycleModel;
import com.bhaskarmantrala.hub.springbootjpa.repository.ITestReportingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author venkata.mantrala
 */
@Service
public class TestReportingImpl {

    @Autowired
    ITestReportingRepository testDataRepository;

    public void saveTestData(TestCycleModel testDataModel) {
        testDataRepository.save(new TestCycle(testDataModel));
    }

    public List<TestCycle> findAllResults() {
        return testDataRepository.findAll();
    }

}
