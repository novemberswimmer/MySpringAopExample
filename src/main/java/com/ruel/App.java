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
        //Spring AOP only works for spring manage beans.
        BusinessClass businessClass = (BusinessClass) context.getBean("businessClass");
        businessClass.printString("Hello World");
        System.out.println("************************");
        Integer sum = businessClass.add(1,2);
        System.out.println("Main class Sum::" + sum);
        System.out.println("************************");
        Integer difference = businessClass.subtract(4,1);
        System.out.println("Main class Difference::" + difference);
        System.out.println("************************");
        Integer product = businessClass.multiply(2,5);
        System.out.println("Main class Product::" + product);
    }
}
