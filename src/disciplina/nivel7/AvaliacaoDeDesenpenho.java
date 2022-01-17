package disciplina.nivel7;

import disciplina.Disciplina;

public class AvaliacaoDeDesenpenho extends Disciplina{
    public AvaliacaoDeDesenpenho(){
        super.setCodigo("DEIN0095");
        super.setArea("Avaliacao de Desempenho");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEMA0343, DEIN0114");
    }
}
