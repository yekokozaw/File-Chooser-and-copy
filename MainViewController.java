package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MainViewController {
	
	  @FXML
	   public void onSingleBtnClicked() throws IOException {
		  FileChooser fc=new FileChooser();
		  fc.getExtensionFilters().add(
				  new ExtensionFilter("Image File","*.jpeg")
		 );
		  File selectedPath = fc.showOpenDialog(null);
		  System.out.println(selectedPath);
		  String currentPath = System.getProperty("user.dir");
		  String folderPath = currentPath+"/src/application/img";
		 
		  File copyFile = new File(folderPath+"/"+selectedPath.getName());
		  FileUtils.copyFile(selectedPath, copyFile);
	    }
	   @FXML
	   public void onMultiBtnClicked() {
		   
	    }

//	public void addBtnClicked() {
//		if(input.getText().isEmpty()) return;
//		listview.getItems().add(input.getText());
//	}
//	
//	public void deleteBtnClicked() {
//		String data=listview.getSelectionModel().getSelectedItem();
//		listview.getItems().remove(data);
//	}
}
