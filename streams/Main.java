package streams;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Map;

import optional.Genero;
import optional.Pessoa;

public class Main {
    static void main(){
        List<Boletim> boletins = getBoletim();

        boletins.forEach(Boletim::calculatrResultado);

        List<Boletim> aprovados = boletins.stream().
            filter(b->b.getDisciplina()
                .stream().allMatch(disciplina-> disciplina.getResultado()
            .equals(Resultado.APROVADO))
    ).toList();
    System.out.println(aprovados);

    boletins.forEach(b->{
        b.getDisciplina().forEach(d->System.out.println(d.getNome()));
    });

    Set<Disciplina> comFlatMap = boletins.stream().
        flatMap(b->b.getDisciplina().stream()).collect(Collectors.toSet());
        System.out.println("--------Com Flat Map-------");
        comFlatMap.forEach(d-> System.out.println(d.getNome()));

        System.out.println("**********Agrupado por aluno***********");
        Map< Pessoa, List<Boletim> agrupadoPorAluno = boletins.stream().collect(Collectors.groupingBy(Boletim::getPessoa));
            agrupadoPorAluno.forEach(pessoa,boletims) -> {
                System.out.println("Aluno" + pessoa.getNome());
                boletims.forEach()
            };
    }
    public static List<Boletim> getBoletim(){
        Pessoa ana = new Pessoa("Ana", 25, Genero.FEMININO, "ana@gmail.com");
        Pessoa pedro = new Pessoa("Pedro", 32, Genero.MASCULINO, "pedro@gmail.com");
        Pessoa jose = new Pessoa("José", 10, Genero.MASCULINO, "jose@gmail.com");
        Pessoa maria = new Pessoa("Maria", 64, Genero.FEMININO, "maria@gmail.com");

      Boletim b = new Boletim(ana,List.of(new Disciplina(DisciplinaEnum.ALGORITMOS, List.of(10.0, 2.0, 4.5)
      , null , 0.0)) );
        List<Boletim> boletins = ArrayList<>();
        boletins.add(b);
        
        
        return null;
    }

}
