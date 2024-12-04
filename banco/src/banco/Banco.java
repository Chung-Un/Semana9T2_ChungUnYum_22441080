/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author chung
 */
public class Banco {

    static cuentaBanco cuenta = new cuentaBanco();
    
    public static void main(String[] args) {
    String opcionUsuario;
    String salir= "n";
    float monto;
    
    cuenta.cliente = JOptionPane.showInputDialog("Ingrese su nombre: ");
    cuenta.nCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta: "));
    cuenta.telefono = JOptionPane.showInputDialog("Ingrese su numero de telefono con guiones: ");
    
    
    while(salir.equals("n")){
  
            monto = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto a depositar: "));
            cuenta.depositar(monto, cuenta);
            
            opcionUsuario = JOptionPane.showInputDialog("Desea realizar un retiro?(s/n)").toLowerCase();
           
            switch(opcionUsuario){
            
                case "s":
                 monto = Float.parseFloat (JOptionPane.showInputDialog("Ingrese el monto a retirar"));
                    cuenta.retirar(monto, cuenta);
                    break;
                    
                case "n":
                    break;
                 
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida", "Datos invalidos", JOptionPane.INFORMATION_MESSAGE);
                    break;
            
            
            }
            
           salir = JOptionPane.showInputDialog("Desea salir?(s/n)").toLowerCase();
           
           
    }
    }
    
}
