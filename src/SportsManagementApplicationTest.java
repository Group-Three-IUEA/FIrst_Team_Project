import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;
import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class SportsManagementApplicationTest {

    private SportsManagementApplication app;

    @BeforeEach
    void setUp() {
        app = new SportsManagementApplication();
    }

    @Test
    void testFrameInitializationAndTitle() {
        assertNotNull(app.applicationFrame, "JFrame should be initialized");
        assertEquals("Sports Management System", app.applicationFrame.getTitle(), "Frame title should match");
    }

    @Test
    void testLayoutManagerIsBorderLayout() {
        LayoutManager layout = app.applicationFrame.getLayout();
        assertTrue(layout instanceof BorderLayout, "Layout manager must be an instance of BorderLayout");
    }

    @Test
    void testFrameIconIsSet() {
        Image icon = app.applicationFrame.getIconImage();
        assertNotNull(icon, "Application icon should be set and not null");
    }
}