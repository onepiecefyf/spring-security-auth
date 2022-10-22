### Spring Security 学习笔记

#### UserDetailsService
查询数据库用户名和密码
- 继承UsernamePasswordAuthenticationFilter，实现三个方法
- 创建类实现UserDetailsService接口
- PasswordEncoder加密

#### 认证
通过用户名和密码登陆的过程
UsernamePasswordAuthorityFilter

自定义认证过滤器
UsernamePasswordAuthenticationFilter

- AuthenticatonManager

认证之前的：获得表单提交认证的信息
User user = new ObjectMapper().readValue(request.getInputStream(), User.class)

认证之后：认证成功之后处理、认证失败方法



### 授权

自定义授权过滤器

BasicAuthenticationFilter
- doFilterInterval
- 


### 记住我

RememberMeService

### CSRF 跨站请求伪造

### JMT


### AuthenticationEntryPoint


