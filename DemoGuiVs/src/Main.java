





// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.control.TextField;
// import javafx.scene.layout.GridPane;
// import javafx.scene.paint.Color;
// import javafx.scene.text.Font;
// import javafx.scene.text.FontWeight;
// import javafx.stage.Stage;

// public class App extends Application {
//    private final Label lblNum1 = new Label("Number1:");
//     private final Label lblNum2 = new Label("Number2:");
//     private final Label lblSum = new Label("Sum:");
//     private final TextField txtNum1 = new TextField();
//     private final TextField txtNum2 = new TextField();
//     private final TextField txtSum = new TextField();
//     private final Button btnAdd = new Button("Add");
//     private final Button btnClear = new Button("Clear");
    
    
//     @Override
//     public void start(Stage primaryStage) {
//         lblNum1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         lblNum2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         lblSum.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         btnAdd.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         btnClear.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         txtNum1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         txtNum2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
//         txtSum.setFont(Font.font("Times New Roman", FontWeight.BOLD, 16));
        
//         lblNum1.setTextFill(Color.BLUE);
//         lblNum2.setTextFill(Color.BLUE);
//         lblSum.setTextFill(Color.BLUE);
//         btnAdd.setTextFill(Color.BLUE);
//         btnClear.setTextFill(Color.BLUE);
        
//         txtNum1.setAlignment(Pos.BOTTOM_RIGHT);
//         txtNum2.setAlignment(Pos.BOTTOM_RIGHT);
//         txtSum.setAlignment(Pos.BOTTOM_RIGHT);
        
//         GridPane root = new GridPane();
//         root.addRow(0, lblNum1, txtNum1);
//         root.addRow(1, lblNum2, txtNum2);
//         root.addRow(2, lblSum, txtSum);
//         root.addRow(3, btnAdd, btnClear);
        
        
        
// //        root.addRow(0, lblNum1);
// //        root.addRow(0, txtNum1);
        
//         root.setHgap(10);
//         root.setVgap(10);
//         root.setAlignment(Pos.CENTER);
//         root.setStyle("-fx-background-color: pink");
       
//        AddHandlerClass addHandler = new AddHandlerClass();
//        ClearHandlerClass clearHandler = new ClearHandlerClass();
//        btnAdd.setOnAction(addHandler);
//        btnClear.setOnAction(clearHandler);
       
//         Scene scene = new Scene(root, 350, 250);
//         primaryStage.setTitle("Adding Two Numbers");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
//     public static void main(String[] args) {
//         launch(args);
//     }
//     class AddHandlerClass implements EventHandler<ActionEvent>{
//         @Override
//         public void handle(ActionEvent e){
//             double num1, num2, sum;
//             num1 = Double.parseDouble(txtNum1.getText());
//             num2 = Double.parseDouble(txtNum2.getText());
//             sum = num1+num2;
//             txtSum.setText(Double.toString(sum));
//         }
//     }
//     class ClearHandlerClass implements EventHandler<ActionEvent>{
//         @Override
//         public void handle(ActionEvent e){
//             txtNum1.clear();
//             txtNum2.setText("");
//             txtSum.clear();
//         }
//     }    
// }

