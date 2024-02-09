package lk.ijse.javaFxSample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.javaFxSample.db.Database;

import java.io.IOException;
import java.util.Objects;

/*
    *low White - #EEEEEE
    *light blue - #00ADB5
    *Alu - #393E46
    *light black - #222831
*/
public class LoginFormController {

    public TextField txtUserName;
    public PasswordField txtPassword;
    public AnchorPane rootNode;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        String userName = txtUserName.getText();
        String pw = txtPassword.getText();

        if(userName.equals(Database.USER_NAME) && pw.equals(Database.PASSWORD)) {
            // navigate to the sample form
            //load scene graph to our java method
            AnchorPane rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/homepage_form.fxml")));

            //set a scene to the scene graph
            Scene scene = new Scene(rootNode);

            // get the primary stage from login actors
            Stage stage = (Stage) this.rootNode.getScene().getWindow();

            // set scene to the primary stage
            stage.setScene(scene);

            // set title to the stage
            stage.setTitle("Home Page");

            // get stage to the center
            stage.centerOnScreen();
        } else {
            new Alert(Alert.AlertType.ERROR, "Login Failed").show();
        }
    }
}
