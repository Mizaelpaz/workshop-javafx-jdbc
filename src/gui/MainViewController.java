package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemVendedor;
	
	@FXML
	private MenuItem menuItemDepartamento;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemVendedorAction() {
		System.out.println("onMenuItemVendedorAction");
	}	
		@FXML
		public void onMenuItemDepartamentorAction() {
			System.out.println("onMenuItemVDepartamentoAction");
		}	
			@FXML
			public void onMenuItemAboutAction() {
				System.out.println("onMenuItemAboutAction");
	}
	
	
	
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
		
	}

}
