package disciplina.nivel7;

import disciplina.Disciplina;

public class EngDeRequisitos extends Disciplina{
    public EngDeRequisitos(){
        super.setCodigo("DEIN0099");
        super.setArea("Engenharia de Requisitos");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0226");
    }
}
