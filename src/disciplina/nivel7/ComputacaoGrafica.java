package disciplina.nivel7;

import disciplina.Disciplina;

public class ComputacaoGrafica extends Disciplina{
    public ComputacaoGrafica(){ 
        super.setCodigo("DEIN0120");
        super.setArea("Computacao Grafica");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEMA0342, DEIN0083");
    }
}
