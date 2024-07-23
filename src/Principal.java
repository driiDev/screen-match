import br.com.andrielle.screenmatch.calculos.CalculadoraTempo;
import br.com.andrielle.screenmatch.calculos.FiltroRecomendacao;
import br.com.andrielle.screenmatch.modelos.Episodio;
import br.com.andrielle.screenmatch.modelos.Filme;
import br.com.andrielle.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Barbie");
        meuFilme.setAnoLancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("The Flash");
        serie.setAnoLancamento(2016);
        serie.setTemporadas(9);
        serie.setEpisodiosPorTemporada(23);
        serie.setMinutosPorEpisodio(50);
        serie.exibeFichaTecnica();
        System.out.println("Duração para maratonar: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Vingadores");
        outroFilme.setAnoLancamento(2021);
        outroFilme.setDuracaoEmMinutos(100);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
