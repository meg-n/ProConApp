package com.example.pcapp;

import java.util.ArrayList;

public class DilemmaCollection {
    private ArrayList<Dilemma> dilemmas = new ArrayList<>();
    private static DilemmaCollection dcInstance = null;

    public DilemmaCollection() {
    }

    public DilemmaCollection(ArrayList<Dilemma> dilemmas) {
        this.dilemmas = dilemmas;
    }

    public static DilemmaCollection getInstance() {
        if (dcInstance == null) {
            dcInstance = new DilemmaCollection();
        }
        return dcInstance;

    }

    public ArrayList<Dilemma> getDilemmas() {
        return dilemmas;
    }

    public void setDilemmas(ArrayList<Dilemma> dilemmas) {
        this.dilemmas = dilemmas;
    }

    public void addDilemma(Dilemma dilemma) {
        dilemmas.add(dilemma);
    }

    public void removeDilemma(int dilemmaID) {
        for (Dilemma dilemma : dilemmas) {
            if (dilemma.getDilemmaID() == dilemmaID) {
                dilemmas.remove(dilemma);
            }
        }
    }
}
