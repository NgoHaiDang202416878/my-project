import javax.swing.JOptionPane;
public class FirstDialog {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name:");
JOptionPane.showMessageDialog(null, "Hello " + name);
    }
}