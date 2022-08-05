package com.xiaobai.networkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * @paogram: com.xiaobai.networkProgramming
 * @description: the Socket Server class
 * @author: CodeXiaoBai
 * @createDate: 2022-08-01
 */

public class GreetingServer extends Thread{
    private ServerSocket serverSocket;

    public GreetingServer (int port) throws IOException {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }

    public void run() {
        while (true) {
            try {
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort());
                Socket socket = serverSocket.accept();
                System.out.println("远程主机地址：" + socket.getRemoteSocketAddress());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                System.out.println(dataInputStream.readUTF());
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeUTF("谢谢连接我：" + socket.getRemoteSocketAddress() + "\nGoodBye!");
                socket.close();
            }catch (SocketTimeoutException socketTimeoutException) {
                System.out.println("Socket time out!");
                break;
            }catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String[] args) {
        int port = Integer.parseInt(args[0]);
        try {
            Thread t = new GreetingServer(port);
            t.run();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
