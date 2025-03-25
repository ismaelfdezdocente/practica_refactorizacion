package pruebaJavaDocs;

public class Principal {

	private static final String TEXTO_1 = "Se ha ejecutado el proyecto Java con DNI: ";
	private static final String TEXTO_2 = " y Nombre: ";
	private static final String ERROR_MSG = "El DNI y el nombre no pueden estar vacíos.";

	public static void main(String dni, String nombre) {
		// 1. Validación de parámetros (Aporta +1 de complejidad por cada `if`)
		if (dni == null || dni.isEmpty()) {
			throw new IllegalArgumentException(ERROR_MSG);
		}
		if (nombre == null || nombre.isEmpty()) {
			throw new IllegalArgumentException(ERROR_MSG);
		}

		// 2. Estructura condicional compleja con múltiples anidamientos (+1 por cada
		// `if` y `else if`)
		if (dni.length() > 8) {
			if (dni.startsWith("A")) {
				System.out.println("DNI largo y empieza con A");
			} else if (dni.endsWith("Z")) {
				System.out.println("DNI largo y termina en Z");
			} else {
				System.out.println("DNI largo pero no empieza con A ni termina en Z");
			}
		} else {
			if (nombre.length() > 5) {
				if (nombre.contains(" ")) {
					System.out.println("Nombre largo con espacio");
				} else {
					System.out.println("Nombre largo sin espacio");
				}
			} else {
				System.out.println("Nombre corto");
			}
		}

		// 3. Un bucle con lógica compleja (+1 por cada bucle, +1 por cada `if` dentro)
		for (int i = 0; i < dni.length(); i++) {
			char letra = dni.charAt(i);
			if (Character.isDigit(letra)) {
				if (letra == '0') {
					System.out.println("Número 0 en DNI");
				} else {
					System.out.println("Número en DNI: " + letra);
				}
			} else if (Character.isUpperCase(letra)) {
				System.out.println("Letra mayúscula en DNI");
			} else {
				System.out.println("Otro carácter en DNI");
			}
		}

		// 4. Un switch con varios casos (+1 por cada `case`)
		switch (dni.length()) {
		case 8:
			System.out.println("DNI de 8 caracteres");
			break;
		case 9:
			System.out.println("DNI de 9 caracteres");
			break;
		case 10:
			System.out.println("DNI de 10 caracteres");
			break;
		default:
			System.out.println("DNI de longitud desconocida");
			break;
		}

		// 5. Otro bucle con condiciones dentro (+1 por el bucle, +1 por cada `if`
		// dentro)
		for (char letra : nombre.toCharArray()) {
			if (Character.isUpperCase(letra) && Character.isLetter(letra)) {
				System.out.println("Letra mayúscula: " + letra);
			} else if (Character.isLowerCase(letra) && Character.isLetter(letra)) {
				System.out.println("Letra minúscula: " + letra);
			} else {
				System.out.println("Otro carácter encontrado: " + letra);
			}
		}

		System.out.println("Fin del programa.");
	}
}