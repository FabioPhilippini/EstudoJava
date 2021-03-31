package entitie;

public class Produto {
	public String nome;
	public double preco;
	public int qntd;

	public double valorTotalEstoque() {
		return preco * qntd;
	}

	public void adicionarProduto(int qntd) {
		this.qntd += qntd;
	}

	public void removerProduto(int qntd) {
		this.qntd -= qntd;
	}

	
	public String toString() {
		return nome + ", R$ " 
	                + String.format("%.2f", preco) 
	                + ", " 
	                + qntd 
	                + " unidades, Total: R$ "                 
				    + String.format("%.2f", valorTotalEstoque());
	}

}
