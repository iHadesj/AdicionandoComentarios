public class Main {
    public static void main(String[] args) {
        Pessoa primeiraPessoa = new Pessoa();

        primeiraPessoa.setNome("Eduardo");
        System.out.println(primeiraPessoa.getNome());

        primeiraPessoa.setIdade(17);
        System.out.println(primeiraPessoa.getIdade());

        primeiraPessoa.pessoaMaiorDeIdade();

        System.out.println("\n");

        Pessoa segundaPessoa = new Pessoa();
        segundaPessoa.setNome("Alexandre");
        System.out.println(segundaPessoa.getNome());

        segundaPessoa.setIdade(17);
        System.out.println(segundaPessoa.getIdade());

        segundaPessoa.pessoaMaiorDeIdade();
    }
}