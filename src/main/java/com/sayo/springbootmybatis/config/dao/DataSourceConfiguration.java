//package com.sayo.springbootmybatis.config.dao;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.beans.PropertyVetoException;
//
///**
// * Created by Shuangyao
// * 23:05 2019/7/8
// */
//@Configuration
////mybatis mapper scan path config
//@MapperScan("com.sayo.springbootmybatis.dao")
//public class DataSourceConfiguration {
//    @Value("${jdbc.driverClass}")
//    private String driverClass;
//    @Value("${jdbc.jdbcUrl}")
//    private String jdbcUrl;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${jdbc.password}")
//    private String password;
//
//    @Bean(name = "dataSource")
//    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setDriverClass(driverClass);
//        dataSource.setJdbcUrl(jdbcUrl);
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        //do not commit when the connect pool close
//        dataSource.setAutoCommitOnClose(false);
//        return dataSource;
//    }
//}
