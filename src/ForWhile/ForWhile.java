package ForWhile;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * @author Guilherme
 */
public class ForWhile {

    Scanner leia = new Scanner(System.in);

    void q1() {

        int num;
        boolean sair = false;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 0-10"));
            if (num >= 0 && num <= 10) {
                sair = true;
            } else {
                JOptionPane.showMessageDialog(null, "Numero digitado invalido");
            }
        } while (!sair);
        JOptionPane.showMessageDialog(null, "O numero digitado foi: " + num);
    }

    void q2() {
        boolean correto = false;
        String usuario, senha;
        do {

            usuario = JOptionPane.showInputDialog("Digite o usuario");
            senha = JOptionPane.showInputDialog("Digite a senha");

            if (usuario.equalsIgnoreCase(senha)) {
                JOptionPane.showMessageDialog(null, "Usuario e senha iguais\nDigite novamente");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario e senha validos");
                correto = true;
            }
        } while (!correto);
    }

    void q3() {

        boolean valido = false;
        String nome, sexo, estadoC;
        int idade;
        double salario;

        do {

            nome = JOptionPane.showInputDialog("Digite seu nome");
            if (nome.length() > 3) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "nome precisa ter no minimo de 3 caracteres ");
            }

        } while (!valido);

        valido = false;

        do {

            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            if (idade > 0 && idade < 150) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "idade tem que ser maior que 0");
            }

        } while (!valido);

        valido = false;

        do {

            salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
            if (salario <= 0) {
                JOptionPane.showMessageDialog(null, "salario tem quer ser maior que 0");
            } else {
                valido = true;
            }

        } while (!valido);

        valido = false;

        do {

            sexo = JOptionPane.showInputDialog("Digite o sexo\n[f] feminino [m] masculino");
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo tem que ser 'f' ou 'm'");
            }

        } while (!valido);

        valido = false;

        do {

            estadoC = JOptionPane.showInputDialog("Digite o estado civil\n[s] [c]  [v] [d]");
            if (estadoC.equalsIgnoreCase("s")
                    || estadoC.equalsIgnoreCase("c")
                    || estadoC.equalsIgnoreCase("v")
                    || estadoC.equalsIgnoreCase("d")) {
                valido = true;
            } else {
                JOptionPane.showMessageDialog(null, "estado civil tem que ser 's' 'c' 'd' 'v'");
            }

        } while (!valido);

        JOptionPane.showMessageDialog(null,
                "Nome: " + nome
                + "\nIdade: " + idade
                + "\nSalario " + salario
                + "\nSexo: " + sexo
                + "\nEstado Civil: " + estadoC);

    }

    void q4() {

        int popA, popB;
        int ano = 0;

        popA = 80000;
        popB = 200000;

        while (popB > popA) {
            popA += (popA / 100) * 3;
            popB += (popB / 100) * 1.5;

            ano++;

        }

        JOptionPane.showMessageDialog(null,
                "População A " + popA
                + "\nPopulação B " + popB
                + "\nAnos " + ano);

    }

    void q5() {
        boolean sair = false, valido = false;
        int ano = 0;
        double cresA, cresB;
        int popA, popB;

        do {
            do {

                popA = Integer.parseInt(JOptionPane.showInputDialog("Digite a população da cidade A"));
                if (popA > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "o numero da poprlação não pode ser 0\nDigite novamente ");
                }

            } while (!valido);

            valido = false;

            do {
                cresA = Double.parseDouble(JOptionPane.showInputDialog("Digite o indice de crecimento da cidade A"));
                if (cresA > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "o indice de crescimento não pode ser 0\nDigite novamente ");
                }

            } while (!valido);

            valido = false;

            do {
                popB = Integer.parseInt(JOptionPane.showInputDialog("Digite a população da cidade B"));
                if (popB > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "o numero da poprlação não pode ser 0\nDigite novamente ");
                }

            } while (!valido);

            valido = false;

            do {
                cresB = Double.parseDouble(JOptionPane.showInputDialog("Digite o indice de crecimento da cidade B"));
                if (cresB > 0) {
                    valido = true;
                } else {
                    JOptionPane.showMessageDialog(null, "o indice de crescimento não pode ser 0\nDigite novamente ");
                }

            } while (!valido);

            while (popB > popA) {

                popA += (popA / 100) * cresA;
                popB += (popB / 100) * cresB;

                ano++;
            }

            JOptionPane.showMessageDialog(null, "A população da cidade B vai passa a população da cidade A em " + ano + " anos");

            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Sair [1] sim [2] não"));

            if (opcao == 1) {
                sair = true;
            }

        } while (!sair);
    }

    void q6() {

        for (int x = 0; x <= 20; x++) {
            System.out.println(x);
        }

        for (int y = 0; y <= 20; y++) {
            System.out.print(y + " ");
        }

    }

    void q7() {

        double maior = Double.MIN_VALUE;

        for (int x = 1; x <= 5; x++) {

            double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + x + "° numero"));

            if (num > maior) {
                maior = num;
            }

        }

        JOptionPane.showMessageDialog(null, "O maior numero digitado foi: " + maior);

    }

    void q8() {

        double soma = 0;

        for (int x = 1; x <= 5; x++) {

            double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + x + "° numero"));

            soma += num;

        }

        double media = soma / 5;

        JOptionPane.showMessageDialog(null,
                "Soma: " + soma
                + "\nMedia " + media);

    }

    void q9() {

        for (int x = 0; x <= 50; x++) {

            if (x % 2 == 1) {
                System.out.println(x);
            }

        }

    }

    void q10() {

        int num1, num2, intervalo, referencia;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero interio"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero interio"));

        if (num1 > num2) {

            intervalo = num2;
            referencia = num1 - 1;
            intervalo++;

            while (intervalo <= referencia) {

                System.out.println(intervalo);
                intervalo++;
            }

        } else {
            intervalo = num1;
            referencia = num2 - 1;
            intervalo++;

            while (intervalo <= referencia) {

                System.out.println(intervalo);
                intervalo++;
            }

        }
    }

    void q11() {
        int num1, num2, intervalo, referencia, soma = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero interio"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero interio"));

        if (num1 > num2) {

            intervalo = num2 + 1;
            referencia = num1 - 1;

            while (intervalo <= referencia) {
                soma += intervalo;
                System.out.println(intervalo);
                intervalo++;

            }

        } else {
            intervalo = num1 + 1;
            referencia = num2 - 1;
            intervalo++;

            while (intervalo <= referencia) {

                soma += intervalo;
                System.out.println(intervalo);
                intervalo++;

            }

        }

        JOptionPane.showMessageDialog(null, "a soma do numeros é: " + soma);
    }

    void q12() {

        System.out.println("Qual tabuada você quer ver");
        int num = leia.nextInt();

        for (int x = 1; x <= 10; x++) {
            System.out.println(num + " * " + x + " = " + (num * x));
        }

    }

    void q13() {

        double base, exp;
        int cont = 1;

        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base"));
        exp = Double.parseDouble(JOptionPane.showInputDialog("Digite o expoente"));

        //double res = Math.pow(base, exp);
        double res = 1;

        for (int i = 0; i < exp; i++) {
            res *= base;
        }

        JOptionPane.showMessageDialog(null, "O resultado è; " + res);

    }

    void q14() {

        int numPar = 0, numImpar = 0, num;

        for (int x = 1; x <= 10; x++) {

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + x + "° numero inteiro"));

            if (num % 2 == 0) {
                numPar++;
            } else {
                numImpar++;
            }

        }

        JOptionPane.showMessageDialog(null,
                "nummeros pares: " + numPar
                + "\nnumeros impares: " + numImpar);

    }

    void q15() {

        int qtdTermo = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de termos"));
        int n1 = 1;
        int n2 = 1;
        System.out.print("1 ");
        System.out.print("1 ");
        qtdTermo -= 2;

        while (qtdTermo > 0) {
            System.out.print((n1 + n2) + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            qtdTermo--;
        }
        System.out.println("fim");

    }

    void q16() {

        int qtd = 500;
        int n1 = 1;
        int n2 = 1;
        System.out.print("1 ");
        System.out.print("1 ");
        qtd = qtd - 2;

        while (qtd > 0) {
            System.out.print((n1 + n2) + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            qtd--;
        }
        System.out.println("Fim");

    }

    void q17() {

        System.out.println("Digite um numero");
        int num = leia.nextInt();

        System.out.print(num + " != ");

        int fatorial = 1;

        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("resultado: " + fatorial);

    }

    void q18() {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
        boolean primo = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                JOptionPane.showMessageDialog(null, "Não é um numero primo");
                primo = false;
            }
        }

        if (primo) {
            JOptionPane.showMessageDialog(null, "è um numero primo");
        }

    }

    void q19() {

        double totalNota = Double.parseDouble(JOptionPane.showInputDialog("Qual o total de notas a ser digitadas"));
        double soma = 0, media;

        for (int x = 1; x <= totalNota; x++) {

            double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + x + "° nota"));
            soma = soma + nota;

        }

        media = soma / totalNota;

        JOptionPane.showMessageDialog(null, "Media da sala: " + media);

    }

    void q20() {

        int somaIdade = 0;
        int totalAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de alunos da sala"));

        for (int x = 1; x <= totalAluno; x++) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + x + "° idade do aluno"));
            somaIdade += idade;

        }

        int mediaIdade = somaIdade / totalAluno;

        if (mediaIdade > 0 && mediaIdade < 25) {
            JOptionPane.showMessageDialog(null, "e uma turma jovem");
        } else if (mediaIdade > 26 && mediaIdade < 60) {
            JOptionPane.showMessageDialog(null, "e uma turma adulta");
        } else if (mediaIdade < 60) {
            JOptionPane.showMessageDialog(null, "e uma turma idosa");
        }

    }

    void q21() {

        int somaAluno = 0;
        int alunoSala;
        boolean sair = false;

        int totalSala = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de salas da escola"));

        for (int x = 1; x <= totalSala; x++) {

            do {
                alunoSala = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de aluno da sala " + x));
                if (alunoSala > 40) {
                    JOptionPane.showMessageDialog(null, "A sala não pode ter mais de 40 aluno");
                } else {
                    sair = true;
                }

            } while (!sair);

            sair = false;

            somaAluno = somaAluno + alunoSala;

        }

        int mediaAluno = somaAluno / totalSala;

        JOptionPane.showMessageDialog(null, "media de aluno por sala: " + mediaAluno);

    }

    void q22() {

        double soma = 0;

        int totalCd = Integer.parseInt(JOptionPane.showInputDialog("Digie o total do CD na coleção"));

        for (int x = 1; x <= totalCd; x++) {

            double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do " + x + "° CD"));

            soma += valor;

        }

        double media = soma / totalCd;

        JOptionPane.showMessageDialog(null, "valor investido nos CDs " + media);

    }

    void q23() {

        double valor = 1.99;

        for (int x = 1; x <= 50; x++) {

            System.out.println(x + " - R$" + (valor * x));

        }

    }

    void q24() {

        double pao = 0.18;

        for (int c = 1; c <= 50; c++) {
            System.out.println(c + " - R$" + (pao * c));
        }

    }

    void q25() {
        double pagamento;
        boolean paga = false;
        boolean fechar = false;
        double valor, total = 0;
        int x = 1;

        do {

            valor = Double.parseDouble(JOptionPane.showInputDialog(x + "° Produto"));
            total = total + valor;
            x += 1;

            if (valor == 0) {
                fechar = true;
            }
        } while (!fechar);

        do {

            pagamento = Double.parseDouble(JOptionPane.showInputDialog("Total: " + total
                    + "\nDigite o valor do pagamento"));

            if (pagamento < total) {
                JOptionPane.showMessageDialog(null, "valor invalido");

            } else {
                paga = true;
            }

        } while (!paga);

        double troco = pagamento - total;

        JOptionPane.showMessageDialog(null, "Troco: " + troco);
    }

    void q26() {
        System.out.println("Digite um numero");
        int num = leia.nextInt();

        System.out.print(num + " != ");

        int fatorial = 1;

        for (int i = num; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + " ");
        }
        System.out.print(" = ");
        System.out.print(fatorial);
        System.out.println(" ");
    }

    void q27() {

        double temp, sair, maior, menor, soma = 0;
        int cont = 1;

        temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));

        maior = temp;
        menor = temp;
        soma = soma + temp;

        sair = Double.parseDouble(JOptionPane.showInputDialog("Continuar? \n[1] Sim [2] Não"));
        if (sair == 2) {
            do {

                temp = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura"));

                if (temp > maior) {
                    maior = temp;
                } else if (temp < menor) {
                    menor = temp;
                }

                soma = soma + temp;

                cont++;

                sair = Double.parseDouble(JOptionPane.showInputDialog("Continuar? \n[1] Sim [2] Não"));

            } while (sair != 1);
        } else {

        }
        double tempMedia = soma / cont;

        JOptionPane.showMessageDialog(null,
                "\nMaior temperatura: " + maior
                + "\nMenor temperatura: " + menor
                + "\nTemperatura media: " + tempMedia);

    }

    void q28() {
        //exercicio dublicado
    }

    void q30() {

        boolean sair = false;

        int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual a tabuda fve ser mostrada"));

        int comeco = Integer.parseInt(JOptionPane.showInputDialog("A tabuada teve comecar em qual numero"));

        int termina = Integer.parseInt(JOptionPane.showInputDialog("A tabuada teve acabar em qual numero"));
        if (termina < comeco) {

            do {

                JOptionPane.showMessageDialog(null, "O numero digitado é invalido \nDigite um numero novamente");
                termina = Integer.parseInt(JOptionPane.showInputDialog("A tabuada teve acabar em qual numero"));

                if (termina < comeco) {
                    JOptionPane.showMessageDialog(null, "O numero digitado é invalido \nDigite um numero novamente");
                } else {
                    sair = true;
                }

            } while (!sair);

        }

        while (comeco <= termina) {

            System.out.println(comeco + " * " + tabuada + " = " + (comeco * tabuada));

            comeco++;
        }

    }

    void q31() {
        DecimalFormat format = new DecimalFormat("###,###.##");
        // contratado em 1995
        // 1996 almento salario de 1,5%
        // a cada ano o percentual vira o doro do anterio
        double salarioI = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario inicial do funcionario"));
        int anoC = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que o Funcionaio entrou na empresa"));
        int anoA = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano Atual"));

        double percI = 1.5;
        double percA = percI * (anoA - anoC);

        double salarioR = salarioI * percA;

        JOptionPane.showMessageDialog(null, "Novo salario do funcionario: " + format.format(salarioR));

    }

    void q32() {
        boolean sair = false;
        double total = 0;

        String p1 = "Cachorro Quente";
        int cod1 = 100;
        double preco1 = 1.20;

        String p2 = "Bauru Simple";
        int cod2 = 101;
        double preco2 = 1.30;

        String p3 = "Bauu Com Ovo";
        int cod3 = 102;
        double preco3 = 1.50;

        String p4 = "Hamburguer";
        int cod4 = 103;
        double preco4 = 1.20;

        String p5 = "Chessebuguer";
        int cod5 = 104;
        double preco5 = 1.30;

        String p6 = "Refrigerante";
        int cod6 = 105;
        double preco6 = 1.00;

        System.out.println("ESPECIFICAÇÃO    CÓDIGO   PREÇO\n"
                + p1 + "   " + cod1 + "      " + preco1 + "\n"
                + p2 + "      " + cod1 + "      " + preco2 + "\n"
                + p3 + "      " + cod3 + "      " + preco3 + "\n"
                + p4 + "        " + cod4 + "      " + preco4 + "\n"
                + p5 + "      " + cod5 + "      " + preco5 + "\n"
                + p6 + "      " + cod6 + "      " + preco6 + "\n");

        do {
            System.out.println("total: " + total);
            System.out.print("Codigo Pedido: ");
            int pedC = leia.nextInt();

            if (pedC == 100) {
                total += preco1;
            } else if (pedC == 102) {
                total += preco2;
            } else if (pedC == 103) {
                total += preco3;
            } else if (pedC == 104) {
                total += preco4;
            } else if (pedC == 105) {
                total += preco5;
            } else if (pedC == 106) {
                total += preco6;
            }

            System.out.println("Anotar outro pedido \n[1] sim [2] não ");
            int opcao = leia.nextInt();
            if (opcao == 1) {
                sair = false;
            } else if (opcao == 2) {
                sair = true;
            }

        } while (!sair);

        System.out.println("Total: " + total);
        System.out.print("Pagamento:");
        double paga = leia.nextDouble();

        double troco = paga - total;

        System.out.println("Troco: " + troco);

        System.out.println("");
        System.out.println("volte sempre");

    }

    void q33() {

        double soma = 0;

        System.out.println("digite o valor de n");
        int n = leia.nextInt();
        for (int x = 1, y = 1; x <= n; x++, y += 2) {
            System.out.println(x + "/" + y);

            soma += x / y;

        }

        System.out.println(soma);

    }

    void q34() {

        double soma = 0;

        System.out.println("digite o valor de n");
        int n = leia.nextInt();
        for (int cont = 1, x = 1, y = 1; cont <= n; y += 2, cont++) {
            System.out.println(x + "/" + y);

            soma = x / y;
        }

        System.out.println(soma);
    }

}
