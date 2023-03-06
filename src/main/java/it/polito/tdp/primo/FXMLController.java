/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.primo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnPremi"
    private Button btnPremi; // Value injected by FXMLLoader

    @FXML // fx:id="txtMessaggio"
    private Label txtMessaggio; // Value injected by FXMLLoader
    
    @FXML
    private TextField txtNome;

    @FXML
    void handlePremi(ActionEvent event) {
    	//System.out.println("Premuto");
    	String nome= txtNome.getText();
    	txtMessaggio.setText("Buongiorno, "+nome);
    	
    	txtNome.setText("");
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnPremi != null : "fx:id=\"btnPremi\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtMessaggio != null : "fx:id=\"txtMessaggio\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
