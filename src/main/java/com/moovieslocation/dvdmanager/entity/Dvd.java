package com.moovieslocation.dvdmanager.entity;
import java.util.Date;

public class Dvd {

    private long id;
    private String title;
    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getActualBorrower() {
        return actualBorrower;
    }

    public void setActualBorrower(String actualBorrower) {
        this.actualBorrower = actualBorrower;
    }

    public Date getLoan() {
        return loan;
    }

    public void setLoan(Date loan) {
        this.loan = loan;
    }

    public Date getReturned() {
        return returned;
    }

    public void setReturned(Date returned) {
        this.returned = returned;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    private String author;
    private String actualBorrower;
    private Date loan; //emprunt
    private Date returned; //retourné
    private int loanTerm; // durée d'emprunt autorisée

}
