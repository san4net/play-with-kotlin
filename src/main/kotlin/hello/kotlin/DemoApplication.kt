package hello.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {

	runApplication<DemoApplication>(*args)
}

 @Table("MESSAGES")
 data class Message(@Id val id: String?, val text: String)
