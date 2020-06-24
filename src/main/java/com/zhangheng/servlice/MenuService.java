package com.zhangheng.servlice;

import com.zhangheng.dao.MenuDao;
import com.zhangheng.entity.Menu;


import java.util.List;

public class MenuService {
private MenuDao menuDao=new MenuDao();
    public List<Menu> listAll(){
        return menuDao.listAll();
    }
}
