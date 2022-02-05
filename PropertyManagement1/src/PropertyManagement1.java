import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class PropertyManagement1 {
    public static void main(String args[]) {
        displayWelcome();
        // get information for Apartment 1
        String location = getLocation();
        String aptNum1 = getApartmentNum();
        int sqFt1 = getSquareFt(aptNum1);
        double price1 = getPrice(aptNum1);
        //get information for Apartment 2
        String aptNum2 = getApartmentNum();
        int sqFt2 = getSquareFt(aptNum2);
        double price2 = getPrice(aptNum2);
        //display Apartment information
        displayApartment(location, aptNum1, sqFt1, price1);
        displayApartment(location, aptNum2, sqFt2, price2);
        //display Total Square Feet and Total Price for Apartment 1 and 2
        displayTotals(sqFt1, sqFt2, price1, price2);
    }

    public static void displayWelcome() {
        JOptionPane.showMessageDialog(null, 
            "tjohnson-code Ex1f\nProperty Management:");
    }

    public static String getLocation() {
        String loc = JOptionPane.showInputDialog("Building location: ");
        return loc;
    }

    public static String getApartmentNum() {
        String aptNum = JOptionPane.showInputDialog("Apartment #: ");
        return aptNum;
    }

    public static int getSquareFt(String aptNum) {
        String strSqFt = JOptionPane.showInputDialog("Square Feet for Apartment #: " + aptNum);
        int sqFt = Integer.parseInt(strSqFt);
        return sqFt;
    }

    public static double getPrice(String aptNum) {
        String strPrice = JOptionPane.showInputDialog("Price/Month for Apartment #: " + aptNum);
        double price = Double.parseDouble(strPrice);
        return price;
    }

    public static void displayApartment(String location, String aptNum, int sqFeet, double price) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, 
            "Location: " + location 
            + "\nApartment #: " + aptNum 
            + "\nSq. Ft. for Apartment #" + aptNum + ": " + sqFeet 
            + "\nPrice/Month for Apartment #" + aptNum + ": " + currency.format(price));
    }

    public static void displayTotals(int sqFt1, int sqFt2, double price1, double price2) {
        int sqFtTotal = sqFt1 + sqFt2;
        double priceTotal = price1 + price2;
        NumberFormat currencyTotal = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, 
            "Total Sq. Ft.: " + sqFtTotal 
            + "\nTotal Monthly Revenue: " + currencyTotal.format(priceTotal));
    }
}
