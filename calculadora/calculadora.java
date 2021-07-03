import java.util.InputMismatchException;
import java.util.Scanner;

public class calculadora {

/* 	Calculadora de alcance de anuncio online desenvolvido em Java no Eclipse
 	Autor: Vera Ueda 
 	Versao: 1.0 - 01/07/2021 */

/*
Teste
Pessoa 1 = p1
Pessoa 2 = p2
Pessoa 3 = p3
Pessoa 4 = p4

Para R$ 1,00 investido -> = vi = 1

Vizualizacoes
p1 = 30*vi = 30*1 = 30
p2 = p1*12/100*3/20*40 = 30(18/25) = 30*0,72 = 21,60
p3 = p2*12/100*3/20*40 = 21,60*0,72 = 15,552
p4 = p3*12/100*3/20*40 = 15,552*0,72 = 11,19744

Visualizacoes = p1 + p2 + p3 + p4
Visualizacoes = 30 + 21,60 +15,552 + 11,19744
Visualizacoes = 78,34974 (aproximadamente 78)   */

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);		
	    double valorInvestido, numVisualizacoes; 
	    
	    /* Trata o erro se digitar um valor que nao seja correto */
	    try {
	    
	    /* Solicita que digite o valor investido em Reais */
	    System.out.print("Digite o valor investido em R$: ");
	    valorInvestido = valor.nextDouble();
	    
	    /* Formula:
		valorInvestido = R$ reais investidos
		cv = coeficiente de visualizacoes -> 12/100 * 3/20 * 40 = 18/25 = 0,72 */
	    
	    
	    /*Formula Geral
	    numVisualizacoes = (valorInvestido*30) + (valorInvestido*30*(cv)) + (valorInvestido*30*(cv*cv) + (valorInvestido*30*(cv*cv*cv) */
	    /* Calcula o numero de visualizacoes*/
	    numVisualizacoes = (valorInvestido * 30) + 
				   (valorInvestido * 30 * 0.72) + 
				   (valorInvestido * 30 * (0.72 * 0.72)) + 
				   (valorInvestido * 30 * (0.72 * 0.72 * 0.72));
 
	    /* Imprime a projecao da quant. maxima de pessoas no console */
	    System.out.println();
	    System.out.printf("A quantidade maxima de pessoas que visualizarao o mesmo anuncio sera de : %.0f %n", numVisualizacoes);
	    valor.close();        
	    }
	    /* Se digitar um valor com (.) na casa decimal, sai por erro */
	    catch (InputMismatchException inputMismatchException) {
	    	System.out.println("Digite o valor com a virgula para casa decimal.");
	    }
	}
}
