package disciplina.nivel6;

import disciplina.Disciplina;

public class CalculoNumerico extends Disciplina{
    public CalculoNumerico(){
        super.setCodigo("DEIN0117");
        super.setArea("Calculo Numerico");
        super.setTipo("OBRIGATORIA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0030, DEMA0338");
    }
    
}
