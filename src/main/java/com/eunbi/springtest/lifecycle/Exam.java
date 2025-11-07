package com.eunbi.springtest.lifecycle;

public class Exam {
    private String name;
    private int score;

    public Exam(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " : " + score;
    }


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


}
