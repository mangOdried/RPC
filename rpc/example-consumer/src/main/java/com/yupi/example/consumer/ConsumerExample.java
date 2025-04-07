package com.yupi.example.consumer;

import com.yupi.example.common.model.User;
import com.yupi.example.common.service.UserService;
import com.yupi.yurpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @learn <a href="https://codefather.cn">编程宝典</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
public class ConsumerExample {

    public static void main(String[] args) {
        // 获取代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yupi");
        User user1 = new User();
        user1.setName("mango");
        // 调用
        User newUser = userService.getUser(user);
        User mangoUser = userService.getUser(user1);
        if (newUser != null) {
            System.out.println(newUser.getName());
            System.out.println(mangoUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
