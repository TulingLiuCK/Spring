package Automati.entity;

import org.springframework.beans.factory.annotation.Autowired;

/***
 #Create by LCK on 2021/12/18  15:29
 */
public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    private String name;

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
