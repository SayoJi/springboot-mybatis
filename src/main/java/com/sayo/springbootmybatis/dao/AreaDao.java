package com.sayo.springbootmybatis.dao;

import com.sayo.springbootmybatis.entity.Area;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
    @Select("SELECT * FROM tb_area")
    @Results({
            @Result(property = "areaId", column = "area_id"),
            @Result(property = "areaName", column = "area_name"),
            @Result(property = "priority", column = "priority"),
            @Result(property = "createTime", column = "create_time"),
            @Result(property = "lastUpdTime", column = "last_upd_time")
    })
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
    @Insert("INSERT INTO tb_area(area_name,priority,create_time, last_upd_time) VALUES(#{areaName}, #{priority}, #{createTime}, #{lastUpdTime})")
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
