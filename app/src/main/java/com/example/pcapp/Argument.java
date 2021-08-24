/**
 * This class contains a collection of arguments that make up the dilemma
 */
package com.example.pcapp;

public class Argument {
    private String comment;
    private String rating;
    private String argType;
    private int argumentID;
    private static int argumentNo;

    public Argument(String comment, String rating, String argType) {
        this.comment = comment;
        this.rating = rating;
        this.argType = argType;
        argumentNo++;
        this.argumentID = argumentNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getArgType() {
        return argType;
    }

    public void setArgType(String argType) {
        this.argType = argType;
    }

    public int getArgumentID() {
        return argumentID;
    }

    public void setArgumentID(int argumentID) {
        this.argumentID = argumentID;
    }

    public void changeArgumentType(Argument argument) {
        if (argument.argType.equalsIgnoreCase("Pro")) {
            argument.argType = "Con";
        } else {
            argument.argType = "Pro";
        }
    }
}
