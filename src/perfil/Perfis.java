package perfil;


public class Grupos {
	private String nome;
	private  RepositorioPerfis listaNomes;
	private String descricao;
	private RepositorioMensagens listaMensagens;
	
	public Grupos(String name, String number, RepositorioPerfis repositorioPerfis, RepositorioMensagens repositorioMensagens) {
		this.nome = null;
		this.descricao = null;
		this.listaNomes = repositorioPerfis;
		this.listaMensagens = repositorioMensagens;
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
	
	public RepositorioPerfis getListaNomes() {
        return listaNomes;
    }
	
	public RepositorioMensagens getListaMensagens() {
        return listaMensagens;
    }

}
