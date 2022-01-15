package disciplina.nivel2;

import disciplina.Disciplina;

public class Calculo2 extends Disciplina{
    public Calculo2() {
        String codigo = "DEMA0341";
        String area = "Calculo II";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "90";
        String preRequisitos = "DEMA0339";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
