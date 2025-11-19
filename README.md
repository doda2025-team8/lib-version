# lib-version

lib-version is a Java library. It can read and return the version number defined in pom.xml.  e.g. <version>1.0.0<version>
It is published as a Maven package through GitHub Packages so other repositories use it as a dependency.

-----------------------------------
Using Library
-----------------------------------

Configure GitHub Packages in your pom.xml:
```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://maven.pkg.github.com/doda2025-team8/lib-version</url>
    </repository>
</repositories>
```

AND add the dependency:
```xml
<dependency>
    <groupId>com.yourteam</groupId>
    <artifactId>lib-version</artifactId>
    <version>1.0.0</version>
</dependency>
```
The ```<verion>x.x.x<version>``` is the current official number

-----------------------------------
Usage
-----------------------------------

Example usage:
```xml
import com.yourteam.version.VersionUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(VersionUtils.getVersion());
    }
}
```
This will print the version number from pom.xml.

-----------------------------------
Publishing a new version
-----------------------------------

This repository includes a GitHub Actions workflow that automatically publishes the library to GitHub Packages when a version tag is pushed.

Steps:
1. Make sure the version in pom.xml is correct.  
   It should match the tag you push.  
   If they differ, the workflow will publish the version from pom.xml, not the tag.(DO NOT DO THAT! It breaks the assignment requirements.)
2. Create a tag, for example:

   git tag v1.0.0

3. Push the tag:

   git push origin v1.0.0

GitHub Actions will run automatically and deploy the package.
