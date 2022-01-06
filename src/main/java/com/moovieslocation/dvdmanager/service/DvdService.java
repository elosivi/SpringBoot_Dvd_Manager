package com.moovieslocation.dvdmanager.service;

import com.moovieslocation.dvdmanager.entity.Dvd;
import com.moovieslocation.dvdmanager.repository.DvdRepository;

public class DvdService {

    private static long lastCode = 0L;

    private DvdRepository dvdRepository = new DvdRepository();

    public static void createDvd(Dvd newDvd){
        newDvd.setCode(String.valueOf(++lastCode));
        DvdRepository.create(newDvd);
    }

}
