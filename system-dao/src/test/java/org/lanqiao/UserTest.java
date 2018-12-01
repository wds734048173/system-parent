package org.lanqiao;

import org.junit.Test;

public class UserTest {
    @Test
    public void userTest(){
        User user = new User("张三","123456");
        user.showInfo(user);
    }

}
