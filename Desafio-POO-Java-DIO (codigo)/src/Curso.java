public class Curso extends Conteudo{
    

    @Override
    public double calcularXp() {
        // TODO Auto-generated method stub
        return 0;
    }

    private int cargaHoraria;


    public Curso() {
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }


}
