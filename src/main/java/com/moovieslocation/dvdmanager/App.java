package com.moovieslocation.dvdmanager;


import com.moovieslocation.dvdmanager.entity.Dvd;
import com.moovieslocation.dvdmanager.service.DvdService;

import java.util.Scanner;

import static jdk.javadoc.internal.doclets.toolkit.util.Utils.toUpperCase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME INTO DVD MANAGER" );
        enterNewDvd();
        AskAgain();



    }

    public static void enterNewDvd(){

        System.out.println( "Inter the title of the new dvd");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        Dvd newDvd = new Dvd();
        newDvd.setTitle(title);

        DvdService dvdService = new DvdService();
        dvdService.createDvd(newDvd);
    }

    public static void AskAgain(){
        System.out.println( "Add a new dvd ? Y/N");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();

        if(response.equalsIgnoreCase("Y")){
            enterNewDvd();
            AskAgain();
        }else if(response.equalsIgnoreCase("N")){
            System.out.println( " BYE ");
        }else{
            System.out.println( "wrong answer");
            AskAgain();
        }

    }
}
