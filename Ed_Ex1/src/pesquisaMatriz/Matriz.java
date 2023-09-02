package pesquisaMatriz;

import java.util.Random;

public class Matriz {
	public static void main(String[] args) {
		int l,c;
		int [][] matriz=new int[5][10];
		Random random=new Random();
		for(l=0;l<5;l++) {
			for(c=0;c<10;c++) {
				matriz[l][c]=random.nextInt(201);
			}
		}
		for(l=0;l<5;l++) {
			for(c=0;c<10;c++) {
				if(matriz[l][c]==201) {
					System.out.println("Linha: "+l+"\nColuna: "+c);
					l=5;
					c=10;
				}else if(l==4 && c==9 && matriz[l][c]!=201) {
					System.out.println("Nao existe 201");
				}
			}
		}
	}
}
