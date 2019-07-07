/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufma.lsdi.smartlab.service.core;

/**
 *
 * @author carvalhodaniels
 */
public class Debug {
    private static long timestamp;

    public static long getTimestamp() {
        return timestamp;
    }

    public static void setTimestamp(long tstmp) {
        timestamp = tstmp;
    }
    
    public static void addTimestamp(long tstmp) {
        timestamp += tstmp;
    }
    
    public static void subTimestamp(long tstmp) {
        timestamp -= tstmp;
    }
    
    public static void resetTimestamp() {
        timestamp = 0L;
    }
    
    public static String tstmpString() {
        return "timestamp:" + timestamp + "ms";
    }
}
