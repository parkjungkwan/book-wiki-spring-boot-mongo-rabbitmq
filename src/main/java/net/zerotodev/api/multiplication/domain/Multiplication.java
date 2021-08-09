package net.zerotodev.api.multiplication.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 애플리케이션에서 곱셈을 나타내는 클래스 (a * b)
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Multiplication {
    @Id
    @GeneratedValue
    @Column(name = "MULTIPLICATION_ID")
    private Long id;
    private int factorA;
    private int factorB;
    private int result;

    public Multiplication(){}
    public Multiplication(int factorA, int factorB){
        result = factorA * factorB;
    }

}