package org.DDD;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Generator generator = new Generator();
        SwingUtilities.invokeLater(Generator::new);
    }
}
