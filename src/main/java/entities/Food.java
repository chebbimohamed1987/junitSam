package entities;

import exception.NoFormatNameException;
import exception.NonAbsoluteNumberException;

public class Food {
    private String name;
    private Float calories;

    public Food() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NoFormatNameException {
        if (!name.matches("(?i)[a-z]+")){
            throw new NoFormatNameException("Le nom ne peut contenir que des lettres");
        }
        this.name = name.toUpperCase();
    }

    public Float getCalories() {
        return calories;
    }

    public void setCalories(Float calories) throws NonAbsoluteNumberException {
        if (calories < 0){
            throw new NonAbsoluteNumberException("Le chiffre doit être positif");
        }
        this.calories = calories;
    }
}
