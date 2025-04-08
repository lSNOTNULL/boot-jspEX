package org.example.bootjspex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Boot는 알아서 Scan을 돌려주는데, Application이 있는 하위 패키지
@SpringBootApplication
public class BootJspExApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJspExApplication.class, args);
    }

}
