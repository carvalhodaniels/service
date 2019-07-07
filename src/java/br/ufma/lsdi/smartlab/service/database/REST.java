/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.lsdi.smartlab.service.database;

import br.ufma.lsdi.smartlab.service.core.Debug;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Timestamp;

/**
 *
 * @author carvalhodaniels
 */
public class REST {
    private static final Boolean DEBUG = Boolean.TRUE;
    
    public static String sendGet(String url, String method) throws Exception {
        Timestamp tstmpStart = null, tstmpEnd;
        if(DEBUG)
            tstmpStart = new Timestamp(System.currentTimeMillis());
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod(method);

        //add request header
        //con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        if(responseCode != 200) return null;

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "UTF8"));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        if(DEBUG){
            tstmpEnd = new Timestamp(System.currentTimeMillis());
            Debug.subTimestamp(tstmpEnd.getTime() - tstmpStart.getTime());
        }
        return response.toString();

    }
}
