package SerializableAndNio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import static java.io.File.separator;

public class SerializableDemo {
    public static void main(String[] args){
        String fullPath = separator + "Users" + separator + "ted.sc" + separator + "Desktop" + separator + "git" +
                separator + "javaStudy" + separator + "src" +separator + "SerializableAndNio" + separator + "serial.obj";
        loadObject(fullPath);
    }

    static void loadObject(String fullPath){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(fullPath);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            SerialDTO dto = (SerialDTO)obj;
            System.out.println(dto);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(ois!=null){
                try{
                    ois.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        if(fis!=null){
            try{
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    static void saveObject(String fullPath, SerialDTO dto){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(fullPath); //FileOutputStream 객체 생성
            oos = new ObjectOutputStream(fos);    //ObjectOutputStream 객체를 생성하고, 이때 fos 객체를 매개변수로 넘김. 이렇게 하면 해당 객체가 파일에 저장.
            oos.writeObject(dto); // 메서드의 매개변수로 넘어온 dto 객체 저장
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(oos!=null){
                try{
                    oos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        if(fos!=null){
            try{
                fos.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
