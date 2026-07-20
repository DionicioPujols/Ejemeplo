import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage PrimaryStage)throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Registro.fxml"));
        Scene scene = new Scene(loader.load());
        PrimaryStage.setTitle("Sistema de prueba");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
    }
}
