import java.util.Scanner;

public class DozensOfEggs {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        Integer dozens = 0;
        Integer eggs = 0;

        for(Integer i = 0; i < 7;i++){
            String[] input = reader.nextLine().split(" ");

            Integer count = Integer.parseInt(input[0]);
            String measure = input[1];

            if(measure.equals("dozens")){
                dozens += count;
            }else {
                eggs += count;
            }

            while(eggs >= 12){
                eggs -= 12;
                dozens++;
            }
        }

        System.out.println(dozens + " dozens + " + eggs + " eggs");
    }
}
