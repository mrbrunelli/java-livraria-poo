package livraria;

public class Ebook extends Livro implements Promocional {
	private String watermark;

	public Ebook(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("Aplicando desconto no Ebook");
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}

	public String getWatermark() {
		return watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
	}

}
