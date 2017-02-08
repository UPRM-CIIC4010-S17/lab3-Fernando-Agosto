import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		
		JFrame myFrame = new JFrame("Fernando Agosto");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation((1920/2)-200 ,(1080/2)-200);
		myFrame.setSize(400, 400);
		myFrame.setVisible(true);
		MyPanelClass myPanel=new MyPanelClass();
		myFrame.getContentPane().add(myPanel);
	}
}