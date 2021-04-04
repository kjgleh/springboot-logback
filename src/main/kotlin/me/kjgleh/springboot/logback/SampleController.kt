package me.kjgleh.springboot.logback

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService
) {

    @GetMapping("/test")
    fun test() {
        sampleService.hello()
    }
}
