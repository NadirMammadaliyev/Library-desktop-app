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
public abstract class LibraryModel {

    private Long id;
    private Date dataDate;
    private Integer active;

    public Long getId() {
        return id;
    }

    public Date getDataDate() {
        return dataDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDataDate(Date dataDate) {
        this.dataDate = dataDate;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    
}
