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
        // using XmlBeanFactory
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie=(Movie)factory.getBean("movie");
        System.out.println(movie);

        //Using BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry beanDefinitionRegistry=new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie1= ((DefaultListableBeanFactory)beanDefinitionRegistry).getBean(Movie.class);
        System.out.println(movie1);

        // using ApplicationContext
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2=(Movie)context.getBean("movie");
        System.out.println(movie2);
    }
}
