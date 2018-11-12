package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Cliente;

/**
 *
 * @author phaar
 */
public class CategoriaDAO extends ExeculteSQL{

    public CategoriaDAO(Connection con) {
        super(con);
    }
    
    
    public List<Categoria> ConsultaCodigoCategoria(String nome){
        
        String sql = "select idcategoria from categoria where nome = '" + nome + "'";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(Exception e){
            return null;
        }
        
    }
    
    public String Inserir_Categoria(Categoria a){
        String sql = "insert into categoria value(0,?,?)";
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          
          ps.setInt(1, a.getCodigo());           
          ps.setString(2, a.getNome());
          if(ps.executeUpdate() < 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public List<Categoria> ListarCategoria(){
        String sql = "select idcategoria,codigo,nome from categoria";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    lista.add(a);
                    
                }
                return lista;
            }else{
                return null; 
              }
            }catch(SQLException e){
                return null;
            }
        }
    public List<Categoria> Pesquisar_Nome_Categoria(String nome){
        String sql = "Select idcliente, nome, RG, CPF, Telefone, Email" + "from cliente where nome Like'" + nome + "%'";
         List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    lista.add(a);
                    
                }
                return lista;
            }else{
                return null; 
              }
            }catch(SQLException e){
                return null;
            }
    }
    
     public List<Categoria> Persquisar_Cod_Categoria(int cod){
        String sql = "Select idcategoria, nome, codigo" + "from categoria where nome idcategoria = '" + cod + "'";
         List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    lista.add(a);
                    
                }
                return lista;
            }else{
                return null; 
              }
            }catch(SQLException e){
                return null;
            }
    }
    
    public List<Categoria> ListarComboCategoria(){
        
        String sql = "select nome from categoria order by nome";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    Categoria a = new Categoria();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                    
                }
                return lista;
            }else{
                return null;
            }
            
        }catch(Exception e){
            return null;
        }
    }
    
    public boolean Testar_Categoria(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from categoria where idcategoria = " +  cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    Resultado = true;
                }
            }
        }catch(SQLException ex){
            ex.getMessage();
        }
        return Resultado;
    }
    public List<Categoria> CapturarCategoria(int cod){
        String sql = "select * from categoria where idcategoria =" + cod + " ";
        List<Categoria> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    Categoria a = new Categoria();
                    a.setCodigo(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        }catch(SQLException e){
            return null;
        }
    }
    
        public String Excluir_Categoria(Categoria a ){
        String sql = "delete from categoria where idcategoria = ? and nome = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getNome());
            if(ps.executeUpdate() > 0){
                return "Excluir com sucesso.";
            }else{
                return "Erro ao excluir"; 
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String Alterar_Categoria(Categoria a){
        String sql = "update categoria set nome = ? ,preco = ? where idcategoria = ? ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getCodigo());
            if(ps.executeUpdate() > 0){
                return "Atualizado com sucesso.";
            }else{
                return "Erro ao Atualizar";
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
}
