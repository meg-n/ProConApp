package com.example.pcapp;

import java.util.ArrayList;

public class Dilemma {
    private ArrayList<Argument> argumentList = null;
    private String dilemmaDesc;
    private int dilemmaID;
    private static int dilemmaNo = 0;
    public Dilemma(String dilemmaDesc, ArrayList<Argument> argumentList) {
        this.dilemmaDesc = dilemmaDesc;
        this.argumentList = argumentList;
        dilemmaNo++;
        this.dilemmaID = dilemmaNo;
    }

    public String getDilemmaDesc() {
        return dilemmaDesc;
    }

    public int getDilemmaID() {
        return dilemmaID;
    }

    public void setDilemmaID(int dilemmaID) {
        this.dilemmaID = dilemmaID;
    }

    public void addArgument(Argument argument){
        argumentList.add(argument);
    }

    public void createArgument(Argument argument){

    }

    public void removeArgument (int argumentID){
        for (Argument argument: argumentList) {
            if(argument.getArgumentID() == argumentID){
                argumentList.remove(argument);
            }
        }
    }
}
