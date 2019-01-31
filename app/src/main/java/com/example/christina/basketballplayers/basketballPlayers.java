package com.example.christina.basketballplayers;

public class basketballPlayers
{
    private String name;
    private int jerseyNumber;
    private int age;
    private int heightFeet;
    private int heightInch;

    public basketballPlayers(String name, int jerseyNumber, int age, int heightFeet, int heightInch)
    {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.age = age;
        this.heightFeet = heightFeet;
        this.heightInch = heightInch;
    }

    public void display()
    {
        System.out.println(name + ", " + jerseyNumber + ", " + age + ", " + heightFeet + " (" + heightInch + ")");
    }

    public String getName()
    {
        return name;
    }

    public int getJerseyNumber()
    {
        return jerseyNumber;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age >= 1)
        {
            this.age = age;
        }
    }

    public int getHeightFeet()
    {
        return heightFeet;
    }

    public int getHeightInch()
    {
        return heightInch;
    }
}
