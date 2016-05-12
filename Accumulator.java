// The calculator project. Accumulator part.
// Written by Ruoying Hao, Magen Crawford, Daniel Say.
// Written since January 31.
//Honor Code: I have acted with honesty and integrity when producing this work and I am unaware of anyone who has not.


public class Accumulator{
	double valueSoFar;//valueSoFar is the most recent value stored in the memory.
	String currentOperator; // currentOperator is the operator that is in use at the moment.
	Accumulator(){
		valueSoFar = 0.0;
		currentOperator = "C"; 
	}
	void calculate(double numberOnDisplay, String nextOperator){
		if (currentOperator.equals("+"))               //These codes enable the accumulator to add, subtract, multiply, and divide the number 
			valueSoFar = valueSoFar + numberOnDisplay; //displayed on the screen to the number that has been stored.
		if (currentOperator.equals("-"))
			valueSoFar = valueSoFar - numberOnDisplay;
		if (currentOperator.equals("*"))
			valueSoFar = valueSoFar * numberOnDisplay;
		if (currentOperator.equals("/"))
			valueSoFar = valueSoFar / numberOnDisplay;
		if (currentOperator.equals("C")) //Clear all the memory, including the operators.
			valueSoFar = numberOnDisplay;
		
		currentOperator = nextOperator;
		
	}
	double getValue(){				//stores the value so far
		return valueSoFar;
		
	}
}