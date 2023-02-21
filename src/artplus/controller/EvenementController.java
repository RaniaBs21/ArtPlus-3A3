/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artplus.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rahma
 */
public class EvenementController implements Initializable {

    @FXML
    private Text accueil;

    @FXML
    private Button btnParticiper;

    @FXML
    private Button btnV;

    @FXML
    private Text cours;

    @FXML
    private Text ev;

    @FXML
    private Text filactualite;

    @FXML
    private Text quiz;

    @FXML
    private Text reclam;

    @FXML
    private Text shop;
    
// ...

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnParticiper.setOnAction(event -> {
            try {
                Parent parent2 = FXMLLoader.load(getClass().getResource("/artplus.view/Page2.fxml"));

                Scene scene = new Scene(parent2);
                Stage stage = (Stage) ((Node) event.getSource())
                        .getScene().getWindow();
                stage.setScene(scene);
                //Scene scene = btnParticiper.getScene();
                //scene.setRoot(parent2);
//               stage.setScene(scene);
//              stage.setTitle("Interface2");
//               stage.show();
            } catch (IOException ex) {
                Logger.getLogger(EvenementController.class.getName()).log(Level.SEVERE, null, ex);

            }
        });
    }

}
