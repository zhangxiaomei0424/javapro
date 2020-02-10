package com.taiyuan.test;

public class Test2 {
        public static void main(String[] args)
        {
            int sum = 0;
            for (int i=1;i<=100;i++){
                for(int y=2;y<=(i/2); y++){
                    if( i%y==0){
                        sum = 0;
                    }else{
                        sum = i ;
                    }
                }
                System.out.println(sum);
            }
        }
    }
