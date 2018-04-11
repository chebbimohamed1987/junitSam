package entities;

import exception.NoFormatNameException;
import exception.NonAbsoluteNumberException;

public class Human {
    private String name;
    private Integer taille;
    private Float masse;

    public Human() {
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

    public Integer getTaille() {
        return taille;
    }

    public void setTaille(Integer taille) throws NonAbsoluteNumberException {
        if (taille < 0) throw new NonAbsoluteNumberException("La taille doit être supérieur à 0");
        this.taille = taille;
    }

    public Float getMasse() {
        return masse;
    }

    public void setMasse(Float masse) throws NonAbsoluteNumberException {
        if (masse < 0) throw new NonAbsoluteNumberException("La masse doit être supérieur à 0");
        this.masse = masse;
    }
}
