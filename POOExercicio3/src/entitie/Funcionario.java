package entitie;

public class Funcionario {
     public String nome;
     public double salarioBruto;
     public double taxa;
     
     public double salario() {
    	 return salarioBruto - taxa;
     }
     
     public void aumentarSalario(double porcento) {
    	 salarioBruto += salarioBruto*porcento/100;
     }

	@Override
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salario());
	}
     
     
     
     
}
