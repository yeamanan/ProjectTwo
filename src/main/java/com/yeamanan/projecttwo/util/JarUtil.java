package com.yeamanan.projecttwo.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.log4j.Logger;

/**
 * JarUtil class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public final class JarUtil {

    /**
     * Logger.
     */
    private static final Logger LOG =
            Logger.getLogger(JarUtil.class);

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
        final String jarPath = url.getPath().substring(5, url.getPath().indexOf("!"));
        try (final JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"))) {
            final Enumeration<JarEntry> entries = jar.entries();
            while (entries.hasMoreElements()) {
                final JarEntry entry = entries.nextElement();
                final String filePathInJar = entry.getName();
                if (filePathInJar.startsWith(pathFolder)
                        && !filePathInJar.matches(pathFolder)) {
                    filePaths.add(filePathInJar);
                }
            }
        } catch (IOException e) {
            LOG.error("Error reading file names in jar", e);
        }
        return filePaths;
    }

}
