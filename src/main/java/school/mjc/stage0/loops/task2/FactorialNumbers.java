package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
	    int factorialResult = 1;
	    System.out.println(1);
	    for(int i = 1; i <= printToInclusive; i++){
		factorialResult *= i;
		System.out.println(factorialResult);
	    }
    }
}
