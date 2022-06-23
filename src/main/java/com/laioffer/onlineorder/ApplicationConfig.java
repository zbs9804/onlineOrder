package com.laioffer.onlineorder;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration//里面也有Component，这个类大约就是创建springMVC运行所需要的object，以及其他需要用到的，比如我要用到hashmap，那我就定义在这里面
@EnableWebMvc
public class ApplicationConfig {
}
