package com.es2.memento;

import java.util.ArrayList;

public class Memento extends Object{

    private ArrayList<String> students = new ArrayList<>();
    public Memento(ArrayList<String> studentNames){
        students.addAll(studentNames);
    }
    public ArrayList<String> getState(){
        return students;
    }
}
