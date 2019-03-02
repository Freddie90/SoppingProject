package com.project.shop.conf;

import com.project.shop.serv.ShoppingSevice;
import com.project.shop.serv.impl.ShoppingImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppCon {

    @Bean(name="Shop")
    public ShoppingImpl getService(){return new ShoppingImpl();}
}
