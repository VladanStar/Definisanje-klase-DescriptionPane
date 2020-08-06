package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


public class TextAreaDemo extends Application {

    @Override // Redefinisanje metoda start() iz klase Application
    public void start(Stage primaryStage) {
        // Objavljivanje i kreiranje okna za opisivanje
        DescriptionPane descriptionPane = new DescriptionPane();

        // Unos naslova, teksta i slike u okvir za opisivanje
        descriptionPane.setTitle("Canada");
        String description = "The Canadian national flag ...";
        ImageView img_view = new ImageView("ca.jpg");
        img_view.setFitHeight(150);
        img_view.setFitWidth(200);
        descriptionPane.setImageView(img_view);
        descriptionPane.setDescription(description);

        // Kreiranje scene i njeno postavljanje na pozornicu
        Scene scene = new Scene(descriptionPane, 450, 200);
        primaryStage.setTitle("TextAreaDemo"); // Unos naziva pozornice
        primaryStage.setScene(scene); // Postavljanje scene na pozornicu
        primaryStage.show(); // Prikaz pozornice
    }

    public static void main(String[] args) {
        launch(args);
    }

}