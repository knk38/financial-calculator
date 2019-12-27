import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.event.AncestorListener;
import javax.swing.table.TableModel;
import javax.swing.event.AncestorEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class ApplicationWindow {

	private JFrame frame;
	private JTextField inputIncome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationWindow window = new ApplicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static ArrayList<Double> transactions = new ArrayList<>();
	Object tabledat[][] = { {1, 2} , { 4, 5} };
	Object[] titles = {"Transactions"};
	boolean isdone = false;
	boolean calculatingincome = true;
	private JTextField inputExpense;
	private JTextField yearsToSimulate;
	
	private void switchPages(JPanel from, JPanel to){
		from.setVisible(false);
		to.setVisible(true);
	}
			
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1128, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ButtonGroup factorButtonsI = new ButtonGroup();
		ButtonGroup buttongroupE = new ButtonGroup();
		
				
		//																				BEGIN EXPENSE RADIO BUTTONS
		

		
		JPanel transactionsPage = new JPanel();
		transactionsPage.setBounds(0, 0, 1112, 668);
		frame.getContentPane().add(transactionsPage);
		transactionsPage.setLayout(null);
		transactionsPage.setVisible(false);
		
			
		

		JPanel mainTitle_1 = new JPanel();
		mainTitle_1.setBounds(0, 0, 1112, 668);
		frame.getContentPane().add(mainTitle_1);
		mainTitle_1.setLayout(null);
		mainTitle_1.setVisible(true);
		
				JLabel mainTitle = new JLabel("Financial Simulator");
				mainTitle.setBounds(0, 5, 1112, 208);
				mainTitle_1.add(mainTitle);
				mainTitle.setHorizontalAlignment(SwingConstants.CENTER);
				mainTitle.setFont(new Font("Constantia", Font.PLAIN, 53));
				
				JButton startProgrambtn = new JButton("Start");
				startProgrambtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
				startProgrambtn.setBounds(447, 266, 183, 57);
				mainTitle_1.add(startProgrambtn);
				
				JButton btnNewButton_1 = new JButton("Help");
				btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 19));
				btnNewButton_1.setBounds(447, 360, 183, 57);
				mainTitle_1.add(btnNewButton_1);
		
																		
																												// START MAIN MENU
				JPanel mainMenu = new JPanel();
				mainMenu.setBounds(0, 0, 1112, 668);
				frame.getContentPane().add(mainMenu);
				mainMenu.setLayout(null);
				mainMenu.setVisible(false);
				
				JLabel lblNewLabel_3 = new JLabel("Main Menu");
				lblNewLabel_3.setBounds(0, 0, 1112, 94);
				mainMenu.add(lblNewLabel_3);
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
				
				JButton btnAddAnIncome = new JButton("Add a Source of Income");

				btnAddAnIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				btnAddAnIncome.setBounds(411, 133, 302, 74);
				mainMenu.add(btnAddAnIncome);
				
				JButton btnAddAnExpense = new JButton("Add an Expense");
				btnAddAnExpense.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				btnAddAnExpense.setBounds(411, 243, 302, 74);
				mainMenu.add(btnAddAnExpense);
				
				JButton btnViewTotalIncomesexpenses = new JButton("View total Incomes/Expenses");
				btnViewTotalIncomesexpenses.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
				btnViewTotalIncomesexpenses.setBounds(411, 359, 302, 74);
				mainMenu.add(btnViewTotalIncomesexpenses);
				
				JButton btntoTitle = new JButton("Return to Title");
				btntoTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
				btntoTitle.setBounds(411, 470, 302, 74);
				mainMenu.add(btntoTitle);
				
		//																						END MAIN MENU /    BEGIN INCOME PAGE
		JPanel incomePage = new JPanel();
		incomePage.setBounds(0, 0, 1112, 668);
		frame.getContentPane().add(incomePage);
		incomePage.setLayout(null);
		incomePage.setVisible(false);
		
		JLabel lblAnnual = new JLabel("Annual");
		lblAnnual.setBounds(10, 217, 150, 74);
		incomePage.add(lblAnnual);
		lblAnnual.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnnual.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		
				JLabel lblNewLabel = new JLabel("Biannual");
				lblNewLabel.setBounds(10, 302, 150, 74);
				incomePage.add(lblNewLabel);
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
				
						JLabel incomeTitle = new JLabel("Enter a source of income: (in USD)");
						incomeTitle.setBounds(305, 5, 406, 38);
						incomePage.add(incomeTitle);
						incomeTitle.setHorizontalAlignment(SwingConstants.CENTER);
						incomeTitle.setFont(new Font("Palatino Linotype", Font.PLAIN, 27));
						
								JLabel lblNewLabel_1 = new JLabel("Monthly");
								lblNewLabel_1.setBounds(10, 382, 150, 82);
								incomePage.add(lblNewLabel_1);
								lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
								lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
								
										JLabel lblNewLabel_2 = new JLabel("Weekly");
										lblNewLabel_2.setBounds(10, 475, 150, 82);
										incomePage.add(lblNewLabel_2);
										lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
										lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
										
												JLabel lblDaily = new JLabel("Daily");
												lblDaily.setBounds(10, 568, 150, 89);
												incomePage.add(lblDaily);
												lblDaily.setHorizontalAlignment(SwingConstants.CENTER);
												lblDaily.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));


												JRadioButton annualBtn = new JRadioButton("");
												factorButtonsI.add(annualBtn);
												annualBtn.setBounds(168, 217, 90, 74);
												incomePage.add(annualBtn);
												annualBtn.setSelected(true);
												annualBtn.setHorizontalAlignment(SwingConstants.CENTER);
												
												
														JRadioButton biannualBtn = new JRadioButton("");
														factorButtonsI.add(biannualBtn);
														biannualBtn.setBounds(170, 302, 88, 74);
														incomePage.add(biannualBtn);
														biannualBtn.setHorizontalAlignment(SwingConstants.CENTER);
														
														
														
																JRadioButton monthlyBtn = new JRadioButton("");
																factorButtonsI.add(monthlyBtn);
																monthlyBtn.setBounds(166, 382, 92, 74);
																incomePage.add(monthlyBtn);
																monthlyBtn.setHorizontalAlignment(SwingConstants.CENTER);
																
																
																		JRadioButton weeklyBtn = new JRadioButton("");
																		factorButtonsI.add(weeklyBtn);
																		weeklyBtn.setBounds(166, 471, 92, 86);
																		incomePage.add(weeklyBtn);
																		weeklyBtn.setHorizontalAlignment(SwingConstants.CENTER);
																		
																		
																				JRadioButton dailyBtn = new JRadioButton("");
																				factorButtonsI.add(dailyBtn);
																				dailyBtn.setBounds(166, 568, 92, 89);
																				incomePage.add(dailyBtn);
																				dailyBtn.setHorizontalAlignment(SwingConstants.CENTER);
																				
																				
																						JLabel lblWhatIsThe = new JLabel("What is the frequency?");
																						lblWhatIsThe.setBounds(10, 168, 248, 38);
																						incomePage.add(lblWhatIsThe);
																						lblWhatIsThe.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
																						
																								inputIncome = new JTextField();
																								inputIncome.setBounds(534, 230, 349, 50);
																								incomePage.add(inputIncome);
																								inputIncome.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
																								inputIncome.setColumns(10);
																								
																								JLabel lblNewLabel_4 = new JLabel("$");
																								lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
																								lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 37));
																								lblNewLabel_4.setBounds(475, 232, 59, 45);
																								incomePage.add(lblNewLabel_4);
																								
																								JButton btnEnterincome = new JButton("Enter");
																								btnEnterincome.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
																								btnEnterincome.setBounds(884, 232, 150, 45);
																								incomePage.add(btnEnterincome);
																								
																								JLabel lblYouMayUse = new JLabel("You may use decimals, but please omit other characters(commas, dollar signs, words, etc.)");
																								lblYouMayUse.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
																								lblYouMayUse.setHorizontalAlignment(SwingConstants.LEFT);
																								lblYouMayUse.setBounds(501, 304, 542, 74);
																								incomePage.add(lblYouMayUse);
																								
																								JButton returntoMainincome = new JButton("Main Menu\r\n");
																								returntoMainincome.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
																								returntoMainincome.setBounds(884, 568, 150, 50);
																								incomePage.add(returntoMainincome);
		//																		BEGIN EXPENSE PAGE
		JPanel expensePage = new JPanel();
		expensePage.setLayout(null);
		expensePage.setBounds(0, 0, 1112, 668);
		frame.getContentPane().add(expensePage);
		expensePage.setVisible(false);
		
		JLabel label = new JLabel("Annual");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label.setBounds(10, 217, 150, 74);
		expensePage.add(label);
		
		JLabel label_1 = new JLabel("Biannual");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_1.setBounds(10, 302, 150, 74);
		expensePage.add(label_1);
		
		JLabel expenseTitle = new JLabel("Enter an expense: (in USD)");
		expenseTitle.setHorizontalAlignment(SwingConstants.CENTER);
		expenseTitle.setFont(new Font("Palatino Linotype", Font.PLAIN, 27));
		expenseTitle.setBounds(305, 5, 406, 38);
		expensePage.add(expenseTitle);
		
		JLabel label_3 = new JLabel("Monthly");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_3.setBounds(10, 382, 150, 82);
		expensePage.add(label_3);
		
		JLabel label_4 = new JLabel("Weekly");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_4.setBounds(10, 475, 150, 82);
		expensePage.add(label_4);
		
		JLabel label_5 = new JLabel("Daily");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		label_5.setBounds(10, 568, 150, 89);
		expensePage.add(label_5);
		JRadioButton annualExpense = new JRadioButton("");
		annualExpense.setSelected(true);
		annualExpense.setHorizontalAlignment(SwingConstants.CENTER);
		annualExpense.setBounds(168, 217, 90, 74);
		buttongroupE.add(annualExpense);
		expensePage.add(annualExpense);
		
		
		JRadioButton biannualExpense = new JRadioButton("");
		biannualExpense.setHorizontalAlignment(SwingConstants.CENTER);
		biannualExpense.setBounds(170, 302, 88, 74);
		buttongroupE.add(biannualExpense);
		expensePage.add(biannualExpense);
		
		
		JRadioButton monthlyExpense = new JRadioButton("");
		monthlyExpense.setHorizontalAlignment(SwingConstants.CENTER);
		monthlyExpense.setBounds(166, 382, 92, 74);
		buttongroupE.add(monthlyExpense);
		expensePage.add(monthlyExpense);
		
		
		JRadioButton weeklyExpense = new JRadioButton("");
		weeklyExpense.setHorizontalAlignment(SwingConstants.CENTER);
		weeklyExpense.setBounds(166, 471, 92, 86);
		buttongroupE.add(weeklyExpense);
		expensePage.add(weeklyExpense);
		
		
		JRadioButton dailyExpense = new JRadioButton("");
		dailyExpense.setHorizontalAlignment(SwingConstants.CENTER);
		dailyExpense.setBounds(166, 568, 92, 89);
		buttongroupE.add(dailyExpense);
		expensePage.add(dailyExpense);
		
		//																				END EXPENSE RADIO BUTTONS
		JLabel label_6 = new JLabel("What is the frequency?");
		label_6.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		label_6.setBounds(10, 168, 248, 38);
		expensePage.add(label_6);
		
		inputExpense = new JTextField();
		inputExpense.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		inputExpense.setColumns(10);
		inputExpense.setBounds(534, 230, 349, 50);
		expensePage.add(inputExpense);
		
		JLabel label_7 = new JLabel("$");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 37));
		label_7.setBounds(475, 232, 59, 45);
		expensePage.add(label_7);
		
		JButton expenseEnterbtn = new JButton("Enter");
		expenseEnterbtn.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		expenseEnterbtn.setBounds(884, 232, 150, 45);
		expensePage.add(expenseEnterbtn);
		
		JLabel label_8 = new JLabel("You may use decimals, but please omit other characters(commas, dollar signs, words, etc.)");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		label_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		label_8.setBounds(501, 304, 542, 74);
		expensePage.add(label_8);
		
		JButton returntoMain = new JButton("Main Menu\r\n");
		returntoMain.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		returntoMain.setBounds(884, 591, 150, 50);
		expensePage.add(returntoMain);
		
		JButton returntoMaintransactions = new JButton("Return to Main Menu");
		returntoMaintransactions.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		returntoMaintransactions.setBounds(10, 11, 188, 43);
		transactionsPage.add(returntoMaintransactions);
		
		JLabel simulationResultlbl = new JLabel();
		simulationResultlbl.setFont(new Font("Comic Sans MS", Font.PLAIN, 27));
		simulationResultlbl.setHorizontalAlignment(SwingConstants.CENTER);
		simulationResultlbl.setBounds(20, 376, 1082, 239);
		transactionsPage.add(simulationResultlbl);
		
		yearsToSimulate = new JTextField();
		yearsToSimulate.setBounds(597, 183, 188, 43);
		transactionsPage.add(yearsToSimulate);
		yearsToSimulate.setColumns(10);
		
		JLabel lblYearsToSimulate = new JLabel("Years to Simulate:");
		lblYearsToSimulate.setHorizontalAlignment(SwingConstants.CENTER);
		lblYearsToSimulate.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblYearsToSimulate.setBounds(399, 183, 188, 43);
		transactionsPage.add(lblYearsToSimulate);
		
		JButton simulateYears = new JButton("Enter");
		simulateYears.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		simulateYears.setBounds(795, 193, 89, 23);
		transactionsPage.add(simulateYears);
		
		returntoMaintransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(transactionsPage,mainMenu);
			}
		});
		
//																EVERYTHING HAS BEEN INITIALIZED AT THIS POINT ( CALCULATIONS BEGIN)
		
		startProgrambtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(mainTitle_1,mainMenu);
			}
		});
		
		btntoTitle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(mainMenu,mainTitle_1);
			}
		});
		
		btnAddAnIncome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(mainMenu,incomePage);
			}
		});
		btnAddAnExpense.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(mainMenu,expensePage);
			}
		});
		btnViewTotalIncomesexpenses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(mainMenu,transactionsPage);
			}
		});
		returntoMainincome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(incomePage,mainMenu);
			}
		});
		returntoMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPages(expensePage, mainMenu);
			}
		});
		
		btnEnterincome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = 0;
				String factor = " ";
				try {
					value = Double.parseDouble(inputIncome.getText());
					if (annualBtn.isSelected()) {
						factor = "annual";
					} else if (biannualBtn.isSelected()) {
						factor = "biannually";
					} else if (weeklyBtn.isSelected()) {
						factor = "weekly";
					} else if (dailyBtn.isSelected()) {
						factor = "daily";
					} else {
						factor = "monthly";
					}
					DataStorage.addIncome(value, factor);
					inputIncome.setText("");
					System.out.println(transactions);
				} catch (NumberFormatException y) {
					incomeTitle.setText("Please enter a number");
					inputIncome.setText(null);
				}

			}
		});
		
		expenseEnterbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double value = 0;
				String factor = " ";
				try {
					value = Double.parseDouble(inputExpense.getText());
					if (annualExpense.isSelected()) {
						factor = "annual";
					} else if (biannualExpense.isSelected()) {
						factor = "biannually";
					} else if (weeklyExpense.isSelected()) {
						factor = "weekly";
					} else if (dailyExpense.isSelected()) {
						factor = "daily";
					} else {
						factor = "monthly";
					}
					DataStorage.addExpense(value, factor);
					inputExpense.setText("");
					System.out.println(transactions);
				} catch (NumberFormatException y) {
					expenseTitle.setText("Please enter a number");
					inputExpense.setText(null);
				}

			}
		});
		
		simulateYears.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int years = Integer.parseInt(yearsToSimulate.getText());
					simulationResultlbl.setText(DataStorage.giveResult(years));
				}catch (NumberFormatException y ) {
					simulationResultlbl.setText("Please enter a number");
				}
				
			}
		});

	}
}
