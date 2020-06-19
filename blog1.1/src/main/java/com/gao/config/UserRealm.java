//package com.gao.config;
//
//import com.gao.pojo.User;
//import com.gao.service.UserService;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.session.Session;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.apache.shiro.subject.Subject;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class UserRealm extends AuthorizingRealm {
//
//    @Autowired
//    private UserService userService;
//
//    //授权
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        System.out.println("进行了授权");
//        return null;
//    }
//
//    //认证
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//
//        System.out.println("进行了认证");
//        //获取第一个属性
//        String username = (String) authenticationToken.getPrincipal();
//
//        //用过用户名去查找用户信息
//        User user = userService.checkUser(username);
//
//        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getUser_password(), user.getUser_name());
//
//        return info;
//    }
//}
