package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
            try {
                logger.info("Aplicação iniciando...");
                System.out.println("Digite um número: ");
                var scanner = new Scanner(System.in);
                var numero = scanner.nextInt();
            }
            catch(Exception e) {
                logger.error(e.getMessage() + " - " + Arrays.toString(e.getStackTrace()));
            }
        }
}
