package com.taiyuan.test;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Test8 {
    public static void main(String[] args) {
       /* int a = method(1, 2);
        System.out.println(a);*/
      /* Persion p1 = new Persion();
       Persion p2 = new Persion();*/
     /* int[] a = new int[4];
      a[0] = 1;
      a[1] = 2;
      a[2] = 3;
      a[3] = 4;
      System.out.println(a);*/
    /* 输出1，2，3，4中任意三个数组成的所有三位数
    int[] a = {1,2,3,4};
     //先拿出百位的数给i赋值
     for(int b:a){
         //拿出十位的数
         for (int c:a){
              //拿出个位的数
             for(int d:a){
                 if(b!=c&&b!=d&&c!=d) {
                     System.out.println(b * 100 + c * 10 + d);
                 }
             }
         }
     }*/
    /* for (int i=0;i<a.length;i++){
         System.out.println(a[i]);
     }*/
  /*    增强for循环
        for (int b:a){
        System.out.println(b);
    }*/
   /*计算1-100的偶数和
    int sum = 0;
    for (int i=0;i<=100;i++){
        if(i%2==0){
            sum+=i;
        }
    }System.out.println(sum);*/
   /*
   * 定义两个int变量m，n   计算m的n次方
   *
   int m = 4;
   int n = 5;
   int a = 1;
   for(int i=0;i<n;i++){
        a=a*m;
   }
        System.out.println(a);*/
   /*
   //定义100-999之间的水仙花数  如153     1^3+5^3+3^3=153
        for(int i=100;i<=999;i++){
            //取百位
            int a = i/100;
            int b = (i-a*100)/10;
            int c = i-a*100-b*10;
            int sum1=1;
            int sum2=1;
            int sum3=1;
            for(int j=0;j<3;j++) {
                sum1 *= a;
                sum2 *= b;
                sum3 *= c;
                int sum = sum1+sum2+sum3;
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }*/
        /*for(int i=100;i<=999;i++){
            //取百位
            int a = i/100;
            int b = i%100/10;
            int c = i%10;
            if(a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }*/
        //两个正整数  计算最大公约数和最小公倍数
        int m = 20;
        int n = 2;
        int a=0;
        for(int i=1;i<=max(m,n);i++){
            if((m%i==0)&&(n%i==0)){
                a=i;
            }
        }System.out.println("这两个数的最大公约数为："+a);
        for(int j=1;j<=max(m,n);j++){
            int sum = max(m,n)*j;
            if (sum%min(m,n)==0){
                System.out.println("这两个数的最小公倍数为："+sum);
            }break;
        }
    }
}
