import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SportsManagementApplicationTest {

    private SportsManagementApplication app;

    @BeforeEach
    void setUp() {
        app = new SportsManagementApplication();
    }

    @Test
    void testHeaderPanel() {
        assertNotNull(app.applicationFrame.getContentPane()
                        .getComponent(0),
                "Header panel should be added");
    }

    @Test
    void testNavigationPanel() {
        assertNotNull(app.applicationFrame.getContentPane()
                        .getComponent(1),
                "Navigation panel should be added");
    }

    @Test
    void testResultPanel() {
        assertNotNull(app.applicationFrame.getContentPane()
                        .getComponent(2),
                "Result panel should be added");
    }

    @Test
    void testMedalPanel() {
        assertNotNull(app.applicationFrame.getContentPane()
                        .getComponent(3),
                "Medal panel should be added");
    }

    @Test
    void testFooterPanel() {
        assertNotNull(app.applicationFrame.getContentPane()
                        .getComponent(4),
                "Footer panel should be added");
    }
}