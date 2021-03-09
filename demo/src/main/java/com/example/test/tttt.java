package com.example.test;

import org.junit.Test;

/**
 * @author liang
 * @create 2021-03-09-16:12
 */

public class tttt{
    public static void main(String[]args){
        System.out.println("Stringget()="+Stringget());
    }

    public static String Stringget(){
        String a="我最喜欢胡歌";
        try{
            System.out.println("try……我最喜欢的电视剧是《仙剑奇侠传一》");
            return a;
        }catch(Exception e){
            System.out.println("catch……我最喜欢的歌曲是《逍遥叹》");
        }finally{
            a=a+" 并且我最喜欢的书籍是《山海经密码》";
            System.out.println("finally……我说完咯");
            return a;
        }

    }
}
