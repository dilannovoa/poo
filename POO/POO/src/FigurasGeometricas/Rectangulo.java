package FigurasGeometricas;

 class Rectangulo {
      private float base;
      private float altura;
    
     Rectangulo (float base, float altura){
        this.base=base;
        this.altura=altura;
    }

     float getBase() {
        return base;
    }

     void setBase(float base) {
        this.base = base;
    }

     float getAltura() {
        return altura;
    }

     void setAltura(float altura) {
        this.altura = altura;
    }




     void calcularArea() {
        float area=0;
        area=base*altura;
        System.out.println("La base del rectangulo es "+ base +" su altura es "+ altura+" y su area es "+ area);
    
     }
    
}