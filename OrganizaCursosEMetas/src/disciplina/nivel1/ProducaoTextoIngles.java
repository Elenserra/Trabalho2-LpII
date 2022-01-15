package disciplina.nivel1;

import disciplina.Disciplina;

public class ProducaoTextoIngles extends Disciplina{
    public ProducaoTextoIngles() {
        String codigo = "DLER0845";
        String area = "Producao de Texto em Ingles";
        String tipo = "OPTATIVA";
        String cargaHoraria = "60";
        String preRequisitos = "";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
}
