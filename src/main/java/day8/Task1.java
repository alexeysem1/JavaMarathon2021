package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int x = 0;
        while (x<=20000){
            sb.append(x+" ");
            x++;
        }
        System.out.print(sb.toString());

    }
}

