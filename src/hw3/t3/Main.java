package hw3.t3;

public class Main {

    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder("append(CharSequence s, int start, int end)" +
                "Appends a subsequence of the specified CharSequence to this sequence.");
        System.out.println(myStringBuilder.getStr());
        System.out.println(myStringBuilder.subStrings());
    }
}
