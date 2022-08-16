package com.freeit.lesson20.input_output;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.util.Base64;

public class TextFileREaderExample {
    public static void main(String[] args) throws Exception {

        File file = new File("task.txt");


        URL url = new URL("https://raw.githubusercontent.com/iryna-pantsialeyeva/freeit/main/src/task1/Hello.java");
        URLConnection uc;
        uc = url.openConnection();
        InputStream inputStream = uc.getInputStream();

        try (BufferedInputStream bis = new BufferedInputStream(inputStream)) {
            int text = bis.read();
            while (text != -1) {
                    System.out.print((char)text);
                text = bis.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
