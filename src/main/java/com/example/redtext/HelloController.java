package com.example.redtext;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField toText;

    @FXML
    Button upBtn;

    @FXML
    Button dwBtn;

    @FXML
    Label resString;

    ObservModel om = new ObservModel();

    public void initialize(){

        upBtn.setOnAction(actionEvent -> om.addStarUp());
        dwBtn.setOnAction(actionEvent -> om.addStarDown());

        om.s.addListener((ov, s, t1) -> {
            toText.setText(ov.getValue().toString());

        });

//        om.s.bindBidirectional();
        toText.textProperty().bindBidirectional(om.s);

        resString.setText(toText.getText());

    }

}