import java.util.Random;
public class TestCompartment{
    public static void main(String[] args){
        Compartment[] trainCoaches = new Compartment[10];
        Random random = new Random();
        for(int i = 0; i < trainCoaches.length; i++){
            int randomCoach = random.nextInt(4) + 1;
            switch(randomCoach){
                case 1:
                    trainCoaches[i] = new FirstClass();
                    break;
                case 2:
                    trainCoaches[i] = new Ladies();
                    break
                case 3:
                    trainCoaches[i] = new General();
                    break;
                case 4:
                    trainCoaches[i] = new Luggage();
                    break;
            }
        }
        System.out.println("----Train Coach Information----");
        for(int i = 0; i < trainCoaches.length; i++){
            System.out.print("Coach " + (i + 1) + " -> ");
            System.out.println(trainCoaches[i].notice());
        }
    }
}
