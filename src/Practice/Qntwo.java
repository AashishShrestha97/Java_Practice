package Practice;

public class Qntwo {
public static void main(String[] args) {
	evenNumbers(1, 20);
}
static void evenNumbers(int a, int b) {
	for(a = 1; a<=b; a++) {
		if(a % 2 == 0) {
			System.out.println(a);
		}
	}
}
}
