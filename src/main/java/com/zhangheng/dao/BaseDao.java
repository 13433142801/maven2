package com.zhangheng.dao;

import com.zhangheng.utils.DBUtil;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
    //这个封装工具，可以让所有使用
    //引入jdbc
    public JdbcTemplate template=new JdbcTemplate(DBUtil.getDataSource());
}
