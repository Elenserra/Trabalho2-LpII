package disciplina.nivel7;

import disciplina.Disciplina;

public class IntrodCriptografia extends Disciplina{
    public IntrodCriptografia(){ 
        super.setCodigo("DEIN0232");
        super.setArea("Introducao a Criptografia");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0030,DEIN0080, DEIN0088");
    }
}
