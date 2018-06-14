package com.ryan.houses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.ryan.houses.mapper")
//开启springboot事务支持 在需要事务支持的方法上加上@Transactional注解即可表示该方法支持事务
@EnableTransactionManagement
@SpringBootApplication
public class HousesApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousesApplication.class, args);
    }
}
