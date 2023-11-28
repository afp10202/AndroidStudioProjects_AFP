package com.kelompok11_progmob_a.myrecipe.model;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private int imageRes;
    private String video;
    private ArrayList<String> ingredient = null;
    private ArrayList<String> steps = null;

    public Recipe(String name, int imageRes, String video, ArrayList<String> ingredient, ArrayList<String> steps) {
        this.name = name;
        this.imageRes = imageRes;
        this.video = video;
        this.ingredient = ingredient;
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public ArrayList<String> getIngredient() {
        return ingredient;
    }

    public void setIngredient(ArrayList<String> ingredient) {
        this.ingredient = ingredient;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }
}
