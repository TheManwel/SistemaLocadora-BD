package DAO;

import java.sql.Connection;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author phaar
 */
public class FilmeDAO extends ExeculteSQL{

    public FilmeDAO(Connection con) {
        super(con);
    }

    public List<Categoria> ListarComboCategoria() {
        
    }
    
}
