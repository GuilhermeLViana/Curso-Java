package IfElse;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class IfElse {
    void q1() {
        double num1, num2;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro numero"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "o maior numero digirado foi " + num1);
        } else {
            JOptionPane.showMessageDialog(null, "o maior numero digirado foi " + num2);
        }

    }

    void q2() {
        
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        
        if (num >= 0) {
            JOptionPane.showMessageDialog(null, "o valor digitado é positivo");
        } else {
            JOptionPane.showMessageDialog(null, "o valor digitado é negativo");
        }

    }

    void q3() {
        String sexo;

        sexo = JOptionPane.showInputDialog(null, "qual seu sexo \n [F]  [M] ");

        switch (sexo) {
            case "M": {
                JOptionPane.showMessageDialog(null, "Masculino");
                break;
            }
            case "F": {
                JOptionPane.showMessageDialog(null, "Feminino");
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null, "Letra digitada não é valida");
                break;
            }

        }

    }

    void q4() {

        String letra;

        letra = JOptionPane.showInputDialog(null, "Digite uma letra");

        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                JOptionPane.showMessageDialog(null, "a letra digitada é uma vogal");
                break;
            default:
                JOptionPane.showMessageDialog(null, "a letra digitada é uma consoante");
                break;

        }

    }

    void q5() {

        double nota1, nota2, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a 1° nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite a 2° nota"));

        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "sua media é " + media);

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "você foi aprovado");
        } else if (media < 7) {
            JOptionPane.showMessageDialog(null, "você foi reprovado");
        } else if (media == 10) {
            JOptionPane.showMessageDialog(null, "você foi aprovado com distinção");
        }
    }

    void q6() {

        double num1, num2, num3, maior = 0;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° numero"));
        if (num1 > maior) {
            maior = num1;
        }
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2° numero"));
        if (num2 > maior) {
            maior = num2;
        }
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 3° numero"));
        if (num3 > maior) {
            maior = num3;
        }

        JOptionPane.showMessageDialog(null, "o maior numro digitado foi : " + maior);
    }

    void q7() {
        double num1, num2, num3, maior = 0, menor = 0;

        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° numero"));

        maior = num1;
        menor = num1;

        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2° numero"));
        if (num2 > maior) {
            maior = num2;
        } else if (num2 < menor) {
            menor = num2;
        }

        num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 3° numero"));
        if (num3 > maior) {
            maior = num3;
        } else if (num3 < menor) {
            menor = num3;
        }

        JOptionPane.showMessageDialog(null, "o maior numero digitado foi : " + maior);
        JOptionPane.showMessageDialog(null, "o menor numero digitado foi : " + menor);

    }

    void q8() {

        double preco1, preco2, preco3, maisB;

        preco1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do 1° produto"));
        maisB = preco1;

        preco2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do 2° produto"));
        preco3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do 3° produto"));

        if (preco2 < maisB) {
            maisB = preco2;
        } else if (preco3 < maisB) {
            maisB = preco3;
        }

        JOptionPane.showMessageDialog(null, "o produto mais barato é " + maisB);

    }

    void q9() {

        double pri, seg, ter = 0, num1, num2, num3;

        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1° numero"));
        pri = num1;

        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2° numero"));
        if (num2 > pri) {
            seg = pri;
            pri = num2;
        } else {
            seg = num2;
        }

        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 3° numero"));
        if (num3 > pri) {
            seg = pri;
            pri = num3;
        } else if (num3 > seg) {
            ter = seg;
            seg = num3;
        } else {
            ter = num3;
        }

        JOptionPane.showMessageDialog(null, "numeros digita em ordem decrescente\n" + pri + "\n" + seg + "\n" + ter);

    }

    void q10() {

        String periodo;

        periodo = JOptionPane.showInputDialog(null, "Digite o periodo que você estuda\n[V] [M] [N]");
        
        
        switch (periodo) {
            case "M":
                JOptionPane.showMessageDialog(null, "Bom Dia");
                break;
            case "V":
                JOptionPane.showMessageDialog(null, "Boa Tarde");
                break;
            case "N":
                JOptionPane.showMessageDialog(null, "Boa Noite");
                break;
            case "m":
                JOptionPane.showMessageDialog(null, "Bom Dia");
                break;
            case "v":
                JOptionPane.showMessageDialog(null, "Boa Tarde");
                break;
            case "n":
                JOptionPane.showMessageDialog(null, "Boa Noite");
                break;
            default:JOptionPane.showMessageDialog(null,"Letra Invalida");
        }

    }

    void q11() {
        int percentual = 0;
        double salario, salarioR, reajuste;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do funcionário"));

        if (salario <= 280){
            percentual = 20;
        }else if(salario > 280 && salario < 700){
            percentual = 15;
        }else if(salario >= 700 && salario < 1500){
            percentual = 10;
        }else if (salario >= 1500){
            percentual = 5;
        }
        
        double aumento = (salario / 100) * percentual ;
        double salarioA = salario + aumento ;
        
        JOptionPane.showMessageDialog(null,
                          "\nSalario: " + salario
                        + "\nPercentual: " + percentual
                        + "\nAumento: " + aumento
                        + "\nSalario ajustado: " + salarioA);

    }

    void q12() {
        
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor/hora"));
        double qtdHora = Double.parseDouble(JOptionPane.showInputDialog("Entre com as horas trabalhadas"));
        
        double salarioBruto = valorHora  * qtdHora;
        
        int percentualIR = 0;
        if(salarioBruto <= 900){
            percentualIR = 0;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            percentualIR = 5;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            percentualIR = 10;
        }else if(salarioBruto > 2500){
            percentualIR = 20;
        }
        
        double ir = (salarioBruto / 100) * percentualIR ;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDesc = ir + inss;
        double salarioL = salarioBruto - totalDesc;
        
        JOptionPane.showMessageDialog(null,
                "Salario Bruto: ( " + valorHora + " * " + qtdHora + " ):" + salarioBruto
                +"\nIR: (" + percentualIR +"% ): " + ir
                +"\nINSS (10%): " + inss
                +"\nFGTS (11%): " + fgts
                +"\nTotal descontos: " + totalDesc
                +"\nSalario Liquido: " + salarioL);
        
    }

    void q13() {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de uma semana"));

        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "sabado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "nao é um numro valido");
                break;
        }
    }

    void q14() {

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota"));
        
        double media = ( num1 + num2 ) / 2;
        
        String aproveitamento = "";
        if (media >= 9 &&  media <= 10){
            aproveitamento = "A";
        }else if(media >= 7.5 && media < 9){
            aproveitamento = "B";
        }else if(media >= 6 && media < 7.5){
            aproveitamento = "C";
        }else if(media >= 4 && media < 6){
            aproveitamento = "D";
        }else if(media >= 0 && media < 4){
            aproveitamento = "E";
        }
        
        
        switch(aproveitamento){
            case "A":
            case "B":
            case "C":{
                JOptionPane.showMessageDialog(null,
                                        "Nota 1: " + num1
                                       +"\nNota 2: " + num2
                                       +"\nMedia: " + media
                                       +"\nConceito: " + aproveitamento
                                       +"\nAprovado");
        
                break;
            }
            case "D":
            case "E":{
                JOptionPane.showMessageDialog(null,
                                        "Nota 1: " + num1
                                       +"\nNota 2: " + num2
                                       +"\nMedia: " + media
                                       +"\nConceito: " + aproveitamento
                                       +"\nAprovado");
                break;
            }
        }
        
        
        
    }

    void q15() {

        double lado1 , lado2, lado3;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1° lado do triangulo"));
        lado2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2° lado do triangulo"));
        lado3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 3° lado do triangulo"));

        if (lado1 < lado2 + lado3 || lado2 < lado3 + lado1 || lado3 < lado1+ lado2){
            
            if ( lado1 == lado2 && lado2 == lado3 ) {
                JOptionPane.showMessageDialog(null,"Triangulo Equilatero");
            }else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                JOptionPane.showMessageDialog(null,"Triangulo Escaleno");
            }else{
                JOptionPane.showMessageDialog(null,"Triangulo Isoceles");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Não é um triangulo");
        }
        
    }

    void q16(){
        
        double valorA, valorB, valorC,delta;
        
        valorA = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A"));
        if(valorA == 0){
            JOptionPane.showMessageDialog(null,"Não é equação do 2° grau");
        }else{
            valorB = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B"));
            valorC = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de C"));
            
            delta = (Math.pow(valorB, 2))- 4 * valorA * valorC;
            
            if(delta < 0){
                JOptionPane.showMessageDialog(null,"A equação não possui raiz");
            }else{
                
                double x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
                double x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
                
                JOptionPane.showMessageDialog(null,
                          "Delta: " + delta
                        + "\nX1: " + x1
                        + "\nX2: " + x2);
            }
        }
        
    }

    void q17(){
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite um ano"));
        
        if( ( ano % 400 == 0 ) || ( ano % 4 == 0  && ano % 100 != 0)){
            JOptionPane.showMessageDialog(null,
                    "O ano " + ano + " é bissexto");
        }else{
            JOptionPane.showMessageDialog(null,
                    "O ano " + ano + " não é bissexto");
        }
    }

    void q18(){
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro"));
        
        if(num%2==0){
            JOptionPane.showMessageDialog(null,"o numero é par");
        }else{
            JOptionPane.showMessageDialog(null,"o numero é impar");
        }
        
    }

    void q19(){
        
        double num1, num2, resultado ;
        int opcao;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o 1° valor"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o 2° valor"));
        
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"qual operação você quer usar \n[1]Soma [2]Subtração [3]Multiplicação [4]Divisão"));
        boolean valida = true;
        
        switch(opcao){
            case 1:{
                resultado = num1 + num2 ;
                JOptionPane.showMessageDialog(null,"A soma é : " + resultado);break;
            }
            case 2:{
                resultado = num1 - num2 ;
                JOptionPane.showMessageDialog(null,"A subtração é : " + resultado);
                break;
            }
            case 3:{
                resultado = num1 * num2 ;
                JOptionPane.showMessageDialog(null,"A multiplicação é : " + resultado)
                        ;break;
            }
            case 4:{
                resultado = num1 / num2 ;
                JOptionPane.showMessageDialog(null,"A divisão é : " + resultado);
                break;
            }
            default:{
                JOptionPane.showMessageDialog(null, "Operação invalida");
                break;
            }
            
            
            
        }
        
    }

    void q20(){
        
        int perg1, perg2, perg3, perg4, perg5, res = 0;
        
        JOptionPane.showMessageDialog(null,"Responda as perguntas com\n [1]Sim [2]Não");
        
        perg1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Telefonou para a vitima"));
        if(perg1 == 1){
            res += 1;
        }
        
        perg2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Esteve no local do crime"));
        if(perg2 == 1){
            res += 1;
        }
        perg3 = Integer.parseInt(JOptionPane.showInputDialog(null,"Mora perto da vitima"));
        if(perg3 == 1){
            res += 1;
        }
        perg4 = Integer.parseInt(JOptionPane.showInputDialog(null,"Devia para a vitima"));
        if(perg4 == 1){
            res += 1;
        }
        perg5 = Integer.parseInt(JOptionPane.showInputDialog(null,"Já trabalhou com a vitima"));
        if(perg5 == 1){
            res += 1;
        }
        
        if(res == 2){
            JOptionPane.showMessageDialog(null,"Você é suspeito do crime");
        }else if(res >= 3 && res <= 4 ){
            JOptionPane.showMessageDialog(null,"Você é cúmplice do crime");
        }else if(res == 5){
            JOptionPane.showMessageDialog(null,"Você é assasino do crime");
        }else{
            JOptionPane.showMessageDialog(null,"Você é inocente");
        }
        
    }

    void q21(){
        
        int tipo = 0;
        double litro, valorLitro = 0,total;
        
        tipo = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de combustivel \n[1]alcool [2]gasolina"));
        
        if(tipo == 1){
            
            litro = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos litros foi comprados"));
            if(litro <= 20){
                valorLitro = 1.90;
                
                total = valorLitro * litro;                                                       
                
                total = total -( total * 3 ) / 100;
                
                JOptionPane.showMessageDialog(null,"o valor a pagar "+ total);
                
            }else{
                
                valorLitro = 1.90;
                
                total = valorLitro * litro;                                                       
                
                total = total -( total * 5 ) / 100;
                
                JOptionPane.showMessageDialog(null,"o valor a pagar "+ total);
                
            }
            
            
        }else if (tipo == 2){
            
            litro = Double.parseDouble(JOptionPane.showInputDialog(null,"Quantos litros foi comprados"));
            
            if(litro <= 20){
                valorLitro = 2.50;
                
                total = valorLitro * litro;                                                       
                
                total = total -( total * 4 ) / 100;
                
                JOptionPane.showMessageDialog(null,"o valor a pagar "+ total);
                
            }else{
                
                valorLitro = 2.50;
                
                total = valorLitro * litro;                                                       
                
                total = total-( total * 6 ) / 100;
                
                JOptionPane.showMessageDialog(null,"o valor a pagar "+ total);
                
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"numero digitado não é valido");
        }
        
        
        
        
    }
    
    void q22(){
        
        double kgMaca, kgMorango, kgFruta, valorMaca, valorMorango,totalValorMaca, totalValorMorango,valorFruta;
        
        kgMaca = Double.parseDouble(JOptionPane.showInputDialog(null,"Digiteo total de Kg de maça "));
        kgMorango = Double.parseDouble(JOptionPane.showInputDialog(null,"Digiteo total de Kg de morango "));
        
        kgFruta = kgMaca + kgMorango ; 
        
        if(kgFruta <= 5){
            
            valorMaca = 1.80;
            valorMorango = 2.50;
            
            totalValorMaca = valorMaca * kgMaca;
            totalValorMorango = valorMorango * kgMorango;
            
            valorFruta = totalValorMaca + totalValorMorango;
            
            JOptionPane.showMessageDialog(null,"valor total a pagar : " + valorFruta);
            
        }else if(kgFruta > 5){
            
            valorMaca = 1.50;
            valorMorango = 2.20;
            
            totalValorMaca = valorMaca * kgMaca;
            totalValorMorango = valorMorango * kgMorango;
            
            valorFruta = totalValorMaca + totalValorMorango;
            
            JOptionPane.showMessageDialog(null,"valor total a pagar : " + valorFruta);
            
        }
        
        
    }
    
    void q23(){
        
        double quantCarne,valorCarne, total;
        int tipoCarne, opcao;
        
        tipoCarne = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o tipo de carne\n[1]File Duplo [2]Alcatra [3]Picanha"));
        
        switch(tipoCarne){
            case 1:{
                
                quantCarne = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de carne em KG"));
                
                if(quantCarne <=5){
                    valorCarne = 4.90;
                    
                    total = valorCarne * quantCarne;
                    
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de pagamento\n[1]A vista [2]cartao tabajara"));
                    if(opcao == 1){
                        JOptionPane.showMessageDialog(null,"Total : " + total);
                    }else if (opcao == 2){
                        
                        total = total - (total * 5) / 100 ;
                        
                        JOptionPane.showMessageDialog(null,"total : " + total);
                    }else{
                        JOptionPane.showMessageDialog(null,"numero invalido");
                    }
                    
                    
                }else if(quantCarne > 5){
                    valorCarne = 5.80;
                    
                    total = valorCarne * quantCarne;
                    
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de pagamento\n[1]A vista [2]cartao tabajara"));
                    if(opcao == 1){
                        JOptionPane.showMessageDialog(null,"Total : " + total);
                    }else if (opcao == 2){
                        
                        total = total - (total * 5) / 100 ;
                        
                        JOptionPane.showMessageDialog(null,"total : " + total);
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"numero invalido");
                    }
                }
            }break;
            case 2:{
                
                
                quantCarne = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de carne em KG"));
                
                if(quantCarne <=5){
                    valorCarne = 5.90;
                    
                    total = valorCarne * quantCarne;
                    
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de pagamento\n[1]A vista [2]cartao tabajara"));
                    if(opcao == 1){
                        JOptionPane.showMessageDialog(null,"Total : " + total);
                    }else if (opcao == 2){
                        
                        total = total - (total * 5) / 100 ;
                        
                        JOptionPane.showMessageDialog(null,"total : " + total);
                    }else{
                        JOptionPane.showMessageDialog(null,"numero invalido");
                    }
                    
                    
                }else if(quantCarne > 5){
                    valorCarne = 6.80;
                    
                    total = valorCarne * quantCarne;
                    
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de pagamento\n[1]A vista [2]cartao tabajara"));
                    if(opcao == 1){
                        JOptionPane.showMessageDialog(null,"Total : " + total);
                    }else if (opcao == 2){
                        
                        total = total - (total * 5) / 100 ;
                        
                        JOptionPane.showMessageDialog(null,"total : " + total);
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"numero invalido");
                    }
                }
            
            }break;
            case 3:{
                
                
                quantCarne = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de carne em KG"));
                
                if(quantCarne <=5){
                    valorCarne = 6.90;
                    
                    total = valorCarne * quantCarne;
                    
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de pagamento\n[1]A vista [2]cartao tabajara"));
                    if(opcao == 1){
                        JOptionPane.showMessageDialog(null,"Total : " + total);
                    }else if (opcao == 2){
                        
                        total = total - (total * 5) / 100 ;
                        
                        JOptionPane.showMessageDialog(null,"total : " + total);
                    }else{
                        JOptionPane.showMessageDialog(null,"numero invalido");
                    }
                    
                    
                }else if(quantCarne > 5){
                    valorCarne = 7.80;
                    
                    total = valorCarne * quantCarne;
                    
                    opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Tipo de pagamento\n[1]A vista [2]cartao tabajara"));
                    if(opcao == 1){
                        JOptionPane.showMessageDialog(null,"Total : " + total);
                    }else if (opcao == 2){
                        
                        total = total - (total * 5) / 100 ;
                        
                        JOptionPane.showMessageDialog(null,"total : " + total);
                        
                    }else{
                        JOptionPane.showMessageDialog(null,"numero invalido");
                    }
                }
            
            }break;
                
            default:JOptionPane.showMessageDialog(null,"numero invalido");break;
        }
    }
}
