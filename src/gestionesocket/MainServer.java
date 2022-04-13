/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nicou
 */
public class MainServer {
   
    int PORT;
    ServerSocket serverSocket;
    
    public MainServer(int port){
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server in ascolto\n");
        } catch(BindException ex){
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void attendi(){
        Socket socket; 
        try {
            socket = serverSocket.accept();
            System.out.println("COnnessione stabilita\n");
            //OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
            //BufferedWriter bf = new BufferedWriter(osw);
        } catch (IOException ex) {
            Logger.getLogger(MainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    
}
