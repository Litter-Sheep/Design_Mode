package com.xiaobai.networkProgramming;

import java.io.*;
import java.net.Socket;

/**
 * @paogram: com.xiaobai.networkProgramming
 * @description: a Socket Client class
 * @author: CodeXiaoBai
 * @createDate: 2022-08-01
 */

public class GreetingClient {
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        try {
            System.out.println("连接到主机：" + serverName + "端口号：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outputStream = client.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF("Hello from " + client.getLocalAddress());
            InputStream inputStream = client.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println("服务器响应：" + dataInputStream.readUTF());
            client.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
