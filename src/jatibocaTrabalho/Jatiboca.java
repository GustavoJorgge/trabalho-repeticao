package jatibocaTrabalho;
import java.util.Scanner;

public class Jatiboca {
	public static void main(String[]args) {
		
		double estoqueJati;
		double estoquePontal;
		double auxEntrada,auxRetirada, auxTransfer;		
		int opc = 0; //variavel para controlar o switch;
		int i=0; //varialvel para controlar a estrutura de repetição;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.printf("Entre com seu nome de usuario:");
		nome = ler.nextLine();
		
		System.out.printf("Ola! Bom dia, %s!\n", nome);
		
		System.out.printf("Favor entrar com a quantidade de estoque inicial em Jatiboca:");
		estoqueJati = ler.nextInt();
		System.out.printf("Favor entrar com a quantidade de estoque inicial em Pontal:");
		estoquePontal = ler.nextInt();
		
		if(estoqueJati>=0 && estoquePontal>=0) {		
			for(i=0 ; opc!=5 ; i++) {				
				opc=0;			
				System.out.printf("O que deseja fazer:\n");
				System.out.printf("1 - Entrada de Produto no Estoque\n");
				System.out.printf("2 - Retirada de Produto no Estoque\n");
				System.out.printf("3 - Transferencia de Estoque\n");
				System.out.printf("4 - Consultar Estoque\n");
				System.out.printf("5 - Finalizar\n");
				System.out.printf("Opção:");
				opc = ler.nextInt();
				
				switch(opc) {
					
				//primeira opção -> ADICIONANDO NO ESTOQUE
					case 1:								
						System.out.printf("--------------------ENTRADA-----------------\n");
						System.out.printf("\nQual empresa:\n");
						System.out.printf("1 - Jatiboca \n");
						System.out.printf("2 - Pontal\n");
						System.out.printf("Opção:");
						opc=ler.nextInt();
						
						//estrutura condicional para ler opção 
						if(opc==1) {													
							System.out.printf("\nQual a quantidade de entrada de açucar em Jatiboca?\n");
							System.out.printf("Quantidade:");
							auxEntrada = ler.nextDouble();
							estoqueJati = estoqueJati + auxEntrada;
							System.out.printf("\nEstoque Atualizado em Jatiboca!!\n");
							System.out.printf("Estoque anterior: %.2fkg\n",estoqueJati-auxEntrada);
							System.out.printf("Estoque atual: %.2fkg\n",estoqueJati);
							System.out.printf("-----------------------------------------\n");							
							opc=0;
							break;						
								
						}else if(opc==2) {						
							System.out.printf("\nQual a quantidade de entrada de açucar na Pontal?\n");
							System.out.printf("Quantidade:");
							auxEntrada = ler.nextDouble();
							estoquePontal = estoquePontal + auxEntrada;
							System.out.printf("\nEstoque Atualizado na Pontal!!\n");
							System.out.printf("Estoque anterior: %.2fkg\n",estoquePontal-auxEntrada);
							System.out.printf("Estoque atual: %.2fkg\n",estoquePontal);
							System.out.printf("-----------------------------------------\n");
							opc=0;
							break;
								
						}else {
							System.out.printf("OPÇÃO INVALIDA!!\n");
							System.out.printf("-----------------------------------------\n");
							break;
						}	
						
					//segunda opção -> RETIRANDO DO ESTOQUE
					case 2:					
						
						System.out.printf("\n----------------RETIRADA:------------------\n");
						System.out.printf("Qual empresa:\n");
						System.out.printf("1 - Jatiboca \n");
						System.out.printf("2 - Pontal\n");
						System.out.printf("Opção:");
						opc=ler.nextInt();
						//estrutura condicional para ler opção 
						if(opc==1) {							
							System.out.printf("\nQual a quantidade de retirada de açucar na Jatiboca?\n");
							System.out.printf("Quantidade:");
							auxRetirada = ler.nextDouble();
							
							if(auxRetirada<=estoqueJati) {
								estoqueJati = estoqueJati - auxRetirada;
								System.out.printf("\nEstoque Atualizado na Jatiboca!!\n");
								System.out.printf("Estoque anterior: %.2fkg\n",estoqueJati+auxRetirada);
								System.out.printf("Estoque atual: %.2fkg\n",estoqueJati);
								System.out.printf("-----------------------------------------\n");
								opc=0;
								break;
							}else {
								System.out.printf("Não sera possivel, há no estoque %.2fkg disponivel\n",estoqueJati);
								System.out.printf("-----------------------------------------\n");
								opc=0;
								break;
							}
						}else if(opc==2) {
							
							System.out.printf("\nQual a quantidade de retirada de açucar na Pontal?\n");
							System.out.printf("Quantidade:");
							auxRetirada = ler.nextDouble();
							
							if(auxRetirada<=estoquePontal) {
								estoquePontal = estoquePontal - auxRetirada;
								System.out.printf("\nEstoque Atualizado na Filial!!\n");
								System.out.printf("Estoque anterior: %.2fkg\n",estoquePontal+auxRetirada);
								System.out.printf("Estoque atual: %.2fkg\n",estoquePontal);
								System.out.printf("-----------------------------------------\n");
								opc=0;
								break;
							}else {
								System.out.printf("Não sera possivel, há no estoque %.2fkg disponivel\n",estoquePontal);
								System.out.printf("-----------------------------------------\n");
								opc=0;
								break;
							}
							
						}else{
							System.out.printf("OPÇÃO INVALIDA!!\n");
							System.out.printf("-----------------------------------------\n");
							break;
						}	
					
					//terceira opção - TRANSFERENCIA DE UM ESTOQUE AO OUTRO
					case 3:
						
						System.out.printf("\n---------------TRANSFERENCIA----------------\n");
						System.out.printf("Qual seria a transferencia?\n");
						System.out.printf("1 - Jatiboca >> Pontal\n");
						System.out.printf("2 - Pontal>>Jatibola\n");
						System.out.printf("Opção:");
						opc = ler.nextInt();
						
						if(opc==1) {
							System.out.printf("Quantidade que deseja transferir de Jatiboca para Pontal:");
							auxTransfer = ler.nextDouble();
							
							estoqueJati -= auxTransfer;
							estoquePontal += auxTransfer;
							
							System.out.printf("\nTransferencia Realizada!!\n");
							System.out.printf("Estoque atualizado Jatiboca: %.2fkg\n",estoqueJati);
							System.out.printf("Estoque atualizado Pontal: %.2fkg\n",estoquePontal);
							System.out.printf("-----------------------------------------\n");
							opc=0;
							break;
						}else if(opc==2){
							System.out.printf("Quantidade que deseja transferir de Pontal para Jatiboca:");
							auxTransfer = ler.nextDouble();
							
							estoquePontal -= auxTransfer;
							estoqueJati += auxTransfer;
							
							System.out.printf("\nTransferencia Realizada!!\n");
							System.out.printf("Estoque atualizado Jatiboca: %.2fkg\n",estoqueJati);
							System.out.printf("Estoque atualizado Pontal: %.2fkg\n",estoquePontal);
							System.out.printf("-----------------------------------------\n");
							opc=0;
							break;
						}else {
							System.out.printf("OPÇÃO INVALIDA!!!\n);");
							System.out.printf("-----------------------------------------\n");
							break;						
						}
					
					case 4:
						System.out.printf("\n----------------ESTOQUE------------------\n");
						System.out.printf("Quantidade em estoque Jatiboca: %.2fkg\n",estoqueJati);
						System.out.printf("Quantidade em estoque Pontal: %.2fkg\n",estoquePontal);
						System.out.printf("-----------------------------------------\n");
						opc=0;
						break;
					
					case 5:
						System.out.printf("\nFINALIZAR\n");
						System.out.printf("Bom dia, %s! Bom trabalho!!\n",nome);
						
				}//chave switch
				
			}//chave laço for
		}else{//chave if inicial
			System.out.printf("Não podemos continuar o procedimento, pois o estoque não pode ser negativo");
		}
	}//chave publica
}//chave da classe