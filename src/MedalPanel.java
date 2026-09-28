import javax.swing.*;
import java.awt.*;

public class MedalPanel extends JPanel {

    public MedalPanel() {

        setLayout(new GridLayout(4, 1));

        JLabel title = new JLabel("Medal Standings");
        JLabel gold = new JLabel("Gold: 0");
        JLabel silver = new JLabel("Silver: 0");
        JLabel bronze = new JLabel("Bronze: 0");

        add(title);
        add(gold);
        add(silver);
        add(bronze);
    }
}
