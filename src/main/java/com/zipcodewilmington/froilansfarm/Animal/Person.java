package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Eat.Edible;

public abstract class Person extends Animal{
    private String name;
    public boolean fed = false;
    public Boolean mounted = false;

    public Person(String name) {
        this.name = name;
    }
    public Person() {
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(Edible type) {
    }

    public void dismount() {
        mounted = false;
    }

    public boolean isMounted() {
        return mounted;
    }
}
