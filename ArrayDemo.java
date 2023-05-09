public class ArrayDemo {
    public static void main(String[] args) {
        // int nums [ ] = {3, 7, 4, 6, 7, 10};

        int arr [][] = new int [3][4];  // normal array

        // jagged array

        // int nums [][] = new int [3][]; 

        // arr[0]= new int [4];
        // arr [2] = new int [6];
        // arr [3] = new int [2];

       

        // for( int a []: nums){
        //     for (int b:a){
        //         System.out.print( b+ " ") ;
        //     }
        //     System.out.println();
        // }




    
        
        for(int i=0; i<arr.length; i++ )
        
        {
            for(int j= 0; j<arr.length; j++){
                arr [i][j]= (int)(Math.random() *10);
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
           
        }

        System.out.println("------------------------------");

        // Using for each ()

        for (int n[]: arr){

            for (int m: n){
                System.out.print(m + " ");
                
            }

            System.out.println();
        }
        
    }
}
