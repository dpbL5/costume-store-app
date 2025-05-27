module costumestore {
    requires javafx.controls;
    requires transitive javafx.graphics;
    requires javafx.fxml;
    requires java.sql;
    
    opens costumestore to javafx.fxml;
    exports costumestore;

    opens costumestore.views to javafx.fxml;
    exports costumestore.views;

    opens costumestore.models to javafx.base;
    exports costumestore.models;

    
}
