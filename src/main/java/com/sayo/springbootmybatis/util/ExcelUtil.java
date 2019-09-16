package com.sayo.springbootmybatis.util;

/**
 * Created by Shuangyao
 * 21:18 2019/9/16
 */
public class ExcelUtil {

    public static boolean isExcel2003(String filePath)
    {
        return filePath.matches("^.+\\.(?i)(xls)$");
    }

    public static boolean isExcel2007(String filePath)
    {
        return filePath.matches("^.+\\.(?i)(xlsx)$");
    }
}
