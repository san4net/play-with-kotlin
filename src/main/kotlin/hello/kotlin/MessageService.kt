package hello.kotlin

import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages():List<Message>{
        return  db.findAll().toList()
    }

    fun save(message: Message) {
        db.save(message)
    }
}
