package com.yeamanan.projecttwo.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * JarUtil class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public final class JarUtil {

    /**
     * Constructor.
     */
    private JarUtil() { }

    /**
     * getJarFolderFileList() method.
     *
     * @param aClass a class
     * @param pathFolder the folder in the jar
     * @return a list of file paths
     */
    public static List<String> getJarFolderFileList(final Class aClass,
            final String pathFolder) {
        final List<String> filePaths = new ArrayList<>();
        final URL url = aClass.getClassLoader().getResource(pathFolder);
        final String jarPath =
                url.getPath().substring(5, url.getPath().indexOf("!"));
        try {
            JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"));
            Enumeration<JarEntry> entries = jar.entries();
            while(entries.hasMoreElements()) {
                final JarEntry entry = entries.nextElement();
                final String filePathInJar = entry.getName();
                if(filePathInJar.startsWith(pathFolder) && !filePathInJar.matches(pathFolder)) {
                    filePaths.add(filePathInJar);
                }
            }
        } catch (IOException e) {
            System.out.printf("Error reading mission file" + e);
        }
        return filePaths;
    }

}
