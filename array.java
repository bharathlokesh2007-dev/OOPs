
public class array {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
            sum = sum + arr[i];

        }
        double average = (double) sum/ arr.length;
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
        System.out.println(average);

    }
}
