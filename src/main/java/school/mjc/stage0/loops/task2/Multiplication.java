package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
	    if(multiplyByAndToInclusive == 0){
		    //System.out.println("");
	    } else if(multiplyByAndToInclusive < 0){
		for(int i = 0; i >= multiplyByAndToInclusive; i--){
			System.out.println((i*multiplyByAndToInclusive)*-1);
		}
	} else{
		for(int i = 0; i <= multiplyByAndToInclusive; i++){
		System.out.println(i*multiplyByAndToInclusive);
		}
	}
    }
}
