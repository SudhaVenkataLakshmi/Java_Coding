public class Arrays2{
    public static void main(String[] args) {
        int[] array = {3,6,8,9,10,2,4,12,10,7,20,16,19};
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