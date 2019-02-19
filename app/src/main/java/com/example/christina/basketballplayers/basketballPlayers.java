package com.example.christina.basketballplayers;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class basketballPlayers implements Serializable
{
    public String name;
    public int jerseyNumber;
    public int age;
    public int heightFeet;
    public int heightInch;

    public basketballPlayers(String name, int jerseyNumber, int age, int heightFeet, int heightInch)
    {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.heightFeet = heightFeet;
        this.heightInch = heightInch;
    }

    public basketballPlayers()
    {
        this.name = "Name";
        this.jerseyNumber = 0;
        this.age = 0;
        this.heightFeet = 0;
        this.heightInch = 0;
    }

    @Exclude
    public String getNameString()
    {
        return this.name;
    }

    @Exclude
    public String getIntsString()
    {
        return "Jersey Number: " + this.jerseyNumber + ", Age: " + this.age + ", Height in Feet: " + this.heightFeet + ", Height in Inches: " + this.heightInch + ".";
    }

    @Exclude
    public String toString()
    {
        return this.name + ", #" + this.jerseyNumber + ", " + this.heightFeet + " ft, " + this.heightInch + " in (" + this.age + ")";
    }

    @Exclude
    public void display()
    {
        System.out.println(name + ", " + jerseyNumber + ", " + age + ", " + heightFeet + " (" + heightInch + ")");
    }

    @Exclude
    public String getName()
    {
        return name;
    }

    @Exclude
    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    @Exclude
    public int getAge()
    {
        return this.age;
    }

    @Exclude
    public void setAge(int age)
    {
        if (age >= 1)
        {
            this.age = age;
        }
    }

    @Exclude
    public int getHeightFeet()
    {
        return heightFeet;
    }

    @Exclude
    public int getHeightInch()
    {
        return heightInch;
    }
}
