package net.zerotodev.api.multiplication.service;

import net.zerotodev.api.multiplication.domain.Multiplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.BDDMockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
class MultiplicationServiceImplTest {
    private MultiplicationServiceImpl multiplicationService;
    @Mock RandomGeneratorServiceImpl randomGeneratorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        randomGeneratorService = new RandomGeneratorServiceImpl();
        multiplicationService = new MultiplicationServiceImpl() ;
    }

    @Test
    public void test_createMultiplication(){
        given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30);
        Multiplication multiplication = multiplicationService.createRandomMultiplication();
        assertThat(multiplication.getFactorA(),is(50));
        assertThat(multiplication.getFactorB(),is(30));
    }








}