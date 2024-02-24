/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;


import java.sql.SQLException;
import java.sql.ResultSet;
import projetovendas.interfaces.IOperacao;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class Cidade implements IOperacao {

    private String nome;
    private int codibge;
    
    private Statement mysqStatement = null;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodibge() {
        return codibge;
    }

    public void setCodibge(int codibge) {
        this.codibge = codibge;
    }

    @Override
    public void cadastrar() {
         String insert  = "insert into cidade(nome, cod_ibge) "
                + "values('"+getNome()+"',"+getCodibge()+")";
         mysqStatement = ConexaoDB.getStatement();
         
        try {
            mysqStatement.executeUpdate(insert);
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
         
       
    }

    @Override
    public boolean alterar() {
        return false;
    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public void cancelar() {

    }
    public List<Cidade> getListaCidadesModel() {
        String select = "select nome, cod_ibge from cidade";
        List<Cidade> listasCidadeDB = new ArrayList();
        mysqStatement = ConexaoDB.getStatement();
        try {
            ResultSet rs =  mysqStatement.executeQuery(select);
            while (rs.next()){
                Cidade cid = new Cidade();
                cid.setCodibge(rs.getInt("cod_ibge"));
                cid.setNome(rs.getString("nome"));
                listasCidadeDB.add(cid);
            }
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        return listasCidadeDB;
    }
    @Override
    public String toString() {
        return "Cidade{" + "nome=" + nome + ", codibge=" + codibge + '}';
    }
    
    

}
