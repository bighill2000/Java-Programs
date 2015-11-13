/**
 * Created by mrglass on 11/12/2015.
 */
public class Doors100 {
    public static void main(String[] args) {
        boolean[] doors = new boolean[101];
        for(int i=0; i< doors.length;i++)
            doors[i] = false;

        for(int i=1;i<doors.length;i++){
            System.out.println(i+":");
            for(int j=i;j< doors.length;j+=i){
                System.out.print(j+", ");
                if(doors[j])
                    doors[j] = false;
                else
                    doors[j] = true;
            }
            System.out.println();
        }
        check(doors);
    }

    private static void check(boolean[] doors) {
        String open ="";
        String closed ="";
        for(int i=1; i<doors.length;i++){
            if(doors[i])
                open += i+", ";
            else
                closed += i+", ";
        }
        System.out.println("Open: "+ open);
        System.out.println("Closed: "+ closed);
    }
}
