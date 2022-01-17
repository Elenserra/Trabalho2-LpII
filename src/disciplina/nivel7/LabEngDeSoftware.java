package disciplina.nivel7;

import disciplina.Disciplina;

public class LabEngDeSoftware extends Disciplina{
    public LabEngDeSoftware(){
        super.setCodigo("DEIN0103");
        super.setArea("Laboratorio de Engenharia de Software");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0115, DEIN0226");
    }
    
}
