package FigurasGeometricas;

 class Circulo {
      private float radio;
    
     Circulo (float radio){
        this.radio=radio;
    }

     float getRadio() {
        return radio;
    }

     void setRadio(float radio) {
        this.radio = radio;
    }




     void calcularArea() {
        double area=0;
        area=3.14*(radio*2);
        System.out.println("El radio del circulo es "+ radio +" y su area es "+ area);
    
     }
    
}