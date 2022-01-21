package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.service.DefaultMovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * by Elodie BARBE elodiebarbe.pro@gmail.com
 * janv 2022
 * Udemy training project
 */

@Configuration
@ComponentScan(basePackages = {
        "com.mycompany.dvdstore.controller",
        "com.mycompany.dvdstore.repository.file",
        /*".mycompany.dvdstore.service"*/})
@PropertySource("classpath:application.properties")
public class App 
{


    public static void main( String[] args )
    {
        System.out.println( "Welcome!\n" );
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        MovieController movieController = context.getBean(MovieController.class);

        movieController.addUsingConsole();
    }
    @Bean
    public MovieServiceInterface configureMovieService() {
        return new DefaultMovieService();
    }


}
