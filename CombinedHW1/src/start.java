import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Zachary Hill on 9/3/2015.
 */
public class start {
    public static void main(String[] args) {
        int r;
        Object[] choose = {"Credit (Question 1)","Price (Question 2)","Quit"};
        while(true) {
            r = JOptionPane.showOptionDialog(null, "Please Pick a Task", "Choose", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choose, choose[0]);
            if (r == JOptionPane.CANCEL_OPTION) {
                break;
            } else if (r == JOptionPane.YES_OPTION) {
                credit();
            } else {
                price();
            }
        }

    }
    public static void credit(){
        int r;
        double creditUsed, creditLeft,creditAmount = 0;
        Object[] options1 = {"Continue","Quit"};
        NumberFormat money = new DecimalFormat("$0.00");
        while(true){
            try {
                creditAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of max credit"));
                creditUsed = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of credit to use"));
                if (creditAmount >= creditUsed) {
                    creditLeft = creditAmount - creditUsed;
                    r = JOptionPane.showOptionDialog(null, "Credit left:\n" + money.format(creditLeft), "Continue", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[1]);
                    if (r == JOptionPane.NO_OPTION)
                        break;
                }
            } catch (NumberFormatException e) {
                r = JOptionPane.showOptionDialog(null, "Please only enter numbers.", "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options1, options1[0]);
                if (r == JOptionPane.CANCEL_OPTION)
                    break;
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null,e,"Error",JOptionPane.OK_OPTION,JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }

    public static void price() {
        double tax, price, total;
        int r;
        String message;
        NumberFormat percent = new DecimalFormat("0.00%");
        NumberFormat money = new DecimalFormat("$0.00");
        Object[] options = {"Again","Quit"};
        while(true){
            try{
                price = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter price."));
                tax = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter tax rate.\n(In percent)"));
                total = tax/100 * price + price;
                message = "Price:\t\t    " + money.format(price) +"\nTax Rate:  " + percent.format(tax/100) +"\nTotal Tax: " + money.format(tax/100*price) + "\nTotal:     " + money.format(total);
                r = JOptionPane.showOptionDialog(null,message,"Summary",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
                if(r == JOptionPane.NO_OPTION) {
                    break;
                }

            }catch(NumberFormatException e){
                r = JOptionPane.showOptionDialog(null, "Please only enter numbers.", "Error", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (r == JOptionPane.CANCEL_OPTION)
                    break;
            }catch (Exception e){
                JOptionPane.showConfirmDialog(null,e,"Error",JOptionPane.OK_OPTION,JOptionPane.ERROR_MESSAGE);
                break;
            }
        }

    }
}
