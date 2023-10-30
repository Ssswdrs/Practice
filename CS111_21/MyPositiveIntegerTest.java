package CS111_21;

public class MyPositiveIntegerTest {
	public static void main(String[] args) {
		MyPositiveInteger myInt1 = new MyPositiveInteger("20000999");
		System.out.println(myInt1.isEven());
		myInt1.prettyPrint();
		MyPositiveInteger myInt2 = new MyPositiveInteger("1099999999999999999999");
		myInt2.prettyPrint();
	}
}
