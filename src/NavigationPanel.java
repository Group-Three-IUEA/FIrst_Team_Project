import javax.swing.*;
import java.awt.*;

public class NavigationPanel extends JPanel {

    public NavigationPanel() {

        setLayout(new GridLayout(3, 1));

        JButton athletesButton = new JButton("Athletes");
        JButton fixturesButton = new JButton("Fixtures");
        JButton resultsButton = new JButton("Results");

        add(athletesButton);
        add(fixturesButton);
        add(resultsButton);
    }
}