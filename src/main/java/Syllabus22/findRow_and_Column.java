package Syllabus22;

public class findRow_and_Column {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4},{5,6,7,8}};
        for (int row=0;row< arr.length;row++){
            for (int column=0;column< arr.length;column++){
                if (arr[row][column]==8){
                    System.out.println(row+" "+column);
                }
            }
        }
    }
}
