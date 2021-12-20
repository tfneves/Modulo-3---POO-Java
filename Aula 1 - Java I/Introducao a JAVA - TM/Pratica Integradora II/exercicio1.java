public class exercicio1{
    public static void main(String args[]){
        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
        Integer[] sortedArray = new Integer[array.length];

        for(int i=0; i<array.length; i++){
            int indexPos = 0;

            for(int j=0; j<array.length; j++){
                if(j == i) continue;
                if(array[i]>array[j]) indexPos+=1;
            }
            sortedArray[indexPos] = array[i];
        }

        for (int item : sortedArray) {
            System.out.println(item);
        }
    }
}