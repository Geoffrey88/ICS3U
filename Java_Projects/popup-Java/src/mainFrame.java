import javax.swing.JFrame;
import javax.swing.WindowConstants;

//this imports the javax class package - WindowConstant

public class mainFrame extends JFrame {
    public void init(){
        setTitle("im a popup");
        setSize(600,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}