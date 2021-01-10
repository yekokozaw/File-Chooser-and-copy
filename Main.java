package application;
	
import java.io.File;
import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	public static void main(String[] args) throws IOException {
		launch(args);
		
//		String currentPath = System.getProperty("user.dir");
//		String folderPath = currentPath+"/src/application/img";
//		File folder = new File(folderPath);
//		if(!folder.exists()) {
//			folder.mkdir();
//		}
//		//System.out.println(currentPath);
//		File old = new File("/home/ye/Pictures/jennie.jpg");
//		File copy = new File(folderPath+"/"+old.getName());
//		FileUtils.copyFile(old,copy);
}

	public void start(Stage primaryStage) throws Exception{
		
		Parent root= FXMLLoader.load(getClass().getResource("Second.fxml"));
		Scene scene=new Scene(root);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}