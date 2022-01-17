package disciplina.nivel7;

import disciplina.Disciplina;

public class InterfaceHumComputador extends Disciplina{
    public InterfaceHumComputador(){  
        super.setCodigo("DEIN0102");
        super.setArea("Interface Humano-Computador");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0226");
    }
}
