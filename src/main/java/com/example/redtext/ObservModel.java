package com.example.redtext;

import javafx.beans.property.SimpleStringProperty;

public class ObservModel {

    SimpleStringProperty s = new SimpleStringProperty();

    public void addStarUp(){
        s.set("*"+s.getValue());
    }

    public void addStarDown(){
        s.set(s.getValue()+"*");
    }


}
