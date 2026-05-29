public class Arrays2{
    public static void main(String[] args) {
        int[] array = {3,6,8,9,10,2,15,12,5,18,30};
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