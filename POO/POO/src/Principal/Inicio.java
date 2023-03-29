package Principal;

import Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        
       

        //Reto 3
        Empleado e1=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);
        e1.pedirDatos();
        e1.pedirEmpleado();
        e1.mostrarEmpleado();
        e1.calcularHonorarios();
   }
}