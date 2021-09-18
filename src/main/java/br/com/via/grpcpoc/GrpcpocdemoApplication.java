package br.com.via.grpcpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 122
 * https://stackoverflow.com/questions/5170620/unable-to-use-intellij-with-a-generated-sources-folder
 * I'm using Maven (SpringBoot application) solution is:
 *
 * Right click project folder
 * Select Maven
 * Select Generate Sources And Update Folders
 * Then, Intellij automatically import generated sources to project.
 */


@SpringBootApplication
public class GrpcpocdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcpocdemoApplication.class, args);
    }

}
