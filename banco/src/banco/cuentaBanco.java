/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author chung
 */
public class cuentaBanco {
    private float saldo=0;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public String cliente,telefono;
    public final int limite = 999999;
    public int nCuenta;
 
   void depositar(float monto,cuentaBanco cuenta){
    float test = cuenta.saldo + monto;
       
       if(monto<0){
       JOptionPane.showMessageDialog(null, "Numeros negativos", "Datos invalidos", JOptionPane.ERROR_MESSAGE);
       }
       else if(test>cuenta.limite){
       JOptionPane.showMessageDialog(null,"El monto sobrepasa los limites de su cuenta" , "Datos invalidos", JOptionPane.ERROR_MESSAGE);
       }
       else{
       cuenta.saldo = test;
       JOptionPane.showMessageDialog(null,"Deposito realizado exitosamente, su saldo actual es: Lps." + cuenta.saldo, "Transaccion exitosa", JOptionPane.INFORMATION_MESSAGE);
       }
    }
    
    void retirar (float monto,cuentaBanco cuenta){
    float test = cuenta.saldo - monto;
    
        if(monto<0){
        JOptionPane.showMessageDialog(null, "El monto a retirar es negativo","Numeros negativos", JOptionPane.ERROR_MESSAGE);
        }
        else if(test<0){
        JOptionPane.showMessageDialog(null, "Fondos insuficientes" , "Datos invalidos" , JOptionPane.ERROR_MESSAGE);
        }
        else{
        cuenta.saldo = test;
        JOptionPane.showMessageDialog(null,"Retiro realizado exitosamente, su saldo actual es: Lps." + cuenta.saldo, "Transaccion exitosa", JOptionPane.INFORMATION_MESSAGE);
        
        }
        
    }
    
}
