package com.knf.dev;

import javax.persistence.*;

@Entity
@Table

public class PersonData2015 {
    @Id
    @SequenceGenerator(
            name="Person_Sequence",
            sequenceName = "Person_Sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "Person_Sequence"
    )
    private long id;
    private String name;
    private int year;
    private String category;
    private String award;

    private String img;

    public long getId() {
        return id;
    }




    public PersonData2015(String name, int year, String category, String award, String img) {
        this.name = name;
        this.year = year;
        this.category = category;
        this.award = award;
        this.img=img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public PersonData2015(){
    }

    public PersonData2015(long id){
        this.id=id;
    }

}
