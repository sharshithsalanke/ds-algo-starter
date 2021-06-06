public class Bubble_sort {
    public static void bubble_sort(int[] array) {
        Boolean sorted= false;
        while(!sorted){
            sorted=true;
            for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                swap(array, i,i+1);
                sorted=false;
            }
            }
        }

    }
    public static void swap(int[] array, int i ,int j){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) { 
        int[] arr ={9,8,7,6,5,4,3,2,1};
        bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}