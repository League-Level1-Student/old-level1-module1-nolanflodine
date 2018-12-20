import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
Microwave m=new Microwave();
int flavor=Integer.parseInt(JOptionPane.showInputDialog("What flavor popcorn do you want?"));
int cookTime=Integer.parseInt(JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn?"));
m.putInMicrowave(null);
}
}
