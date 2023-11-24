package ficha;

public class Funcionario {
	
	// atributos de classe
	
	private String matricula;
	private String nome;
	private String cargo;
	private String vendas;
	
	private double salario;
	private double comissao;
	
	
	// construtor
	
	public Funcionario() {
		
	}
	
	// metodos setter 
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
		
	}
	
	
	public void setNome(String nome){
		this.nome = nome;
		
	}
	
	public void setCargo(String cargo){
		this.cargo = cargo;
		
	}
	
	public void setSalario(double salario){
		this.salario = salario;
		
	}
	
	public void setVendas (String vendas) {
		this.vendas = vendas;
	}
	
	public void setComissao(double comissao){
		this.comissao = comissao;
		
	}
	
	//metodos getter 
	
	public String getmatricula(){
		return this.matricula;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCargo(){
		return this.cargo;
	}
	
	public Double getSalario(){
		return this.salario;
	}
	
	public String getVendas() {
		return this.vendas;
	}
	
	public Double getComissao(){
		return this.comissao;
	}
	
	
	// metodos de reajuste salarial 
	
	public void reajustarSalario() {
		if (this.cargo.equalsIgnoreCase(" Gerente ")) {	//Este método compara duas strings ignorando suas maiúsculas e minúsculas.
			this.salario = this.salario * 1.10; // aumentar 10%
		}else if (this.cargo.equalsIgnoreCase(" vendedor ")) {
			this.salario = this.salario * 1.05; //aumentar 5%
		}else {
			this.salario = this.salario * 1.01; //aumentar 1%
		}
			
	}
	
	public void calcularComissao() {
        double valorVendas = Double.parseDouble(this.vendas); //converter vendas em um valor double
        this.comissao = valorVendas * 0.01; // 1% de comissão de vendas
    }

}
