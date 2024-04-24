import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Calender_manage extends JFrame {
    private List<Event> events = new ArrayList<>();
    private JList<Event> eventList;
    private DefaultListModel<Event> listModel;
    private JButton addButton, editButton, deleteButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calender_manage().setVisible(true));
    }

    public Calender_manage() {
        setTitle("Event Management Calender");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
    }
}


