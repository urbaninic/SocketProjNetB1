/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author nicou
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // socket è oggetto DataSocket
            
            // creazione istanza della classe serversocket con porta di ascolto (sufficiente che sia >1024)
            ServerSocket serSock = new ServerSocket(2000);
            
            // istruzione per far rimanere il server in ascolto di richiesta di connessione
            Socket socket = serSock.accept();
            
            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bf = new BufferedWriter(osw);
            
            // scrittura messaggio benvenuto
            bf.write("Ciao");
            bf.flush();
            
            // ricezione richiesta connessione da client
            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            
            String riceviMess = br.readLine();
            
            // stampa stringa
            System.out.println(riceviMess);
            
            // Associo a oggetto socket possibilità di lettura
            /*
            
            // scrivere al Client un messaggio di saluto dopo l'avvenuta connessione
            System.out.println("Connessione avvenuta");
            System.out.println(bufRead);*/
            // chiusura connessione 
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

    }
    
}
