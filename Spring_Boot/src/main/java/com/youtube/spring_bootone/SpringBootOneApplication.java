//package com.youtube.spring_bootone;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Demo_app {
//
//    @RequestMapping("/")
//	public String greet() {
//        return "Hello World";
//    }
//}

package com.youtube.spring_bootone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneApplication.class, args);
    }

    @RequestMapping("/")
    public String greet() {
        return "Hello World Sanskar ";
    }
}
