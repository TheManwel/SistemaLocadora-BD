/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluguel;
import modelo.Cliente;

/**
 *
 * @author phaar
 */
public class AluguelDAO extends ExeculteSQL{

    public AluguelDAO(Connection con) {
        super(con);
    }
    
    public String Inserir_Aluguel(Aluguel a){
        String sql = "insert into aluguel value(0,?,?,?,?,?,?,?,?,?,?)";
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);       
         
          
          ps.setInt(1, a.getCod());
          ps.setInt(2, a.getCoddvd());
          ps.setInt(3, a.getCodcliente());
          ps.setString(4, a.getData_aluguel());
          ps.setString(5, a.getData_devolucao());
          ps.setString(6, a.getHorario());
          
          
          if(ps.executeUpdate() < 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public List<Aluguel> ListarAluguel(){
        String sql = "select idaluguel, iddvd, idcliente, hora_aluguel, data_aluguel, data_devolucao from aluguel";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCoddvd(rs.getInt(1));
                    a.setCodcliente(rs.getInt(2));
                    a.setData_aluguel(rs.getString(3));
                    a.setHorario(rs.getString(4));
                    a.setData_devolucao(rs.getString(5));
                    
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
    public List<Aluguel> Pesquisar_Nome_Aluguel(String nome){
        String sql = "Select idaluguel, iddvd, idcliente, hora_aluguel, data_aluguel, data_devolucao" + "from aluguel where idaluguel Like'" + nome + "%'";
         List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCoddvd(rs.getInt(1));
                    a.setCodcliente(rs.getInt(2));
                    a.setData_aluguel(rs.getString(3));
                    a.setHorario(rs.getString(4));
                    a.setData_devolucao(rs.getString(5));
                    
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
public List<Aluguel> Persquisar_Cod_Aluguel(int cod){
        String sql = "Select idaluguel, iddvd, idcliente, hora_aluguel, data_aluguel, data_devolucao" + "from aluguel where idaluguel = '" + cod + "'";
         List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCoddvd(rs.getInt(1));
                    a.setCodcliente(rs.getInt(2));
                    a.setData_aluguel(rs.getString(3));
                    a.setHorario(rs.getString(4));
                    a.setData_devolucao(rs.getString(5));
                    
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
    public List<Aluguel> ListarComboAluguel(){
        
        String sql = "select hora_aluguel from aluguel order by nome ";
        List<Aluguel> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    Aluguel a = new Aluguel();
                    a.setCod(rs.getInt(1));
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
    
    public boolean Testar_Aluguel(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from Aluguel where idaluguel = " +  cod + "";
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
    public List<Aluguel> CapturarAluguel(int cod){
        String sql = "select * from Aluguel where idaluguel =" + cod + " ";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCoddvd(rs.getInt(1));
                    a.setCodcliente(rs.getInt(2));
                    a.setData_aluguel(rs.getString(3));
                    a.setHorario(rs.getString(4));
                    a.setData_devolucao(rs.getString(5));
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
    
    public List<Aluguel> ConsultaCodigoAluguel(String nome){
        
        String sql = "select idaluguel from alguel where nome = '" + nome + "'";
        List<Aluguel> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Aluguel a = new Aluguel();
                    a.setCod(rs.getInt(1));
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
    
    public String Excluir_Aluguel(Aluguel a ){
        String sql = "delete from aluguel where idaluguel = ? and nome = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCod());
            ps.setInt(2, a.getCoddvd());
            if(ps.executeUpdate() > 0){
                return "Excluir com sucesso.";
            }else{
                return "Erro ao excluir"; 
            }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    
    public String Alterar_Aluguel(Aluguel a){
        String sql = "update aluguel set idcliente = ? ,data_aluguel = ? , iddvd = ?" + ", hora_aluguel = ? , data_devolucao = ? , idcliente " + " where idcliente = ? ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCod());
          ps.setInt(2, a.getCoddvd());
          ps.setInt(3, a.getCodcliente());
          ps.setString(4, a.getData_aluguel());
          ps.setString(5, a.getData_devolucao());
          ps.setString(6, a.getHorario());
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
