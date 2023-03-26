public class Bai2 {
    public static void main(String[] args) {
        int [] ar1 = {3,7,5,2,37,9,7,10,22,0};
        System.out.println("tong cac phan tu cua mang la ");
        System.out.println(sumArray(ar1));
        System.out.println("phan tu lon nhat trong mang la  ");
        System.out.println(maxArray(ar1));
    }
    public static  int sumArray (int[] ar){
        int sum= 0;
      for( int i :ar ){
          sum+=i;
        }return sum;
    }
    public static  int maxArray (int[] ar){
        int max= ar[0];
        for( int i=1;i<ar.length;i++){
          if(max<ar[i]){
              max=ar[i];
          }
        }return max;
    }

}
