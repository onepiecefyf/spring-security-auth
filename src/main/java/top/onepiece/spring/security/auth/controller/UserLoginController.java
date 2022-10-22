package top.onepiece.spring.security.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户登陆
 *
 * @author fengyafei
 */
@RequestMapping("api/v1/user")
@RestController
public class UserLoginController {

  @RequestMapping("/login")
  public String login() {
    return "login success";
  }
}
