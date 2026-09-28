import javax.swing.*;

public class ResultPanel extends JPanel {

    public ResultPanel() {

        JLabel title = new JLabel("Enter Competition Result");

        JTextField athleteName = new JTextField(15);
        JTextField result = new JTextField(10);

        JButton submitButton = new JButton("Submit");

        add(title);
        add(athleteName);
        add(result);
        add(submitButton);
    }
}
