//Kyle Pittman 5/28/2015.
package com.pitstop.learning.test.WriteToFile;

import java.io.File;

public class GetPathOfClass {

    public static void main(String[] args) {

        String internalPath = GetPathOfClass.class.getName().replace(".", "\\");
        String simpleName = GetPathOfClass.class.getSimpleName();
        String externalPath = GetPathOfClass.class.getProtectionDomain().getCodeSource().getLocation().getPath().substring(1).replace("/", "\\"). replace("%20", " ");
        String path = externalPath + internalPath.replace(simpleName, "");
        path = path.replace("out\\production\\General", "src");

        System.out.println(internalPath);
        System.out.println(simpleName);
        System.out.println(externalPath);
        System.out.println(path);
        /**
        System.out.println(GetPathOfClass.class.getName().replace(".", "\\"));
        System.out.println(GetPathOfClass.class.getSimpleName());

        System.out.println(GetPathOfClass.class.getName().replace(".", "\\").substring(0,GetPathOfClass.class.getName().lastIndexOf(GetPathOfClass.class.getSimpleName())));
        /**
         * C:\Java Workspace\General\src\com\pitstop\learning\test\WriteToFile\GetPathOfClass.java
         * C:\Java Workspace\General\out\production\General\com\pitstop\learning\test\WriteToFile\
         */

        //System.out.println("\n" + GetPathOfClass.class.getProtectionDomain().getCodeSource().getLocation().getPath().substring(1).replace("/", "\\"). replace("%20", " "));
    }
}
