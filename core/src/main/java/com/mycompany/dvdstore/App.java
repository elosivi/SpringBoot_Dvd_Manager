package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * by Elodie BARBE elodiebarbe.pro@gmail.com
 * janv 2022
 * Udemy training project
 */
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Welcome!\n" );

       ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       MovieController movieController = context.getBean(MovieController.class);

       movieController.addUsingConsole();
    }


}
