import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        inserirInformacoes();

    }

    /**
     * @param informacoesCadastro Construtor para salvar os valores nas variáveis
     * @param scanner             classe do java para ser possível entrar com
     *                            informações via terminal
     * 
     *                            Método criado para usuário cadastrar suas
     *                            informações
     * 
     */

    public static void inserirInformacoes() {
        InformacoesCadastro informacoesCadastro = new InformacoesCadastro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu Nome! ");
        informacoesCadastro.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência! ");
        informacoesCadastro.agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta! ");
        informacoesCadastro.numero = scanner.nextInt();

        System.out.println("Por favor, digite o valor do primeiro Depósito! ");
        informacoesCadastro.saldo = scanner.nextDouble();

        juntarInformacoes(informacoesCadastro.numero, informacoesCadastro.agencia, informacoesCadastro.nomeCliente,
                informacoesCadastro.saldo);

        scanner.close();

    }

    /**
     * Método criado para concatenar as informações e exibir a mensagem final
     * 
     */
    public static void juntarInformacoes(Integer numero, String agencia, String nomeCliente, Double saldo) {

        System.out.println(
                "Olá ".concat(nomeCliente)
                        .concat(", obrigado por criar uma conta em nosso banco, sua agência é: ".concat(agencia)
                                .concat(", conta: ".concat(numero.toString()).concat(" e seu saldo: R$")
                                        .concat(saldo.toString()).concat(" já está disponível para saque"))));

    }

}

/**
 * Construtor criado para armazenar as informações dos usuários nas variáveis
 * 
 * @param numero      numero da conta
 * @param agencia     numero da agencia
 * @param nomeCliente nome do cliente
 * @param saldo       valor do saldo
 */

class InformacoesCadastro {

    Integer numero;
    String agencia;
    String nomeCliente;
    Double saldo;

    public InformacoesCadastro() {

    }

    public InformacoesCadastro(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

}