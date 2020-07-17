
package arrayobjetotarea1;
class Sensor{
    public int voltaje;
    public String tipo;
    Sensor(int voltaje, String tipo){
        this.voltaje=voltaje;
        this.tipo=tipo;
    }
}
 //@author Junior Steven Cangui Toapanta
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE \n");
        System.out.println("Asiganatura: Programación");
        System.out.println("Estudiante: Junior Steven Cangui Toapanta");
        System.out.println("Nivel: 4to");
        System.out.println("Carrera: Ingeniería Automotriz\n");
        System.out.println("Tema: ARRAY DE OBJETOS\n");
        System.out.println("Sensores utilizados para detectar la falta "
                + "de potencia y el voltaje con el que  funcionan:\n");
        Sensor[] arreglo;
         //Asigno memoria para 10 objetos de tipo Sensor
         arreglo=new Sensor[10];
         //inicialize los elementos del array
         arreglo[0]=new Sensor(4,"Posición del cigueñal-CKP");
         arreglo[1]=new Sensor(12,"Voltaje");
         arreglo[2]=new Sensor(9,"Potencia-HP");
         arreglo[3]=new Sensor(6,"Velocidad-VSS");
         arreglo[4]=new Sensor(5,"Presión Absoluta-MAP");
         arreglo[5]=new Sensor(10,"Flujo masa de aire-MAF");
         arreglo[6]=new Sensor(12,"Temperatura del aire-IAT");
         arreglo[7]=new Sensor(5,"Oxígeno");
         arreglo[8]=new Sensor(9,"Posición de la mariposa-TPS");
         arreglo[9]=new Sensor(6,"Punto muerto del pistón-TCD");
         
         //Acedo a los elementos del array
         for(int i=0; i<arreglo.length; i++){
             System.out.println("El sensor "+ i + ":" + arreglo[i].voltaje 
                     + "v "+ arreglo[i].tipo);
         }
    }
    
}
