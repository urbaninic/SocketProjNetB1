/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author nicou
 */
public class MainClient {
    Socket socket;
    BufferedReader bufRead;
    BufferedWriter bufWrite;
    
    public MainClient(InetAdress ip, int port{
        socket = new Socket(ip,port);
    }
    
    
}
