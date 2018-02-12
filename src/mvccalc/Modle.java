package mvccalc;


public class Modle {

private	double result;
	public Modle(){
		
		result=0.0;
	
		
	}

public double getresult(){
	return this.result;
			}
public void setresult(double result){
	this.result=result;
}

public void add(double number1,double number2){

	 result=number1+number2;
	
}
public void subtract(double number1,double number2){

	 result=number1-number2;
	
}
public void mult(double number1,double number2){
result=number1*number2;
	
	
}
public  void division(double number1,double number2){

if(number2==0){
result=Double.NaN;
}
else result=number1/number2;

	
}
public void sqrt(double number1){
if (number1<0){
	result=Double.NaN;
}
else result=Math.sqrt(number1);
	
}

public void mod(double number1,double number2){

	 result=number1 % number2;
	
}
}

