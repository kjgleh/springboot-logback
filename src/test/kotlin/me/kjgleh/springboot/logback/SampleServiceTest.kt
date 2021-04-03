package me.kjgleh.springboot.logback

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class SampleServiceTest @Autowired constructor(
    private val sampleService: SampleService
) {

    @Test
    fun hello() {
        sampleService.hello()
    }
}
