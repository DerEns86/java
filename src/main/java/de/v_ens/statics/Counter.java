package de.v_ens.statics;

public class Counter {

    public static int totalCount = 0;

    protected int instanceCount;

    public Counter (){
        this.instanceCount = 0;
    }

    public void incrementInstanceCount(){
         this.instanceCount++;
    }


    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                '}';
    }


}
