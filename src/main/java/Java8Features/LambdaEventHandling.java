package Java8Features;

import javax.swing.*;

public class LambdaEventHandling {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Event Handling");
        JButton button = new JButton("Hii Tanu");

        button.addActionListener(e -> System.out.println("Button Clicked"));

        frame.add(button);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
