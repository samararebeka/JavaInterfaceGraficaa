/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import Negocio.Musica;
import java.util.ArrayList;



public class ControlaMusica {
    
   
private ArrayList<Musica> musica = new ArrayList<>();


 //private  ArrayList<Musica> musica = new ArrayList<>();
    
    public boolean salvar (Musica a){
        if (a != null){
            musica.add(a);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Musica> retornaTodos(){
        return musica;
    }
 
    
  
  public void remove (Musica c) {
     
        musica.remove(c);/*Índice do jogador que você selecionar através da interface.*/   
 
    }
 
   public void procurar(int select){
       
      musica.get(select);
  
   }

   public Musica Buscar(int select){
       
      return musica.get(select);
   } 
  
  
   
//    public ArrayList<Musica> remove(String nomeMusic) {
//        if(musica)
//        musica.remove(posicao);
//     return musica;
//  }
   
    
}
