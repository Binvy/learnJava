package com.tstar.basic;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/1 0001
 */
public class WriteContextFromURL {
    public static void main(String[] args) {
        String url="https://github.com/";
        String regex= "(http|https)://[\\w+\\.?/?]+\\.[A-Za-z]+";
        spiderURL(url, regex,"github");
    }

    private static void spiderURL(String url, String regex, String filename) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = sdf.format(new Date());

        URL realURL = null;
        URLConnection connection = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        PrintWriter pw1 = null;

        Pattern pattern = Pattern.compile(regex);

        try {
            realURL = new URL(url);
            connection = realURL.openConnection();

            File fileDir = new File("E:/spider/" + time);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }

            // save the context from url
            pw = new PrintWriter(new FileWriter("E:/spider/" + time + "/" + filename + "_context.txt"), true);
            pw1 = new PrintWriter(new FileWriter("E:/spider/" + time + "/" + filename + "_URL.txt"), true);

            br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = null;

            while ((line = br.readLine()) != null) {
                pw.println(line);
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    pw1.println(matcher.group());
                }
            }
            System.out.println("spider success!");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
                pw1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
