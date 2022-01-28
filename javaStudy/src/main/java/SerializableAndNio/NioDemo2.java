package SerializableAndNio;

import java.nio.IntBuffer;
import java.util.concurrent.ForkJoinTask;
import java.util.stream.IntStream;

public class NioDemo2 {
    public static void main(String[] args){
        checkBufferStatus();
        ForkJoinTask s;
    }
    public static void checkBufferStatus(){
        try{
            IntBuffer buffer = IntBuffer.allocate(1024);
            buffer.get();
            printBufferStatus("get",buffer);
            buffer.mark();
            printBufferStatus("mark",buffer);
            buffer.get();
            printBufferStatus("get",buffer);
            buffer.reset();
            printBufferStatus("reset",buffer);
            buffer.rewind();
            printBufferStatus("rewind",buffer);
            buffer.clear();
            printBufferStatus("clear",buffer);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void printBufferStatus(String job, IntBuffer buffer){
        System.out.println("Buffer "+job+ " !!");
        System.out.format("Buffer position=%d remaining=%d limit=%d\n",buffer.position(),buffer.remaining(),buffer.limit());
    }
    public static void checkBuffer(){
        try{
            IntBuffer buffer = IntBuffer.allocate(1024);
            IntStream.range(0,100).forEach(num->buffer.put(num));
            System.out.println("Buffer capacity : " + buffer.capacity() );
            System.out.println("Buffer limit    : " + buffer.limit() );
            System.out.println("Buffer position : " + buffer.position() );
            buffer.flip();
            System.out.println("Buffer flipped!");
            System.out.println("Buffer limit    : " + buffer.limit() );
            System.out.println("Buffer position : " + buffer.position() );
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
