package ficha;
import java.util.Scanner;

/*controle funcionario */

public class FichaCadastro extends Funcionario {
	

	public static void main(String[] args) {
		
		// instancia um objeto da classe funcionario 
		
		Funcionario funcionario = new Funcionario();
		Scanner scanner = new Scanner(System.in);
		
		
		// cadastro 
		
		System.out.println("Digite a matrícula: ");
		funcionario.setMatricula (scanner.nextLine());

        System.out.println("Digite o nome: ");
        funcionario.setNome (scanner.nextLine());

        System.out.println("Digite o cargo: ");
        funcionario.setCargo(scanner.nextLine());

        System.out.println("Digite o salário: ");
        funcionario.setSalario(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("Digite o valor das vendas: ");
        funcionario.setVendas (scanner.nextLine());
		
        
		//exibir os dados cadastrei no objeto
		
        System.out.println("\nDados cadastrados:");
        System.out.println("Matrícula: " + funcionario.getmatricula());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Vendas: " + funcionario.getVendas());
		
		// escrever na tela o reajuste de salario
        
		funcionario.reajustarSalario();
		
		System.out.println("\nsalario reajustado por ano: " +funcionario.getSalario());
		
		funcionario.calcularComissao();
		
		System.out.println("comissao por vendas: " +funcionario.getComissao());
		
		scanner.close();
	}
	

	
}
