import javax.swing.*;
import java.awt.*;

public class SportsManagementApplication {


    JFrame applicationFrame;

    public SportsManagementApplication() {

        applicationFrame = new JFrame("Sports Management System");

        applicationFrame.setSize(1000, 600);

        applicationFrame.setLayout(new BorderLayout());


        HeaderPanel headerPanel = new HeaderPanel();
        NavigationPanel navigationPanel = new NavigationPanel();
        ResultPanel resultPanel = new ResultPanel();
        MedalPanel medalPanel = new MedalPanel();
        FooterPanel footerPanel = new FooterPanel();

        applicationFrame.add(headerPanel, BorderLayout.NORTH);
        applicationFrame.add(navigationPanel, BorderLayout.WEST);
        applicationFrame.add(resultPanel, BorderLayout.CENTER);
        applicationFrame.add(medalPanel, BorderLayout.EAST);
        applicationFrame.add(footerPanel, BorderLayout.SOUTH);

        applicationFrame.setVisible(true);
    }
}
