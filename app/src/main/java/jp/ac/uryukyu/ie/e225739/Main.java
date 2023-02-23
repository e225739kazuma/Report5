package jp.ac.uryukyu.ie.e225739;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("壱百満");
            System.out.println(e.getMessage());
        }
        String str = "NullPointerExceptionが発生しました。";
        int value = Integer.parseInt(str);
    }

}
