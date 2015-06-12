import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//遊戲結束
public class End {

	public static void main(String[] args) {
		Frame fr =new Frame();
		fr.setLayout(null);
		Label endl =new Label("經過了100秒，遊戲結束了");
		fr.setSize(400,300);
		fr.setBounds(100, 100, 400, 300);
		endl.setBounds(150, 100, 150, 30);
		fr.setVisible(true);
		fr.add(endl);
		/*視窗上按鈕*/
		fr.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
		/**********/

	}

}
