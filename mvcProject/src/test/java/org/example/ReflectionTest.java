package org.example;

import javassist.tools.reflect.Reflection;
import org.example.annotation.Controller;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    @Test
    void controllerScan() {
        Reflections reflection = new Reflections("org.example");

        Set<Class<?>> beans = new HashSet<>();
        beans.addAll(reflection.getTypesAnnotatedWith(Controller.class));

        logger.debug("beans: [{}]", beans);
    }
}
