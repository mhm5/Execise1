package com.mycompany.execise1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class PrimaryController {

    public Label Number;
    @FXML
    private Button ClearMe;

    @FXML
    private Button DecreaseMe;

    @FXML
    private Button ExitMe;

    @FXML
    private Button IncreaseMe;

    int number=0 ;
    
    @FXML
    void Reset(ActionEvent event) {
         // clear the number and reset it to 0
          Number.setText(String.valueOf(number=0));
    }
    
    @FXML
    void close_window(ActionEvent event) {

      //close window button
        Stage stage = (Stage) ExitMe.getScene().getWindow();
        stage.close();
    }

    @FXML
    void increase_number(ActionEvent event) {
        //this button decrease the number by 1
        Number.setText(String.valueOf(number+=1));

    }
    
    @FXML
    void decrease_number(ActionEvent event) {
        //This button increase the number by 1
        Number.setText(String.valueOf(number-=1));

    }
}
