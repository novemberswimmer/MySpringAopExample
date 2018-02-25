package com.ruel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ruel.BusinessClass;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BusinessClass businessClass = (BusinessClass) context.getBean("businessClass");
        businessClass.printString("Hello World");
    }
}
