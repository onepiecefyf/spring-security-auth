package top.onepiece.spring.security.auth.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import top.onepiece.spring.security.auth.entity.UserInfo;
import top.onepiece.spring.security.auth.mapper.UserInfoMapper;

/**
 * 实现UserDetailsService 实现用户登陆
 *
 * @author fengyafei
 */
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {

  private UserInfoMapper userInfoMapper;

  @Autowired
  public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
    this.userInfoMapper = userInfoMapper;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
    queryWrapper.eq(UserInfo::getUsername, username);
    UserInfo userInfo = userInfoMapper.selectOne(queryWrapper);
    if (Objects.isNull(userInfo)) {
      throw new UsernameNotFoundException("用户不存在");
    }
    String userName = userInfo.getUsername();
    String password = new BCryptPasswordEncoder().encode(userInfo.getPassword());

    // 权限集合
    List<GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("role");
    return new User(userName, password, authorities);
  }
}
