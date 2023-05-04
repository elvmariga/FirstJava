
class Calculator{
        
        public int perimeter(int w, int l){
                int p =w*l;
                return p;
        }
}

public class FirstJava {

        public static void main(String[] args) {
                
                
                // for ( int i = 0; i<10; i++)
                // System.out.println("Hello " + i );
                
                Calculator rect = new Calculator();

                int results = rect.perimeter(4, 9);


                System.out.println(results);
        
        }

}