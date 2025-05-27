package costumestore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import costumestore.models.Employee;
/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Employee loggedInEmployee;

    public static Employee getLoggedInEmployee() {
        return loggedInEmployee;
    }

    public static void setLoggedInEmployee(Employee loggedInEmployee) {
        App.loggedInEmployee = loggedInEmployee;
    }

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("views/LoginScene"));
        stage.setTitle("Costume Store Management System");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }   

    public static void main(String[] args) {
        launch();
    }

}