package bellingson.controller

import bellingson.service.HelloService

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
class HelloController {

    @Autowired
    HelloService helloService


    @RequestMapping("/hello")
    void hello(Model model, HttpServletRequest request) {

        println 'hello'

        model.hello = helloService.fetchHello()


    }


}
