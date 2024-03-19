package com.example.myapplication;

public class DataFlags {
    private int flagID;
    private int nameID;
    private int abbreviationID;
    private int stolishID;
    public DataFlags (int _flagID, int _nameID, int _abbreviationID, int _stolishID) {
        flagID = _flagID;
        nameID = _nameID;
        abbreviationID = _abbreviationID;
        stolishID = _stolishID;
    }
    public int getFlagID() {
        return flagID;
    }
    public int getNameID() {
        return nameID;
    }
    public int getAbbreviationID() {
        return abbreviationID;
    }

    public int getStolishID(){return stolishID;}
}