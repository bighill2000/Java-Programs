import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by mrglass on 9/9/2015.
 */
public class ConfirmBox {
    static boolean answer;


    public static boolean display(String title, String message){
        Stage window = new Stage();

        //block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        //create label and button for box
        Label label = new Label();
        label.setText(message);

        //Create two buttons

        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        //create vbox layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesButton,noButton);
        layout.setAlignment(Pos.CENTER);

        //display window and wait for it to be closed
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;


    }
}
