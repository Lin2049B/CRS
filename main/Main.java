package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/ui/student.fxml"));
        primaryStage.setTitle("Course Registration");
        primaryStage.setScene(new Scene(root, 443, 554));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
