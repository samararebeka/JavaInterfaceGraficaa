 
package classemusic;


public class ClasseMusic  {
    Lancamento lancamento;
    Compositores compositor;
    String nomeMusica;

    public ClasseMusic(Lancamento lancamento, Compositores compositor, String nomeMusica) {
        this.lancamento = lancamento;
        this.compositor = compositor;
        this.nomeMusica = nomeMusica;
    }

    public Lancamento getLancamento() {
        return lancamento;
    }

    public void setLancamento(Lancamento lancamento) {
        this.lancamento = lancamento;
    }

    public Compositores getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositores compositor) {
        this.compositor = compositor;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }
    
    
    
}
    
    