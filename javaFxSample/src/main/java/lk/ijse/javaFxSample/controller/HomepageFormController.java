package lk.ijse.javaFxSample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HomepageFormController {

    public AnchorPane rootNode;
    public void btnCustomerOnAction(ActionEvent actionEvent) {

    }

    public void btnItemOnAction(ActionEvent actionEvent) {

    }

    public void btnDashboardOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane rootNode = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/view/dashboardview_form.fxml")));

        //set a scene to the scene graph
        Scene scene = new Scene(rootNode);

        // get the primary stage from login actors
        Stage stage = (Stage) this.rootNode.getScene().getWindow();

        // set scene to the primary stage
        stage.setScene(scene);
    }
}
