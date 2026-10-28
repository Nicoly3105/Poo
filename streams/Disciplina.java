package streams;
import java.util.List;

public class Disciplina {
    
    private DisciplinaEnum nome;
    private List<Double> notas;
    private Resultado resultado;
    private Double media;
    
    public Disciplina(){

    }

    public Disciplina(DisciplinaEnum nome, List<Double> notas, Resultado resultado, Double media) {
        this.nome = nome;
        this.notas = notas;
        this.resultado = resultado;
        this.media = media;
    }

    public DisciplinaEnum getNome() {
        return nome;
    }

    public void setNome(DisciplinaEnum nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Disciplina [nome=" + nome + ", notas=" + notas + ", resultado=" + resultado + ", media=" + media + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((notas == null) ? 0 : notas.hashCode());
        result = prime * result + ((resultado == null) ? 0 : resultado.hashCode());
        result = prime * result + ((media == null) ? 0 : media.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disciplina other = (Disciplina) obj;
        if (nome != other.nome)
            return false;
        if (notas == null) {
            if (other.notas != null)
                return false;
        } else if (!notas.equals(other.notas))
            return false;
        if (resultado != other.resultado)
            return false;
        if (media == null) {
            if (other.media != null)
                return false;
        } else if (!media.equals(other.media))
            return false;
        return true;
    }
    
    
}
