package disciplina.nivel7;

import disciplina.Disciplina;

public class LabSoftwareBasico extends Disciplina{ 
    public LabSoftwareBasico(){
        super.setCodigo("DEIN0238");
        super.setArea("Laboratorio de Software Basico");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0079, DEIN0114");
    }
}
