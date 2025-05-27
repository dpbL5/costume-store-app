package costumestore.views;

import java.io.IOException;

import costumestore.App;
import costumestore.models.Employee;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ManagerHomeScene {
    @FXML
    private Button btnViewRevenueStat;
    @FXML
    private Label lblEmp;
   
    private Employee currentEmployee = App.getLoggedInEmployee();

    @FXML
    private void initialize() {
        if (lblEmp != null) {
            lblEmp.setText("Welcome, " + currentEmployee.getName() + " (" + currentEmployee.getPosition() + ")");
        }
        System.out.println("ManagerHomeScene initialized");
    }

    @FXML
    public void btnViewRevenueStatOnClick(ActionEvent e) throws IOException {
        System.out.println("View Revenue Statistics button clicked");
        App.setRoot("views/SelectTypeScene");
    }
}
