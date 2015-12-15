/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Inya
 */
public class REVISI {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("10.151.43.147", 6666);
        
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String test = input.readLine();
        System.out.println(test);
        String soal = input.readLine();
        System.out.println(soal);
        
        String ii ;
        Scanner input_user = new Scanner(System.in);
        ii = input_user.nextLine ();
        String request = "Username:"+ ii + "\n" ;
       
        writer.write(request);
        writer.flush();
        
        test = input.readLine();
        System.out.println(test);
        soal = input.readLine();
        System.out.println(soal);
        
            while (true){
                String split[] = soal.split(" ");
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println(split[2]);

                int angka1 = Integer.parseInt(split[0]);
                int angka2 = Integer.parseInt(split[2]);
                int hasil = 0;

                if(split[1].equals("+")){
                    System.out.println("masuk +");
                    hasil = angka1 + angka2;        
                }
                else if(split[1].equals("-")){
                    System.out.println("masuk -");
                    hasil = angka1 - angka2;        
                }
                else if(split[1].equals("x")){
                    System.out.println("masuk x");
                    hasil = angka1 * angka2;        
                }
                else if(split[1].equals("mod")){
                    System.out.println("masuk mod");
                    hasil = angka1 % angka2;        
                }

                System.out.println(hasil);
                String jawab = "Result:" + hasil + "\n";
                System.out.println(jawab);
                writer.write(jawab);
                writer.flush();

                test = input.readLine();
                System.out.println(test);
                if (test.equals("Hash:")){
                    break;
                }
                soal = input.readLine();
                System.out.println(soal);
                
            }
            String leng = input.readLine();
            System.out.println(leng);
            String isi = input.readLine();
            System.out.println(isi);
            
            String jawab = "Hash:" + isi + "\n";
            System.out.println(jawab);
            writer.write(jawab);
            writer.flush();
            
            test = input.readLine();
            System.out.println(test);

    }
    
}
