package BaseTable;

/**
 * @Author Yangzibin
 * @Date 2021/9/27
 */
public class MultiplicationTable {
    int i=9;
    int j=9;
    public void Multiplication(){
        System.out.println("99乘法表");
        for (i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"       "  );
            }
            System.out.println();

        }
    }
    public void Triangle(){
        System.out.println("三角星号");
        for (i=1;i<=9;i++){
            for(j=0;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

}
