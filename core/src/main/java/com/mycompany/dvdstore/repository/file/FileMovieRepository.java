package com.mycompany.dvdstore.repository.file;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    @Value("${movies.file.location}")
    private File file;


    public Movie add(Movie movie){
        FileWriter writer;

        long lastId=list().stream().map(Movie::getId).max(Long::compare).orElse(0L);
        movie.setId(lastId+1);

        try{
            writer = new FileWriter(file,true);// check value (path) from bean generated into applicationContext.xml
            writer.write(movie.getId() + ";"+ movie.getTitle() + ";"+ movie.getGenre() + ";"+ movie.getDescription() + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The movie #" + movie.getId()+ " : " + movie.getTitle()+ " / "+ movie.getGenre()+ " has been added into the file movie.csv.");
        System.out.println(file);
        return movie;
    }
    @Override
    public Movie getById(long id) {
        final Movie movie = new Movie();
        movie.setId(id);
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {

                final String[] allProperties = line.split("\\;");
                final long nextMovieId=Long.parseLong(allProperties[0]);
                if (nextMovieId==id) {
                    movie.setTitle(allProperties[1]);
                    movie.setGenre(allProperties[2]);
                    movie.setDescription(allProperties[3]);
                    return movie;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException e");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException e");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("A movie from the file does not have a proper id");
            e.printStackTrace();
        }
        movie.setTitle("UNKNOWN");
        movie.setGenre("UNKNOWN");
        movie.setDescription("UNKNOWN");
        return movie;
    }

    @Override
    public List<Movie> list() {
        List<Movie> movies=new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            for(String line; (line = br.readLine()) != null; ) {
                final Movie movie=new Movie();
                final String[] movieInfo = line.split("\\;");
                final long movieId=Long.parseLong(movieInfo[0]);
                movie.setId(movieId);
                movie.setTitle(movieInfo[1]);
                movie.setGenre(movieInfo[2]);
                movie.setDescription(movieInfo[3]);
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


}
