package com.example.testmainactivity.tool;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionTool {

    private URL url;
    private String response ="";

    public ConnectionTool(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    public boolean openConnection() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);
        connection.connect();

        // 獲得返回值
        InputStream in = connection.getInputStream();
        response = getResponse(in);
//        Log.i("response", response);

        connection.disconnect();

        return true;
    }

    private static String getResponse(InputStream in) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuilder builder = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            Log.i("getResponse error"
                    ,e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                Log.i("getResponse error"
                ,e.getMessage());
            }
        }
        return builder.toString();
    }

    public String getResponse(){
        return response;
    }

}
