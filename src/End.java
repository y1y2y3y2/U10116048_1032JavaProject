import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//�C������
public class End {

	public static void main(String[] args) {
		Frame fr =new Frame();
		fr.setLayout(null);
		Label endl =new Label("�g�L�F100��A�C�������F");
		fr.setSize(400,300);
		fr.setBounds(100, 100, 400, 300);
		endl.setBounds(150, 100, 150, 30);
		fr.setVisible(true);
		fr.add(endl);
		/*�����W���s*/
		fr.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
		/**********/

	}

}
