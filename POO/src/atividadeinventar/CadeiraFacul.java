package atividadeinventar;

public class CadeiraFacul {
	private String professor;
	private int alunos;
	private int cargah;
	private String materia;

	public CadeiraFacul(String professor, int alunos, int cargah, String materia) {
		super();
		this.professor = professor;
		this.alunos = alunos;
		this.cargah = cargah;
		this.materia = materia;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

	public int getCargah() {
		return cargah;
	}

	public void setCargah(int cargah) {
		this.cargah = cargah;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "CadeiraFacul [professor=" + professor + ", alunos=" + alunos + ", cargah=" + cargah + ", materia="
				+ materia + "]";
	}
	
}
