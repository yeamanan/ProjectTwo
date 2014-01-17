package com.yeamanan.projecttwo.service;

//import org.apache.log4j.Logger;

/**
 * GenericService class.
 *
 * @author Yeam Anan (<yeamanan|at|gmail|dot|com>)
 */
public class GenericService {

    /**
     * Logger.
     */
//    private static final Logger LOG = Logger.getLogger(GenericService.class);
    
    /**
     * Object folder in jar.
     */
    protected final transient String folder;

    /**
     * XML file's extension.
     */
    protected final transient String extension;

    /**
     * Type of generic.
     */
    protected final transient Class gClass;

    /**
     * Constructor.
     *
     * @param argFolder the folder where are those xml file
     * @param argExtension the extension of the xml file
     * @param argClass a class
     */
    protected GenericService(final String argFolder, final String argExtension,
                             final Class argClass) {
        this.folder = argFolder;
        this.extension = argExtension;
        this.gClass = argClass;
    }

}
