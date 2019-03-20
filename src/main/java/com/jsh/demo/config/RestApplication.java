package com.jsh.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestApplication extends ResourceConfig {
    private static final Logger logger = LoggerFactory.getLogger(RestApplication.class);
   //用户注册bean-拦截器-过滤器-API
    public RestApplication (){
//        register();

    }
}
