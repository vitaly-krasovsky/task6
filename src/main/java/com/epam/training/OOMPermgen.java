package com.epam.training;


import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Main application.
 *
 * @author vkrasovsky
 */
public class OOMPermgen {
    private static final Logger LOGGER = LogManager.getLogger(OOMPermgen.class);
    //    public static final String DELIMITER = "------------------------------------------------------------------------";
    public static final String CLASS_NAME_PREFIX = "com.epam.training.Generated_";

    /**
     * @param args the args
     */
    public static void main(String[] args) throws NotFoundException, CannotCompileException {
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                LOGGER.debug(DELIMITER);
//                LOGGER.debug(e.getMessage());
//                LOGGER.debug(DELIMITER);
//            }
//        });
        int count = 0;
        while (true) {
            ClassPool classPool = ClassPool.getDefault();
            CtClass ctClass = classPool.makeClass(CLASS_NAME_PREFIX + count);
            Class clazz = ctClass.toClass();
            count++;
            LOGGER.debug(clazz.getName());
            LOGGER.debug(clazz.getClassLoader());
        }
    }
}
