package ProjetoConversordeMoedas;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import cores.util.Cores;

public class Projeto_conversor_v1_1 {

	public static void main(String[] args) {
		
		int op, opInicial;
		int realConvert, yuanConvert, rupiaConvert, rubloConvert, randConvert;
		Scanner leia = new Scanner(System.in);
		Conversor conversor = new Conversor(0);

		try
		{
			System.out.println(Cores.TEXT_GREEN_BOLD+"\nSeja bem-vindo ao ExchanGen - BRICS.");
			conversor.keyPress();
		do
		{
			System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nDigite sua moeda nativa para conversão:");
			System.out.println(Cores.TEXT_RESET + Cores.TEXT_YELLOW + "1-Real Brasileiro");
			System.out.println("2-Rublo Russo");
			System.out.println("3-Yuan Renminbi Chinês");
			System.out.println("4-Rupias Indianas");
			System.out.println("5-Rand Sulafricano");
			System.out.println("0-Sair");
			op = leia.nextInt();
				
			switch (op)
			{
			case 0:
			{
				System.out.println("\nSaindo...");
				break;
			}
			case 1: // Real Brasileiro para outas Moedas.
			{
				System.out.println(Cores.TEXT_GREEN + "\nVocê selecionou Real Brasileiro.");
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nDefina para qual moeda converter:");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_YELLOW + "1-Rublo Russo");
				System.out.println("2-Yuan Renminbi Chinês");
				System.out.println("3-Rupias Indianas");
				System.out.println("4-Rand Sulafricano");
				System.out.println("0-Voltar");
				realConvert = leia.nextInt();
				switch (realConvert)
				{
				case 0: {
					System.out.println("\nVoltando...");
					break;
				}
				case 1: // Real para Rublo Russo
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Real BRL para Rublo RUB");
					System.out.printf(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 11.7357, "RUB");
					conversor.keyPress();
					break;
				}
				case 2: // Real para Yuan Renminbi Chinês
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Real BRL para Yuan CNY");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 1.3221, "CNY");
					conversor.keyPress();
					break;
				}
				case 3: // Real para Rupias Indianas
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Real BRL para Rupia INR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 15.444, "INR");
					conversor.keyPress();
					break;
				}
				case 4: // Real para Rand Sulafricano
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Real BRL para Rand ZAR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 3.1959, "ZAR");
					conversor.keyPress();
					break;
				}
				default:
				{
					System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção invalida, tente novamente!!!");
				}
					break;
				}
				System.out.println("\n");
				break;
			}
			case 2: // Menu - Rublo Russo para outras moedas.
			{
				System.out.println(Cores.TEXT_GREEN + "\nVocê selecionou Rublo Russo.");
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nDefina para qual moeda converter:");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_YELLOW + "1-Real");
				System.out.println("2-Yuan Renminbi Chinês");
				System.out.println("3-Rupias Indianas");
				System.out.println("4-Rand Sulafricano");
				System.out.println("0-Voltar");
				rubloConvert = leia.nextInt();
				switch (rubloConvert)
				{
				case 0:
				{
					System.out.println("\nVoltando...");
					break;
				}
				case 1: // Rublo Russo para Real
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rublo RUB para Real BRL");
					System.out.printf(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.0825, "BRL");
					conversor.keyPress();
					break;
				}
				case 2: // Rublo Russo para Yuan Renminbi Chinês
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rublo RUB para Yuan CNY");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.1127, "CNY");
					conversor.keyPress();
					break;
				}
				case 3: // Rublo Russo para Rupias Indianas
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rublo RUB para Rupia INR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 1.3162, "INR");
					conversor.keyPress();
					break;
				}
				case 4: // Rublo Russo para Rand Sulafricano
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rublo RUB para Rand ZAR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.2724, "ZAR");
					conversor.keyPress();
					break;
				}
				default:
				{
					System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção invalida, tente novamente!!!");
				}
				}
				System.out.println("\n");
				break;
			}
			case 3: // Yuan para outras moedas
			{
				System.out.println(Cores.TEXT_GREEN + "\nVocê selecionou Yuan Renminbi Chinês.");
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nDefina para qual moeda converter: ");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_YELLOW + "1-Real");
				System.out.println("2-Rublo Russo");
				System.out.println("3-Rupias Indianas");
				System.out.println("4-Rand Sulafricano");
				System.out.println("0-Voltar");
				yuanConvert = leia.nextInt();
				switch (yuanConvert)
				{
				case 0: // Voltar
				{
					System.out.println("\nVoltando...");
					break;
				}
				case 1: // Yuan para Real
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Yuan CNY para Real BRL");
					System.out.printf(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.7561, "BRL");
					conversor.keyPress();
					break;
				}
				case 2: // Yuan para Rublo Russo
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Yuan CNY para Rublo RUB");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 9.1713, "RUB");
					conversor.keyPress();
					break;
				}
				case 3: // Yuan para Rupias Indianas
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Yuan CNY para Rupia INR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 11.6837, "INR");
					conversor.keyPress();
					break;
				}
				case 4: // Yuan para Rand Sulafricano
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Yuan CNY para Rand ZAR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 2.4178, "ZAR");
					conversor.keyPress();
					break;
				}
				default:
				{
					System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção invalida, tente novamente!!!");
				}
				}
				System.out.println("\n");
				break;
			}
			case 4: // Rupias Indianas para outras moedas
			{
				System.out.println(Cores.TEXT_GREEN + "\nVocê selecionou Rupia Indianas.");
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nDefina para qual moeda converter:");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_YELLOW + "1-Real");
				System.out.println("2-Rublo Russo");
				System.out.println("3-Yuan Renminbi Chinês");
				System.out.println("4-Rand Sulafricano");
				System.out.println("0-Voltar");
				rupiaConvert = leia.nextInt();
				switch (rupiaConvert)
				{
				case 0:
				{
					System.out.println("\nVoltando...");
					break;
				}
				case 1: // Rupias Indianas para Real
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rupia INR para Real BRL");
					System.out.printf(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.0647, "BRL");
					conversor.keyPress();
					break;
				}
				case 2: // Rupias Indianas para Rublo Russo
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rupia INR para Rublo RUB");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.7851, "RUB");
					conversor.keyPress();
					break;
				}
				case 3: // Rupias Indianas para Yuan Renminbi Chinês
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rupia INR para Yuan CNY");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.0856, "CNY");
					conversor.keyPress();
					break;
				}
				case 4: // Rupias Indianas para Rand Sulafricano
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rupia INR para Rand ZAR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.207, "ZAR");
					conversor.keyPress();
					break;
				}
				default: {
					System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção invalida, tente novamente!!!");
				}
				}
				System.out.println("\n");
				break;
			}
			case 5: // Rand Sulafricano para outras moedas
			{
				System.out.println(Cores.TEXT_GREEN + "\nVocê selecionou Rand SulAfricano.");
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nDefina para qual moeda converter:");
				System.out.println(Cores.TEXT_RESET + Cores.TEXT_YELLOW + "1-Real");
				System.out.println("2-Rublo Russo");
				System.out.println("3-Yuan Renminbi Chinês");
				System.out.println("4-Rupias Indianas");
				System.out.println("0-Voltar");
				randConvert = leia.nextInt();
				switch (randConvert)
				{
				case 0:
				{
					System.out.println("\nVoltando...");
					break;
				}
				case 1: // Rand Sulafricano para Real
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rand ZAR para Real BRL");
					System.out.printf(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.3128, "BRL");
					conversor.keyPress();
					break;
				}
				case 2: // Rand Sulafricano para Rublo Russo
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rand ZAR para Rublo RUB");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 3.7942973, "RUB");
					conversor.keyPress();
					break;
				}
				case 3: // Rand Sulafricano para Yuan Renminbi Chinês
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rand ZAR para Yuan CNY");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 0.413807, "CNY");
					conversor.keyPress();
					break;
				}
				case 4: // Rand Sulafricano para Rupias Indianas
				{
					System.out.println(Cores.TEXT_GREEN + "\nConversão selecionada: Rand ZAR para Rupia INR");
					System.out.println(Cores.TEXT_YELLOW + "\nEntre com valor a ser convertido:");
					conversor.setValor(leia.nextDouble());
					conversor.conversaoMult(conversor.valor, 4.8337214, "INR");
					conversor.keyPress();
					break;
				}
				default:
				{
					System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nOpção invalida, tente novamente!!!");
				}
				}
				System.out.println("\n");
				break;
			}
			}
			if (op > 5 || op < 0)
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nEntre com uma opção valida!!!");
		}
		while (op != 0);
		System.out.println(Cores.TEXT_RESET + Cores.TEXT_GREEN + "Obrigado por usar nosso programa!!!");
	}
	 catch (InputMismatchException e)
	{
		System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "\nFavor entrar apenas com número"
													+ "\nReinicie o programa, por gentileza.");
	}
		}

}
