package costumestore.views;

import costumestore.models.RevenueStat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RevenueListScene {

    @FXML
    private Button btnBack;

    @FXML
    private Label lblEmp;

    @FXML
    private TableView<RevenueStat> tblRevenue;

    @FXML
    private TableColumn<RevenueStat, String> colType;
    
    @FXML
    private TableColumn<RevenueStat, String> colRevenue;
    @FXML
    public void initialize() {
        setupTable();
    }

    private void setupTable() {
        
    }
}
