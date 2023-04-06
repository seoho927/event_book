package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러에 필요함
public class HelloController {

    @GetMapping("hello")  // "/hello"로 들어오면 이 메서드를 호출해준다.
    public String hello(Model model){
        model.addAttribute("data", "hello!!!"); //data로 hello!!!가 들어간다, key : value 쌍으로 전달됨.
        return "hello";  //hello.html로 넘어가도록 한다.
    }
}