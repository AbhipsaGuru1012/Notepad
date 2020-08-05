import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class notepad extends JFrame implements ActionListener{
	JTextArea ta1;
	JScrollPane p1;
	notepad(){
		setTitle("Notepad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta1=new JTextArea();
		p1=new JScrollPane(ta1);
		add(p1);
		JMenuBar mbr=new JMenuBar();
		add(mbr,BorderLayout.NORTH);
		JMenu file=new JMenu("FILE");
		JMenu edit=new JMenu("EDIT");
		mbr.add(file);
		mbr.add(edit);
		
		JMenuItem copy=new JMenuItem("COPY");
		JMenuItem paste=new JMenuItem("PASTE");
		JMenuItem selectall=new JMenuItem("SELECT ALL");
		JMenuItem cut=new JMenuItem("CUT");
		JMenuItem today=new JMenuItem("TODAY");
		
		edit.add(copy);
		edit.add(paste);
		edit.add(selectall);
		edit.add(cut);
		edit.add(today);
		
		setVisible(true);
		setSize(400,400);
		copy.addActionListener(this);
		cut.addActionListener(this);
		paste.addActionListener(this);
		selectall.addActionListener(this);
		today.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String text=e.getActionCommand();
		if(text.equals("COPY"))
			ta1.copy();
		if(text.equals("PASTE"))
			ta1.paste();
		if(text.equals("SELECT ALL"))
			ta1.selectAll();
		if(text.equals("CUT"))
			ta1.cut();
		if(text.equals("TODAY"))
			ta1.setText(""+new Date());
		
	}
	public static void main(String[] args) {
		new notepad();
	}
}
