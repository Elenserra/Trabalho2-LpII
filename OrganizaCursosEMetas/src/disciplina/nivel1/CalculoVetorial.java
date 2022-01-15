package disciplina.nivel1;

import disciplina.Disciplina;

public class CalculoVetorial extends Disciplina{
    public CalculoVetorial() {
        String codigo = "DEMA0340";
        String area = "Calculo Vetorial e Geometria Analitica";
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
