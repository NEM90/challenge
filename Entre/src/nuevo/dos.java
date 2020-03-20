package nuevo;

public class dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = { 1, 2, -1, 1, 0, 1, 2, -1, -1, -2 };
		char[][] matriz = { { 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O' }, { 'O', 'O', 'O', 'O' },
				{ 'O', 'O', 'O', 'O' } };
		int f = 0, c = 0;

		for (int i = 0; i < myArray.length; i++) {
			if (i % 2 == 0) {
				if (myArray[i] >= 0) {
					if (c + myArray[i] < 4) {
						c += myArray[i];
					} else {
						c = 3;
					}

					// caso izquierda
				} else {
					if (c + myArray[i] > 0) {
						c += myArray[i];
					} else {
						c = 0;
					}
				}
				// caso arriba y abajo
			} else {
				if (myArray[i] >= 0) {
					if (f + myArray[i] < 4) {
						f += myArray[i];
					} else {
						f = 3;
					}

				} else {
					if (f + myArray[i] > 0) {
						f += myArray[i];
					} else {
						f = 0;
					}

				}
			}

		}

		matriz[f][c] = 'X';

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}

	}

}
