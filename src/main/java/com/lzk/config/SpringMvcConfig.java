package com.lzk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lzk.controller")
//开启json数据类型自动转换
//@EnableWebMvc
public class SpringMvcConfig {
}
