import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do compositor:");
        String nomeCompositor = scanner.nextLine();
        System.out.println("Digite a idade do compositor:");
        int idadeCompositor = scanner.nextInt();
        Pessoa compositor = new Pessoa(nomeCompositor, idadeCompositor);


        System.out.println("Digite o gênero do álbum:");
        String generoAlbum = scanner.nextLine();
        System.out.println("Digite o ano do álbum:");
        int anoAlbum = scanner.nextInt();
        System.out.println("Digite o nome do álbum:");
        scanner.nextLine();
        String nomeAlbum = scanner.nextLine();
        System.out.println("Digite o nome do artista:");
        String artistaAlbum = scanner.nextLine();

        System.out.println("Digite o número de músicas no álbum:");
        int numMusicas = scanner.nextInt();
        ArrayList<Musica> musicasAlbum = new ArrayList<Musica>();
        for (int i = 0; i < numMusicas; i++) {
            System.out.println("Digite o título da música:");
            scanner.nextLine();
            String tituloMusica = scanner.nextLine();
            System.out.println("Digite a duração da música:");
            String duracaoMusica = scanner.nextLine();
            Musica musica = new Musica(tituloMusica, duracaoMusica, compositor);
            musicasAlbum.add(new Musica(tituloMusica, duracaoMusica, compositor));
        }

        Album album = new Album(generoAlbum, anoAlbum, nomeAlbum, artistaAlbum);
        album.setMusicas(musicasAlbum);
        album.mostraTodosOsDados();
    }
}