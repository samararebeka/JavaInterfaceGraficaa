/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classemusic;
import java.util.Scanner;

public class Musicaa {
    
    
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
       
        
        RepositorioMusicas musicas = new RepositorioMusicas();
        SingleClassif classif1 = new SingleClassif();
        ExtendedPlayClassif classif2 = new ExtendedPlayClassif();
        LongPlayClassif classif3 = new LongPlayClassif();      
        
        
        
        String GraNome, GraPais,  Incantor, Inpais;
        String ComNom, ComPais, lancam, Indatanasc, ComDataN, Grafundacao;
        String NomMus, EstiMusic, AlbMusic, AltMusic, Tipolan, SN;
        int  cont=0, indMusic, contr, number;
        double duracao; 
        
        
        do{
        System.out.println("\nDigite nome da musica: ");
        NomMus = entrada.next();
       
        
        
        System.out.println("\nNome da gravadora: ");
        GraNome = entrada.next();
        System.out.println("Pais de fundacao: ");
        GraPais = entrada.next();
        System.out.println("Ano de fundacao: ");
        Grafundacao = entrada.next();
        
        
        System.out.println("\nNome do Interprete:  ");
        Incantor = entrada.next();
        System.out.println("Pais de Nascimento : ");
        Inpais = entrada.next();
        System.out.println("Ano de Nascimento: ");
        Indatanasc = entrada.next();
        
        System.out.println("\nNome do Compositor:  ");
        ComNom = entrada.next();
        System.out.println("Pais de Nascimento : ");
        ComPais = entrada.next();
        System.out.println("Ano de Nascimento: ");
        ComDataN = entrada.next();
        
        System.out.println("Tipo de lancamento: ");
        Tipolan = entrada.next();
        System.out.println("Estilo da musica: ");
        EstiMusic = entrada.next();
        System.out.println("Album: ");
        AlbMusic = entrada.next();
        System.out.println("Lancamento: ");
        lancam = entrada.next();
        
        do{
            System.out.println("Duracao: ");
            duracao = entrada.nextDouble();
        
       
            if(duracao>0){
                contr=0;
            }else{
                contr=1;
                System.out.println("ERRO! DIGITE NUMEROS ACIMA DE 0");
            }
        }while(contr==1);
        
        
        Interprete cantor = new Interprete(Incantor, Inpais, Indatanasc);
        Compositores compos = new Compositores(ComNom, ComPais, ComDataN);
        Gravadora Grav = new Gravadora(GraNome, GraPais, Grafundacao);
        Lancamento lancamento = new Lancamento(lancam, Tipolan, cantor, EstiMusic, AlbMusic, duracao,Grav);
        ClasseMusic musica = new ClasseMusic( lancamento, compos, NomMus);        
        
        musicas.inserir(musica);
        
        cont++;
        }while(cont!=10);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        do{
            System.out.println("\nDeseja procurar alguma musica?\n S=para sim\n N= para nao\n");
            SN=entrada.next();
            if(SN.equals("S")|| SN.equals("s") ||SN.equals("N")|| SN.equals("n")){
                contr=0;
            }else{
                System.out.println("\nERRO! DIGITE APENAS S OU N");
                contr=1;
            }
        }while(contr==1);
        
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da musica: \n");
        AltMusic = entrada.next();
        musicas.ConsultaMusica(AltMusic);    
         }  
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        do{
            System.out.println("\nDeseja remover alguma musica?\n S=para sim\n N= para nao\n");
            SN=entrada.next();
            if(SN.equals("S")|| SN.equals("s") ||SN.equals("N")|| SN.equals("n")){
                contr=0;
            }else{
                System.out.println("\nERRO! DIGITE APENAS S OU N");
                contr=1;
            }
        }while(contr==1);
        
        if(SN.equals("S")|| SN.equals("s")){ 
        System.out.println("\nDigite o nome da musica: \n");
        AltMusic = entrada.next();
        musicas.remover(AltMusic);
        System.out.println("\nMusica deletada \n");
        musicas.print();    
        } 
        
           
        System.out.println("\nInsira uma nova musica a seguir\n");

        System.out.println("\nDigite nome da musica: ");
        NomMus = entrada.next();

        System.out.println("\nNome da gravadora: ");
        GraNome = entrada.next();
        System.out.println("Pais de fundacao: ");
        GraPais = entrada.next();
        System.out.println("Ano de fundacao: ");
        Grafundacao = entrada.next();
        
        
        System.out.println("\nNome do Interprete:  ");
        Incantor = entrada.next();
        System.out.println("Pais de Nascimento : ");
        Inpais = entrada.next();
        System.out.println("Ano de Nascimento: ");
        Indatanasc = entrada.next();
        
        System.out.println("\nNome do Compositor:  ");
        ComNom = entrada.next();
        System.out.println("Pais de Nascimento : ");
        ComPais = entrada.next();
        System.out.println("Ano de Nascimento: ");
        ComDataN = entrada.next();
        
        System.out.println("Tipo de lancamento: ");
        Tipolan = entrada.next();
        System.out.println("Estilo da musica: ");
        EstiMusic = entrada.next();
        System.out.println("Album: ");
        AlbMusic = entrada.next();
        System.out.println("Lancamento: ");
        lancam = entrada.next();
        
        do{
            System.out.println("Duracao: ");
            duracao = entrada.nextDouble();
        
       
            if(duracao>0){
                contr=0;
            }else{
                contr=1;
                System.out.println("ERRO! DIGITE NUMEROS ACIMA DE 0");
            }
        }while(contr==1);
        Interprete cantor = new Interprete(Incantor, Inpais, Indatanasc);
        Compositores compos = new Compositores(ComNom, ComPais, ComDataN);
        Gravadora Grav = new Gravadora(GraNome, GraPais, Grafundacao);
        Lancamento lancamento = new Lancamento(lancam, Tipolan, cantor, EstiMusic, AlbMusic, duracao,Grav);
        ClasseMusic musica = new ClasseMusic( lancamento, compos, NomMus);        
        
        musicas.inserir(musica);
        musicas.print();
        
            
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        do{
            System.out.println("\nDeseja alterar alguma musica?\n S=para sim\n N= para nao\n");
            SN=entrada.next();
            if(SN.equals("S")|| SN.equals("s") ||SN.equals("N")|| SN.equals("n")){
                contr=0;
            }else{
                System.out.println("\nERRO! DIGITE APENAS S OU N");
                contr=1;
            }
        }while(contr==1);
        
        if(SN.equals("S")|| SN.equals("s")){ 
        musicas.print();
        System.out.println("\nO numero da musica que quer alterar: \n");
        indMusic = entrada.nextInt(); 
        musicas.alterarMusica(indMusic-1);                
        
         

       }
   System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        System.out.println("Digite que tipo de play list deseja:");
        opcoes();
        
        do{
            System.out.println("\nDigite de 1 a 3");
            number=entrada.nextInt();
            if(number>0 && number <=3){
                contr=0;
            }else{
                System.out.println("\nERRO!Numero invalido!");
                contr=1;
            }

        }while(contr==1);
         if(number>0 && number <=3){
             
        switch(number){
        case 1:classif1.classificaLancamento(musicas.classemusic);break;
        case 2:classif2.classificaLancamento(musicas.classemusic);break;
        case 3:classif3.classificaLancamento(musicas.classemusic);break;
          }
       }
        
        //clasf.classificaLancamento(completo);
        
    }
    public static void opcoes(){

            System.out.println("1 - Single (1 a 3 faixas)");
            System.out.println("2 - Extend Play (4 a 6 faixas)");
            System.out.println("3 - Long Play (7 ou mais faixas)");
    }
  }
