import test.Asb;
import java.util.Scanner;

class abd{
    public static void main(String[] args){
      abdo  h1 = new abdo();
        Asb h2=new Asb();
      h1.age=10;
      h1.name();
//int [] x =new int[3];
//x[0]=55;
//        x[1]=22;
//        x[2]=33;
//        int[] y ={2,3,4};
//
//        for (int i =0 ; i<3;i++){
//            System.out.println(y[i]);}
//
//            int [][] z={{3,4,5,9},{22,33,44,88}};
//            for (int j=0;j< z.length;j++){
//                for (int n=0;n<z[j].length;n++){
//                    System.out.println(z[j][n]);
//                }
//            }
//        int n=new Scanner(System.in).nextInt();
//        int  z=new Scanner(System.in).nextInt();
//        sum(n,z)
        int[] x=new int[4];
        input(x);
        output(x);
        int[] y=new int[6];

        input(y);
        output(y);

        }
//        public static void sum(int x,int y){
//
//
//            System.out.println(x+y);
//        }
    public static void input(int []a){
        System.out.println("Enter the Elements of Array");
        for (int i=0;i<a.length;i++){
            a[i]=new Scanner(System.in).nextInt();
        }
    }
    public static void output(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    }


