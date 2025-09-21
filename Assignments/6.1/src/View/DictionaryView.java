package View;

import Model.Dictionary;
import Controller.DictionaryController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class DictionaryView extends Application {
    private DictionaryController controller;

    @Override
    public void start(Stage primaryStage) {
        controller = new DictionaryController(new Dictionary());

        try {
            primaryStage.setOnCloseRequest(t -> {
                Platform.exit();
                System.exit(0);
            });

            TextField wordInput = new TextField();
            wordInput.setPromptText("Enter word");

            Button searchButton = new Button("Search");
            TextArea meaningOutput = new TextArea();
            meaningOutput.setEditable(false);
            meaningOutput.setWrapText(true);
            meaningOutput.setPrefRowCount(5);

            searchButton.setOnAction(e -> {
                String word = wordInput.getText();
                String meaning = controller.getMeaning(word);
                meaningOutput.setText(meaning);
            });

            FlowPane root = new FlowPane(10, 10);
            root.getChildren().addAll(new Label("Word:"), wordInput, searchButton, new Label("Meaning:"), meaningOutput);

            Scene scene = new Scene(root, 400, 300);
            primaryStage.setTitle("Model.Dictionary");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
