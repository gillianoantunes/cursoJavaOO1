package entities;

import java.util.Locale;
import java.util.Scanner;

public class Employee {
	
	//classe nao cria o static void main
	   public	String name;
	   public  Double salarioBruto;
	   public Double imposto; 
	    
	   public  double salarioLiq(){   
		   return salarioBruto - imposto;  
	   }
	   
	   public void mostrarDados() {
		   System.out.printf("Funcionário: " + name  + " Salário Liquido: " + salarioLiq());
	   }
	   public void aumentarSalario(Double porcentagem) {
		   salarioBruto += salarioBruto*(porcentagem/100);
	   }
	}

