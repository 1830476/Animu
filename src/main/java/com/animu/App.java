package com.animu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Nuevo commit");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage =(Stage) FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        stage.show();
    }
}
