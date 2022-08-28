/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

public class Lancamento {
   private String anolancamento;
   private String tipolancamento;
   private String estilomus;
   private String album;
   private String duração;
   private Gravadora gravadora;
   private Interprete interprete;

    public Lancamento(String anolancamento, String tipolancamento, String estilomus, String album, String duração, Gravadora gravadora, Interprete interprete) {
        this.anolancamento = anolancamento;
        this.tipolancamento = tipolancamento;
        this.estilomus = estilomus;
        this.album = album;
        this.duração = duração;
        this.gravadora = gravadora;
        this.interprete = interprete;
    }

    public Interprete getInterprete() {
        return interprete;
    }

    public void setInterprete(Interprete interprete) {
        this.interprete = interprete;
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

    public String getEstilomus() {
        return estilomus;
    }

    public void setEstilomus(String estilomusic) {
        this.estilomus = estilomusic;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getDuração() {
        return duração;
    }

    public void setDuração(String duração) {
        this.duração = duração;
    }

    public Gravadora getGravadora() {
        return gravadora;
    }

    public void setGravadora(Gravadora gravadora) {
        this.gravadora = gravadora;
    }
  

}
        

