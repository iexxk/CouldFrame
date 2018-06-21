package exxk.couldframe.eurekacenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekacenterApplication {
    @Value("${test}")  //调用配置中心的配
   static String test;
    public static void main(String[] args) {
        SpringApplication.run(EurekacenterApplication.class, args);
        System.out.print(""+test);
    }
}
