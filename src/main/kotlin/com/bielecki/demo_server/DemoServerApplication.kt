package com.bielecki.demo_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoServerApplication

fun main(args: Array<String>) {
	runApplication<DemoServerApplication>(*args)
	var gr = GetRequest()
	gr.myrequest()
}
