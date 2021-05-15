package cn.itcast14.StringBuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //append 返回自身
        sb.append("abc");
        System.out.println(sb);
        System.out.println("----------------");
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("-----------------");
        //append
        StringBuilder sb3 = new StringBuilder();
        sb3.append("learn Java,");
        sb3.append("看课程");
        sb3.append("找小黑");
        System.out.println(sb3);
        String str = sb3.toString();
        System.out.println(str);

    }
}
