module net.lamah.gestion_consultation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens net.lamah.gestion_consultation to javafx.fxml;
    exports net.lamah.gestion_consultation;
}