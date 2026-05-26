public class Arrays2{
    public static void main(String[] args) {
        int[] array = {12,9,5,3,8,11,18};
        int search = 9;
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