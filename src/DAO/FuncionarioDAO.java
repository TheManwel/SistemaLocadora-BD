package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Funcionario;

public class FuncionarioDAO extends ExeculteSQL {
    public FuncionarioDAO(Connection con){
        super(con);
    }
    public boolean Logar(String login, String senha){
        boolean finalResult = false;
        try{
            String consulta = "select login, senha from funcionario" + " where login = '" +login+ "' and senha = '" +senha+ "'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    Funcionario a = new Funcionario();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
        }
        }catch (SQLException ex){
            ex.getMessage();
        }
        return finalResult;
    }
    
     public String Inserir_Funcionario(Funcionario a){
        String sql = "insert into funcionario value(0,?,?,?,?,?,?,?,?,?,?)";
        try{
          PreparedStatement ps = getCon().prepareStatement(sql);
          
          ps.setString(1, a.getNome());
          ps.setString(2, a.getSenha());
          ps.setString(3, a.getLogin());
          ps.setInt(4, a.getCod());
          
          if(ps.executeUpdate() < 0){
              return "Inserido com sucesso.";
          }else{
              return "Erro ao inserir";
          }
        }catch(SQLException e){
            return e.getMessage();
        }
    }
    public List<Funcionario> ListarFuncionario(){
        String sql = "select idfuncionario,nome,senha,login,cod, from funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Funcionario a = new Funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    a.setLogin(rs.getString(4));
                    
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
    public List<Funcionario> Pesquisar_Nome_Funcionario(String nome){
        String sql = "Select idfuncionario, nome, senha, login, cod" + "from funcionario where nome Like'" + nome + "%'";
         List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Funcionario a = new Funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    a.setLogin(rs.getString(4));
                    
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
    public List<Funcionario> Persquisar_Cod_Funcionario(int cod){
        String sql = "Select idfuncionario, nome, senha, login, cod" + "from funcionario where nome idfuncionario = '" + cod + "'";
         List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Funcionario a = new Funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    a.setLogin(rs.getString(4));
                    
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
    public List<Funcionario> ListarComboFuncionario(){
        
        String sql = "select nome from funcionario order by nome ";
        List<Funcionario> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while (rs.next()){
                    
                    Funcionario a = new Funcionario();
                    a.setNome(rs.getString(1));
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
    
    public boolean Testar_Funcionario(int cod){
        boolean Resultado = false;
        try{
            
            String sql = "Select * from Funcionario where idfuncionario = " +  cod + "";
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
    public List<Funcionario> CapturarFuncionario(int cod){
        String sql = "select * from funcionario where idfuncionario =" + cod + " ";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs != null){
                while (rs.next()){
                    Funcionario a = new Funcionario();
                    a.setCod(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setSenha(rs.getString(3));
                    a.setLogin(rs.getString(4));
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
    
    public List<Funcionario> ConsultaCodigoFuncionario(String nome){
        
        String sql = "select idfuncionario from funcionario where nome = '" + nome + "'";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if(rs != null){
                while(rs.next()){
                    Funcionario a = new Funcionario();
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
    
    public String Excluir_Funcionario(Funcionario a ){
        String sql = "delete from funcionario where idfuncionario = ? and nome = ?";
        
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getCod());
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
    
    public String Alterar_Funcionario(Funcionario a){
        String sql = "update funcionario set nome = ? ,data_nasc = ? , rg = ?" + ",cpf = ? ,email = ? ,telefone = ?,rua = ? " + ",numero = ?,cep = ? where idcliente = ? ";
        try{
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2, a.getSenha());
            ps.setString(3, a.getLogin());
            ps.setInt(4, a.getCod());
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
