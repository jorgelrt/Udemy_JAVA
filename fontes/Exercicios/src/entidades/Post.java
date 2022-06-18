package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Integer id;
	private Date momento;
	private String titulo;
	private String conteudo;
	private Integer likes;
	
	private List<Comentario> listaComentario = new ArrayList<Comentario>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public Post(Integer id,Date momento, String titulo, String conteudo) {
		this.id = id;
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public Integer getId() {
		return id;
	}
	
	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void darLikes() {
		if (likes == null) {
			this.likes = 1;
		}else {
			this.likes += 1;
		}
		
	}
	
	public void addComentario(Comentario comentario){
		listaComentario.add(comentario);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Postado em ");
		sb.append(sdf.format(momento));
		sb.append('\n');
		sb.append("id: ");
		sb.append(id);
		sb.append('\n');
		sb.append("Titulo: ");
		sb.append(titulo);
		sb.append('\n');
		sb.append(conteudo);
		sb.append('\n');
		for(Comentario c : listaComentario) {
			sb.append("Comentario: ");
			sb.append(c);
			sb.append('\n');
		}
		sb.append("Likes: ");
		sb.append(likes);
		sb.append('\n');
		return sb.toString();	
	}
}
