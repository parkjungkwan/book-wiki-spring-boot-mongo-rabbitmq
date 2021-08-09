package net.zerotodev.api.multiplication.controller;
import net.zerotodev.api.multiplication.domain.Multiplication;
import net.zerotodev.api.multiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 곱셈 애플리케이션의 REST API 를 구현한 클래스
 */
@RestController
@RequestMapping("/multiplications")
public class MultiplicationController {
    private final MultiplicationService multiplicationService;

    @Autowired
    public MultiplicationController(final MultiplicationService multiplicationService) {
        this.multiplicationService = multiplicationService;
    }

    @GetMapping("/random")
    Multiplication getRandomMultiplication() {
        return multiplicationService.createRandomMultiplication();
    }

}
