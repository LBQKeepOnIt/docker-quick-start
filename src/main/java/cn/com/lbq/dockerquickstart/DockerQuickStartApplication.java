package cn.com.lbq.dockerquickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerQuickStartApplication {

    @RequestMapping(value = "say")
    public String sayHello(){
        return "Hello docker.Welcome here!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerQuickStartApplication.class, args);
    }

}
