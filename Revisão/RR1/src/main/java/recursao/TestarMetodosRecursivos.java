package recursao;

public class TestarMetodosRecursivos {
	public static void main(String[] args) {
		// preencha esse metodo com codigo para testar a classe MetodosRecursivos.
		int[] array = {1, 2, 3, 4, 5, 6}; //21
		String[] arrayString = {null, "batata", "do", "bk", null, "eh", "maravilhosa", null};
		MetodosRecursivos methods = new MetodosRecursivos();
		System.out.println(methods.calcularSomaArray(array));
		System.out.println(methods.calcularFatorial(7));
		System.out.println(methods.calcularFibonacci(3));
		System.out.println(methods.countNotNull(arrayString, 0));
		System.out.println(methods.potenciaDe2(5));
		System.out.println(methods.progressaoAritmetica(1, 2, 10));
		System.out.println(methods.progressaoGeometrica(1, 2, 5));
	}
}
