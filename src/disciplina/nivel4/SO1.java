package disciplina.nivel4;

import disciplina.Disciplina;

public class SO1 extends Disciplina{
    public SO1(){
        super.setCodigo("DEIN0114");
        super.setArea("Sistemas Operacionais I");
        super.setTipo("OBRIGATORIA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0079, DEIN0080");
    }
    
}
