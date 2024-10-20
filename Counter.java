import java.io.IOException;

public class Counter implements AutoCloseable {

    private int counter = 0;
    private boolean closed= false;

    void add() throws IOException{
        if (closed) throw new IOException("resource is closed");
        counter++;
    }

    int getValue(){
        return counter;
    }

    @Override
    public void close() throws Exception{
        closed=true;

    }
    
}
