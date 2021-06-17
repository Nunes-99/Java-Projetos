package Entities;

public class Cadastro 
{
	
	private String name;
	private Integer id;
	private Double salario;
	
	public Cadastro(String name, Integer id, Double salario) {
		this.name = name;
		this.id = id;
		this.salario = salario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalario() {
		return salario;
	}
	
	public double aumento(double valor) {
		this.salario += salario * (valor / 100);
		return salario;
	}

	@Override
	public String toString() {
		return "Id: "
				+ id 
				+"Nome: "
				+ name
				+"Salário: "
				+ salario;
	}
	
	
	
}
