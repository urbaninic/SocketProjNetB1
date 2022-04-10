/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.rmi.runtime.Log;


/**
 *
 * @author nicou
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            // apertura socket con IP + SERVER
            Socket socket = new Socket("127.0.0.1", 2000);
            System.out.println("Questo è il CLIENT");
            // verifica connessione            
            //System.out.println(socket.isConnected());
            
            BufferedReader bufRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String receivedMess = bufRead.readLine();
            
            // stampa su output
            System.out.println(receivedMess);
            
            
            //punto 2 es.2
            BufferedWriter bufWrite = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            String sendMess = "Richiedo connessione - dammi l'ora";
            bufWrite.write(sendMess+"\n\r");
            bufWrite.flush();
            
            BufferedReader ora = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String receiveTime = ora.readLine();
            System.out.println("Ecco a te l'ora: " + receiveTime);
            
            socket.close();
        } catch (IOException ex) {
            System.out.println("Errore");
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
