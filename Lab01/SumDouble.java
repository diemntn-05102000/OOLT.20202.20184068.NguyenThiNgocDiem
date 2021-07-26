package OOP;

import javax.swing.*;

public class SumDouble {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotificationSum = "Sum: " ;
        String strNotificationDiff = "Difference: " ;
        String strNotificationPro = "Product: " ;
        String strNotificationQuo = "Quotient: " ;

        strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: "
                ,"Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNotificationSum += strNum1 + "+";
        strNum2 = JOptionPane.showInputDialog(null,"Please input the second number: "
                ,"Input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNotificationSum += strNum2;
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1+num2;
        double diff = num1-num2;
        double pro = num1*num2;
        double quo = num1/num2;
        strNotificationDiff += strNum1 +"-"+ strNum2+ "="+ diff ;
        strNotificationPro += strNum1 +"x"+ strNum2+ "="+ pro ;
        strNotificationQuo += strNum1 +":"+ strNum2+ "="+ quo ;


        strNotificationSum += "=" + sum;
        JOptionPane.showConfirmDialog(null,strNotificationSum,
                "Sum", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,strNotificationDiff,
                "Difference", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,strNotificationPro,
                "Product", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showConfirmDialog(null,strNotificationQuo,
                "Quotient", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
