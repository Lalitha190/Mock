package com.fmc.config;

import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

//3 ways of writing of componentscan
@Configuration
@ComponentScan("com.fmc")
//@ComponentScan(basePackages= {"com.fmc","com.fmc.config"})
//@ComponentScan(basePackageClasses= com.fmc.Vehicle.class)//it is best way of doing


public class ProjectConfig {

}
