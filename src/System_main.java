
import teste_02.Aluno;
import teste_02.Curso;
import teste_02.Responsavel;
import teste_02.Turma;
import teste_02.TurmaAluno;
import teste_02.Media;



public class Systema_Escolar {
	public static void main(String args[]) {
		
		
	
		
		Curso curso = new Curso("2024","Sistema da Informação");
		Responsavel chefe_da_quebrada = new Responsavel(1, "Davi Gatinho San", "Rua MangaRosa", "123456789", "123.456.789-00", 1, 12.000);
		Aluno aluno = new Aluno(1,"Jhonne Jeferson", "Rua MangaVerde", "987354678", "456.789.234-98", "1234567", "01/01/2024", chefe_da_quebrada, curso);
		Turma turma = new Turma(1, "Turma A", 200, curso);
		TurmaAluno Taluno = new TurmaAluno(turma, aluno, "POO", Media.calcularMedia(10, 8));
		
		System.out.println("Nome do aluno: " + Taluno.getAluno());
		System.out.println("Nome do curso: " + Taluno.getCurso().getCurso());
		System.out.println("Nome da turma: " + Taluno.getTurma().getTurma());
		System.out.println("Nome da diciplina: " + Taluno.getDiciplina());
		System.out.println("Nota Final: " + Taluno.getNota());
	
		
	}

}
