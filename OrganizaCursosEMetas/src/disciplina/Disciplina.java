package disciplina;

import entidade.Aluno;

public abstract class Disciplina{
    private String codigo;
    private String area;
    private String tipo;
    private String cargaHoraria;
    private String preRequitisos;
    private Boolean Aprovado = false;

    private Aluno aluno; 

    public Boolean getAprovado() {
        return Aprovado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setAprovado(Boolean aprovado) {
        this.Aprovado = aprovado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getcargaHoraria() {
        return cargaHoraria;
    }

    public void setcargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getPreRequitisos() {
        return preRequitisos;
    }

    public void setPreRequitisos(String preRequitisos) {
        this.preRequitisos = preRequitisos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Disciplina [area=" + area + ", cargaHoraria=" + cargaHoraria + ", codigo=" + codigo + ", preRequitisos="
                + preRequitisos + ", tipo=" + tipo + "]";
    }

    
    
}