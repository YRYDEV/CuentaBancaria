
package cuentabancaria;

public class CuentaBancariaClass {

    private String nomTitular;
    private double saldo;

    public CuentaBancariaClass(String nomTitular, double saldo) {
        this.nomTitular = nomTitular;
        this.saldo = saldo;
    }

    public String getNomTitular() {
        return nomTitular;
    }

    public void setNomTitular(String nomTitular) {
        this.nomTitular = nomTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("No hay suficiente dinero para retirar: " + cantidad);
        } else {
            saldo -= cantidad;
        }
    }

}
            
    

        
  

