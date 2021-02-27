package by.senko.gaykevich.quantumservice

import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@EnableEurekaClient
@SpringBootApplication
class QuantumServiceApplication

fun main() {
    runApplication<QuantumServiceApplication>()
}
