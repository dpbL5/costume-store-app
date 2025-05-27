package costumestore.views;

import java.io.IOException;
import javafx.scene.control.Label;
import costumestore.App;
import costumestore.models.Employee;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SelectTypeScene {
    @FXML
    private Button btnMonthly;
    @FXML
    private Button btnQuaterly;
    @FXML
    private Button btnYearly;
    @FXML
    private Button btnBack;
    @FXML 
    private Label lblEmp;

    private Employee currentEmployee = App.getLoggedInEmployee();
    
    @FXML
    private void initialize() {
        if (lblEmp != null) {
            lblEmp.setText(currentEmployee.getName() + " (" + currentEmployee.getPosition() + ")");
        }
        System.out.println("SelectTypeScene initialized");
    }

    @FXML
    private void btnMonthlyOnClick() {
        System.out.println("Monthly button clicked");
        try {
            App.setRoot("views/RevenueListScene");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnQuaterlyOnClick() {
        System.out.println("Quarterly button clicked");
    }

    @FXML
    private void btnYearlyOnClick() {
        System.out.println("Yearly button clicked");
    }
    @FXML
    private void btnBackOnClick() throws IOException {
        System.out.println("Back button clicked");
        try {
            App.setRoot("views/ManagerHomeScene");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
