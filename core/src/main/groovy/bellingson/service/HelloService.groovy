package bellingson.service

import bellingson.model.Hello
import org.springframework.stereotype.Service

@Service
class HelloService {

    Hello fetchHello() {
         new Hello(name:'John')
    }


}
