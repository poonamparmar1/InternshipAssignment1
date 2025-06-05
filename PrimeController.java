package com.example.primeapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PrimeController {

    @GetMapping("/isPrime")
    public String isPrime(@RequestParam int number) {
        if (number <= 1) return number + " is not a prime number.";
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return number + " is not a prime number.";
            }
        }
        return number + " is a prime number.";
    }
}
