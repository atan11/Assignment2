package firstcode;

public class main {
    public static int countEvenNum(int arr[], int size){

        int count=0;

        for (int i=0; i<size; i++){

            if (arr[i]%2==0){
                count++;
            }

            else{
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int n = 5;
        int[] dogs={0,1,2,3,4};

        int m=100;
        int[] bar= new int[100];

        for (int i=0; i<m; i++)
        {
            bar[i]=i;
        }

        // int dogstotal=countEvenNum(dogs,n);
        // int bartotal=countEvenNum(bar,m);

        System.out.println("The total number of even numbers in dogs are: " + countEvenNum(dogs,n));
        System.out.println("The total number of even numbers in bar are: " + countEvenNum(bar,m));

    }

}
