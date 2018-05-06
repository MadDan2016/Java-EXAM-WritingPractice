import javax.swing.JOptionPane;

public class HoursCalculator{
  public static void main (String args[]){
    float payRate = .20f;
    
    float hours = JOptionPane.showInputDialog("Please enter your hours")
    JOptionPane.showMessageDialog(null, "Your rate of pay is " + hours * payRate, "", JOptionPane.INFORMATION_MESSAGE);
    }
   }
