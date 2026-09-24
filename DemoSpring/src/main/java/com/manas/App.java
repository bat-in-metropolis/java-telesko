package com.manas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev devObj = new Dev();
//        Dev devObj = context.getBean(Dev.class);
        Dev devObj = (Dev) context.getBean("dev"); // - We can use "dev" instead of Dev.class, because we defined the ID in beans.
        devObj.build();
//        System.out.println( "Hello World!" );

//        devObj.age = 19;
//        System.out.println(devObj.age);
//        devObj.setAge(43);
//        System.out.println(devObj.getAge());
    }
}
