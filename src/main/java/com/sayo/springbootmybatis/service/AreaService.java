package com.sayo.springbootmybatis.service;

import com.sayo.springbootmybatis.dao.AreaDao;
import com.sayo.springbootmybatis.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Shuangyao
 * 21:38 2019/9/16
 */
@Service
public class AreaService {

    @Autowired
    private AreaDao areaDao;

    @Transactional
    public boolean saveAreaList(List<Area> areaList) {
        try {
            for (Area area : areaList) {
                this.areaDao.insertArea(area);
            }
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
