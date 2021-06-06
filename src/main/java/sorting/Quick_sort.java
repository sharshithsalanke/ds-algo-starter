public class Quick_sort {
    public static void partition(int[] arr){
        int l=0;
        int h=arr.length-1;
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j){
            do{
                i++;
            }while(arr[i]>pivot);
            do{
                j--;
            }while(arr[j]<pivot);
            swap(arr[i],arr[j]);
        }
        swap(arr[l],arr[j]);
    }
    public static void swap(int i, int j){
        int temp;
        temp=i;
        i=j;
        j=temp;
    }
    public static void main(String[] args) {
        int[] array={9,8,7,6,5,4,3,2,1};
        partition(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}