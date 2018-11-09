/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

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
    
}
