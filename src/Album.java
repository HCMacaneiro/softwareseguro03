import java.util.ArrayList;

public class Album {
    private String genero;
    private int ano;
    private String nome;
    private String artista;
    private ArrayList<Musica> musicas;

    public Album(String genero, int ano, String nome, String artista) {
        this.genero = genero;
        this.ano = ano;
        this.nome = nome;
        this.artista = artista;
        this.musicas = new ArrayList<Musica>();
    }

    public void setMusicas(Musica musica) {
        this.musicas.add(musica);
    }

    public void mostraTodosOsDados() {
        System.out.println("Gênero: " + this.genero + "\n"
                + "Ano: " + this.ano + "\n"
                + "Nome: " + this.nome + "\n"
                + "Artista: " + this.artista + "\n"
                + "Musicas: " + this.musicas);
    }
}
