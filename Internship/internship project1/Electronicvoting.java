import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Electronicvoting implements ActionListener 
{

	JFrame frame;
	
	JButton button;
	JButton button2;
	JRadioButton A;
	JRadioButton B;
	JRadioButton C;
	JRadioButton D;
	JRadioButton E;
	JLabel l=new JLabel("                                 ELECTRONIC VOTING                        ");
	int t=0; 
	
	int votesA=0;
	int votesB=0;
	int votesC=0;
	int votesD=0;
	int votesE=0;
	  
	public static void main(String args[]) 
	{
	new Electronicvoting();
	}
	
	Electronicvoting() 
	{
		
		frame = new JFrame("ELECTION VOTING");
		
		JPanel panel = new JPanel(new GridLayout(6, 1));
		JPanel buttons = new JPanel(new FlowLayout());
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(buttons, BorderLayout.SOUTH);
		

		button = new JButton("Submit");
		button2 = new JButton("Results");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		A = new JRadioButton("1.#");
		B = new JRadioButton("2.@");
		C = new JRadioButton("3.$");
		D = new JRadioButton("4.&");
		E = new JRadioButton("5.OTHERS");
	
		
		ButtonGroup bg = new ButtonGroup ();
		
		bg.add(A);
		bg.add(B);
		bg.add(C);
		bg.add(D);
		bg.add(E);
		panel.add(l);
		panel.add(A);
		panel.add(B);
		panel.add(C);
		panel.add(D);
		panel.add(E);
		buttons.add(button);
		buttons.add(button2);
	
		int fw = 300;
		int fh = 400;
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds((int) screensize.getWidth() - fw, 0, fw, fh);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==(button)) {
			if(A.isSelected()) {
				votesA++;
				System.out.println("TDP(#) voted for!"+votesA);
			}else if(B.isSelected()) {
				votesB++;
				System.out.println("BJP(@) voted for!"+votesB);
			}else if(C.isSelected()) {
				votesC++;
				System.out.println("YCP($) voted for!"+votesC);
			}else if(D.isSelected()) {
				votesD++;
				System.out.println("LOKSATHA(&) voted for!"+votesD);
			}else if(E.isSelected()) {
				votesE++;
				System.out.println("OTHERS voted for!"+votesE);
			}
	
			t = votesA + votesB + votesC + votesD + votesE;
			System.out.println("total = " + t);
		
			}
		
			if (e.getSource()==(button2)) {
				System.out.println("votes scured:" +votesA+" " +votesB+" "+votesC+" "+votesD+" "+votesE);
				int ap = (votesA* 100/(votesA+votesB+votesC+votesD+votesE));
				System.out.println("TDP(#) has " + ap + "% of votes ");
    				int bp = (votesB* 100/(votesA+votesB+votesC+votesD+votesE));
				System.out.println("BJP(@) has " + bp + "% of votes ");
				int cp = (votesC* 100/(votesA+votesB+votesC+votesD+votesE));
				System.out.println("YCP($) has " + cp + "% of votes ");
				int dp = (votesD* 100/(votesA+votesB+votesC+votesD+votesE));
				System.out.println("LOKSATHA(&) has " + dp + "% of votes ");
				int ep = (votesE* 100/(votesA+votesB+votesC+votesD+votesE));
				System.out.println("OTHERS has " + ep + "% of votes ");
				int a[]=new int[5];
	a[0]=votesA;
	a[1]=votesB;
	a[2]=votesC;
	a[3]=votesD;
	a[4]=votesE;

	for(int i=0;i<5;i++)
	{
	for(int j=1;j<5-i;j++)
	{
	if(a[i]<a[j])
	{
	int temp;
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	}
	}
	System.out.println();
	if(a[0]==votesA)
	System.out.println("TDP(#) has been elected");
	if(a[0]==votesB)
	System.out.println("BJP(@) has been elected");
	if(a[0]==votesC)
	System.out.println("YCP($) has been elected");
	if(a[0]==votesD)
	System.out.println("LOKSATHA(&) has been elected");
	if(a[0]==votesE)
	System.out.println("others has been elected");
        System.out.println("percentage of participation is  "  +((t*100)/20)+"% ");  
            
}
			
}
	
}
	



