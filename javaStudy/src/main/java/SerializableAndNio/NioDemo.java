package SerializableAndNio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
    public static void main(String[] args){
        basicWriteAndRead();
    }
    public static void basicWriteAndRead(){
        String fileName = "/Users/ted.sc/Desktop/git/javaStudy/src/SerializableAndNio/nio.txt";
        try{
            writeFile(fileName, "My first NIO sample.");
            readFile(fileName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void writeFile(String fileName, String data) throws Exception{
        FileChannel channel = new FileOutputStream(fileName).getChannel(); // FileChannel 객체를 생성
        byte[] byteData = data.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(byteData); // 매개 변수로 저장할 byte 배열을 넘겨받고, ByteBuffer 객체 생성
        channel.write(buffer); // 매개변수로 buffer 객체를 넘겨받고, 파일에 쓰는 기능
        channel.close();
    }
    public static void readFile(String fileName) throws Exception{
        FileChannel channel = new FileInputStream(fileName).getChannel(); //FileChannel 객체를 생성
        ByteBuffer buffer = ByteBuffer.allocate(1024); //매개변수로 데이터가 저장되는 크기를 정하여 ByteBuffer 객체 생성
        channel.read(buffer); //매개변수로 buffer 객체를 넘겨받고, 데이터를 이 버퍼에 담으라고 알려줌. buffer에 데이터가 담기기 시작.
        buffer.flip(); // buffer에 담겨있는 데이터의 가장 앞으로 이동

        while (buffer.hasRemaining()) // hasRemaining() 메소드로 데이터가 더 남아 있는지 식별
            System.out.print((char)buffer.get());

        channel.close();
    }
}
