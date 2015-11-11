import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.*;
import javafx.stage.Stage;



/**
 * Created by mrglass on 9/9/2015.
 */
public class Main extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JvaFX - hello");
        button = new Button("Close Program");
        button.setOnAction(event ->{
            event.consume();
            closeProgram();
        });

        window.setOnCloseRequest(event -> closeProgram());


        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram(){
        Boolean answer = ConfirmBox.display("This is my Story", "Sure you want to exit?");
        if (answer)
                window.close();
    }
}


