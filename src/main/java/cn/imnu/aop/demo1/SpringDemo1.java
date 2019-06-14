package cn.imnu.aop.demo1;

import org.junit.Test;

public class SpringDemo1 {
    @Test
    public void demo1(){
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).creatProxy();
        proxy.save();
        proxy.delete();
        proxy.find();
        proxy.update();
    }
}
