/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.nadir.library.model;

/**
 *
 * @author Asus
 */
public class Book extends LibraryModel{
    private String name;
    private Language language;
    private Shelf shelf;
    private Integer page;
    private Double price;
    private String dateOfPublication ;
    private Integer currentSituation;
    private Integer numberOfBook;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public Integer getCurrentSituation() {
        return currentSituation;
    }

    public void setCurrentSituation(Integer currentSituation) {
        this.currentSituation = currentSituation;
    }

    public Integer getNumberOfBook() {
        return numberOfBook;
    }

    public void setNumberOfBook(Integer numberOfBook) {
        this.numberOfBook = numberOfBook;
    }

    @Override
    public String toString() {
        return  getId()+": " + name+ " - " + getLanguage(); 
    }
    
}
