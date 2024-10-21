public class Automovil {
    String modelo;
    String marca;
    String color = "Negro";
    double cilindraje; //tapo de dato nativo con minuscula

    /*public void detalleauto(){
        String modelo = "otro";
        System.out.println("La marca de el auto es:"+this.marca); // sirve para imprimir cosas
        System.out.println("auto.modelo = " +this.modelo);
        System.out.println("auto.color = " +this.color);
        System.out.println("auto.cilindraje = " +this.cilindraje);
    }*/

    public String detalleauto(){
        StringBuilder sb = new StringBuilder();
        String modelo = "otro";
        sb.append("La marca de el auto es:"+this.marca); // sirve para imprimir cosas
        sb.append("auto.modelo = " +this.modelo);
        sb.append("auto.color = " +this.color);
        sb.append("auto.cilindraje = " +this.cilindraje);
        return sb.toString();
    }

    // siempre hay que instanciar el metodo
}

// this es para poder diferenciar los datos fuera de el metodo, es decir con esta palabra se puede buscar el valor de el atributos de una clase
// se puede diferenciar el tipo por el color que posee linea 8 y 2