/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;


public class Lancamento {
   String anolancamento;
   String tipolancamento;
   Interprete interprete;
   String estilomus;
   String album;
   double duração;
   Gravadora gravadora;

    public Lancamento(String anolancamento, String tipolancamento, Interprete interprete, String estilomus, String album, double duração, Gravadora gravadora) {
        this.anolancamento = anolancamento;
        this.tipolancamento = tipolancamento;
        this.interprete = interprete;
        this.estilomus = estilomus;
        this.album = album;
        this.duração = duração;
        this.gravadora = gravadora;
    }

    public String getAnolancamento() {
        return anolancamento;
    }

    public void setAnolancamento(String anolancamento) {
        this.anolancamento = anolancamento;
    }

    public String getTipolancamento() {
        return tipolancamento;
    }

    public void setTipolancamento(String tipolancamento) {
        this.tipolancamento = tipolancamento;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
    }

    public String getEstilomus() {
        return estilomus;
    }

    public void setEstilomus(String estilomus) {
        this.estilomus = estilomus;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuração() {
        return duração;
    }

    public void setDuração(double duração) {
        this.duração = duração;
    }

    public Gravadora getGravadora() {
        return gravadora;
    }

    public void setGravadora(Gravadora gravadora) {
        this.gravadora = gravadora;
    }

}
        

