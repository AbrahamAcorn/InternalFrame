import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mainWin extends JFrame implements ActionListener{
	GridBagLayout gbl=new GridBagLayout();
	GridBagConstraints gbc=new GridBagConstraints();
	JInternalFrame internalAdd,internalList;
	JButton ad;
	public mainWin() {	
		getContentPane().setLayout(null/*new BorderLayout()*/);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Lab Master-Test Booking");
		setVisible(true);
		JMenuBar menuBar=new JMenuBar();
			JMenu mast=new JMenu("Masters");
			JMenu book=new JMenu("Booking");
			JMenu testp=new JMenu("Test Performance");
			JMenu printg=new JMenu("Printing");
			JMenu trans=new JMenu("Transaction");
			JMenu laRep=new JMenu("Last Report");
			JMenu sett=new JMenu("Settings");
			JMenu util=new JMenu("Utilities");
			JMenu wind=new JMenu("Window");
			JMenu hlp=new JMenu("Help");
		
			menuBar.add(mast);menuBar.add(book);menuBar.add(testp);menuBar.add(printg);menuBar.add(trans);
			menuBar.add(laRep);menuBar.add(sett);menuBar.add(util);menuBar.add(wind);menuBar.add(hlp);
		setJMenuBar(menuBar);
		add(menuBar,BorderLayout.PAGE_START);
		
		JToolBar tBar=new JToolBar();
		tBar.setBounds(10,30, 1390, 70);
		//aButton.setText("texto");
		//aButton.setIcon(new ImageIcon("fichero.gif"));

		// Texto en el centro y debajo del icono
		//aButton.setHorizontalTextPosition( SwingConstants.CENTER );
		//aButton.setVerticalTextPosition( SwingConstants.BOTTOM );
			ad=new JButton();
			
			ad.addActionListener(this);
			ImageIcon addd = new ImageIcon("addfolder.png");
			ImageIcon addf = new ImageIcon(addd.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
			//ad.setHorizontalTextPosition( SwingConstants.CENTER );
			//ad.setVerticalTextPosition( SwingConstants.BOTTOM );
			ad.setIcon(addf);
			ad.setText("Add");
			ad.setBounds(10, 10, 55, 60);
			tBar.add(ad);
			
			JButton edit=new JButton("edit");
			edit.setBounds(65, 10, 55, 60);
			ImageIcon edi = new ImageIcon("multiedit");
			ImageIcon edif = new ImageIcon(edi.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
			ad.setHorizontalTextPosition( SwingConstants.CENTER );
			ad.setVerticalTextPosition( SwingConstants.BOTTOM );
			ad.setIcon(edif);
			tBar.add(ad);
			tBar.add(edit);
			
			JButton back=new JButton("back");
			tBar.add(back);
			
			JButton next=new JButton("next");
			tBar.add(next);
			
			JButton list=new JButton("list");
			tBar.add(list);
			
			JButton save=new JButton("save");
			tBar.add(save);
			
			JButton print=new JButton("print");
			tBar.add(print);
			
			JButton test=new JButton("test");
			tBar.add(test);
			
			JButton cancel=new JButton("cancel");
			tBar.add(cancel);
			
			JButton setng=new JButton("settings");
			tBar.add(setng);
			
			JButton delete=new JButton("delete");
			tBar.add(delete);
			
			JButton slip=new JButton("slip");
			tBar.add(slip);
			
			JButton exit=new JButton("exit");
			tBar.add(exit);
			
		add(tBar,BorderLayout.PAGE_START);	
		
		JDesktopPane deskP=new JDesktopPane();
		deskP.setBounds(0,95,1380,250);
			internalAdd=new JInternalFrame();
			internalAdd.getContentPane().setLayout(null);
			internalAdd.setSize(1370, 240);
			internalAdd.setDefaultCloseOperation(HIDE_ON_CLOSE);
			internalAdd.setVisible(true);
			internalAdd.setMaximizable(true);
			internalAdd.setClosable(true);
			internalAdd.setIconifiable(true);
			internalAdd.setResizable(true);
			
				JPanel panelAdd=new JPanel(null);
				panelAdd.setSize(1370,240);
				panelAdd.setBackground(new Color(216,255,209));
					//Componentes del panel alv
				
					JLabel lblID=new JLabel("Patient ID: ");
					lblID.setBounds(10, 10, 100, 20);
					panelAdd.add(lblID);
					JTextField cajaID=new JTextField();
					cajaID.setBounds(90, 10, 70, 20);
					panelAdd.add(cajaID);
					
					JLabel date=new JLabel("Date");
					date.setBounds(280, 10, 30, 20);
					panelAdd.add(date);
					JComboBox cajadate=new JComboBox();
					cajadate.addItem("dd/mm/aaaa");
					cajadate.setBounds(330, 10, 100, 20);
					panelAdd.add(cajadate);
					
					JLabel lbltime=new JLabel("Time hh:mm");
					lbltime.setBounds(440, 10, 100, 20);
					panelAdd.add(lbltime);
					JTextField hrs=new JTextField();
					hrs.setBounds(520, 10, 20, 20);
					panelAdd.add(hrs);
					JLabel lblpoints=new JLabel(":");
					lblpoints.setBounds(540, 10, 20, 20);
					panelAdd.add(lblpoints);
					JTextField min=new JTextField();
					min.setBounds(550, 10, 20, 20);
					panelAdd.add(min);
					
					 JLabel label11 = new JLabel("Lab No.");
				     label11.setBounds(590, 10, 50, 20);
				     panelAdd.add(label11);
				     JTextField textField10 = new JTextField(10);
				     textField10.setBounds(640, 10, 100, 20);
				     panelAdd.add(textField10);
					
					JLabel lblname=new JLabel("Name: ");
					lblname.setBounds(10, 40, 70, 20);
					panelAdd.add(lblname);
					JComboBox name=new JComboBox();
					name.addItem("Mr.");
					name.addItem("Sr.");
					name.setBounds(90, 40, 50, 20);
					panelAdd.add(name);
					JTextField cajaname=new JTextField();
					cajaname.setBounds(150, 40, 250, 20);
					panelAdd.add(cajaname);
					
					JLabel lblsex=new JLabel("Sex:");
					lblsex.setBounds(10, 70, 70, 20);
					panelAdd.add(lblsex);
					JComboBox cajasex=new JComboBox();
					cajasex.setBounds(90, 70, 70, 20);
					cajasex.addItem("Male");
					cajasex.addItem("Female");
					panelAdd.add(cajasex);
					
					JLabel age=new JLabel("Age");
					age.setBounds(170, 70, 30, 20);
					panelAdd.add(age);
					JTextField cajage=new JTextField();
					cajage.setBounds(200, 70, 30, 20);
					panelAdd.add(cajage);
					
					JLabel mont=new JLabel("Months");
					mont.setBounds(240, 70, 45, 20);
					panelAdd.add(mont);
					JTextField cajamonth=new JTextField();
					cajamonth.setBounds(285, 70, 30, 20);
					panelAdd.add(cajamonth);
					
					JLabel day=new JLabel("Days");
					day.setBounds(320, 70, 30, 20);
					panelAdd.add(day);
					JTextField cajaday=new JTextField();
					cajaday.setBounds(350, 70, 30, 20);
					panelAdd.add(cajaday);
					
					
					
					JLabel refB=new JLabel("Refered By:");
					refB.setBounds(10, 100, 100, 20);
					panelAdd.add(refB);
					JTextField cajaRef=new JTextField();
					cajaRef.setBounds(90, 100, 70, 20);
					panelAdd.add(cajaRef);
					JTextField other=new JTextField();
					other.setBounds(180, 100, 150, 20);
					panelAdd.add(other);
					
					 JLabel label12 = new JLabel("Sample By");
					 //AcomodarLas cordenadas de este
				        label12.setBounds(400, 70, 60, 20);
				        panelAdd.add(label12);

				        JTextField textField11 = new JTextField(8);
				        textField11.setBounds(470, 70, 100, 20);
				        panelAdd.add(textField11);

				        JButton btn2 = new JButton(new ImageIcon());
				        btn2.setBounds(571, 73, 15, 15);
				        panelAdd.add(btn2);

				        JLabel label13 = new JLabel("Panel Code");
				        label13.setBounds(400, 100, 80, 20);
				        panelAdd.add(label13);

				        JTextField textField12 = new JTextField(8);
				        textField12.setBounds(470, 100, 100, 20);
				        panelAdd.add(textField12);

				        JButton btn3 = new JButton();
				        btn3.setBounds(571, 103, 15, 15);
				        panelAdd.add(btn3);

				        JLabel label14 = new JLabel("Panel ID");
				        label14.setBounds(400, 130, 80, 20);
				        panelAdd.add(label14);

				        JTextField textField13 = new JTextField(8);
				        textField13.setBounds(470, 130, 100, 20);
				        panelAdd.add(textField13);

				        JLabel label15 = new JLabel("e-mail");
				        label15.setBounds(400, 160, 80, 20);
				        panelAdd.add(label15);

				        JTextField textField14 = new JTextField(8);
				        textField14.setBounds(470, 160, 100, 20);
				        panelAdd.add(textField14);
					
				
			internalAdd.add(panelAdd);
		deskP.add(internalAdd);
		add(deskP);
			//termina el primer panel y el prier deskp
		
		JDesktopPane deskPList=new JDesktopPane();
		deskPList.setBounds(0,340,1380,350);
			internalList=new JInternalFrame();
			internalList.getContentPane().setLayout(null);
			internalList.setSize(1370, 340);
			internalList.setDefaultCloseOperation(HIDE_ON_CLOSE);
			internalList.setVisible(true);
			internalList.setMaximizable(true);
			internalList.setClosable(true);
			internalList.setIconifiable(true);
			internalList.setResizable(true);
			
			 JPanel panelList = new JPanel();
		        panelList.setBackground(new Color(181, 204, 212));
		        panelList.setLayout(null);
		        panelList.setBounds(10, 0, 760, 200);

		        String column[] = {"Text ID", "Text Name", "Rate", "Diec %", "Discount Acount",
		                "Tax(%)", "Tax Amt."};
		        String dats[][] = {{"", "", "", "", "", "", ""}};

		        JTable table = new JTable(dats, column);
		        JScrollPane scroll = new JScrollPane(table);
		        scroll.setBounds(5, 5, 630, 40);
		        panelList.add(scroll);

			
			internalList.add(panelList);
			
			 JPanel panelProgress = new JPanel();
			 Color az=new Color(57, 53, 243);
				 panelProgress.setBackground(new Color(121, 192, 238));
			     panelProgress.setPreferredSize(new Dimension(680, 200));
			     panelProgress.setLayout(null);
			     panelProgress.setBounds(775, 0, 680, 200);

			     JLabel totlTst = new JLabel("Total Tests");
			     totlTst.setBounds(10, 10, 100, 20);
			     panelProgress.add(totlTst);
			     
			     JProgressBar progressBar = new JProgressBar();
			     progressBar.setMaximum(100);
			     progressBar.setMinimum(0);
			     progressBar.setValue(100);
			     progressBar.setForeground(az);
			     progressBar.setBounds(110, 10, 100, 15);
			     panelProgress.add(progressBar);
			     
			     JLabel tstA = new JLabel("Test Amt.");
			     tstA.setBounds(10, 30, 100, 20);
			     panelProgress.add(tstA);
			     
			     JProgressBar tstBar = new JProgressBar();
			     tstBar.setMaximum(100);
			     tstBar.setMinimum(0);
			     tstBar.setValue(100);
			     tstBar.setForeground(az);
			     tstBar.setBounds(110, 30, 100, 15);
			     panelProgress.add(tstBar);
			     
			     JLabel conc = new JLabel("Concession");
			     conc.setBounds(10, 50, 100, 20);
			     panelProgress.add(conc);
			     
			     JProgressBar conceBar = new JProgressBar();
			     conceBar.setMaximum(100);
			     conceBar.setMinimum(0);
			     conceBar.setValue(100);
			     conceBar.setForeground(az);
			     conceBar.setBounds(110, 50, 100, 15);
			     panelProgress.add(conceBar);
			     
			     JLabel home = new JLabel("Home Colection");
			     home.setBounds(10, 70, 120, 20);
			     panelProgress.add(home);
			     
			     JProgressBar homeBar = new JProgressBar();
			     homeBar.setMaximum(100);
			     homeBar.setMinimum(0);
			     homeBar.setValue(100);
			     homeBar.setForeground(az);
			     homeBar.setBounds(110, 70, 100, 15);
			     panelProgress.add(homeBar);
			     
			     JLabel taxA = new JLabel("Tax Amt.");
			     taxA.setBounds(10, 90, 120, 20);
			     panelProgress.add(taxA);
			     
			     JProgressBar taxBar = new JProgressBar();
			     taxBar.setMaximum(100);
			     taxBar.setMinimum(0);
			     taxBar.setValue(100);
			     taxBar.setForeground(az);
			     taxBar.setBounds(110, 90, 100, 15);
			     panelProgress.add(taxBar);
			     
			     JLabel netA = new JLabel("Net Amt.");
			     netA.setBounds(10, 110, 120, 20);
			     panelProgress.add(netA);
			     
			     JProgressBar netBar = new JProgressBar();
			     netBar.setMaximum(100);
			     netBar.setMinimum(0);
			     netBar.setValue(100);
			     netBar.setForeground(az);
			     netBar.setBounds(110, 110, 100, 15);
			     panelProgress.add(netBar);
			     
			     JLabel balnce = new JLabel("Balance");
			     balnce.setBounds(10, 130, 120, 20);
			     panelProgress.add(balnce);
			     
			     JProgressBar balanceBar = new JProgressBar();
			     balanceBar.setMaximum(100);
			     balanceBar.setMinimum(0);
			     balanceBar.setValue(100);
			     balanceBar.setForeground(az);
			     balanceBar.setBounds(110, 130, 100, 15);
			     panelProgress.add(balanceBar);
			     
 			internalList.add(panelProgress);
		        
		    JPanel ultimoPanel = new JPanel();
	        	ultimoPanel.setBackground(new Color(176, 226, 255));
	        	ultimoPanel.setLayout(null);
        		ultimoPanel.setBounds(0, 210, 1380, 100);
	        	JLabel homCol = new JLabel("Home Collection");
		        homCol.setBounds(5, 10, 120, 20);
		        ultimoPanel.add(homCol);

		        JTextField cajaHomeC = new JTextField(4);
		        cajaHomeC.setBounds(102, 10, 60, 20);
		        ultimoPanel.add(cajaHomeC);

		        JLabel paid = new JLabel("Paid");
		        paid.setBounds(182, 10, 120, 20);
		        ultimoPanel.add(paid);

		        JTextField cajaPaid = new JTextField(5);
		        cajaPaid.setBounds(210, 10, 60, 20);
		        ultimoPanel.add(cajaPaid);

		        JLabel pType = new JLabel("Pay Type");
		        pType.setBounds(285, 10, 120, 20);
		        ultimoPanel.add(pType);

		        JComboBox comboType = new JComboBox();
		        comboType.addItem("CASH");
		        comboType.setBounds(340, 10, 60, 20);
		        ultimoPanel.add(comboType);

		        JLabel receipt = new JLabel("Receipt No.");
		        receipt.setBounds(420, 10, 120, 20);
		        ultimoPanel.add(receipt);

		        JTextField cajaReceip = new JTextField(8);
		        cajaReceip.setBounds(485, 10, 60, 20);
		        ultimoPanel.add(cajaReceip);

	        internalList.add(ultimoPanel);

		        
		deskPList.add(internalList);
		add(deskPList);
		
		
		
		setLocationRelativeTo(null);setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ad) {
			//internalAdd.setVisible(true);
		}
		
	}
	
}


public class GUI_InternalFrames {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new mainWin();
			}
		});

	}

}
