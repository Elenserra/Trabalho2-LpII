package disciplina.nivel1;

import disciplina.Disciplina;

public class EticaCidadania extends Disciplina{
    public EticaCidadania() {
        String codigo = "DFIL0315";
        String area = "Etica e Cidadania";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "60";
        String preRequisitos = "";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
