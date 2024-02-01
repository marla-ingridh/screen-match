package br.com.alura.screematch.calculos;
import br.com.alura.screematch.modelo.Filme;
import br.com.alura.screematch.modelo.Serie;
import br.com.alura.screematch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

     public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
     }
}
