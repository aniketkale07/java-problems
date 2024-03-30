/*11.	The total mechanical energy of a particle is given by e=mgh+(1/2) mv^2?

 Enter Mass of Object,Velocity of object ,height of object from ground..
12
25
3.2
Mechnical Energy : 376.320000000000
 */
import java.util.Scanner;
public class prg11_mechincal_energy {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
double mass_of_object,velocity,acceleration =9.8,height,m_energy;
System.out.println(" Enter Mass of Object,Velocity of object ,height of object from ground..");
        
mass_of_object =sc.nextDouble();
velocity =sc.nextDouble();
height =sc.nextDouble();
        m_energy= ((1/2)* mass_of_object*velocity*velocity)+(mass_of_object * acceleration * height);
System.out.println("Mechnical Energy : "+ m_energy);
    }
    }
}
