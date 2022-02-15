package spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import spring5.dao.UserDao;

import java.util.Properties;

@Service
//@Transactional(propagation=Propagation.REQUIRED) // 该类的所有方法都添加了事务
public class UserService {
    @Autowired
    private UserDao userDao;

    // 转账的方法
    public void accountMoney() {
        // lucy-100
        userDao.reduceMoney();
        int i = 1/0;
        // mary+100
        userDao.addMoney();
    }

}
