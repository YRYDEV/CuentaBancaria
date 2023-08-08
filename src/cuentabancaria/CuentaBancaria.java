
package cuentabancaria;

public class CuentaBancaria {

    public static void main(String[] args) {

        CuentaBancariaClass c1 = new CuentaBancariaClass("ana", 1000);
        CuentaBancariaClass c2 = new CuentaBancariaClass("luis", 500);

        c1.depositar(200);
        c1.retirar(100);

        System.out.println("La cuenta de " + c1.getNomTitular() + " tiene un saldo final de " + c1.getSaldo());
        System.out.println("La cuenta de " + c2.getNomTitular() + " tiene un saldo final de " + c2.getSaldo());
    }

}
/*En la primera línea, creamos una clase llamada CuentaBancaria con la palabra reservada public class.

En las siguientes dos líneas, declaramos dos atributos privados de tipo String y double que almacenan el nombre del titular y el saldo de la cuenta respectivamente. Usamos la palabra reservada private para indicar que estos atributos solo son accesibles desde la propia clase y no desde otras clases.

En la siguiente línea, declaramos un constructor que recibe dos parámetros de tipo String y double que representan el nombre y el saldo inicial de la cuenta. Usamos la palabra reservada public para indicar que este constructor es accesible desde otras clases y tiene el mismo nombre que la clase. Dentro del constructor, usamos la palabra reservada this para referirnos a los atributos de la clase y les asignamos los valores de los parámetros.

En las siguientes cuatro líneas, declaramos un método público que devuelve el nombre del titular de la cuenta. Usamos la palabra reservada public para indicar que este método es accesible desde otras clases y la palabra reservada String para indicar que devuelve un valor de tipo String. El nombre del método es getNombre y no recibe ningún parámetro. Dentro del método, usamos la palabra reservada return para devolver el valor del atributo nombre.

En las siguientes cuatro líneas, declaramos un método público que devuelve el saldo de la cuenta. Usamos la palabra reservada public para indicar que este método es accesible desde otras clases y la palabra reservada double para indicar que devuelve un valor de tipo double. El nombre del método es getSaldo y no recibe ningún parámetro. Dentro del método, usamos la palabra reservada return para devolver el valor del atributo saldo.

En las siguientes cinco líneas, declaramos un método público que recibe una cantidad a depositar y actualiza el saldo de la cuenta. Usamos la palabra reservada public para indicar que este método es accesible desde otras clases y la palabra reservada void para indicar que no devuelve ningún valor. El nombre del método es depositar y recibe un parámetro de tipo double que representa la cantidad a depositar. Dentro del método, usamos el operador += para sumar el valor del parámetro al valor del atributo saldo.

En las siguientes nueve líneas, declaramos un método público que recibe una cantidad a retirar y actualiza el saldo de la cuenta. Usamos la palabra reservada public para indicar que este método es accesible desde otras clases y la palabra reservada void para indicar que no devuelve ningún valor. El nombre del método es retirar y recibe un parámetro de tipo double que representa la cantidad a retirar. Dentro del método, usamos una estructura condicional if-else para comprobar si la cantidad a retirar es mayor que el saldo de la cuenta. Si es así, mostramos un mensaje de error por pantalla usando el método println de la clase System.out. Si no es así, usamos el operador -= para restar el valor del parámetro al valor del atributo saldo.

En la siguiente línea, creamos una clase principal llamada PruebaCuentaBancaria con la palabra reservada public class.

En las siguientes dos líneas, declaramos el método principal con las palabras reservadas public static void main y recibiendo un parámetro de tipo String[] llamado args. Este método es el punto de entrada al programa y se ejecuta al iniciar el programa.

En las siguientes tres líneas, creamos dos objetos de la clase CuentaBancaria con diferentes nombres y saldos iniciales. Usamos la palabra reservada new para invocar al constructor de la clase CuentaBancaria y le pasamos los valores correspondientes como argumentos. Asignamos los objetos creados a dos variables de tipo CuentaBancaria llamadas c1 y c2.

En las siguientes seis líneas, realizamos algunas operaciones de depósito y retiro sobre las cuentas usando los métodos depositar y retirar de los objetos c1 y c2. Pasamos como argumentos las cantidades a depositar o retirar.

En las últimas dos líneas, mostramos por pantalla los nombres y saldos finales de las cuentas usando los métodos getNombre y getSaldo de los objetos c1 y c2.
*/