package by.senko.gaykevich.quantumservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author Anton Senko-Gaykevich
 * @since 2021-02-26
 */
@RestController
@RequestMapping("/quantum")
class CheckController {

    @GetMapping("/check")
    fun check(): String {
        return "Quantum service works"
    }
}
