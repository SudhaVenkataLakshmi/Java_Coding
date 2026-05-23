public class ArraysPractice {
    public static void main(String[] args) {
        int[] array = {2,6,9,10,12,30,9};
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println("Maximum Value: " +max);
    }
}