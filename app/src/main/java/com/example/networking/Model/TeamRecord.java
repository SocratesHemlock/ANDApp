package com.example.networking.Model;

public class TeamRecord
{
    private int win;
    private int loss;
    private int points;

    public TeamRecord(int win, int loss, int points) {
        this.win = win;
        this.loss = loss;
        this.points = points;
    }

    public int getWin()
    {
        return win;
    }

    public int getLoss()
    {
        return loss;
    }

    public int getPoints()
    {
        return points;
    }
}