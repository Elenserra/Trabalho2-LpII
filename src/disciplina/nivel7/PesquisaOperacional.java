package disciplina.nivel7;

import disciplina.Disciplina;

public class PesquisaOperacional extends Disciplina{
    public PesquisaOperacional(){ 
        super.setCodigo("DEIN0119");
        super.setArea("Pesquisa Operacional");
        super.setTipo("OPTATIVA");
        super.setcargaHoraria("60");
        super.setPreRequitisos("DEMA0342, DEIN0083");
    }
}
