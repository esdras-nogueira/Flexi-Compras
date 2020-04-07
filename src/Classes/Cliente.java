
package Classes;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.util.Date;


public class Cliente {
    private String idcliente;
    private int idTipo;
    private String Nome;
    private String Snome;
    private String Endereco;
    private String Telefone;
    private int idCidade;
    private Date DNascimento;
    private Date Data;

    public Cliente(String idcliente, int idTipo, String Nome, String Snome, String Endereco, String Telefone, int idCidade, Date DNascimento, Date Data) {
        this.idcliente = idcliente;
        this.idTipo = idTipo;
        this.Nome = Nome;
        this.Snome = Snome;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.idCidade = idCidade;
        this.DNascimento = DNascimento;
        this.Data = Data;
    }

    public Cliente(String text, int selectedIndex, String text0, String text1, String text2, String text3, int selectedIndex0, Date date, Date date0, Type String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSnome() {
        return Snome;
    }

    public void setSnome(String Snome) {
        this.Snome = Snome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public Date getDNascimento() {
        return DNascimento;
    }

    public void setDNascimento(Date DNascimento) {
        this.DNascimento = DNascimento;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
    @Override
    public String toString(){
        return idcliente +"|"
                
               +idTipo +"|"
               +Nome +"|"        
               +Snome +"|"
               +Endereco +"|"
               +Telefone +"|"
               +idCidade +"|"
               +Utilidades.formatDate(DNascimento)+"|"
               +Utilidades.formatDate(Data);       
    }
    
}
