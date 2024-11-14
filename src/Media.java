package teste_02;

public  class Media {
	
	public static double calcularMedia(int a , int b) {
	
		  double mediaRes = (a + b ) / 2.0; 
	
		  System.out.printf("> Aluno %s\n", mediaRes >= 6 ? "Aprovado" : "Reprovado");
	
		return mediaRes;
	}
	
}
