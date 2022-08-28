/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

/**
 *
 * @author Administrator
 */
public class SingleClassif implements Classificar{

    public SingleClassif() {
    }

    
 
    @Override
    public void classificaLancamento(ClasseMusic[] completo) {
        double[] compare=new double[3];
        int cont, cont1=0, k=0, l=0;
        
       
        for(int i=0; i<completo.length; i++){
            if(completo[i].getLancamento().getDuração()<=600.0 &&cont1<3){      
                compare[k]=completo[i].getLancamento().getDuração();    
                    cont1++;
                      k++;
                      if(k==2){
                    i=completo.length;
                }
            }
        }
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\n\nEsta eh a sua play list single:");
        for(int i=0; i<completo.length; i++){
            cont=0;
            if(l<3){
                for(int j=0; j<3; j++){ 
                    if(completo[i].getLancamento().getDuração()==compare[j]){
                        if(cont==0){
                       
                        System.out.println("\nMusica: " + completo[i].getNomeMusica()+", duracao: "+ compare[j] +" s\n");
                        cont=1;
                        l++;
                
                        }                    
                    }
                }
            }
        }
    }
}
