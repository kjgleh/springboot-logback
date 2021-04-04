package me.kjgleh.springboot.logback

import mu.NamedKLogging
import org.springframework.stereotype.Component

// 로거 설정
//private val logger = KotlinLogging.logger {}

@Component
class SampleService {

    // 로거 설정
//        companion object: KLogging()

    // logback-spring.xml에 설정된 특정 로거를 선택하여 로깅할 수 있다.
    companion object : NamedKLogging("AWS_LOGGER")

    fun hello() {
        logger.info("info...")
    }
}
