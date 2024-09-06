import Classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pes = new Pessoa();

        pes.setCPF("10909208905");
        pes.setNome("Jota né felas");
        pes.setTelefone("47996854628");

        System.out.println(pes.getCPF());
        System.out.println(pes.getNome());
        System.out.println(pes.getTelefone());
    }
}