/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
public class Book {
    private String title;
    private int pageNumber;
    private int publicationYear;
    
    public Book(String title, int pageNumbers, int pubYear){
        this.title = title;
        this.pageNumber = pageNumbers;
        this.publicationYear = pubYear;
    }
    public String getTitle (){
        return title;
    }

    public String toString(){
            return this.title + ", " + this.pageNumber + " pages, " + this.publicationYear;
    }
    
}
