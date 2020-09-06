package bigtest;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
        (exclude = {
//                DataSourceAutoConfiguration.class,
//                DataSourceTransactionManagerAutoConfiguration.class,
//                MybatisAutoConfiguration.class,
                RedisAutoConfiguration.class,
//                RedisReposi(exclude = {
//        DataSourceAutoConfiguration.class,
//        DataSourceTransactionManagerAutoConfiguration.class,
//        MybatisAutoConfiguration.class,
//        RedisAutoConfiguration.class,
//        RedisRepositoriesAutoConfiguration.class
//})toriesAutoConfiguration.class
       })

public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
