/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetovendas.model;

/**
 *
 * @author aluno
 */
import java.sql.SQLException;
import projetovendas.interfaces.IOperacao;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estado implements IOperacao {

    private String nome;
    private String sigla;

    private Statement mysqStatement = null;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public void cadastrar() {
        String insert = "insert into estado(nome_estado, sigla_estado) "
                + "values('" + getNome().toUpperCase() + "','" + getSigla().toUpperCase() + "')";
        mysqStatement = ConexaoDB.getStatement();

        try {
            mysqStatement.executeUpdate(insert);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean alterar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString() {
        return "Estado{" + "nome=" + nome + ", codibge=" + sigla + '}';
    }
}
