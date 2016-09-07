package com.zhuke.something.guava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZHUKE on 2016/9/7.
 */
@Service
public class UserInfoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(rollbackFor = Exception.class)
    public void insert() throws Exception {
        jdbcTemplate.execute("insert into user_info values (1,'zhuke')");
    }
}
