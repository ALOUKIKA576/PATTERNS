public class Solution {
    public static void nForest(int n) {
        // Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
   OR
public class Solution {
    public static void nForest(int n) {
        // Write your code here
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 

//OUTPUT
//* * * *
//* * * *
//* * * *
//* * * *
