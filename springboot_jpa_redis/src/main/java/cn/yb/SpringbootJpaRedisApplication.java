package cn.yb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaRedisApplication {

    public static void main(String[] args) {
        System.out.println("开始");
        SpringApplication.run(SpringbootJpaRedisApplication.class, args
        );
    }

}
