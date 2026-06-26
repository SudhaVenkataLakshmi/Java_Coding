public class Arrays2{
    public static void main(String[] args) {
        int[] array = {2,5,8,9,10,11,20,3};
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
