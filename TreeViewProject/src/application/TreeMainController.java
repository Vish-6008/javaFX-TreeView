/********************************************************************************************
 *   COPYRIGHT (C) 2022 TONAL INC
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without  written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  JAVA-FX project
 *   Project:  TreeMainController
 *   Platform: JavaSE-22.0.1
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 * 	 Version: 2024-03 (4.31.0)
 *   Build id: 20240307-1437 
 *********************************************************************************************/

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TreeMainController implements Initializable {
	@FXML
	TreeView<String> treeView;

	// Adding the image on the list icon
	Image icon = new Image(getClass().getResourceAsStream("/img/pngwing.png"));

	@Override
	public void initialize(URL Location, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
		// TODO Auto-generated method stub

		TreeItem<String> nodeA = new TreeItem<>("node A");
		TreeItem<String> nodeB = new TreeItem<>("node B");
		TreeItem<String> nodeC = new TreeItem<>("node C");
		root.getChildren().addAll(nodeA, nodeB, nodeC); // easy way to call

		// to Add & get SubNodes for above main nodes
		TreeItem<String> nodeA1 = new TreeItem<>("node A1", new ImageView(icon));
		TreeItem<String> nodeB1 = new TreeItem<>("node B1", new ImageView(icon));
		TreeItem<String> nodeC1 = new TreeItem<>("node C1", new ImageView(icon));
		nodeA.getChildren().addAll(nodeA1, nodeB1, nodeC1);
		root.getChildren().add(nodeA);
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);

		treeView.setRoot(root);

	}

}
