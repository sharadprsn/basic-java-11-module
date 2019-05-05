package com.app;

import com.app.util.AppUtil;

public class Main {

    public static void main(String[] args){
        Main main = new Main();
        main.init();
    }

    private void init() {
        AppUtil appUtil = new AppUtil();
        System.out.println(appUtil.toUpper("Hello World!!"));
    }
}
