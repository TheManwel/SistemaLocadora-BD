package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.DVD;

public class DVDDAO extends ExeculteSQL{

    public DVDDAO(Connection con) {
        super(con);
    }
    public boolean Testar_DVD(int cod){
        boolean teste = false;
        try{
            String sql = "select iddvd from dvd where iddvd =" + cod + "";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    teste = true;
                }
            }
        }catch(SQLException ex){
        
        }
        return teste;
    }
    
    public List<DVD> CapturarDVD(){
        String sql = "select * from dvd where iddvd = " + cod + " ";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setData_compra(rs.getString(3));
                    a.setSituacao(rs.getString(4));
                    a.setPreco(rs.getDouble(5));
                    
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
    
    public boolean Testar_Situacao(int cod){
        boolean teste = false;
        try{
            String sql = "select iddvd from dvd where iddvd =" + cod + "" + " and situacao = 'Disponível";
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    teste = true;
                }
            }
        }catch(SQLException ex){
        
        }
        return teste;
    }
    public String Inserir_DVD(DVD a){
        String sql = "insert into dvd value(0,?,?,?,?,?,?,?,?,?,?)";
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          
          ps.setInt(1, a.getCodigo());
          ps.setInt(2, a.getCod_filme());
          ps.setString(3, a.getSituacao());
          ps.setDouble(4, a.getPreco());
          
          if(ps.executeUpdate() < 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public List<DVD> ListarDVD(){
        String sql = "select iddvd ,idfilme, preco_compra, data_compra, situacao from dvd";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setSituacao(rs.getString(3));
                    a.setPreco(rs.getDouble(4));
                    
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
    public List<DVD> Pesquisar_Nome_DVD(String nome){
        String sql = "Select idcliente, nome, RG, CPF, Telefone, Email" + "from cliente where nome Like'" + nome + "%'";
         List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setSituacao(rs.getString(3));
                    a.setPreco(rs.getDouble(4));
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
    public List<DVD> Persquisar_Cod_DVD(int cod){
        String sql = "Select idcliente, nome, RG, CPF, Telefone, Email" + "from cliente where nome idcliente = '" + cod + "'";
         List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setSituacao(rs.getString(3));
                    a.setPreco(rs.getDouble(4));
                    
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
    public List<DVD> ListarComboDVD(){
        
        String sql = "select iddvd from dvd order by nome ";
        List<DVD> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
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
    
    public boolean Testar_DVD(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from dvd where iddvd = " +  cod + "";
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
    public List<DVD> CapturarDVD(int cod){
        String sql = "select * from dvd where iddvd =" + cod + " ";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    DVD a = new DVD();
                    a.setCodigo(rs.getInt(1));
                    a.setCod_filme(rs.getInt(2));
                    a.setSituacao(rs.getString(3));
                    a.setPreco(rs.getDouble(4));
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
    
    public List<DVD> ConsultaCodigoDVD(String nome){
        
        String sql = "select iddvd from dvd where iddvd = '" + nome + "'";
        List<DVD> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    DVD a = new DVD();
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
    
    public String Excluir_DVD(DVD a ){
        String sql = "delete from dvd where iddvd = ? and cod_filme = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
            if(ps.executeUpdate() > 0){
                return "Excluir com sucesso.";
            }else{
                return "Erro ao excluir"; 
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String Alterar_DVD(DVD a){
        String sql = "update dvd set codigo = ? , cod_filme = ? ,  = ?" + ", situacao = ? , preco = ?" + " where iddvd = ? ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCodigo());
          ps.setInt(2, a.getCod_filme());
          ps.setString(3, a.getSituacao());
          ps.setDouble(4, a.getPreco());
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

