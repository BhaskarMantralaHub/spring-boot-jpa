package com.bhaskarmantrala.hub.springbootjpa.repository;

import com.bhaskarmantrala.hub.springbootjpa.entity.TestCycle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author venkata.mantrala
 */
@Repository
public interface ITestReportingRepository extends JpaRepository<TestCycle, Long> {
}
