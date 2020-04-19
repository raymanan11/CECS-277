
package LabSingleton;

public class MathLibrary {
	private static MathLibrary mathLibrary;

	private MathLibrary() {

	}

	public static synchronized MathLibrary getInstance() {
		if (mathLibrary == null) {
			mathLibrary = new MathLibrary();
		}

		return mathLibrary;
	}

	public int someMathMethod() {
		return -1;
	}
	
	public double anotherMathMethod() {
		return 0;
	}
}
