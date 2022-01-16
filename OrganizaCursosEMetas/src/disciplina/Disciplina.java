package disciplina;

import entidade.Aluno;

public abstract class Disciplina{
    private String codigo;
    private String area;
    private String tipo;
    private String cargaHoraria;
    private String preRequitisos;
    private Boolean Aprovado = false;
    private String situacao = "matriculado";
    private float notas[] = new float[6];

    private Aluno aluno; 
    
    public void setNotas(int i, float nota) {
    	if (i <= 6 && i >=0)
    		this.notas[i] = nota;
    }
    
    public float[] getNotas() {
    	return this.notas;
    }
    
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
   
    public float media (float m1, float m2, float m3) {
    	return (m1+m2+m3)/3;
    }
    
    public float getMin(float a, float b, float c) {
    	float min = a;
    	if (b > a) 
    		min = b;
    	if (c > b)
    		min = c;
    	
    	return min;
    }
    
    public void calculaNotasAlunos(){
    	float nota1 = notas[0], nota2 = notas[1], nota3 = notas[2];
    	float media = media(nota1, nota2, nota3);
        if (media >= 7.0f){
            this.setSituacao("aprovado");
        }else{
        	float min = getMin(nota1, nota2, nota3);
        	
        	if (min == nota1) {
        		nota1 = notas[4];        		
        	} else if (min == nota2) {
        		nota2 = notas[4];        		
        	} else if (min == nota3) {
        		nota3 = notas[4];        		
        	}
        	media = media(nota1, nota2, nota3);
        	if (media >= 7.0f){
                this.setSituacao("aprovado");
        	} 
        	//TODO nota final
        }
    }

    @Override
    public String toString() {
        return "Disciplina [area=" + area + ", cargaHoraria=" + cargaHoraria + ", codigo=" + codigo + ", preRequitisos="
                + preRequitisos + ", tipo=" + tipo + "]";
    }

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

    
    
}