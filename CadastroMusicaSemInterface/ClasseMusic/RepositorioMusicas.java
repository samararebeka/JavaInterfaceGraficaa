/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class RepositorioMusicas {
    final ClasseMusic[] classemusic;
    private int indice;
    private final static int MAX = 10;
    int n;
    int p;
    String a;

    
    public RepositorioMusicas(){
        indice = 0;
        classemusic = new ClasseMusic[MAX];
    }
    
    
 //Estrutura Inserir Musica

     public void inserir(ClasseMusic a){
         classemusic[indice] = a;
        indice++;
     }  
     
    
     
     
//Estrutura Remover Musica

     public void remover(String musica){
         for(int i=0; i<indice; i++){
             if(classemusic[i].getNomeMusica().equals(musica)){
                classemusic[i] = classemusic[indice-1];
                classemusic[indice-1] = null;
                indice--;
           }   
         }
       }
    
     
     
//Estrutura Procurar Musica
     
     public ClasseMusic procurarMusica(String musica){
         ClasseMusic temp = null;
           for(int i=0; i<indice; i++){
             if(classemusic[i].getNomeMusica().equals(musica)){
                 temp = classemusic[i];
                 break;
            }
        }if(temp == null){
                if(n==0){
             System.out.println("\nMUSICA NAO ENCONTRADA!!!!\n");
         }
        } else {
         System.out.println("\nMUSICA ENCONTRADA!!!\n A musica encontrada foi: " +musica + "\n"  );

         }
         return temp;
     }
     
     
  
   
           
           
 //Estrutura imprimir Musica

     public void print(){
         for(int i=0; i<indice; i++){
            
            System.out.println("############################################################################################################################################################################");
            if(i==0){
               p=i+1; 
               System.out.println("Musica: "+ p);
            }
            else{
                p++;
                System.out.println("Musica: "+ p);
            }
            System.out.println("Nome da musica: "+ classemusic[i].getNomeMusica());            
            System.out.println("Estilo: "+ classemusic[i].getLancamento().getEstilomus());
            System.out.println("Lancamento: "+ classemusic[i].getLancamento().getAnolancamento());
            System.out.println("Album: "+ classemusic[i].getLancamento().getAlbum());
            System.out.println("Tipo de Lancamento: "+ classemusic[i].getLancamento().getTipolancamento());
            System.out.println("Duracao: "+ classemusic[i].getLancamento().getDuração());


            
            System.out.println("Compositor: "+ classemusic[i].getCompositor().getNome());
            System.out.println("Data Nascimento: "+ classemusic[i].getCompositor().getAno());
            System.out.println("Pais: "+ classemusic[i].getCompositor().pais);

            System.out.println("Cantor: "+ classemusic[i].getLancamento().getInterprete().getNome());
            System.out.println("Data de Nascimento: "+classemusic[i].getLancamento().getInterprete().getAno());
            System.out.println("Pais: "+ classemusic[i].getLancamento().getInterprete().getPais());
            
            System.out.println("\nGravadora: "+classemusic[i].getLancamento().getGravadora().getNome());
            System.out.println("Pais de fundacao: "+ classemusic[i].getLancamento().getGravadora().getPais());
            System.out.println("Ano de Fundacao: "+ classemusic[i].getLancamento().getGravadora().getAno()+"\n");
            


        }   
    }
     
     
     
        public void opcoes(){
     System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

            System.out.println("1 - Nome da musica");
            System.out.println("2 - Estilo");
            System.out.println("3 - Ano de Lancamento");
            System.out.println("4 - Tipo de Lancamento");
            System.out.println("5 - Compositor");
            System.out.println("6 - Data de Nascimento do compositor");
            System.out.println("7 - Pais do compositor");
            System.out.println("8 - Cantor");
            System.out.println("9 - Data de Nascimento do Cantor");
            System.out.println("10 - Pais do cantor");
            System.out.println("11 - Gravadora");
            System.out.println("12 - Pais de fundacao");
            System.out.println("13 - Ano de Fundacao");
            System.out.println("14- Duracao");
            System.out.println("15 - Album");


            
     System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
     
            
        }
        
       
        public void alterarMusica( int i){
             Scanner entrada = new Scanner (System.in);
             int contr;

       //  remover(tempAlterar.getNomeMusica());
         
         System.out.println("\nO que deseja alterar?\n");
         opcoes();
             
         int opc =  entrada.nextInt();
            switch(opc){
                case 1: System.out.println("\nDigite um novo nome para a música: ");
                        String newNome = entrada.next();                    
                        classemusic[i].nomeMusica=newNome; break;
                        
                case 2: System.out.println("\nDigite um novo estilo da música: ");
                        String estilo = entrada.next();         
                        classemusic[i].getLancamento().estilomus=estilo; break;
                        
                case 3: System.out.println("\nDigite um novo ano de Lancamento para a música: ");
                        String lanca = entrada.next(); 
                        classemusic[i].getLancamento().anolancamento=lanca; break;
                        
                case 4: System.out.println("\nDigite um novo Compositor para a música: ");
                        String Compositor = entrada.next();                      
                        classemusic[i].getCompositor().nome=Compositor; break;
                        
                case 5: System.out.println("\nDigite uma nova data de Nascimento do compositor: ");
                        String datacomp = entrada.next();                       
                        classemusic[i].getCompositor().ano=datacomp; break;
                        
                case 6: System.out.println("\nDigite o novo pais do compositor: ");
                        String paiscomp = entrada.next();                      
                        classemusic[i].getCompositor().pais=paiscomp; break;   
                        
                case 7: System.out.println("\nDigite um novo nome para o cantor: ");
                        String cantor = entrada.next();                      
                        classemusic[i].getLancamento().getInterprete().nome=cantor; break;   
                        
                case 8: System.out.println("\nDigite uma nova data de nascimento para o cantor: ");
                        String datacantor= entrada.next();                      
                        classemusic[i].getLancamento().getInterprete().ano=datacantor; break; 
                        
                case 9: System.out.println("\nDigite um novo pais para o cantor: ");
                        String paiscantor = entrada.next();                       
                        classemusic[i].getLancamento().getInterprete().pais=paiscantor; break;  
                        
                case 10: System.out.println("\nDigite um nova gravadora para a música: ");
                        String grav= entrada.next();                      
                        classemusic[i].getLancamento().getGravadora().nome=grav; break;
                        
                case 12: System.out.println("\nDigite um novo pais de fundacao para a gravadora: ");
                        String paisgrav = entrada.next();                      
                        classemusic[i].getLancamento().getGravadora().pais=paisgrav; break;
                        
                case 13: System.out.println("\nDigite um novo ano de fundacao para a gravadora: ");
                        String anograv = entrada.next();                      
                        classemusic[i].getLancamento().getGravadora().ano=anograv; break;
                        
                case 14:
                                           
                    do{     
                        System.out.println("\nDigite um novo numero de duracao para a musica: ");
                        double duracao = entrada.nextDouble(); 
                        if(duracao>0){
                            classemusic[i].getLancamento().duração=duracao;
                             contr=0;
                        }else{
                            contr=1;
                            System.out.println("ERRO! DIGITE NUMEROS ACIMA DE 0");
                        }
                    }while(contr==1); break;
                        
                case 15: System.out.println("\nDigite um novo album: ");
                        String album = entrada.next();
                        classemusic[i].getLancamento().album=album; break;
            }
            System.out.println("\nMusica alterada com sucesso!!! \n");
            printf(i);
     
        }       
      public void ConsultaMusica(String musica){
            ClasseMusic temp = null;
            int s=0;
            for(int i=0; i<indice; i++){
            if(classemusic[i].getNomeMusica().equals(musica)){
                 temp = classemusic[i];
                 s=i;
                 break;
            }
        }if(temp == null){
            System.out.println("\nMUSICA NAO ENCONTRADA!!!!\n");
            
         
        } else {
            System.out.println("\nMUSICA ENCONTRADA!!!\n");
            printf(s);

         }
         
     }
      public void printf(int s){
            System.out.println("Nome da musica: "+ classemusic[s].getNomeMusica());            
            System.out.println("Estilo: "+ classemusic[s].getLancamento().getEstilomus());
            System.out.println("Lancamento: "+ classemusic[s].getLancamento().getAnolancamento());
            System.out.println("Album: "+ classemusic[s].getLancamento().getAlbum());
            System.out.println("Tipo de Lancamento: "+ classemusic[s].getLancamento().getTipolancamento());
            System.out.println("Duracao: "+ classemusic[s].getLancamento().getDuração());


            
            System.out.println("Compositor: "+ classemusic[s].getCompositor().getNome());
            System.out.println("Data Nascimento: "+ classemusic[s].getCompositor().getAno());
            System.out.println("Pais: "+ classemusic[s].getCompositor().pais);

            System.out.println("Cantor: "+ classemusic[s].getLancamento().getInterprete().getNome());
            System.out.println("Data de Nascimento: "+classemusic[s].getLancamento().getInterprete().getAno());
            System.out.println("Pais: "+ classemusic[s].getLancamento().getInterprete().getPais());
            
            System.out.println("\nGravadora: "+classemusic[s].getLancamento().getGravadora().getNome());
            System.out.println("Pais de fundacao: "+ classemusic[s].getLancamento().getGravadora().getPais());
            System.out.println("Ano de Fundacao: "+ classemusic[s].getLancamento().getGravadora().getAno()+"\n");

      }
     
} 

    