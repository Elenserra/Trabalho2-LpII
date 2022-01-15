package disciplina.nivel1;

import disciplina.Disciplina;

public class IntroducaoComputacao extends Disciplina{
    public IntroducaoComputacao() {
        String codigo = "DEIN0075";
        String area = "Introducao a Computacao";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "45";
        String preRequisitos = "";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
