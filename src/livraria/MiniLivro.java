package livraria;

public class MiniLivro extends Livro {
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}
}
