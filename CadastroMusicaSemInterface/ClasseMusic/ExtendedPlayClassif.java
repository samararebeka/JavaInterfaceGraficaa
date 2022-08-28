/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

/**
 *
 * @author Administrator
 */
public class ExtendedPlayClassif implements Classificar {

    public ExtendedPlayClassif() {
    }
    
    
    public void classificaLancamento(ClasseMusic[] completo) {
        double[] compare=new double[6];
        double totcompare=0;
	int cont=0, cont1;
        for(int i=0; i<completo.length; i++){	
            if(totcompare<1800.0 &&cont<=6){
                compare[i] = completo[i].getLancamento().getDuração();
                totcompare = compare[i];
		cont++;
            }else {
		break;
            }	   
	}
 System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("\n\nEsta eh a sua play list Extended Play:");
 	if(cont>=4 &&cont<=6){
            for(int i=0; i<completo.length; i++){
               cont1=0;

                for(int j=0; j<6; j++){
                    
                    if(completo[i].getLancamento().getDuração()==compare[j]){
                        if(cont1==0){
                        System.out.println("\nMusica: " + completo[i].getNomeMusica()+", duracao "+ compare[j] +" s\n");
                        cont1=1;
                        }   
                    }
                }
            }    
        }else{
            System.out.println("Faixas insuficientes para completar a seleção Extended Play!\n");
           
        }
        
    }
}
