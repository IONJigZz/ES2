package com.es2.memento;

import java.util.ArrayList;

public class Server extends Object{

    private ArrayList<String> Students = new ArrayList<>();
    public Server(){}
    public void addStudent(String studentName) throws ExistingStudentException{
        if(Students.contains(studentName))
            throw new ExistingStudentException();
        else
            Students.add(studentName);
    }
    public Memento backup(){
        Memento m = new Memento(Students);
        return m;
    }
    public void restore(Memento state){
        Students = state.getState();
    }
    public ArrayList<String> getStudentNames(){
        return Students;
    }
}
