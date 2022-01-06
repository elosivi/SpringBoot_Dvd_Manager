package com.mycompany.dvdstore.entity;

import java.util.List;

public class Movie {

    private long id;
    private String title;
    private int copiesNbAvailable;
    private String genre;
    private String mainActor;
    private List<String> actorsList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCopiesNbAvailable() {
        return copiesNbAvailable;
    }

    public void setCopiesNbAvailable(int copiesNbAvailable) {
        this.copiesNbAvailable = copiesNbAvailable;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public List<String> getActorsList() {
        return actorsList;
    }

    public void setActorsList(List<String> actorsList) {
        this.actorsList = actorsList;
    }
}
