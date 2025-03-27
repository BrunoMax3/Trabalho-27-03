package br.com.fecaf.model;

// Tive que fazer esse import do Arrays também, dei uma pesquisada e essa era a forma mais facíl.
// se não fosse dessa forma teria que fazer um monte de if e else.

import java.util.Scanner;
import java.util.Arrays;

public class Triangulo {
// public double[] lados;. Criei aqui em cima isso para eu não ter que ficar criando mais de um lá embaixo.
    public double base, lado2, lado3, area, perimetro, altura;
    public double[] lados;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base:     */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:     */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        lados = new double[]{base, lado2, lado3};

        return true;
    }

    public void calcularArea() {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro() {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo() {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        if (base == lado2 && base == lado3) {

            System.out.println("Este Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triângulo é Escaleno ...");

        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");

    }
    // Aqui eu usei o Arrays.sort para fugir de muitos if e else.
    // Arrays.sort organiza os lados do triângulo em ordem crescente.
    // Dependendo da ordem e dos valores inseridos pelo usuário, alguns casos poderiam resultar em erro.
    public boolean verificarTrianguloRetangulo() {
        System.out.println("/*********************************/");
        System.out.println("/*   Verificando Triângulo   */");
        System.out.println("/*********************************/");

        Arrays.sort(lados);

        // Verifica o Teorema de Pitágoras
        if ((lados[0] * lados[0]) + (lados[1] * lados[1]) == (lados[2] * lados[2]))  {
            System.out.println("Este Triângulo é Retângulo!");
            System.out.println("/*********************************/");
            return true;
        } else {
            System.out.println("Este Triângulo NÃO é Retângulo!");
            System.out.println("/*********************************/");
            return false;
        }


    }
    //Verifica se é um triangulo 3,4,5.
    public void triangulo345() {
        System.out.println("/*********************************/");
        System.out.println("/*     Verificando Triângulo     */");
        System.out.println("/*********************************/");

        Arrays.sort(lados);
        // Aqui temos dois cálculos, porque só se for um triângulo retângulo ele passará para o próximo passo.
        // Se eu fizesse do jeito convencional e usasse dois números iguais no retângulo, ele erraria a resposta.
        if ((lados[0] * lados[0]) + (lados[1] * lados[1]) == (lados[2] * lados[2]) && (lados[0] % 3 == 0) && (lados[1] % 4 == 0) && (lados[2] % 5 == 0)) {
            System.out.println("/* Este triângulo é 3,4,5 */");
        } else System.out.println("/* Este não é um triângulo 3,4,5 */");
    }
}
