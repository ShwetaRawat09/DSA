package prerequisite_sheet.phase1_number_basics;

public class PrimeNumber {

    public static void isPrime(int num){
        boolean isPrime = true;
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }

}