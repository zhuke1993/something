package com.zhuke.something.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by ZHUKE on 2016/9/7.
 */
@Service
public class UserInfoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private PlatformTransactionManager transactionManager;

    @Autowired
    private TransactionDefinition transactionDefinition;

    @Autowired
    private TransactionTemplate transactionTemplate;

    @Transactional(rollbackFor = RuntimeException.class)
    public void insertShengming() throws Exception {
        jdbcTemplate.execute("insert into user_info values (1,'zhuke')");
        throw new RuntimeException("hahah");
    }

    /**
     * 编程式事务管理
     *
     * @throws Exception
     */
    public void insert() {
        //手动开启一个事务
        TransactionStatus transactionStatus = null;
        try {
            transactionStatus = transactionManager.getTransaction(transactionDefinition);
            jdbcTemplate.execute("insert into user_info values (1,'zhuke')");
            int i = 1 / 0;
            transactionManager.commit(transactionStatus);
        } catch (RuntimeException e) {
            e.printStackTrace();
            transactionManager.rollback(transactionStatus);
        }
    }

    public void insertInTemplate() {
        transactionTemplate.execute(new TransactionCallback<Object>() {
            public Object doInTransaction(TransactionStatus status) {
                jdbcTemplate.execute("insert into user_info values (1,'zhuke')");
                int i = 1/0;
                return null;
            }
        });
    }


}
