package com.com.util.file;

import java.io.*;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * @comments: 文件的压缩与解压缩
 * @author: binvy
 * @Date: 2018/4/4
 */
public class ZipUtil {
    public static void zipFile(String srcFile, String zipFile) throws IOException {
        String temp = "";
        File src = new File(srcFile);
        File zip = new File(zipFile);
        if (!src.exists()) {
            System.out.println("要压缩的文件" + srcFile + "不存在");
        }
        if (!zip.getParentFile().exists()) {
            zip.getParentFile().mkdirs();
        }
        ZipOutputStream zos = null;
        Charset charset = Charset.forName("GBK");
        try {
            zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zip)), charset);
            zip(src, zos, temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (zos != null) {
                zos.flush();
            }
            zos.close();
        }


    }

    private static void zip(File src, ZipOutputStream zos, String temp) throws IOException {
        if (src.isDirectory()) {
            String str = temp + src.getName() + "/";
            zos.putNextEntry(new ZipEntry(str));
            File[] files = src.listFiles();
            for ( File file : files
                   ) {
                zip0(file, zos, str);
            }
        } else {
            zip0(src, zos, temp);
        }
    }

    public static void zip0(File src, ZipOutputStream zos, String temp) throws IOException {
        zos.setLevel(-1);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        zos.putNextEntry(new ZipEntry(temp + src.getName()));

        byte buf[] = new byte[1024];
        int len = bis.read(buf);
        while (len != -1) {
            zos.write(buf, 0, len);
        }
        zos.closeEntry();
        bis.close();
    }

    public static void unzip(String zipFile) throws IOException {
        File zip = new File(zipFile);
        ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(zip)), Charset.forName("GBK"));
        ZipEntry entry = zis.getNextEntry();
        while (entry != null) {
            if (entry.isDirectory()){
                File file = new File(zip.getParentFile().getName() + "/" + entry.getName());
                if (!file.exists()) {
                    file.mkdirs();
                } else {
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] buf = new byte[1024];
                    int len = zis.read(buf);
                    while (len != -1) {
                        bos.write(buf, 0, len);
                    }
                    zis.closeEntry();
                    bos.close();
                }
                zis.close();
            }
        }
    }
}
