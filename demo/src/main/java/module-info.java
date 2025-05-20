module costumestore {
    requires javafx.controls;
    requires javafx.fxml;

    opens costumestore to javafx.fxml;
    exports costumestore;
}
