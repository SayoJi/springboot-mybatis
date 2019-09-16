package com.sayo.springbootmybatis.dao;

import com.sayo.springbootmybatis.entity.Area;

import java.util.List;

/**
 * Created by Shuangyao
 * 0:29 2019/7/9
 */
public interface AreaDao {

    /**
     * query all area.
     * @return a list of area
     */
    List<Area> findAllArea();

    /**
     * query area by area id.
     * @param areaId area id
     * @return
     */
    Area findAreaById(Integer areaId);

    /**
     * insert area
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * update area
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * delete area
     * @param areaId
     * @return
     */
    int deleteArea(String areaId);
}
