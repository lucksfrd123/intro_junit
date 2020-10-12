package boleto;

public class Boleto {
	
	private String codigo;
	private String dia;
	private double valor;
	
	public Boleto(String codigo, String dia, double valor) {
		super();
		this.codigo = codigo;
		this.dia = dia;
		this.valor = valor;		
	}
	
	public String getdate(String codigo) {
		return this.dia;
	}
	
	public String getcodigo(String dia, double valor) {
		return codigo;
	}
	
	public double getvalor() {
		return this.valor;
	}

}
