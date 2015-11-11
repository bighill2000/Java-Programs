import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by mrglass on 9/2/2015.
 */
public class Project1A2 {
    public static void main(String[] args) {
        int r;
        double creditUsed, creditLeft,creditAmount = 0;
        boolean check = true;
        Object[] options1 = {"Continue","Quit"};
        NumberFormat money = new DecimalFormat("$0.00");
        while(check){
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
                break;
            }
        }
    }
}
