package Main;

import Entidades.Autores;
import Entidades.Editora;
import Entidades.Email;
import Entidades.Livros;
import EntidadesDAO.AutoresDAO;
import EntidadesDAO.EditoraDAO;
import EntidadesDAO.LivrosDAO;
import IEntidadesDAO.IAutoresDAO;
import IEntidadesDAO.IEditoraDAO;
import IEntidadesDAO.ILivrosDAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eduar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IAutoresDAO a = new AutoresDAO();
        IEditoraDAO e = new EditoraDAO();

        
        Set<Livros> livros = new HashSet<>();
        Livros livro1 = new Livros();
        livro1.setCusto(65);
        livro1.setEdicao("Limitada");
        livro1.setTitulo("Os três porquinhos");
        
        Livros livro2 = new Livros();
        livro2.setCusto(100);
        livro2.setEdicao("Limitada");
        livro2.setTitulo("A bela e a fera");
        
        Livros livro3 = new Livros();
        livro3.setCusto(90);
        livro3.setEdicao("Limitada");
        livro3.setTitulo("Alladim");
        
        Livros livro4 = new Livros();
        livro4.setCusto(69);
        livro4.setEdicao("Limitada");
        livro4.setTitulo("Mickey");
        
        Livros livro5 = new Livros();
        livro5.setCusto(85);
        livro5.setEdicao("Limitada");
        livro5.setTitulo("Os patetas");
        
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livros.add(livro4);
        livros.add(livro5);
        
        Autores autor1 = new Autores();
        autor1.setNome("Carlos");
        autor1.email = new ArrayList<>();
        autor1.email.add(new Email("Carlos@gmail.com"));
        autor1.email.add(new Email("contato.Carlos@gmail.com"));
        autor1.Livros = livros;
        
        Autores autor2 = new Autores();
        autor2.setNome("Matheus");
        autor2.email = new ArrayList<>();
        autor2.email.add(new Email("Matheus@gmail.com"));
        autor2.Livros = livros;
        
        Autores autor3 = new Autores();
        autor3.setNome("Vinicios");
        autor3.email = new ArrayList<>();
        autor3.email.add(new Email("Vinicios@gmail.com"));
        autor3.email.add(new Email("contato.vini@gmail.com"));
        autor3.Livros = livros;
        
        Autores autor4 = new Autores();
        autor4.setNome("Marcelo");
        autor4.email = new ArrayList<>();
        autor4.email.add(new Email("Marcelo@gmail.com"));
        autor4.Livros = livros;
        
        Autores autor5 = new Autores();
        autor5.setNome("Ricardo");
        autor5.email = new ArrayList<>();
        autor5.email.add(new Email("Ricardo@gmail.com"));
        autor5.email.add(new Email("contato.ric@gmail.com"));
        autor5.Livros = livros;
        
        Editora editora1 = new Editora();
        editora1.setId(1);
        editora1.setNome("Companhia de Letras");
        editora1.AddLivro(livro1);
        
        Editora editora2 = new Editora();
        editora2.setId(2);
        editora2.setNome("Editora Record");
        editora1.AddLivro(livro2);
        
        Editora editora3 = new Editora();
        editora3.setId(3);
        editora3.setNome("Editora Rocco");
        editora1.AddLivro(livro3);
        
        Editora editora4 = new Editora();
        editora4.setId(4);
        editora4.setNome("Somos Educacao");
        editora1.AddLivro(livro4);
        
        Editora editora5 = new Editora();
        editora5.setId(25);
        editora5.setNome("Saraiva");
        editora5.AddLivro(livro5);
        
        e.SalvarEditora(editora1);
        e.SalvarEditora(editora2);
        e.SalvarEditora(editora3);
        e.SalvarEditora(editora4);
        e.SalvarEditora(editora5);
        
        a.SalvarAutor(autor1);
        a.SalvarAutor(autor2);
        a.SalvarAutor(autor3);
        a.SalvarAutor(autor4);
        a.SalvarAutor(autor5);
    }
    
}
