package com.syz.designMode.strategy.version2.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.syz.designMode.strategy")  //这个相当于在application.xml 配置搜苗包的配置
@Configuration
//他就是代替application.xml配置文件的，也就是去xml化，这就是spring注解驱动 application.xml等价于这个注解 1.x配置文件方式，2.X步入注解是时代，2.5重要性变革，引入@service等等，3.X里程碑的阶段，提供大量的不接，可以实现去xml
// 从Spring3.0，@Configuration用于定义配置类，可替换xml配置文件，被注解的类内部包含有一个或多个被@Bean注解的方法，这些方法将会被AnnotationConfigApplicationContext或AnnotationConfigWebApplicationContext类进行扫描，并用于构建bean定义，初始化Spring容器。
public class Configure {

}
