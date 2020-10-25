package Main;

import Entidades.Autores;
import Entidades.Email;
import EntidadesDAO.AutoresDAO;
import IEntidadesDAO.IAutoresDAO;
import java.util.ArrayList;
import java.util.List;

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
        
        Autores autor = new Autores();
        autor.setNome("Carlos");
        autor.email = new ArrayList<Email>();
        autor.email.add(new Email("carlos@gmail.com"));
        a.SalvarAutor(autor);
        
        
    }
    
}
