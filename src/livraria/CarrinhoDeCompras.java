package livraria;

public class CarrinhoDeCompras {
	private double total;

	public void adiciona(Livro livro) {
		System.out.println("Adicionando: " + livro);
		livro.aplicaDescontoDe(0.16);
		this.total += livro.getValor();
	}

	public double getTotal() {
		return this.total;
	}
}
