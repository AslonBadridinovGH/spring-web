package de.neuefische.springweb;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @GetMapping("/api/hello")
    public String helloWorld(){
          return "Hello World";
    }

    @GetMapping("/api/hello/{name}")
    public String helloJohn(@PathVariable String name){
        return "Hello " + name;
    }

}
