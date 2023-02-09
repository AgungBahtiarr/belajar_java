package Java_Dasar;

/**
 * uasWriteUp
 */
public class uasWriteUp {

    
    public static void main(String[] args) {
                 int [] numbers;
                 numbers = new int[4];
                 numbers[0] = 1;
                 numbers[1] = 2;
                 numbers[2] = 3;
                 numbers[3] = 4;
                 int sum = 0;
                try {
                    for(int i=0;i<=4;i++){
                        sum = sum+numbers[i];
                    }
                }
                catch (Exception e){
                    System.out.println("invalid index");
                }
                System.out.println(sum);
            }
    }
