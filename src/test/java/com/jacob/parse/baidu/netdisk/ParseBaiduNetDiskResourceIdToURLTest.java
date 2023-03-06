package com.jacob.parse.baidu.netdisk;

import com.jacob.parse.baidu.netdisk.ParseBaiduNetDiskResourceIdToURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 */
public class ParseBaiduNetDiskResourceIdToURLTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String out = ParseBaiduNetDiskResourceIdToURL.parse(line);
            System.out.println(out);
        }
    }
}