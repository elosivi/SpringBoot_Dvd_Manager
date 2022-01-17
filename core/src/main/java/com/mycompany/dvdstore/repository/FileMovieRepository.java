package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{


    static FileWriter writer;

    public void add(Movie movie){

        try{
            writer = new FileWriter("D:\\DEV\\JAVA\\Udemy projects\\SpringBoot_formation_Udemy\\SpringBoot_Dvd_Manager\\movies.txt", true);
            writer.write(movie.getTitle() + " ; "+ movie.getGenre() + "\n");
            writer.close();
            System.out.println("The movie " + movie.getTitle()+ " / "+ movie.getGenre()+ " has been added into the file movie.txt.");
            System.out.println("D:\\DEV\\JAVA\\Udemy projects\\SpringBoot_formation_Udemy\\SpringBoot_Dvd_Manager\\movies.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
