package com.sayo.springbootmybatis.dao;

import com.sayo.springbootmybatis.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Shuangyao
 * 21:35 2019/9/15
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    public void findAllArea() {
        List<Area> areaList = areaDao.findAllArea();
        assertEquals(1,areaList.size());
    }

    @Test
    public void findAreaById() {
    }

    @Test
    public void insertArea() {

    }

    @Test
    public void updateArea() {
    }

    @Test
    public void deleteArea() {
    }
}