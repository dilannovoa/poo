package FigurasGeometricas;

 class Cuadrado extends Figura {
     private float lado;

   Cuadrado (float lado){
   this.lado=lado;
   }

     float getLado() {
        return lado;
    }

     void setLado(float lado) {
        this.lado = lado;
    }

       


     void calcularArea() {
       float area=0;
       area=lado*lado;
       System.out.println("El lado del cuadrado es "+ lado+" y su area es " +area);
   
    }
}