package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;
import modelo.Classificacao;

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

}
