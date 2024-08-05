package ManageCourses;

import javax.swing.*;
import java.awt.*;

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

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.add(showCourseButton);        // Add the first button to the panel
        buttonsPanel.add(displayStudentsButton);   // Add the second button to the panel

        frame.add(buttonsPanel, BorderLayout.NORTH);
        frame.add(desktop, BorderLayout.CENTER);  // 1.
        frame.setVisible(true);                   // 1.

    }


}
