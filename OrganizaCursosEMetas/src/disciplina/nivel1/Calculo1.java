package disciplina.nivel1;

import disciplina.Disciplina;

public class Calculo1 extends Disciplina{
    public Calculo1() {
        String codigo = "DEMA0339";
        String area = "Calculo I";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "90";
        String preRequisitos = "";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
