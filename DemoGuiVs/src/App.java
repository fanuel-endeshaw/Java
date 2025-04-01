import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        // FXMLLoader loader=new FXMLLoader(getClass().getResource("MainScene.fxml"));
        // Parent root=loader.load();
        // Controller controller=loader.getController();
        // controller.setMainWindow(primaryStage);
        // primaryStage.setTitle("Main");
        // primaryStage.setScene(new Scene(root,800,800));


        Parent root=FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}







