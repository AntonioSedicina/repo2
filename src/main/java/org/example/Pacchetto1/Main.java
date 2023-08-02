package org.example.Pacchetto1;
/* utilizzo get e set

            class   package subclass    world
public      si      si      si          si
protected   si      si      si          no
default     si      si      no          no
private     si      no      no          no
 */

public class Main {
    public static void main(String[] args){

        Persona p1 = new Persona("Antonio","Sedicina");
        System.out.println(p1.getCognome());

        p1.setCognome("Ulix");
        System.out.println(p1.getCognome());
    }
}
