package disciplina.nivel2;

import disciplina.Disciplina;

public class MDL extends Disciplina{
    public MDL() {
        String codigo = "DEIN0078";
        String area = "Matematica Discreta e Logica";
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
