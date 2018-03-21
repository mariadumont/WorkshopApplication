
public class Principal {

	public static void main(String[] args) {
		showWellcome();

		doAdd();
		
	}

	/**
	 * @return TODO
	 * 
	 */
	private static int doAdd() {
		int a =1;
		int b=2;
		return a+b;
		//System.out.println("El resultado de la suma es "+resul);
	}

	/**
	 * 
	 */
	private static void showWellcome() {
		System.out.println("***************************************");
		System.out.println("Biemvcenido al supermercado el caminas");
		System.out.println("***************************************");
	}

}
