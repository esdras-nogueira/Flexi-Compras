 
package Classes;

import com.sun.corba.se.impl.encoding.BufferManagerRead;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Date;

public class Dados {
    private int maxUsu = 50;
    private int maxPro = 100;
    private int maxCli = 100;
    private Usuario msUsuarios[]= new Usuario[maxUsu];
    private Produto msProdutos[]= new Produto[maxPro];
    private Cliente msclientes[]= new Cliente[maxCli];
    private int conUsu =0;
    private int conPro =0;
    private int conCli =0;
    private int numFatura =0;
    
    
    public Dados (){
      
    preencherUsuarios();
      
    preencherProdutos();
    
    preencherClientes();
    
    preencherConfiguracao();
         
    }
    
 
    
    public int getNumeroFatura(){
       return numFatura;  
    }
    
    
    public void setNumeroFatura(){
        this.numFatura = numFatura;
    }
    
    public int numeroUsuarios(){
       return conUsu; 
        
    }
    
    public int numeroProdutos(){
       return conPro; 
        
    }
    
     public int numeroClientes(){
       return conCli;
        
    }
    
    public Usuario[]getUsuario(){
        return msUsuarios;
    }
    
    public Produto[]getProdutos(){
        return msProdutos;
    }
    
    public Cliente[]getClientes(){
        return msclientes;
    }
    
    public boolean validarUsuario(String usuario,String senha){
     boolean aux = false;
     for(int i = 0; i < conUsu; i++){
         if(msUsuarios[i].getIdUsuario().equals(usuario)&&
                 msUsuarios[i].getSenha().equals(senha)){
         return true;
     }
     }
     return false;       
}
    
    public int getPerfil(String usuario){
    for(int i = 0; i < conUsu; i++){
         if(msUsuarios[i].getIdUsuario().equals(usuario)){
         return msUsuarios[i].getPerfil();
     }
     }
     return -1;       
}
public void trocarSenha(String usuario, String senha){
    for(int i = 0; i < conUsu; i++){
         if(msUsuarios[i].getIdUsuario().equals(usuario)){
         msUsuarios[i].setSenha(senha);
         return;
     }
     }
            
}

public int posicaoUsuario(String usuario){
     
     for(int i = 0; i < conUsu; i++){
         if(msUsuarios[i].getIdUsuario().equals(usuario)){
         return i;
     }
     }
     return -1;       
}

public int posicaoProduto(String produto){
     
     for(int i = 0; i < conPro; i++){
         if(msProdutos[i].getIdProduto().equals(produto)){
         return i;
     }
     }
     return -1;       
}

public int posicaoCliente(String cliente){
     
     for(int i = 0; i < conCli; i++){
         if(msclientes[i].getIdcliente().equals(cliente)){
         return i;
     }
     }
     return -1;       
}

public String adicionarUsuario(Usuario mUsuario){
    if(conUsu == maxUsu){
        return"NUMERO MAXIMO DE USUARIOS JA CADASTRADOS";
    }
    msUsuarios[conUsu]= mUsuario;
    conUsu++;
    return"USUARIO CADASTRADO COM SUCESSO";
}

public String adicionarProduto(Produto mpProduto){
    if(conPro == maxPro){
        return"NUMERO MAXIMO DE PRODUTOS JA CADASTRADOS";
    }
    msProdutos[conPro]= mpProduto;
    conPro++;
    return"PRODUTO CADASTRADO COM SUCESSO";
}

public String adicionarCliente(Cliente mCliente){
    if(conCli == maxCli){
        return"NUMERO MAXIMO DE FORNECEDORES JA CADASTRADOS";
    }
    msclientes[conCli]= mCliente;
    conCli++;
    return"FORNECEDOR CADASTRADO COM SUCESSO";
}

public String editarUsuario(Usuario mUsuario, int pos){
    msUsuarios[pos].setNome(mUsuario.getNome());
    msUsuarios[pos].setSnome(mUsuario.getNome());
    msUsuarios[pos].setSenha(mUsuario.getNome());
    msUsuarios[pos].setPerfil(mUsuario.getPerfil());
    
    return"USUARIO EDITADO COM SUCESSO";
}

public String editarProduto(Produto mProduto, int pos){
    msProdutos[pos].setDescricao(mProduto.getDescricao());
    msProdutos[pos].setPreco(mProduto.getPreco());
    msProdutos[pos].setImposto(mProduto.getImposto());
    msProdutos[pos].setAnotacao(mProduto.getAnotacao());
    
    return"PRODUTO EDITADO COM SUCESSO";
}

public String editarCliente(Cliente mCliente, int pos){
    msclientes[pos].setIdcliente(mCliente.getIdcliente());
    msclientes[pos].setNome(mCliente.getNome());
    msclientes[pos].setSnome(mCliente.getSnome());
    msclientes[pos].setEndereco(mCliente.getEndereco());
    msclientes[pos].setTelefone(mCliente.getTelefone());
    msclientes[pos].setIdCidade(mCliente.getIdCidade());
    msclientes[pos].setDNascimento(mCliente.getDNascimento());
    msclientes[pos].setData(mCliente.getData());
    
    return"FORNECEDOR EDITADO COM SUCESSO";
}

public String deletarUsuario(int pos){
    for (int i = pos; i < conUsu -1; i++){
        msUsuarios[i]= msUsuarios[i + 1];
    }
    conUsu--;
    return"USUARIO DELETADO COM SUCESSO";
}

public String deletarProduto(int pos){
    for (int i = pos; i < conPro -1; i++){
        msProdutos[i]= msProdutos[i + 1];
    }
    conPro--;
    return"PRODUTO DELETADO COM SUCESSO";
}

public String deletarCliente(int pos){
    for (int i = pos; i < conCli -1; i++){
        msclientes[i]= msclientes[i + 1];
    }
    conCli--;
    return"FORNECEDOR DELETADO COM SUCESSO";
}

public void salvarTodo(){
    SalvarUsuarios();
    SalvarClientes();
    SalvarProdutos();
    SalvarConfiguracao();
}
public void SalvarUsuarios(){
    FileWriter fw =null;
    PrintWriter pw =null;
    
    try{
        fw= new FileWriter("Dadosbd/usuarios.txt");
        pw= new PrintWriter(fw);
        
        for(int i=0; i< conUsu;i++){
            pw.println(msUsuarios[i].toString());
        }
    }catch(Exception e1){
        e1.printStackTrace();
    }finally{
        try{
            if (fw != null){
                fw.close();
            }
    }catch(Exception e2){
        e2.printStackTrace();
    }       
}
      
}


public void SalvarProdutos(){
FileWriter fw =null;
    PrintWriter pw =null;
    
    try{
        fw= new FileWriter("Dadosbd/produtos.txt");
        pw= new PrintWriter(fw);
        
        for(int i=0; i< conPro;i++){
            pw.println(msProdutos[i].toString());
        }
    }catch(Exception e1){
        e1.printStackTrace();
    }finally{
        try{
            if (fw != null){
                fw.close();
            }
    }catch(Exception e2){
        e2.printStackTrace();
    }       
}
}   
    public void SalvarClientes(){
FileWriter fw =null;
    PrintWriter pw =null;
    
    try{
        fw= new FileWriter("Dadosbd/clientes.txt");
        pw= new PrintWriter(fw);
        
        for(int i=0; i< conCli;i++){
            pw.println(msclientes[i].toString());
        }
    }catch(Exception e1){
        e1.printStackTrace();
    }finally{
        try{
            if (fw != null){
                fw.close();
            }
    }catch(Exception e2){
        e2.printStackTrace();
    }       
}
}
    public void SalvarConfiguracao(){
    FileWriter fw =null;
    PrintWriter pw =null;
    
    try{
        fw= new FileWriter("Dadosbd/configuracao.ini");
        pw= new PrintWriter(fw);
        
            pw.println("[Geral]");
            pw.println("FaturaAtual=" +numFatura);
      
    }catch(Exception e1){
        e1.printStackTrace();
    }finally{
        try{
            if (fw != null){
                fw.close();
            }
    }catch(Exception e2){
        e2.printStackTrace();
    }       
}
      
}


public void preencherUsuarios(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
        arquivo = new File("Dadosbd/usuarios.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        
        int pos;
        String aux;
        String linha;
        String idUsuario;
        String nome;
        String snome;
        String senha;
        int perfil;
        
        while((linha = br.readLine())!=null){
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            idUsuario = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            nome = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            snome = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            senha = aux;
            linha = linha.substring(pos + 1);
            perfil = new Integer(linha);
            
            Usuario mUsuario = new Usuario(idUsuario,
                    nome,
                    snome,
                    senha,
                    perfil);
            msUsuarios[conUsu]= mUsuario;
            conUsu++;
        }
        
    } catch (Exception e1) {
        e1.printStackTrace();
    }finally{
        try {
            if(fr !=null){
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void preencherProdutos(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
        arquivo = new File("Dadosbd/produtos.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        
        int pos;
        String aux;
        String linha;
        
        String idProduto;
        String descricao;
        int preco;
        int imposto;
        String anotacao;
        
        while((linha = br.readLine())!=null){
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            idProduto = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            descricao = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            preco = new Integer(aux);
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            imposto = new Integer(aux);
            linha = linha.substring(pos + 1);
            anotacao = (linha);
            
            Produto mProduto = new Produto(
                    idProduto,
                    descricao,
                    preco,
                    imposto,
                    anotacao);
                    
            msProdutos[conPro]= mProduto;
            conPro++;
        }
        
    } catch (Exception e1) {
        e1.printStackTrace();
    }finally{
        try {
            if(fr !=null){
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

public void preencherClientes(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
        arquivo = new File("Dadosbd/clientes.txt");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        
        int pos;
        String aux;
        String linha;
        String idcliente;
        int idTipo;
        String Nome;
        String Snome;
        String Endereco;
        String Telefone;
        int idCidade;
        Date DNascimento;
        Date Data;
        
        while((linha = br.readLine())!=null){
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            idcliente = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            idTipo = new Integer(aux);
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            Nome = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            Snome = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            Endereco = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            Telefone = aux;
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            idCidade = new Integer(aux);
            linha = linha.substring(pos + 1);
            
            pos = linha.indexOf('|');
            aux = linha.substring(0,pos);
            DNascimento = Utilidades.StringtoDate(aux);
            linha = linha.substring(pos + 1);
            
            
            Data = Utilidades.StringtoDate(aux);
            
            Cliente mCliente = new Cliente(
                    idcliente,
                    idTipo,
                    Nome,
                    Snome,
                    Endereco,
                    Telefone,
                    idCidade,
                    DNascimento,
                    Data);
            msclientes[conCli]= mCliente;
            conCli++;
        }
        
    } catch (Exception e1) {
        e1.printStackTrace();
    }finally{
        try {
            if(fr !=null){
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
public void preencherConfiguracao(){
    File arquivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    try {
        arquivo = new File("Dadosbd/configuracao.ini");
        fr = new FileReader(arquivo);
        br = new BufferedReader(fr);
        
       
        String linha;
        
        while((linha = br.readLine())!=null){
        if (linha.startsWith("VendaAtual=")){
            numFatura = new Integer(linha.substring(12));
        }    

        }      
        
    } catch (Exception e1) {
        e1.printStackTrace();
    }finally{
        try {
            if(fr !=null){
                fr.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

    public void setNumeroFatura(int numFatura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    

    
}


   

   

    
      



    

  
