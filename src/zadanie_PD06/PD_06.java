package zadanie_PD06;
/*
    Utwórz  klasę z metodą: public List<String> wyszukaj(List<String> lancuchyZnakow) {//...
 Metoda powinna zwracać listę zawierającą te elementy z listy wejściowej które zaczynają się na literę ‘a’
  i mają dokładne 3 znaki
  Zadanie zrealizuj w dwóch wariantach, kompatybilnym z Javą 7, oraz bez ograniczeń w wersji Jav
  */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PD_06 {

    public List<String> wyszukaj(List<String> lancuchyZnakow){

        List<String> listaOstateczna = lancuchyZnakow.stream()
                .filter(a -> a.length() == 3 && a.charAt(0)=='a')
                .collect(Collectors.toList());
        return listaOstateczna;
    }

    public List<String> wyszukaj2(List<String> lancuchyZnakow) {

        List<String> listaZnaków = new ArrayList<>();
        for (int i = 0; i < lancuchyZnakow.size(); i++) {
            if (lancuchyZnakow.get(i).charAt(0) == 'a' && lancuchyZnakow.get(i).length() == 3) {
                listaZnaków.add(lancuchyZnakow.get(i));
            }
        }return listaZnaków;
    }


    public static void main(String[] args) {
        List<String> listaZnaków = List.of("foo", "bar", "add","awde", "afb");

        PD_06 run = new PD_06();
        System.out.println(run.wyszukaj2(listaZnaków));


    }
}
