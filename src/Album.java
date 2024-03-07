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

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public void mostraTodosOsDados() {
        System.out.println("Gênero: " + this.genero + "\n"
                + "Ano: " + this.ano + "\n"
                + "Nome: " + this.nome + "\n"
                + "Artista: " + this.artista + "\n"
                + "Músicas:");

        for (Musica musica : this.musicas) {
            System.out.println(" - Título: " + musica.getTitulo() + ", Duração: " + musica.getDuracao() + ", Compositor: " + musica.getCompositor().getNome());
        }
    }
}
