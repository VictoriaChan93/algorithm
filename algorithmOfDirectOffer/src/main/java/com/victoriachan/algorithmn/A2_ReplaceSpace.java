package com.victoriachan.algorithmn;

/**
 * @program: algorithm
 * @description:
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为 We%20Are%20Happy。
 * @author: VictoriaChan
 * @create: 2020/03/12 00:09
 **/
public class A2_ReplaceSpace {

    public static void main(String[] args) {
        A2_ReplaceSpace a2_replaceSpace = new A2_ReplaceSpace();
        System.out.println(a2_replaceSpace.replaceSpace(new StringBuffer("We Are Happy.")));
        System.out.println(a2_replaceSpace.replaceSpacePlanB(new StringBuffer("We Are Happy.")));
    }

    /**
     * 解题思路:
     * 通过字符串中空格的个数，计算新字符串长度
     * 两个指针进行字符串拷贝，当遇到‘ ’时替换为 %20
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        char[] ch = str.toString().toCharArray();
        for (char c: ch){
            if(c==' ')
                sb.append("20%");
            else
                sb.append(c);
        }

        return sb.toString();
    }

    public String replaceSpacePlanB(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        int spaceNum = 0;
        char[] ch = str.toString().toCharArray();
        for(char c: ch){
            if(c==' ') spaceNum++;
        }

        int length = str.length()+2*spaceNum-1;
        char[] ct = new char[length+1];//新建数组

        int strIndex = str.length()-1;

        while (strIndex>=0){
           if(str.charAt(strIndex)==' '){
               ct[length--] = '0';
               ct[length--] = '2';
               ct[length--] = '%';
           }else{
               ct[length--] = str.charAt(strIndex);
           }
            strIndex--;
        }

        return String.valueOf(ct);
    }

}
