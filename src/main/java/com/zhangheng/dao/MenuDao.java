package com.zhangheng.dao;

import com.zhangheng.entity.Menu;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

/**
 * @auth zh
 * @date 2020/6/23
 * @Description
 */
public class MenuDao extends BaseDao {

     //查询所有
    public List<Menu> listAll(){
        String sql="select * from menu";
        return template.query(sql,new BeanPropertyRowMapper<Menu>(Menu.class));
    }


}
