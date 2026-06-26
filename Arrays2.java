public class Arrays2{
    public static void main(String[] args) {
        int[] array = {12,5,7,9,10,2,4,15};
        int search = 20;
        boolean found = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == search){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
