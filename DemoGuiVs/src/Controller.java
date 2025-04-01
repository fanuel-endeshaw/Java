

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
// import javafx.scene.control.TextArea;
// import javafx.stage.Stage;
// import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller {
   // private TextArea tfield;
    // private Stage mainWindow;
    // @FXML
    // void onBtnClicked(ActionEvent event) {
    // System.out.println("hallo");
    // }
    // public void setMainWindow(Stage mainWindow) {
    //  this.mainWindow=mainWindow;
    // }
    @FXML
 private Circle mycircle;
 double r;
 double p;
private Stage stage;
private Scene scene;
private Parent root;
public void up(ActionEvent e){
    System.out.println("up clicked");
    mycircle.setCenterY(r-=10);
}
public void down(ActionEvent e){
    System.out.println("up clicked");
    mycircle.setCenterY(r+=10);
}
public void right(ActionEvent e){
    System.out.println("up clicked");
    mycircle.setCenterX(p-=10);
}
public void left(ActionEvent e){
    System.out.println("up clicked");
    mycircle.setCenterX(p+=10);
}
public void switchToScene2(ActionEvent event) throws Exception{
  root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

}
public void switchToScene1(ActionEvent event)throws Exception{
    root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
}


}
