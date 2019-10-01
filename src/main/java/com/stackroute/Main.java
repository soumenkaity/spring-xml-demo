package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main( String[] args )
    {
        // using AbstractApplicationContext
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
        System.out.println("Movie Details : "+movie);

        Movie movie1=context.getBean("movie1",Movie.class);
        System.out.println("Movie Details : "+movie1);

        context.registerShutdownHook();
    }
}
