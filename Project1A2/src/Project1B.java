import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by mrglass on 9/3/2015.
 */
public class Project1B {
    public static void main(String[] args) {
        double tax, price, total;
        boolean check = true;
        int r;
        String message;
        NumberFormat percent = new DecimalFormat("0.00%");
        NumberFormat money = new DecimalFormat("$0.00");
        Object[] options = {"Again","quit"};
        while(check){
            try{
                price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter price of object."));
                tax = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter tax rate.\n(In percent)"));
                total = tax* price + price;
                message = "Price:\t" + money.format(price) +"\nTax:\t" + percent.format(tax) + "\nTotal:\t" + money.format(total);
                r = JOptionPane.showOptionDialog(null,message,"Summary",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
                if(r == JOptionPane.NO_OPTION) {
                    break;
                }

            }catch(NumberFormatException e){
                r = JOptionPane.showOptionDialog(null, "Please only enter numbers.", "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (r == JOptionPane.CANCEL_OPTION)
                    break;
            }catch ((Exception e){
                break;
            }
        }
    }
}
