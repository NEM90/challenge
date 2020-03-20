package nuevo;

public class uno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = { 1, 2, 1, 3, 3, 1, 2, 1, 5, 1 };
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
		for (int i = 0; i < myArray.length; i++) {
			switch (myArray[i]) {
			case 1:

				cont1++;
				break;
			case 2:
				cont2++;

				break;
			case 3:
				cont3++;

				break;

			case 4:
				cont4++;

				break;
			case 5:
				cont5++;

				break;

			}

		}
		
		System.out.println("El histograma es : ");

		System.out.print("1 :");
		for (int i = 0; i < cont1; i++) {
			System.out.print("*");
		}

		System.out.println("");

		System.out.print("2 :");
		for (int i = 0; i < cont2; i++) {
			System.out.print("*");
		}

		System.out.println("");

		System.out.print("3 :");
		for (int i = 0; i < cont3; i++) {
			System.out.print("*");
		}

		System.out.println("");

		System.out.print("4 :");
		for (int i = 0; i < cont4; i++) {
			System.out.print("*");
		}

		System.out.println("");

		System.out.print("5 :");
		for (int i = 0; i < cont5; i++) {
			System.out.print("*");
		}

		System.out.println("");

	}

}
