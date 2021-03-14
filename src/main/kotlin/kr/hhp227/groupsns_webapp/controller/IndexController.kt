package kr.hhp227.groupsns_webapp.controller

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration(exclude = [DataSourceAutoConfiguration::class])
class IndexController {
    @GetMapping
    fun index(): String {
        return "Hello World"
    }
}