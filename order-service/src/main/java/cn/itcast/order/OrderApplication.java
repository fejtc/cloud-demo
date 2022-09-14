package cn.itcast.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /**
     * 创建RestTemplate对象并注入Spring容器，利用它发http请求
     * Bean的注入只能在配置类里，带有@SpringBootApplication注解的启动类本身也是配置类
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}