package view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessFrame extends JFrame {
	
	
	private final int LARG_DEFAULT=1000;
	private final int ALT_DEFAULT=1000;
	
	
	public ChessFrame(String s) {
		super(s);// verificar o construtor da classe abstrata : deve exibir o frame com o titulo passado como parametro
		
		Toolkit tk=Toolkit.getDefaultToolkit();//procedimento descrito na nota de aula cap 10
		Dimension screenSize=tk.getScreenSize();//idem
		
		int sl=screenSize.width;//idem
		int sa=screenSize.height;//idem
		int x=sl/2-LARG_DEFAULT/2;//idem
		int y=sa/2-ALT_DEFAULT/2;//idem
		
		JPanel p = new ChessPanel(sl/2,sa/2);
		
		//add PrimPanel in Frame
		getContentPane().add(p);
		
		//set position of frame
		setBounds(x,y,LARG_DEFAULT,ALT_DEFAULT);
		
		//set size of frame
		setSize(LARG_DEFAULT,ALT_DEFAULT);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
