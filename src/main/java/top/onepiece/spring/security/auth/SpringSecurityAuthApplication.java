package top.onepiece.spring.security.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot启动类
 *
 * @author fengyafei
 */
@MapperScan("top.onepiece.spring.security.auth.mapper")
@SpringBootApplication
public class SpringSecurityAuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringSecurityAuthApplication.class, args);
  }
}
