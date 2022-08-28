/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

/**
 *
 * @author Administrator
 */
public class LongPlayClassif implements Classificar{

    public LongPlayClassif() {
    }
    

    public void classificaLancamento(ClasseMusic[] completo) {
        
        double[] compare=new double[completo.length];
        double totcompare=0;
	int cont=0, i=0, cont1;
        do{
            compare[i] = completo[i].getLancamento().getDuração();
            totcompare = compare[i];
            cont++; 
            i++;
        }while(totcompare<1800.0 ||i!=completo.length);    
	for(int l=cont; l<completo.length; l++){
            compare[i] = completo[i].getLancamento().getDuração();
            totcompare = compare[i];
        }
  System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println("\n\nEsta eh a sua play list Long Play:");
 	if(cont>=7 &&totcompare>1800.0){
            for(int k=0; k<completo.length; k++){
                cont1=0;
                for(int j=0; j<completo.length; j++){
                    if(completo[k].getLancamento().getDuração()==compare[j]){
                        if(cont1==0){
                        System.out.println("\nMusica: " + completo[k].getNomeMusica()+", duracao "+ compare[j] +" s\n");
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
