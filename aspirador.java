/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arno;

/**
 *
 * @author Aluno
 */
public class Arno{
    
/*
    definição dos atributos 
    */    
boolean status = false;
int linha;
int coluna;
int [][] comodo =  {{0, 0, 1},
                    {1, 1, 0},
                    {0, 0, 1},    
};
    
 
    /*
    definição dos metodos
    */
public void Arno(){
    
}   
public void ligar(){

    System.out.println("Aspirador ligado");
this.status = true;    
}    
public void verifica_sujeira(){

    this.mapa_matriz(); 
        
    
    
for (this.linha=0;this.linha<3;this.linha++){    
for (this.coluna=0;this.coluna<3;this.coluna++ )  {
   
if (comodo[this.linha][this.coluna]==1){
    System.out.println("Sujo");
this.aspira_sujeira(this.coluna, this.linha);
}

}}
  
}
public void aspira_sujeira(int coluna, int linha){
    System.out.println("Limpando");
comodo[linha][coluna]=0;  
    System.out.println("depois que aspirou");
for (this.linha=0;this.linha<3;this.linha++){    
for (this.coluna=0;this.coluna<3;this.coluna++ )  {
    System.out.println(comodo[this.linha][this.coluna]);
if (comodo[this.linha][this.coluna]==1){
    System.out.println("Sujo");
this.aspira_sujeira(this.coluna, this.linha);
}
}
}
}
public void verifica_obstaculo(){
    
}    
public void desligar(){
    System.out.println("Aspirador desligado");    
this.status = false;

}    
public void mapa_matriz(){
    System.out.println("Imprimindo mapa");    
  for (this.linha=0;this.linha<3;this.linha++){    
for (this.coluna=0;this.coluna<3;this.coluna++ )  {
    System.out.println(comodo[this.linha][this.coluna]); 
}}
}

    public static void main(String[] args){
Arno a = new Arno();  
a.verifica_sujeira();       
    }
}
