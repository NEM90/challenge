package nuevo;

import java.util.*;

public class tres {

	static boolean esPrioritario(String codigo) {
		if (codigo.charAt(0) == 'P' || codigo.charAt(0) == 'W')
			return true;
		return false;
	}

	static boolean verificar(String codigo) {

		String generado = codigo.substring(4, 9);
		int suma = 0, s2 = 0;
		for (int i = 0; i < 5; i++) {
			suma += Integer.parseInt("" + generado.charAt(i));
		}

		while (suma - 10 > 0) {
			s2 += suma % 10;
			suma = suma / 10;

		}

		suma = suma + s2;
		if (Integer.parseInt("" + codigo.charAt(10)) == suma)
			return true;

		return false;
	}

	static void ordenarLista(List<String> cod) {

		Collections.sort(cod);

	}

	static List<String> unirLista(List<String> cod1, List<String> cod2) {
		List<String> listar = new ArrayList<String>();
		listar.addAll(cod1);
		listar.addAll(cod2);
		return listar;
	}

	static List<String> intercepcionLista(List<String> cod1, List<String> cod2) {
		List<String> listar = new ArrayList<String>();
		Set<String> inter = new HashSet<String>(cod1);
		inter.retainAll(cod2);
		listar.addAll(inter);
		return listar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Lista1 = new ArrayList<String>();
		List<String> Lista2 = new ArrayList<String>();
		List<String> Listar = new ArrayList<String>();

		Lista1.add("PCR-88578-9");
		Lista1.add("ERF-88578-3");
		Lista1.add("HGF-65466-3");
		Lista2.add("MCR-15486-2");
		Lista2.add("JHG-78954-1");
		Lista2.add("HGF-65466-3");

		System.out.println(esPrioritario("PCR-88578-9"));
		System.out.println(verificar("PCR-88578-9"));

		System.out.println(Lista1);
		ordenarLista(Lista1);
		System.out.println(Lista1);

		Listar = unirLista(Lista1, Lista2);
		System.out.println(Listar);

		Listar = intercepcionLista(Lista1, Lista2);
		System.out.println(Listar);

	}

}
