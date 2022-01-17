package disciplina.nivel7;

import disciplina.Disciplina;

public class SistemasDistribuidos extends Disciplina {
    public SistemasDistribuidos(){ 
        super.setCodigo("DEIN0107");
        super.setArea("Sistemas Distribuidos");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0088,DEIN0114");
    }
}
