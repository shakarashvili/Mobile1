package thirdExercies;

import java.util.Arrays;

public class Lestomore {


        public static void main(String[] args) { // მესამე დავალება
            int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};
            // ეს არაითი
           // Arrays.sort(arr);
            //ეს ორი ციკლით
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

