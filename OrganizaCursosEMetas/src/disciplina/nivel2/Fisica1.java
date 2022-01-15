package disciplina.nivel2;

import disciplina.Disciplina;

public class Fisica1 extends Disciplina{
    public Fisica1() {
        String codigo = "DEFI0254";
        String area = "Fisica I";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "60";
        String preRequisitos = "DEMA0339";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
