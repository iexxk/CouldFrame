package exxk.couldframe.eurekacenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
    public class HiController {
        @Value("${EUREKA_PORT}") //调用配置中心的配置
                String test;

        @RequestMapping(value = "/hi")
        public String hi(){
            return test;
        }
    }
