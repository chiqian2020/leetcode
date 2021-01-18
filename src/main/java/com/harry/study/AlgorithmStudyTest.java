package com.harry.study;

import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.jupiter.api.Test;

/**
 *
 * 死磕算法
 *
 * @author harry
 * @date 2021/1/13 10:54 上午
 **/
public class AlgorithmStudyTest {

    @Test
    public void test1() {
        String md5 = Md5Crypt.md5Crypt("agdjasdjgasjd".getBytes());
        System.out.println(md5.hashCode());
    }

    @Test
    public void maxLongPrefixTest() {
        String[] array = {"flwe","flw","flwwe","flw"};
        System.out.println(getMaxLongPrefix(array));
    }

    private String getMaxLongPrefix(String[] array) {
        if (array == null || array.length == 0) {
            return "";
        }
        String str = array[0];
        String str2 = "";
        int index = 1;
        while(index < array.length){
            for(int i=0; i < (str.length() < array[index].length()? str.length():array[index].length()); i++){
                if(str.charAt(i) != array[index].charAt(i)){
                    break;
                }
                str2 += str.charAt(i);
            }
            str = str2;
            str2 = "";
            index++;
        }
        return str;
    }

}
