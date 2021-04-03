package me.kjgleh.springboot.logback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootLogbackApplication

fun main(args: Array<String>) {
    runApplication<SpringbootLogbackApplication>(*args)
}
