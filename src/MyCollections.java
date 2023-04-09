public class MyCollections {
    public static void main(String[] args){
        try{
            Resources myResource=new Resources();
            Thread t1=new Thread(new MyThread("t1",4,myResource));
            Thread t2=new Thread(new MyThread("t2",10,myResource));
            t1.start();
            t2.start();
            t1.join();
            System.out.println("Hey I'm main");
            System.out.println(myResource.get());
        }
        catch (InterruptedException e){

        }
    }
}
