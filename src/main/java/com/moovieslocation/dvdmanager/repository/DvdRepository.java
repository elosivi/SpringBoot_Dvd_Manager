package com.moovieslocation.dvdmanager.repository;

import com.moovieslocation.dvdmanager.entity.Dvd;

import java.util.ArrayList;
import java.util.List;

public class DvdRepository {

    private static List<Dvd> dvdList = new ArrayList<>();

    public static void create (Dvd newDvd){
        dvdList.add(newDvd);
        System.out.println(newDvd.getTitle() + " was added ");
        returnList();
    }

    public static List returnList(){
        System.out.println("The List");
        for (Dvd dvd : dvdList) {
            System.out.println(dvd.getTitle());
        }
        return dvdList;
    }

}
