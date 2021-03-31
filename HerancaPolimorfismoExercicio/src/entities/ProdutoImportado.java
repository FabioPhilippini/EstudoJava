package entities;

public final class ProdutoImportado extends Produto {
	private Double frete;

	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double frete) {
		super(nome, preco);
		this.frete = frete;
	}

	public Double getFrete() {
		return frete;
	}

	public void setFrete(Double frete) {
		this.frete = frete;
	}

	public Double precoTotal() {
		return super.getPreco() + frete;
	}

	@Override
	public final String etiquetaPreco() {
		return getNome() + " R$ " + String.format("%.2f", precoTotal()) + " (Frete: R$ " + String.format("%.2f",frete) + ")";
	}
}
