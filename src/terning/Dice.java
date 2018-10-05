package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		double d1=Math.random()*6;     // 0-1
		double d2=d1;                     // 0-5
		//double d3=Math.round(d2);             // 0-5 integer
		return (int) d2+1;                     // 1-6
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}
	}
}
