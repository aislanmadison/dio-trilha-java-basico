public class Contador {
	public static void main(String[] args) {
		
			
		Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try{
			contar(parametroUm, parametroDois);
			System.out.println(contar);
		
		}catch (ContadorInvalidoException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}	
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		for (int contador =1; contador <=5; contador ++){
			if (contador == 3)
			break;
		}
	}
}