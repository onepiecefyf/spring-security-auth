package top.onepiece.spring.security.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import top.onepiece.spring.security.auth.entity.UserInfo;

/**
 * 用户Mapper
 *
 * @author fengyafei
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {}
