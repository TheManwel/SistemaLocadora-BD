package DAO;

import java.sql.*;
import modelo.Funcionario;

public class FuncionarioDAO extends ExeculteSQL {
    public FuncionarioDAO(Connection con){
        super(con);
    }
    public boolean Logar(String login, String senha){
        boolean finalResult = false;
        try{
            String consulta = "select login, senha from funcionario" + "wherw login = '"+login+"'and seha = '"+senha+"'";
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
}
