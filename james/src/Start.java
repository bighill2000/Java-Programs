import javax.swing.*;
import javax.swing.text.StringContent;

/**
 * Created by james on 9/7/2015.
 */
public class Start {
    public static void main(String[] args) {
 //       AdvCreditCalc cc = new AdvCreditCalc();
  //      SalesTax st = new SalesTax();
        String[] options = {"Credit Calculator",
                "Sales Tax",
                "Next Project",
                "Project After That"};
        String choice = (String) JOptionPane.showInputDialog(null,
                "Please Select a Project",
                "Intro To Java",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
        if (choice == options[0]) {
    //        cc.creditCalc();
        } else if (choice == options[1]) {
  //          st.Tax();
        } else if (choice == options[2]) {
            JOptionPane.showConfirmDialog(null,
                    "Feature Coming Soon",
                    "Try Again Later",
                    JOptionPane.CANCEL_OPTION);
        } else if (choice == options[3]) {
            JOptionPane.showConfirmDialog(null,
                    "Feature Coming Soon",
                    "Try Again Later",
                    JOptionPane.CANCEL_OPTION);
        }
    }
}