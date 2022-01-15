package disciplina.nivel3;

import disciplina.Disciplina;

public class Lp2 extends Disciplina{
    
    public Lp2() {
        String codigo = "DEIN0225";
        String area = "Linguagem de Programacao II";
        String tipo = "OBRIGATORIA";
        String cargaHoraria = "60";
        String preRequisitos = "DEIN0076";
        super.setCodigo(codigo);
        super.setArea(area);
        super.setTipo(tipo);
        super.setcargaHoraria(cargaHoraria);
        super.setPreRequitisos(preRequisitos);
    }
 
}
