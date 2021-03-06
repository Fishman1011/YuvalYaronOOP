package gui;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



@SuppressWarnings("serial")
public class P_algo2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtMac;
	private JTextField txtMac_1;
	private JTextField txtMac_2;
	private JTextField txtSignal;
	private JTextField txtSignal_1;
	private JTextField txtSignal_2;
	private JTextField textLon;
	private JTextField textLat;
	private JTextField textAlt;
	private JLabel lblMac;
	private JLabel lblSignal;
	private JButton btnNewButton_1;
	private JButton btnSubmit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					P_algo2 frame = new P_algo2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public P_algo2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 531, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlgorithm = new JLabel("Find user loction");
		lblAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorithm.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblAlgorithm.setBounds(137, 11, 188, 35);
		contentPane.add(lblAlgorithm);

		textField = new JTextField();
		textField.setBounds(15, 107, 476, 26);
		contentPane.add(textField);
		textField.setColumns(10);


		txtMac = new JTextField();
		txtMac.setHorizontalAlignment(SwingConstants.CENTER);
		txtMac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMac.setText("");

			}
		});
		txtMac.setText("MAC 1");
		txtMac.setBounds(37, 200, 146, 26);
		contentPane.add(txtMac);
		txtMac.setColumns(10);
		txtMac.setEnabled(false);
		txtMac.setEditable(false);
		JRadioButton jradio3val = new JRadioButton("Three Mac and Signal Input");
		jradio3val.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jradio3val.isSelected())
				{

					textField.setEnabled(false);
					txtMac.setEnabled(true);
					txtMac_1.setEnabled(true);
					txtMac_2.setEnabled(true);			
					txtSignal.setEnabled(true);
					txtSignal_1.setEnabled(true);
					txtSignal_2.setEnabled(true);

					textField.setEditable(false);
					txtMac.setEditable(true);
					txtMac_1.setEditable(true);
					txtMac_2.setEditable(true);
					txtSignal.setEditable(true);
					txtSignal_1.setEditable(true);
					txtSignal_2.setEditable(true);

					txtMac.setText("MAC 1");
					txtMac_1.setText("MAC 2");
					txtMac_2.setText("MAC 3");
					txtSignal.setText("Signal 1");
					txtSignal_1.setText("Signal 2");
					txtSignal_2.setText("Signal 3");




				}
			}
		});
		jradio3val.setBounds(15, 145, 252, 29);
		contentPane.add(jradio3val);

		jradio3val.setActionCommand("enable");
		jradio3val.setEnabled(true);


		JRadioButton jradioString = new JRadioButton("String Line From \"nogps\" File Input");
		jradioString.setSelected(true);
		jradioString.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jradioString.isSelected())
				{

					textField.setEnabled(true);
					txtMac.setEnabled(false);
					txtMac_1.setEnabled(false);
					txtMac_2.setEnabled(false);

					txtSignal.setEnabled(false);
					txtSignal_1.setEnabled(false);
					txtSignal_2.setEnabled(false);

					textField.setEditable(true);
					txtMac.setEditable(false);
					txtMac_1.setEditable(false);
					txtMac_2.setEditable(false);
					txtSignal.setEditable(false);
					txtSignal_1.setEditable(false);
					txtSignal_2.setEditable(false);

					txtMac.setText("MAC 1");
					txtMac_1.setText("MAC 2");
					txtMac_2.setText("MAC 3");
					txtSignal.setText("Signal 1");
					txtSignal_1.setText("Signal 2");
					txtSignal_2.setText("Signal 3");

				}

			}
		});
		jradioString.setBounds(15, 66, 293, 29);
		contentPane.add(jradioString);

		jradioString.setActionCommand("enable");
		jradioString.setEnabled(true);

		ButtonGroup bt=new ButtonGroup();
		bt.add(jradioString);
		bt.add(jradio3val);




		txtMac_1 = new JTextField();
		txtMac_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMac_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMac_1.setText("");
			}
		});
		txtMac_1.setText("MAC 2");
		txtMac_1.setColumns(10);
		txtMac_1.setBounds(37, 242, 146, 26);
		contentPane.add(txtMac_1);
		txtMac_1.setEnabled(false);
		txtMac_1.setVisible(true);
		txtMac_1.setEditable(false);
		txtMac_2 = new JTextField();
		txtMac_2.setHorizontalAlignment(SwingConstants.CENTER);

		txtMac_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMac_2.setText("");
			}
		});
		txtMac_2.setText("MAC 3");
		txtMac_2.setColumns(10);
		txtMac_2.setBounds(37, 284, 146, 26);
		contentPane.add(txtMac_2);
		txtMac_2.setEnabled(false);
		txtMac_2.setVisible(true);
		txtMac_2.setEditable(false);
		txtSignal = new JTextField();
		txtSignal.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtSignal.setText("");
			}
		});
		txtSignal.setText("Signal 1");
		txtSignal.setColumns(10);
		txtSignal.setBounds(216, 200, 146, 26);
		contentPane.add(txtSignal);
		txtSignal.setEnabled(false);
		txtSignal.setVisible(true);
		txtSignal.setEditable(false);
		txtSignal_1 = new JTextField();
		txtSignal_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignal_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtSignal_1.setText("");
			}
		});
		txtSignal_1.setText("Signal 2");
		txtSignal_1.setColumns(10);
		txtSignal_1.setBounds(216, 242, 146, 26);
		contentPane.add(txtSignal_1);
		txtSignal_1.setEnabled(false);
		txtSignal_1.setVisible(true);
		txtSignal_1.setEditable(false);
		txtSignal_2 = new JTextField();
		txtSignal_2.setHorizontalAlignment(SwingConstants.CENTER);

		txtSignal_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtSignal_2.setText("");
			}
		});
		txtSignal_2.setText("Signal 3");
		txtSignal_2.setColumns(10);
		txtSignal_2.setBounds(216, 284, 146, 26);
		contentPane.add(txtSignal_2);
		txtSignal_2.setEnabled(false);
		txtSignal_2.setVisible(true);
		txtSignal_2.setEditable(false);

		textLon = new JTextField();
		textLon.setEditable(false);
		textLon.setColumns(10);
		textLon.setBounds(191, 372, 134, 26);
		contentPane.add(textLon);

		JLabel lblLat = new JLabel("Lat");
		lblLat.setBounds(66, 345, 69, 20);
		contentPane.add(lblLat);

		JLabel lblLon = new JLabel("Lon");
		lblLon.setBounds(240, 345, 69, 20);
		contentPane.add(lblLon);

		JLabel lblAlt = new JLabel("Alt");
		lblAlt.setBounds(409, 345, 69, 20);
		contentPane.add(lblAlt);

		textLat = new JTextField();
		textLat.setEditable(false);
		textLat.setColumns(10);
		textLat.setBounds(15, 372, 134, 26);
		contentPane.add(textLat);

		textAlt = new JTextField();
		textAlt.setEditable(false);
		textAlt.setColumns(10);
		textAlt.setBounds(359, 372, 134, 26);
		contentPane.add(textAlt);

		lblMac = new JLabel("MAC");
		lblMac.setBounds(77, 174, 69, 20);
		contentPane.add(lblMac);

		lblSignal = new JLabel("Signal");
		lblSignal.setBounds(260, 174, 69, 20);
		contentPane.add(lblSignal);

		btnNewButton_1 = new JButton("Add estimated Loction to no-GPS file");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent args0) {
					GUI_Wrapper.chooseNoGPSFile();
					GUI_Wrapper.saveTOCSV(GUI_Wrapper.CSVType.Algo2);

			}
		});



		btnNewButton_1.setBounds(134, 437, 247, 29);
		contentPane.add(btnNewButton_1);

		btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List<String> input = new ArrayList<String>();

				
				if(jradio3val.isSelected()) {
					input.add(txtMac.getText());
					input.add(txtSignal.getText());
					input.add(txtMac_1.getText());
					input.add(txtSignal_1.getText());
					input.add(txtMac_2.getText());
					input.add(txtSignal_2.getText());
				}
				else if(jradioString.isSelected()) {
					String[] line = textField.getText().split(",");
					for (int i = 6; i < line.length; i += 4) {
						input.add(line[i+1]);
						input.add(line[i+2]);						
					}
				}

					List<Double> output = GUI_Wrapper.algo2user(input);
					textAlt.setText(output.get(0).toString());
					textLon.setText(output.get(0).toString());
					textLat.setText(output.get(0).toString());
				

			}
		});

		btnSubmit.setBounds(392, 212, 99, 86);
		contentPane.add(btnSubmit);

	}

}
