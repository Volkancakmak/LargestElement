public class Main {
    public static void main(String[] args) {
        double[] numArray={23.4,50,75,25,15,36,47};
        double largest =numArray[0];
        for(double num:numArray){
            if(largest<num)
                largest=num;
        }
        System.out.format("Largest element %.2f",largest);
    }
}