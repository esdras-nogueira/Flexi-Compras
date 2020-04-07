
package Classes;


public class Usuario {
    private String idUsuario;
    private String nome;
    private String snome;
    private String senha;
    private int perfil;

    public Usuario(String idUsuario, String nome, String snome, String senha, int perfil) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.snome = snome;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }
    
    @Override
    public String toString(){
        return idUsuario +"|"
                
               +nome +"|"
               +snome +"|"        
               +senha +"|" 
               +perfil;       
    }
}

