package teste_02;

public class TurmaAluno {
	private Turma turma;
	private Aluno aluno;
	private String disciplina;
	private double nota;
	
	public TurmaAluno(Turma turma, Aluno aluno, String disciplina, double nota) {
		this.turma = turma;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
		
	}
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

}
