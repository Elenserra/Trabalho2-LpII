package disciplina.nivel6;

import disciplina.Disciplina;

public class InteligenciaArtificial extends Disciplina{
    public InteligenciaArtificial(){
        super.setCodigo("DEIN0118");
        super.setArea("Inteligencia Artificial");
        super.setTipo("OBRIGATORIA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0078, DEIN0083");
    }
}
