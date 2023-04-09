public class MyThread implements Runnable{
    private String id;
    private Integer timing;
    private Resources res;
    MyThread(String id,Integer timing,Resources res){
        this.id=id;
        this.timing=timing;
        this.res=res;
    }

    @Override
    public void run() {
        try{
            for(int i=0;i<timing;i++){
                res.add(i);
                System.out.println("I am in:"+id+" res:"+res.get());
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){

        }

    }
}
