public class chocolatefactory{


public static void main(String[] args){

int[]  arr = {4,5,0,1,9,0,5,0};

int size =  arr.length;

for(int i=0;i<size;i++){

     if(arr[i] == 0){

    temp = arr[i];
    arr[i] = arr[i+1];
    a[i+1] = temp;
}


}

}
}