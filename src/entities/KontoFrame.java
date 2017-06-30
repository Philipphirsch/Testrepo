package entities;

import java.awt.*;
import java.awt.event.*;
import java.text.*;

import entities.Person.Konto;


public class KontoFrame extends Frame implements ActionListener, WindowListener{
	private Konto meinKonto = null;
	private Label inhaberText = new Label("Inhaber");
	private Label inhaberAnzeige = new Label();
	private Label guthabenText = new Label("Kontostand");
	private Label guthabenAnzeige = new Label();
	private Button einzahlenButton = new Button("einzahlen");
	private Button abhebenButton = new Button("einzahlen");
	private GridLayout fensterLayout = new GridLayout (3,2);
	private DecimalFormat geldFormat = new DecimalFormat("#,##0.00");
	private TextField tf;
	double betrag;	
    String stringBetrag;

	
	public void setKonto (Konto k){
		this.meinKonto = k;
	}
	
	public Konto getKonto(){
		return meinKonto;
	}
	
	  public void init() { 
		    Person inhaber = meinKonto.getBesitzer();
		    String inhString = inhaber.toString(); 
		    inhaberAnzeige.setText(inhString); 
		    double guthaben = meinKonto.getGuthaben(); 
		    String gutString = geldFormat.format(guthaben); 
		    guthabenAnzeige.setText(gutString); 
		    this.setSize(600,400); 
		    this.setTitle("Konto-Fenster"); 
		    this.setLayout(fensterLayout); 
		    this.add(inhaberText); 
		    this.add(inhaberAnzeige); 
		    this.add(guthabenText); 
		    this.add(guthabenAnzeige); 
		    this.add(einzahlenButton); 
		    this.add(abhebenButton);
		    tf = new TextField(0);
		    this.add(tf);

		    
		    
		    einzahlenButton.addActionListener(this); 
		    abhebenButton.addActionListener(this); 
		    this.addWindowListener(this); 
		  } 
	  
		  public void actionPerformed (ActionEvent e) { 
		    Object angeklickt = e.getSource(); 
		    
		    if (angeklickt == einzahlenButton ) { 
              stringBetrag = tf.getText();
              betrag = Double.parseDouble(stringBetrag);
              meinKonto.einzahlen(betrag); 
              System.out.println(betrag);

		    } 
		    
		    if (angeklickt == abhebenButton ) { 
		      stringBetrag = tf.getText();
		      betrag = Double.parseDouble(stringBetrag);
		      meinKonto.abheben(betrag);
              System.out.println(betrag);
		    } 
		    
		    double guthaben = meinKonto.getGuthaben(); 
		    String gutString = geldFormat.format(guthaben); 
		    guthabenAnzeige.setText(gutString); 
		    //test
		  } 
		  public void windowClosing (WindowEvent e) { 
		    this.setVisible(false); 
		    System.exit(0); 
		  } 
		  public void windowClosed (WindowEvent e) { } 
		  public void windowOpened (WindowEvent e) { } 
		  public void windowIconified (WindowEvent e) { } 
		  public void windowDeiconified (WindowEvent e) { } 
		  public void windowActivated (WindowEvent e) { } 
		  public void windowDeactivated (WindowEvent e) { } 
		} 
