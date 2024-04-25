import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




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
        initComponents();
    }

    private void initComponents() {
        listModel = new DefaultListModel<>();
        eventList = new JList<>(listModel);
        addButton = new JButton("Add Event");
        editButton = new JButton("Edit Event");
        deleteButton = new JButton("Delete Event");

        setLayout(new BorderLayout());
        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(addButton);
        controlPanel.add(editButton);
        controlPanel.add(deleteButton);

        add(new JScrollPane(eventList), BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Event newEvent = createNewEvent();
                if (newEvent != null) {
                    events.add(newEvent);
                    updateEventList();
                }
            }
        });

    }
    private Event createNewEvent() {
     return null;
    }


    private void updateEventList() {
    }
}

