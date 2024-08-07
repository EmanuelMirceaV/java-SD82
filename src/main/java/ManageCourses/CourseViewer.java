package ManageCourses;

import Inheritance.Module1;
import Inheritance.Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseViewer {

    public static void main(String[] args) {

        // 1. Create the GUI Frame

        // =============================================
        // Classes & Objects
        // Methods
        JFrame frame = new JFrame("Course Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        // Create the main desktop pane to hold internal frames
        JDesktopPane desktop = new JDesktopPane();

        // 2. Implement Buttons
        // =============================================
        JButton showCourseButton = new JButton("Show Course Info");
        JButton displayStudentsButton = new JButton("Display Student");

        // Inheritance
        Module1 module1 = new Module1();
        Module2 module2 = new Module2();

        // Polymorphism
        showCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame courseFrame = createInternalFrame1("Modules Info:", module1, module2);
                desktop.add(courseFrame);
            }
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(showCourseButton);        // Add the first button to the panel
        buttonsPanel.add(displayStudentsButton);   // Add the second button to the panel

        frame.add(buttonsPanel, BorderLayout.NORTH);
        frame.add(desktop, BorderLayout.CENTER);  // 1.
        frame.setVisible(true);                   // 1.

    }

    // Custom Method
    private static JInternalFrame createInternalFrame1(String title, Module1 content1, Module2 content2){
        JInternalFrame internalFrame = new JInternalFrame(title, true,true,true,true);
        internalFrame.setSize(300,170);
        internalFrame.setVisible(true);

        return internalFrame;
    }


}
