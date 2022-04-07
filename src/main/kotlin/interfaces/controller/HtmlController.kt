package interfaces.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping


@Controller
class HtmlController {

    @GetMapping("/user")
    fun getUsers() {
    }

    @PostMapping("/user")
    fun createUser() {
    }
}