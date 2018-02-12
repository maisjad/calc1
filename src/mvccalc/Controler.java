package mvccalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controler {
	View view;
	Modle modle;
 Double input1;
	 Double input2;
	 String opr;

public	Controler(){
	//view=new View();
	//modle=new Modle();
 
}
class BtnListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==view.btnlist.get(0)){
			view.t.setText("");
			
		}
		
		
		if(event.getSource()==view.btnlist.get(17)){
		view.t.setText(view.t.getText()+".");
		
			
		}
		if(event.getSource()==view.btnlist.get(4)){
			view.t.setText(view.t.getText()+"7");
				
			}
		if(event.getSource()==view.btnlist.get(5)){
			view.t.setText(view.t.getText()+"8");
				
			}
		if(event.getSource()==view.btnlist.get(6)){
			view.t.setText(view.t.getText()+"9");
				
			}
		if(event.getSource()==view.btnlist.get(8)){
			view.t.setText(view.t.getText()+"4");
				
			}
		if(event.getSource()==view.btnlist.get(9)){
			view.t.setText(view.t.getText()+"5");
				
			}
		if(event.getSource()==view.btnlist.get(10)){
			view.t.setText(view.t.getText()+"6");
				
			}
		if(event.getSource()==view.btnlist.get(12)){
			view.t.setText(view.t.getText()+"1");
				
			}
		if(event.getSource()==view.btnlist.get(13)){
			view.t.setText(view.t.getText()+"2");
				
			}
		if(event.getSource()==view.btnlist.get(14)){
			view.t.setText(view.t.getText()+"3");
				
			}
		if(event.getSource()==view.btnlist.get(16)){
			view.t.setText(view.t.getText()+"0");
				
			}
		//if(event.getSource()==view.btnlist.get(3)){
			//view.t.setText(view.t.getText()+"");
				
			//}
		if(event.getSource()==view.btnlist.get(1)){
			if(view.t.getText().equals("")){input1=0.0;}
			else input1=Double.parseDouble(view.t.getText());
			view.t.setText("");
			 opr = "/";
				
			}
		if(event.getSource()==view.btnlist.get(2)){
			if(view.t.getText().equals("")){input1=0.0;}
			else input1=Double.parseDouble(view.t.getText());
			view.t.setText("");
			 opr = "*";
				
			}
		if(event.getSource()==view.btnlist.get(7)){
			if(view.t.getText().equals("")){input1=0.0;}
			else input1=Double.parseDouble(view.t.getText());
			view.t.setText("");
			 opr = "-";
				
			}
		if(event.getSource()==view.btnlist.get(11)){
			if(view.t.getText().equals("")){input1=0.0;}
			else input1=Double.parseDouble(view.t.getText());
			view.t.setText("");
			 opr = "+";
				
			}
		if(event.getSource()==view.btnlist.get(15)){
			if(view.t.getText().equals("")){input1=0.0;}
			else input1=Double.parseDouble(view.t.getText());
			view.t.setText("");
			 opr = "%";
				
			}
		if(event.getSource()==view.btnlist.get(18)){
			if(view.t.getText().equals("")){input1=0.0;}
			else input1=Double.parseDouble(view.t.getText());
			view.t.setText("");
			 opr = "sqrt";
				
			}
		if(event.getSource()==view.btnlist.get(19)){
			//view.t.setText(view.t.getText()+"/");
			if(opr!="sqrt"){
				if(view.t.getText().equals("")){input2=0.0;}
				else input2=Double.parseDouble(view.t.getText());
			}
			if(opr=="*"){
				modle.mult(input1,input2);
	view.t.setText(""+modle.getresult());	
			 
				
			}
			if(opr=="/"){
				modle.division(input1,input2);
				if (modle.getresult()==Double.NaN){
					view.t.setText("NaN!");	
				}
				else view.t.setText(""+modle.getresult());	
			 
				
			}
			if(opr=="sqrt"){
				modle.sqrt(input1);
				if (modle.getresult()==Double.NaN){
					view.t.setText("NaN!");	
				}
				else view.t.setText(""+modle.getresult());	
			 
				
			}
			if(opr=="-"){
				modle.subtract(input1,input2);
	view.t.setText(""+modle.getresult());	
			 
				
			}
			if(opr=="+"){
				modle.add(input1,input2);
	view.t.setText(""+modle.getresult());	
			 
				
			}
			if(opr=="%"){
				modle.mod(input1,input2);
	view.t.setText(""+modle.getresult());	
			 
				
			}
			
			
			
		
		}}}
public void addmodle(Modle modle){
	this.modle=modle;
}
public void addview(View view){
	this.view=view;
}
public void init(){
	 view.setBtnListener(new BtnListener());

}
}

