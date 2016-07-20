package test; 

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
 
public class CMDexe {

    public static void main(String[] args) {
        String[] cmd = new String[] { "cmd.exe", "/C", "ipconfig /all" };
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            
            new Thread(new StreamDrainer(process.getInputStream())).start();
            new Thread(new StreamDrainer(process.getErrorStream())).start();
            
            process.getOutputStream().close();

            int exitValue = process.waitFor();
            System.out.println("∑µªÿ÷µ£∫" + exitValue);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
}

class StreamDrainer implements Runnable {
    private InputStream ins;

    public StreamDrainer(InputStream ins) {
        this.ins = ins;
    }

    public void run() {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(ins));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
