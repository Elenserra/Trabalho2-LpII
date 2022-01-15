
package disciplina.nivel2;

import disciplina.Disciplina;

public class AlgebraLinear extends Disciplina{
    public AlgebraLinear() {
        String codigo = "DEMA0342";
        String area = "Algebra Linear I";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "60";
        String preRequisitos = "DEMA0340";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
