import java.util.ArrayList;

public class RadixSort {

    public static void main(String[] args) {

        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(iArr);
    }

    private static void radixSort(int iArr[]) {
        int maxValue = findLargerValue(iArr);
        ArrayList<String> stringsArray = convertToString(iArr);
        ArrayList<String> formattedArray = completaZero(stringsArray, maxValue);
        ArrayList<String> response = new ArrayList<String>();

        
        for(int i=maxValue-1; i>=0; i--){
            if(i == maxValue-1) response = insertItensInList(formattedArray, i);
            else response = insertItensInList(response, i);
        }

        for(String item : response) {
            System.out.println(item + " ");
        }
    }


    /**
     * Retorna a quantidade de algarismos do maior valor de um array de int
     * @param array
     * @return int[]
     */
    private static int findLargerValue(int[] array) {
        int[] sortedArray = new int[array.length];

        for(int i=0; i<array.length; i++){
            int indexPos = 0;

            for(int j=0; j<array.length; j++){
                if(j == i) continue;
                if(array[i]<array[j]) indexPos+=1;
            }
            sortedArray[indexPos] = array[i];
        }
        return Integer.toString(sortedArray[0]).length();
    }


    /**
     * Converte valores de um array int em String
     * @param array
     * @return String[]
     */
    private static ArrayList<String> convertToString(int array[]) {
        ArrayList<String> stringsArray = new ArrayList<String>();
        for(int i=0; i<array.length; i++) {
            stringsArray.add(Integer.toString(array[i]));
        }
        return stringsArray;
    }


    /**
     * Completa com 0 a esquerda coincidindo com o numero de digitos do maior numero do array
     * @param array
     * @param maxValue
     * @return ArrayList<String>
     */
    private static ArrayList<String> completaZero(ArrayList<String> array, int maxValue) {
        String strZero = "0";

        for(int i=0; i<array.size(); i++) {
            array.set(i, strZero.repeat(maxValue-array.get(i).length()) + array.get(i));
        }
        return array;
    }


    /**
     * Insere valores nas listas
     * @param array
     * @param index
     * @return ArrayList<String>
     */
    private static ArrayList<String> insertItensInList(ArrayList<String> array, int index) {

        // ArrayList de retorno
        ArrayList<String> response = new ArrayList<String>();

        // Cria ArrayList para armazenar ArrayLists
        ArrayList<ArrayList<String>> listas = new ArrayList<ArrayList<String>>();

        // Popula ArrayList de ArrayLists
        for(int i=0; i<10; i++){
            listas.add(new ArrayList<String>());
        }

        // Adiciona numeros nas respectivas listas
        for(String item : array) {
            listas.get(Character.getNumericValue(item.charAt(index))).add(item);
        }

        // Popula ArrayList response
        for(ArrayList<String> l : listas) {
            for(int i=0; i<l.size(); i++){
                response.add(l.get(i));
            }
        }

        return response;
    }
}
