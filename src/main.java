import javax.swing.JOptionPane;
import static java.lang.Math.sqrt;

public class main {
    public static void main(String[] args) {
        javax.swing.JOptionPane.showMessageDialog(null, "This is a currency convertor program");
        boolean flag = true;
        double num1,total;
        do {
            int num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Choose one of the following option~\n1.INR to USD\n2.USD to INR\n3.INR to YEN\n4.YEN to INR\n5.Exit"));
            switch (num){
                case 1:
                    num1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter currency amount in INR"));
                    total = num1*0.012;
                    javax.swing.JOptionPane.showMessageDialog(null, num1+" INR  = "+total+" USD");
                    break;
                case 2:
                    num1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter currency amount in USD"));
                    total = num1*82.91;
                    javax.swing.JOptionPane.showMessageDialog(null, num1+" USD  = "+total+" INR");
                    break;
                case 3:
                    num1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter currency amount in INR"));
                    total = num1*1.81;
                    javax.swing.JOptionPane.showMessageDialog(null, num1+" INR  = "+total+" YEN");
                    break;
                case 4:
                    num1 = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Enter currency amount in YEN"));
                    total = num1*0.55;
                    javax.swing.JOptionPane.showMessageDialog(null, num1+" YEN  = "+total+" INR");
                    break;
                case 5:
                    javax.swing.JOptionPane.showMessageDialog(null,"The program is exiting");
                    flag = false;
                    break;
            }
        }while(flag == true);
    }
}
