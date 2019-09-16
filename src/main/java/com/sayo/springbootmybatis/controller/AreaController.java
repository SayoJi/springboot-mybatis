package com.sayo.springbootmybatis.controller;

import com.sayo.springbootmybatis.entity.Area;
import com.sayo.springbootmybatis.service.AreaService;
import com.sayo.springbootmybatis.util.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Shuangyao
 * 21:12 2019/9/16
 */
@RestController
@RequestMapping("/api")
public class AreaController {

    private static final Logger logger = LoggerFactory.getLogger(AreaController.class);

    @Autowired
    private AreaService areaService;

    @PostMapping("/importArea")
    public boolean importArea() {
        List<Area> areaList = new ArrayList<>();
        Workbook workbook = null;
        try {
            File file = new File("C:/Users/ASUS/Desktop/teet.xlsx");
            if (ExcelUtil.isExcel2003(file.getPath())) {
                workbook = new HSSFWorkbook(new FileInputStream(file));
            } else {
                workbook = new XSSFWorkbook(new FileInputStream(file));
            }
        } catch (IOException ex) {
            logger.error(ex.getMessage());
            return false;
        }

        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            Sheet sheet = workbook.getSheetAt(i);
            for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
                Area area = new Area();
                Row row = sheet.getRow(j);
                String name = row.getCell(0).getStringCellValue();
                Integer priority = (int)Math.round(row.getCell(1).getNumericCellValue());
                area.setAreaName(name);
                area.setPriority(priority);
                area.setCreateTime(new Date());
                area.setLastUpdTime(new Date());
                areaList.add(area);
            }
        }

        return areaService.saveAreaList(areaList);
    }
}
