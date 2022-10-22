package top.onepiece.spring.security.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * spring security 测试类
 *
 * @author fengyafei
 */
@RequestMapping("/api/v1")
@RestController
public class HelloSecurityController {

  @RequestMapping("/index")
  public String index() {
    return "hello index";
  }

  @RequestMapping("/hello")
  public String hello() {
    return "hello security";
  }
}
