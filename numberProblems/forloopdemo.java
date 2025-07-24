public class forloopdemo {
    
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("while loop");
        int index=0;
        while (index<10) {
            System.out.println(index);
            index++;  
        }
        System.out.println("dowhile:");
        do {
            System.out.println(index);
            
        } while (index<10);
        System.out.println("for each:");
        int arr[]={20,30,40,50};
        for (int ar : arr) {
            System.out.println(ar);
            
        }
    }
}
