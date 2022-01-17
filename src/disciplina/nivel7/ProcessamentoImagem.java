package disciplina.nivel7;

import disciplina.Disciplina;

public class ProcessamentoImagem extends Disciplina{
    public ProcessamentoImagem(){
        super.setCodigo("DEIN0104");
        super.setArea("Processamento de Imagens");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEIN0083, DEMA0343");
    }
}
