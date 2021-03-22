package org.example.junit;

import org.example.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wuxinle
 * @version 1.0
 * @date 2021/3/22 12:42
 */
public class UserTest {

    @Test
    public void test() {
        // load spring configuration
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User user = applicationContext.getBean(User.class);
        user.add();
    }
}
