public class Instertion_sort{
    public static void main(String[] args) {
        int[] array={9,8,7,6,5,4,3,2,1};
        insertion_sort(array);
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }
    public static void insertion_sort(int[] array){
        for(int i=1;i<array.length;i++){
            var current = array[i];
            int j = i-1;
            while(j>=0  && array[j]>current){
                array[j+1]=array[j];
                --j;
            }
            array[j+1]=current;
        }
    }
}