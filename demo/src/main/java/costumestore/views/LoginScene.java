package costumestore.views;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import java.io.IOException;
import java.sql.SQLException;

import costumestore.App;
import costumestore.dao.EmployeeDAO;
import costumestore.models.Employee;

public class LoginScene {
    
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Text errorText;
    @FXML
    private Button loginButton;

    private EmployeeDAO employeeDAO;

    @FXML
    public void onLoginButtonClick() throws IOException, SQLException {
        employeeDAO = new EmployeeDAO();
        String username = usernameField.getText();
        String password = passwordField.getText();

        Employee empTemp = new Employee("", username, password, "", "");
        empTemp.setUsername(username);
        empTemp.setPassword(password);

        // Kiem tra dang nhap
        Employee loggedInEmployee = employeeDAO.SelectByCondition(empTemp);
        if (loggedInEmployee != null) {
            System.out.println("Login successful. Welcome, " + loggedInEmployee.getName() + "!");
            App.setLoggedInEmployee(loggedInEmployee);
            App.setRoot("views/ManagerHomeScene");
        } else {
            errorText.setText("Sai ten dang nhap hoac mat khau");
            System.out.println("Login failed. Invalid username or password.");
        }
    }
}