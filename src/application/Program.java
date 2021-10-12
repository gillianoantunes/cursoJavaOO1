package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Employee empregado;
		empregado = new Employee();
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o nome do funcionário:");
	    empregado.name = sc.nextLine();
	    
	    System.out.println("Digite o salário bruto:");
	    empregado.salarioBruto = sc.nextDouble();
	    
	    System.out.println("Digite o imposto:");
	    empregado.imposto = sc.nextDouble();
	    
	    empregado.salarioLiq();
	    empregado.mostrarDados();
	    System.out.println("Digite a porcentagem de aumento:");
	    Double porcento = sc.nextDouble();
	    empregado.aumentarSalario(porcento);
	    empregado.mostrarDados();
	    sc.close();
	}

}
