package com.example.jug.simple;

/**
 * @author Filip Hrisafov
 */
public class Model {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Model create(String name) {
        Model model = new Model();
        model.setName(name);
        return model;
    }
}
