import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import domain.Animal;
import domain.Cliente;
import domain.Consulta;
import domain.Especie;
import domain.Exame;
import domain.Tratamento;
import domain.Veterinario;

public class App {
    public static void main(String[] args) throws Exception {

        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("16/09/2023");

        Cliente cliente = new Cliente(1, "Samuel", "Rua: teste", "34-9903539517");
      
        Especie especie = new Especie(1, "Canina");

        Animal animal = new Animal(1, "Marley", "Macho", "10 anos", cliente, especie);

        Tratamento tratamento = new Tratamento(1, animal, "Verificar a patinha");
        
        Veterinario veterinario = new Veterinario(1, "Fabrício", "SCRM-MG nº 2341");
        
        Consulta consulta = new Consulta(1, date, veterinario, "Patinha está melhorando", tratamento);

        Exame exame = new Exame(date, "Raio X", "Está melhor", consulta.getCod_consulta(), consulta);

        consulta.setExames(Arrays.asList(exame));
        veterinario.setConsultas(Arrays.asList(consulta));
        tratamento.setConsultas(Arrays.asList(consulta)); 
        cliente.setAnimais(Arrays.asList(animal));
        especie.setAnimais(Arrays.asList(animal));

        System.out.println(cliente);
        System.out.println(especie);
        System.out.println(animal);
        System.out.println(tratamento);
        System.out.println(veterinario);
        System.out.println(consulta);
        System.out.println(exame);

    }
}
