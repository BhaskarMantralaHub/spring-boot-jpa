package com.bhaskarmantrala.hub.springbootjpa.model;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author venkata.mantrala
 */
@Data
public class TestCycleModel {

    @NotNull
    private TestResult result;
    @Min(value = 0)
    @Max(value = 100)
    @NotNull
    private Integer passPercentage;
    @Min(value = 0)
    @NotNull
    private Integer numberOfTests;

}
