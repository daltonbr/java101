package com.company;

import primitives.Circle;
import primitives.Rectangle;
import primitives.Square;

/**
 * Created on 5/2/16 by:
 * Dalton Lima         github.com/daltonbr
 * Lucas Pinheiro      github.com/lucaspin
 *
 * Aula 6 - Exericio 2
 *  É necessário criar um método que calcule a área para as figuras geométricas. Como você implementaria?
 *  Um método específico em cada uma das classes? Utilizaria herança? Utilizaria interfaces? Implemente e
 *  justifique sua escolha de implementação. Escreva como comentário no método main().
 *
 *  RESPOSTA: Para esta implementação optamos pelo uso de uma INTERFACE (primitives.Primitives)
 *  O método getArea() é implementado de maneiras distintas e de forma obrigatória
 *  em todas as classes das primitivas. Sendo assim, a implementação da interface garante que todas as classes
 *  terão o método getArea() presente, também conseguimos especificar a assinatura de modo a manter a
 *  consistência dos dados.
 */

public class Main {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3.0d, 4.0d);
        Circle cir = new Circle( 2.5d );
        Square sqr = new Square( 3.0d );

        System.out.println("Rectangle's area:  " + rec.getArea() );
        System.out.println("Circle's area:  " + cir.getArea() );
        System.out.println("Square's area:  " + sqr.getArea() );
    }
}