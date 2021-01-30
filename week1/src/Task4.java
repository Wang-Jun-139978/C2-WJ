public class Task4 {
    public void push0(int arr[]) {
        int arr1[] = new int[arr.length];
        int sum = 0;
        int num = 0;
        for (int i = 0;num <= arr.length - 1;i++){
            if (arr[num] == 0){
                num++;
            }else{
                arr1[i] = arr[num];
                sum++;
            }
        }
        for (int i = sum;i <= arr.length - 1;i++){
            arr[i] = 0;
        }
        arr = arr1;
    }
}

