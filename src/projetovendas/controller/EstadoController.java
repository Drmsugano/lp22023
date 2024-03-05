


package projetovendas.controller;
import projetovendas.interfaces.IOperacao;
import projetovendas.model.Estado;

public class EstadoController implements IOperacao {
    private Estado estado;
    
    @Override
    public void cadastrar() {
        estado.cadastrar();
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
    
     public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
