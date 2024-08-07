package com.example.assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextField amountField;
    @FXML
    private RadioButton nprToCadRadio;
    @FXML
    private RadioButton cadToNprRadio;
    @FXML
    private Label resultLabel;

    private CurrencyConverterModel model = new CurrencyConverterModel();

    @FXML
    public void handleConvert() {
        try {
            // We parse the input amount from the text field
            double amount = Double.parseDouble(amountField.getText());
            double result;

            // We check which radio button is selected and perform the conversion
            if (nprToCadRadio.isSelected()) {
                result = model.convertNPRToCAD(amount);
                // We set the result label to show the converted amount in CAD
                resultLabel.setText(String.format("Result: %.2f CAD", result));
            } else if (cadToNprRadio.isSelected()) {
                result = model.convertCADToNPR(amount);
                // We set the result label to show the converted amount in NPR
                resultLabel.setText(String.format("Result: %.2f NPR", result));
            } else {
                // We prompt the user to select a conversion direction
                resultLabel.setText("Please select a conversion direction.");
            }
        } catch (NumberFormatException e) {
            // We handle invalid input by showing an error message
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }
}
