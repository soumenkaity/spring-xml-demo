package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        // using ApplicationContext
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=context.getBean("movie",Movie.class);
        System.out.println("Movie Details : "+movie1);

        Movie moviea = context.getBean("moviea", Movie.class);
        Movie movieb = context.getBean("movieb", Movie.class);
        System.out.println("For default/singleton scope, (moviea==movieb) : "+(moviea==movieb));

        Movie movieA = context.getBean("movieA", Movie.class);
        Movie movieB = context.getBean("movieB", Movie.class);
        System.out.println("For prototype scope, (movieA==movieB) : "+(movieA==movieB));
    }
}
