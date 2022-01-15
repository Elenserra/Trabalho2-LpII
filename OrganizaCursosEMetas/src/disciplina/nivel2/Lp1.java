package disciplina.nivel2;

import disciplina.Disciplina;

public class Lp1 extends Disciplina{
    public Lp1() {
        String codigo = "DEIN0030";
        String area = "LPI";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "30";
        String preRequisitos = "DEIN0076";
        Boolean aprovado = false;
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
        super.setAprovado(aprovado);
    }
}
