import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String... args) {

		List<String> novidades = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		novidades.forEach(System.out::println);

		// Hoje
		LocalDate today = LocalDate.now();
		System.out.println("Data Atual=> " + today);

		LocalDate natal = LocalDate.of(today.getYear(), Month.DECEMBER, 25);
		System.out.println("Natal de " + today.getYear() + "=> " + natal);

		// Data atual no Japão, Veja todas a zonas disponíve em ZoneId javadoc
		LocalDate toquio = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("A data corrente em Tóquio (JST) é =" + toquio);

		// Retocedento os dias para obter uma data a partir da data base 01/01/1970
		LocalDate dataBase = LocalDate.ofEpochDay(365);
		System.out.println("365 dias a partir da data base (01/01/1970)= " + dataBase);

		// Obter o dia pelo número sequencial no ano.
		LocalDate centessimoDia2014 = LocalDate.ofYearDay(2014, 100);
		System.out.println("100º dia de 2014=" + centessimoDia2014);

		Comparator<String> comparador = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");
		// Collections.sort(palavras, comparador);
		System.out.println(palavras);

		Comparator<String> comparador2 = (s1, s2) -> {
			return Integer.compare(s1.length(), s2.length());
		};
		// Collections.sort(palavras, comparador);
		System.out.println(palavras);

		// palavras.sort(Comparator.comparing(s -> s.length()));
		System.out.println(palavras);

		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);

		palavras.stream().filter(s -> s.length() < 6).forEach(System.out::println);
		
		List<? extends Number> list1 = new ArrayList<Number>();
	    List<? super String> list2 = new ArrayList<String>();
	    
	    addZeroToList(list1);
	    
	    list2.add("teste");

		System.out.println("Funcionou!!!");
	}
	
	public static void addZeroToList(List<? extends Number> aList)
	{
	   
	}
}
