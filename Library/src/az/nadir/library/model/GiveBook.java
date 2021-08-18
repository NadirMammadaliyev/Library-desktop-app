/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.nadir.library.model;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class GiveBook extends LibraryModel {
    private User user;
    private Book book;
    private Employee  employee;
    private ReadingRoom readingRoom;
    private Date retrunDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ReadingRoom getReadingRoom() {
        return readingRoom;
    }

    public void setReadingRoom(ReadingRoom readingRoom) {
        this.readingRoom = readingRoom;
    }

    public Date getRetrunDate() {
        return retrunDate;
    }

    public void setRetrunDate(Date retrunDate) {
        this.retrunDate = retrunDate;
    }

    @Override
    public String toString() {
        return "GiveBook{" + "user=" + user + ", book=" + book + ", employee=" + employee + ", readingRoom=" + readingRoom + ", retrunDate=" + retrunDate + '}';
    }

    
    
}
