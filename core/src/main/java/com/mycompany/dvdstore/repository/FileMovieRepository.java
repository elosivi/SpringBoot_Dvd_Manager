package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{

    private File file;
    String path = "D:\\DEV\\JAVA\\Udemy projects\\SpringBoot_formation_Udemy\\SpringBoot_Dvd_Manager\\movies.csv";

    public void add(Movie movie){
        FileWriter writer;
        try{
            //writer = new FileWriter(path, true);
            writer = new FileWriter(file,true);// check value (path) from bean generated into applicationContext.xml
            writer.write(movie.getTitle() + " ; "+ movie.getGenre() + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The movie " + movie.getTitle()+ " / "+ movie.getGenre()+ " has been added into the file movie.csv.");
        System.out.println(file);

    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
