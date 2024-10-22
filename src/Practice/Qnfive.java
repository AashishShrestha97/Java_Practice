package Practice;

public class Qnfive {
public static void main(String[] args) {
	calculatePower(5, 3);
}
static void calculatePower(int a, int power) {
	int result = 1;
	for(int i = 1; i<=power; i++) {
		result *= a;
	}
	System.out.println(result);
}
}
