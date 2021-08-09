package net.zerotodev.api.multiplication.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(MockitoExtension.class)
class MultiplicationTest {
    @Mock Multiplication multiplication;

    @DisplayName("Lombok Test")
    @Test
    void test_getFactorA() {
        MockitoAnnotations.initMocks(this);
        multiplication = new Multiplication();
        multiplication.setFactorA(5);
        multiplication.setFactorB(3);
        assertThat(multiplication.getFactorA(),is(5));

    }

}