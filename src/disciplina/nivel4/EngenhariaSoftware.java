package disciplina.nivel4;

import disciplina.Disciplina;

public class EngenhariaSoftware extends Disciplina{
    public EngenhariaSoftware(){
        super.setCodigo("DEIN0226");
        super.setArea("Engenharia de Software");
        super.setTipo("OBRIGATORIA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0225");
    }
}
