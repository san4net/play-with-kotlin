package hello.kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController(val service: MessageService) {

	@GetMapping("/hello")
	fun hello():String = "hello there"

	@GetMapping("/messages")
	fun index(): List<Message> = service.findMessages()

	@PostMapping("/savemessage")
	fun post(@RequestBody message: Message) {
		service.save(message)
	}

}