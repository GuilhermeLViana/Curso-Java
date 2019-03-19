package basico;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Basico {
    // EXERCICIOS SIMPLES
    void q1(){
        
        JOptionPane.showMessageDialog(null,"Olá Mundo");
        
    }
    
    void q2(){
        int num ;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        
        JOptionPane.showMessageDialog(null,"O numero Digitado foi " + num);
        
    }
  
    void q3(){
        
        
        
        int num1, num2, soma;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
        
        soma = num1 + num2 ;
        
        JOptionPane.showMessageDialog(null,"a soma dos numeros digitados é " + soma);
        
    }
    
    void q4(){
        
        int n1, n2, n3, n4;
        double media;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 1° nota"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 2° nota"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 3° nota"));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a 4° nota"));
        
        media = (n1 + n2 + n3 + n4) / 4 ;
        
        JOptionPane.showMessageDialog(null,"sua media foi : " + media);
        
    }
    
    void q5(){
        
        double metro;
        
        metro = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em metro "));
        
        double cent = metro * 100;
        
        JOptionPane.showMessageDialog(null,"O valor " + metro + " em centimetro é igual : " + cent);
        
    }
 
    void q6(){
        
        double raio;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o raio do triangulo "));
        
        double area = Math.PI * Math.pow(raio , 2);
        
        JOptionPane.showMessageDialog(null,"a area do triangulo é " + area);
        
    }

    void q7(){
        
        double lado;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o lado do quadrado"));
        
        double area = lado * 4 ;
        
        double dobro = area * 2 ;
        
        JOptionPane.showMessageDialog(null,"A area do quadrado é igual a "+ area + "\n o dobro dele é : " + dobro);
        
        
    }

    void q8(){
        
        double salarioHora;
        int horaTrabalhada;
        
        horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a hora trabalhada no dia"));
        salarioHora = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salario por hora trabalhada"));
        
        double salarioDia = horaTrabalhada * salarioHora ;
        
        double salarioMes = salarioDia * 30 ;
        
        JOptionPane.showMessageDialog(null,"o seu salario mensal é : " + salarioMes);
        
        
    }

    void q9(){
        
        double tempF;
        
        tempF = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura em F° "));
        
        double tempC = (5 * (tempF-32) /9);
        
        JOptionPane.showMessageDialog(null,"a temperatura " + tempF + "°F e igual a "+ tempC + "°C ");
        
        
    }

    void q10(){
        
        double tempC, tempF;
        
        tempC = Double.parseDouble(JOptionPane.showInputDialog(null,"digite uma temperatura um °C"));
        
        tempF = (1.8 * tempC) + 32;
        
        JOptionPane.showMessageDialog(null,"a temperatura "+ tempC + "°C e igual a " + tempF + "°F");
        
        
    }

    void q11(){
        
        int num1 , num2 ;
        double num3;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outra numero inteiro"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um numero real"));
        
        double qA = (num1 * 2) * (num2 / 2);
        double qB = (num1 * 3) + num3;
        double qC = (num3 * num3 * num3);
        
        JOptionPane.showMessageDialog(null,"1° "+ num1 +"  2° "+num2+"  3° "+ num3 +
                                           " \no produto do dobro do primeiro com metade do segundo : " + qA +
                                           " \na soma do triplo do primeiro com o terceiro : " + qB +
                                           " \no terceiro elevado ao cubo " + qC);                        
    }

    void q12(){
        
        double altura;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite sua altura em metro"));
        
        double pesoIdeal = (72.7 * altura) - 58 ;
        
        JOptionPane.showMessageDialog(null,"seu peso ideal é : " + pesoIdeal);
        
    }

    void q13(){
        
        double salarioHora = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor que você ganha por hora"));
        int horaTrabalhada = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a sua hora trabalhada por dia"));
                        
        double salarioMes = (salarioHora * horaTrabalhada) * 30;
        
        double salarioBruto = salarioMes;
        
        double renda = salarioMes - ( salarioMes / 100 ) * 11 ;
        
        double inss = salarioMes - ( salarioMes / 100 ) * 8 ;
        
        double sind = salarioMes - ( salarioMes / 100 ) * 5 ;
        
        double salarioLiquido = salarioMes - (renda + inss + sind);
        
        JOptionPane.showMessageDialog(null,"Seu salario bruto : "+ salarioBruto +
                                           "\nRenda : " + renda +
                                           "\nINSS : " + inss +
                                           "\nSindicado" + sind +
                                           "\nSalario liquido " + salarioLiquido);
        
    }

    void q14(){
        
        double tamanhoD = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do download"));
        double velocidadeI = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade da internet"));
        
        double tempo = tamanhoD / velocidadeI;
        
        JOptionPane.showMessageDialog(null,"O tempo esperado para o fim do donwload : " + tempo);
    }
}
