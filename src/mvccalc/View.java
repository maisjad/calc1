package mvccalc;

import java.util.*;
import javax.swing.*;

import java.util.Scanner;


import java.lang.String;
import java.awt.*;
import java .awt.Event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class View extends JFrame {
	double firstn;
	double sacandn;
	double result;
	String opr;
	String ans;
	private String btnname[]=new String[20];
	
	
	 static ArrayList <JButton> btnlist=new  ArrayList <JButton> ();
	 JTextField t;
	
	private Controler cont;
	
	public View(){
		
	setLayout(new FlowLayout());
	t=new JTextField("");
	add(t);
	btnname[0]="c";
	btnname[1]="/";
	btnname[2]="*";
	btnname[3]="<-";
	btnname[4]="7";btnname[5]="8";btnname[6]="9";btnname[7]="-";btnname[8]="4";btnname[9]="5";btnname[10]="6";btnname[11]="+";btnname[12]="1";btnname[13]="2";
	btnname[14]="3";btnname[15]="%";btnname[16]="0";btnname[17]=".";btnname[18]="t";btnname[19]="=";
	for(int i=0;i<20;i++){
		btnlist.add(new JButton(btnname[i]));
		add(btnlist.get(i));
	}
	
	
	
	
	t.setPreferredSize(new Dimension(180, 27));
	t.setEditable(true);
	setSize(220,250);
	setResizable(false);
	//cont=new Controlar();
	//cont.addview(this);
	 
	}
	 public void setBtnListener( Controler.BtnListener handler) {
	        for (JButton btn : btnlist){
	            btn.addActionListener(handler);
	        }
	        
	 
	 }
	 public void addcontrolar(Controler cont){
		 this.cont=cont;
	 }
	 

}



