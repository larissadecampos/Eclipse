package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0, res=0;
		String sel=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("Selecione a opção\n");
		System.out.println("+: Soma"
				+ "\n-: Subtração"
				+"\n*: Multiplicação"
				+"\n/: Divisão");
		sel=tec.next();
		switch(sel) {
		case"+":
			System.out.println("Foi selecionado a soma\n");
			System.out.println("insira o primeiro número");
			a=tec.nextInt();
			System.out.println("insira o segundo número");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
			
		case"-":
			System.out.println("Foi selecionado a Subtração\n");
			System.out.println("insira o primeiro número");
			a=tec.nextInt();
			System.out.println("insira o segundo número");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;	
			
		case"*":
			System.out.println("Foi selecionado a Multiplicação\n");
			System.out.println("insira o primeiro número");
			a=tec.nextInt();
			System.out.println("insira o segundo número");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
			
		case"/":
			System.out.println("Foi selecionado a Divisão\n");
			System.out.println("insira o primeiro número");
			a=tec.nextInt();
			System.out.println("insira o segundo número");
			b=tec.nextInt();
			res=a/b;
			System.out.println(a+"/"+b+"="+res);
			break;
		default:
			System.out.println("Essa opção não existe");
			
			}
		

	}

}
    