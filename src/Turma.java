package teste_02;

public class Turma {
	private int idTurma;
	private String turma;
	private int cursoHora;
	private Curso curso;
	
	public Turma(int idTurma, String turma, int cursoHora, Curso curso) {
		this.idTurma = idTurma;
		this.turma = turma;
		this.cursoHora = cursoHora;
		this.curso = curso;
	}
	
	public int getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public int getCursoHora() {
		return cursoHora;
	}
	public void setCursoHora(int cursoHora) {
		this.cursoHora = cursoHora;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
