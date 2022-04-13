/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;
import static com.oracle.jrockit.jfr.ContentType.Timestamp;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
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
//        try {
//            // socket è un oggetto DataSocket
//             System.out.println("Questo è il SERVER");
//            // creazione istanza della classe serversocket con porta di ascolto (sufficiente che sia >1024)
//            ServerSocket serSock = new ServerSocket(2000);
//            
//            // istruzione per far rimanere il server in ascolto di richiesta di connessione
//            // function attendi()
//            Socket socket = serSock.accept(); 
//            OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
//            BufferedWriter bf = new BufferedWriter(osw);
//            
//            // scrittura messaggio benvenuto
//            // function scrivi()
//            bf.write("Ciao\n\r");
//            bf.flush();
//            
//            
//            // ricezione richiesta connessione da client
//            // function leggi()
//            InputStreamReader isr = new InputStreamReader(socket.getInputStream());
//            BufferedReader br = new BufferedReader(isr);
//            
//            String riceviMess = br.readLine();  
//            System.out.println("Esecuzione readline()"+riceviMess+"\n");
//            // stampa stringa + controllo sincronizzazione
//                if(riceviMess.equals("Richiedo connessione - dammi l'ora"))
//                {
//                    System.out.println("Stampo richiesta del client " + riceviMess);
//                    System.out.println("Stampo data e ora: \n");
//                    String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
//                    bf.write(timeStamp+"\n\r");
//                    bf.flush();
//                }
//                else
//                {
//                    System.out.println("Errore nella sincronizzazione");
//                }
//            
//            
//            // chiusura connessione 
//            // metodo chiudiSocket()
//            socket.close();
//            
//            //metodo chiudiserver()
//            
//            //-----------
//            
//            // in main
//            /*MainSever = new mainServer(2000);
//            
//            
//            
//            
//            */
//            
//            
//            
//        } catch (IOException ex) {
//            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//
        MainServer server = new MainServer(2000);
        if(server!=null)
        {
            server.attendi();
        }
   }
    
}
