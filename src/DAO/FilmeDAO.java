package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Cliente;
import modelo.Filme;

/**
 *
 * @author phaar
 */
public class FilmeDAO extends ExeculteSQL{

    public FilmeDAO(Connection con) {
        super(con);
    }

    public List<Filme> ListarComboFilme() {
         String sql = "select nome from filme order by nome ";
        List<Filme> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    Filme a = new Filme();
                    a.setCodigo(rs.getInt(1));
                    a.setAno(rs.getInt(2));
                    a.setCod_categoria(rs.getInt(3));
                    a.setCod_classificacao(rs.getInt(4));
                    a.setTitulo(rs.getString(5));
                    a.setDuracao(rs.getString(6));
                    a.setCapa(rs.getString(7));
                    lista.add(a);
                }
                return lista;
            }else{
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public boolean Testar_Filme(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from filme where idfilme = " +  cod + "";
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
    public List<Filme> CapturarFilme(int cod){
        String sql = "select * from filme where idfilme =" + cod + " ";
        List<Filme> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    Filme a = new Filme();
                    a.setCodigo(rs.getInt(1));
                    a.setAno(rs.getInt(2));
                    a.setCod_categoria(rs.getInt(3));
                    a.setCod_classificacao(rs.getInt(4));
                    a.setTitulo(rs.getString(5));
                    a.setDuracao(rs.getString(6));
                    a.setCapa(rs.getString(7));
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
    
    public List<Filme> ConsultaCodigoFilme(String nome){
        
        String sql = "select idfilme from filme where nome = '" + nome + "'";
        List<Filme> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Filme a = new Filme();
                    a.setCodigo(rs.getInt(1));
                    a.setAno(rs.getInt(2));
                    a.setCod_categoria(rs.getInt(3));
                    a.setCod_classificacao(rs.getInt(4));
                    a.setTitulo(rs.getString(5));
                    a.setDuracao(rs.getString(6));
                    a.setCapa(rs.getString(7));
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
    
    public String Excluir_Filme(Filme a ){
        String sql = "delete from filme where idfilme = ? and nome = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            ps.setString(2, a.getTitulo());
            if(ps.executeUpdate() > 0){
                return "Excluir com sucesso.";
            }else{
                return "Erro ao excluir"; 
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String Alterar_Filme(Filme a){
        String sql = "update filme set titulo = ? ,filme = ? , duracao = ?" + ",idcategoria = ? ,idclassificacao = ? ,ano = ?,capa = ? " + " where idfilme = ? ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getTitulo());
            ps.setString(2, a.getCapa());
            ps.setString(3, a.getDuracao());
            ps.setInt(4, a.getCod_categoria());
            ps.setInt(5, a.getCod_classificacao());
            ps.setInt(6, a.getAno());
            ps.setInt(7, a.getCodigo());
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
