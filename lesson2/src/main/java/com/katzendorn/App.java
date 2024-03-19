package com.katzendorn;

import com.katzendorn.service.MainService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        var ctx = new AnnotationConfigApplicationContext(Configure.class);
        MainService mainService = ctx.getBean(MainService.class);
        mainService.queste();
    }
}
