package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Classificacao;
import modelo.Cliente;

public class ClassificacaoDAO extends ExeculteSQL {

    public ClassificacaoDAO(Connection con) {
        super(con);
    }
    public List<Classificacao> ConsultaCodigoClassificacao(String nome){
        
        String sql = "select idclassificaccao from classificacao where nome = '" + nome + "'";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
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
    
    public String Inserir_Classificacao(Classificacao a){
        String sql = "insert into clasificacao value(0,?,?,?,?,?,?,?,?,?,?)";
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          
          ps.setString(1, a.getNome());
          ps.setInt(2, a.getCodigo());
          
          if(ps.executeUpdate() < 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public List<Classificacao> ListarClassificacao(){
        String sql = "select idclaficaccao,nome,preco from classificacao";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
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
    public List<Classificacao> Pesquisar_Nome_Classificaccao(String nome){
        String sql = "Select idclassificaccao, nome, preco" + "from classificacao where nome Like'" + nome + "%'";
         List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
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
    public List<Classificacao> Persquisar_Cod_Classificacao(int cod){
        String sql = "Select idclassificaccao, nome, RG, CPF, Telefone, Email" + "from cliente where nome idcliente = '" + cod + "'";
         List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Classificacao a = new Classificacao();
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
    
    public List<Classificacao> ListarComboClassificacao(){
        
        String sql = "select nome from classificacao order by nome";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    Classificacao a = new Classificacao();
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
    public boolean Testar_Classificacao(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from classificacao where idclassificaccao = " +  cod + "";
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
    
    public List<Classificacao> CapturarClassificacao(int cod){
        String sql = "select * from classificacao where idclassificao =" + cod + " ";
        List<Classificacao> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    Classificacao a = new Classificacao();
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
    
    
}
