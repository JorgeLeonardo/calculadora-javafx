/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 04623646238
 */
public class PrincipalController implements Initializable {
    
    @FXML
    private TextField txtnum1, txtnum2, txtResultado;
    
    @FXML
    private Button btnSomar;
     @FXML
     
    private void Somar (ActionEvent e) {
     Double num1 = Double.parseDouble(txtnum1.getText());
     Double num2 = Double.parseDouble(txtnum2.getText());
     Double resultSoma;
     resultSoma = num1 + num2;
     txtResultado.setText(resultSoma.toString());
    }
      @FXML
        private void Diminuir (ActionEvent e) {
     Double num1 = Double.parseDouble(txtnum1.getText());
     Double num2 = Double.parseDouble(txtnum2.getText());
     Double resultDim;
     resultDim = num1 - num2;
     txtResultado.setText(resultDim.toString());
    }
      @FXML
            private void Multiplicar (ActionEvent e){
     Double num1 = Double.parseDouble(txtnum1.getText());
     Double num2 = Double.parseDouble(txtnum2.getText());
     Double resultMulti;
     resultMulti = num1 * num2;
     txtResultado.setText(resultMulti.toString());
    }
      @FXML
    private void Dividir (ActionEvent e) {
     Double num1 = Double.parseDouble(txtnum1.getText());
     Double num2 = Double.parseDouble(txtnum2.getText());
     Double resultDiv;
     resultDiv = num1 / num2;
     txtResultado.setText(resultDiv.toString());
    }
    
         
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
