public class Resources {
    private Integer i;
    public Resources(){
        this.i=0;
    }
    public synchronized void add(Integer val){
        this.i=val+this.i;
    }
    public Integer get(){
        return i;
    }
}
