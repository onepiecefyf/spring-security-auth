package top.onepiece.spring.security.auth.entity;

import lombok.Data;

/**
 * 用户实体
 *
 * @author fengyafei
 */
@Data
public class UserInfo {
  private Long id;
  private String username;
  private String password;
}
