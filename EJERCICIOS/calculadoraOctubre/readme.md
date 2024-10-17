clase Calculadora

      /*
       * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
       */
      
      package com.mycompany.calculadora;
      
      import com.mycompany.calculadora.logica.CalculadoraEstandar;
      
      /**
       *
       * @author PILARES
       */
      public class Calculadora {
      
          public static void main(String[] args) {
             CalculadoraEstandar calculador  = new CalculadoraEstandar();
             
             calculador.realizarOperaciones();
          }
      }


clase CalculadorEstandar

          /*
           * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
           * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
           */
          package com.mycompany.calculadora.logica;
          
          import java.util.Scanner;
          
          /**
           *
           * @author PILARES
           */
          public class CalculadoraEstandar {
              private double numero1;
              private double numero2;
              private double resultado;
              private String operador;
          
              public CalculadoraEstandar() {
              }
          
              public CalculadoraEstandar(double numero1, double numero2, double resultado, String operador) {
                  this.numero1 = numero1;
                  this.numero2 = numero2;
                  this.resultado = resultado;
                  this.operador = operador;
              }
          
              public double getNumero1() {
                  return numero1;
              }
          
              public void setNumero1(double numero1) {
                  this.numero1 = numero1;
              }
          
              public double getNumero2() {
                  return numero2;
              }
          
              public void setNumero2(double numero2) {
                  this.numero2 = numero2;
              }
          
              public double getResultado() {
                  return resultado;
              }
          
              public void setResultado(double resultado) {
                  this.resultado = resultado;
              }
          
              public String getOperador() {
                  return operador;
              }
          
              public void setOperador(String operador) {
                  this.operador = operador;
              }
              
              public void realizarOperaciones(){
                  Scanner entrada = new Scanner(System.in);
                  System.out.println("Ingresa el primer numero ");
                  numero1 = entrada.nextDouble();
                  entrada.nextLine();
                  System.out.println("Ingresa el segundo numero ");
                  numero2 = entrada.nextDouble();
                  entrada.nextLine();
                  System.out.println("Ingresa la operacion: * / - + ");
                  operador = entrada.nextLine();
                  switch(operador){
                      case "+":
                          resultado = numero1 + numero2;
                          System.out.println("suma: " + resultado);
                          break;
                      case "-":
                          resultado = numero1 - numero2;
                          System.out.println("resta: " + resultado);
                          break;
                      case "*":
                          resultado = numero1 * numero2;
                          System.out.println("multiplicacion: " + resultado);
                          break;
                      case "/":
                          resultado = numero1 / numero2;
                          System.out.println("division: " + resultado);
                          break;
                      default:
                          System.out.println("operador no valido");
                  }
              }
          }
