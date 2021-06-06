public class Merge_sort{
    public static void merge(int[] array, int l, int m, int h){
        int n1=m-l+1;
        int n2=h-m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;++i){
            L[i]=array[l+i];
        }
        for(int j=0;j<n2;++j){
            R[j]=array[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                array[k]=L[i];
                i++;
            }
            else{
                array[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k]=L[i];
            i++;
            k++;
        }
        while(j<n2){
            array[k]=R[j];
            j++;
            k++;
        }
    }
    public static void merge_sort(int[] array, int l, int h){
        if(l<h){
            int m=(h+l)/2;
            merge_sort(array, l, m);
            merge_sort(array, m+1, h);
            merge(array, l, m, h);
        }
    }
    public static void main(String[] args) {
        int[] array={9,8,7,6,5,4,3,2,1};
        merge_sort(array, 0, array.length);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
}