package com.example.assignment3;

public class CurrencyConverterModel {
    private static final double NPR_TO_CAD_RATE = 0.010; // Example rate
    private static final double CAD_TO_NPR_RATE = 100.0; // Example rate

    // We convert Nepali Rupees (NPR) to Canadian Dollars (CAD)
    public double convertNPRToCAD(double npr) {
        return npr * NPR_TO_CAD_RATE;
    }

    // We convert Canadian Dollars (CAD) to Nepali Rupees (NPR)
    public double convertCADToNPR(double cad) {
        return cad * CAD_TO_NPR_RATE;
    }
}
