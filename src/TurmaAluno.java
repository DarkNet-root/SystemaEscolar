

public class TurmaAluno {
	private Turma turma;
	private Aluno aluno;
	private String diciplina;
	private double nota;
	
	public TurmaAluno(Turma turma, Aluno aluno, String diciplina, double nota) {
		this.turma = turma;
		this.aluno = aluno;
		this.diciplina = diciplina;
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
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}

}
