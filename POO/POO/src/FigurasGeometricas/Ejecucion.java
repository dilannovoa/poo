package FigurasGeometricas;
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) {
        float lado, base, altura, radio;
        int desicion, i=1;
        try (Scanner Lector = new Scanner(System.in)) {
            while(i==1){
                
            System.out.println("DIGITE EL NUMERO, SEGUN LA FIGURA A LA QUE LE QUIERE CALCULAR EL AREA");
            System.out.println("1 SI QUIERE LA FIGURA CUADRADO");
            System.out.println("2 SI QUIERE LA FIGURA RECTANGULO");
            System.out.println("3 SI QUIERE LA FIGURA TRIANGULO");
            System.out.println("4 SI QUIERE LA FIGURA CIRCULO");
            desicion=Lector.nextInt();

            
            if(desicion==1){
            System.out.println("Ingrese el valor del lado del cuadrado");
            lado=Lector.nextFloat();
            Cuadrado cu1=new Cuadrado(lado);
            cu1.calcularArea();
            }
            
            else if(desicion==2){
            System.out.println("Ingrese el valor de la base del rectangulo");
            base=Lector.nextInt();
            System.out.println("Ingrese el valor de la altura del rectangulo");
            altura=Lector.nextInt();
            Rectangulo re1=new Rectangulo(base, altura);
            re1.calcularArea();
            }

            else if(desicion==3){
            System.out.println("Ingrese el valor de la base del triangulo");
            base=Lector.nextInt();
            System.out.println("Ingrese el valor de la altura del triangulo");
            altura=Lector.nextInt();
            Triangulo tr1=new Triangulo(base, altura);
            tr1.calcularArea();
            }
   
            else if(desicion==4){
            System.out.println("Ingrese el valor del radio del circulo");
            radio=Lector.nextFloat();
            Circulo Ci1=new Circulo(radio);
            Ci1.calcularArea();
            }
            i++;
   } 

   System.out.println("¿quiere calcular el area de otra figura geometrica?, digite 0 si si o cualquier otro numero si no");
   i=Lector.nextInt();
        }


        if(i!=1){
        System.out.println("GRACIAS POR USAR EL PROGRAMA DE CALCULAR EL AREA");
    }
    }
     //Lector.close();   
}