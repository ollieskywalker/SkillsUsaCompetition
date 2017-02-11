import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * 
 * @author Elias Chang
 * 
 * @Description Student report card program; student enters grades and classes; progam will return report card
 *
 */
public class Main {
	//Instance variables: Frame, JLabels, JTextFields, JCmboBox
	private JFrame mainFrame;
	public JFrame reportCard;
	private JLabel title, instructions, classList, gradesCat, classType; // gradesCat is label for grades
	private JLabel fGpa, organizedClasses, weightedGPA;
																	//fGpa is final calculate GPA that goes into report card frame
	private JTextField class1, class2, class3, class4, class5, class6;
	private JComboBox grade1, grade2, grade3, grade4, grade5, grade6;
	private ArrayList<JComboBox>list = new ArrayList<JComboBox>(); // List is list for JCoboBoxes to make it easier to loop 
	
	//Initialize ComboBoxes for class unit
	private String[]classUnitList = {"AP", "Honors", "Regular"};
	private JComboBox classUnit1, classUnit2, classUnit3, classUnit4, classUnit5, classUnit6; 
	private ArrayList<JComboBox>unitList = new ArrayList<JComboBox>(); // list for class unit to make it easier to loop
	
	//Default letter grades
	private String[]gradeList = {"A", "B", "C", "D", "F"}; 
	private JButton gpaCalculator; 
	
	//Main function that generates java GUI
	public Main(){
		//Instantiate JFrame
		mainFrame = new JFrame("SkillsUSA Competition");
		//Make JLabel to introduce program
		title = new JLabel("Student report card program");
		title.setBounds(150,0,250,30);
		
		//JLabel to have instructions
		instructions = new JLabel("Please input your classes and letter grades");
		instructions.setBounds(120,30,250,30);
		
		//List out the class input fields along with JLabel each class gets a JCombobox to select grade
		classList = new JLabel("Class: ");
		classList.setBounds(20, 60, 90, 30);
		
		gradesCat = new JLabel("Grade: ");
		gradesCat.setBounds(110, 60, 150, 30);
		
		classType = new JLabel("Class type: ");
		classType.setBounds(200, 60, 90, 30);
		
		class1 = new JTextField();
		class1.setBounds(20, 90, 90, 30);

		grade1 = new JComboBox(gradeList);
		grade1.setBounds(110, 90, 90, 30);
		list.add(grade1);
		
		classUnit1 = new JComboBox(classUnitList);
		classUnit1.setBounds(200, 90, 90 ,30);
		unitList.add(classUnit1);
		
		class2 = new JTextField();
		class2.setBounds(20, 120, 90, 30);
		
		grade2 = new JComboBox(gradeList);
		grade2.setBounds(110, 120, 90, 30);
		list.add(grade2);
		
		classUnit2 = new JComboBox(classUnitList);
		classUnit2.setBounds(200, 120, 90 ,30);
		unitList.add(classUnit2);
		
		class3 = new JTextField();
		class3.setBounds(20, 150, 90, 30);
		
		grade3 = new JComboBox(gradeList);
		grade3.setBounds(110, 150, 90, 30);
		list.add(grade3);
		
		classUnit3 = new JComboBox(classUnitList);
		classUnit3.setBounds(200, 150, 90 ,30);
		unitList.add(classUnit3);
		
		class4 = new JTextField();
		class4.setBounds(20, 180, 90, 30);
		
		grade4 = new JComboBox(gradeList);
		grade4.setBounds(110, 180, 90, 30);
		list.add(grade4);
		
		classUnit4 = new JComboBox(classUnitList);
		classUnit4.setBounds(200, 180, 90 ,30);
		unitList.add(classUnit4);
		
		class5 = new JTextField();
		class5.setBounds(20, 210, 90, 30);
		
		grade5 = new JComboBox(gradeList);
		grade5.setBounds(110, 210, 90, 30);
		list.add(grade5);
		
		classUnit5 = new JComboBox(classUnitList);
		classUnit5.setBounds(200, 210, 90 ,30);
		unitList.add(classUnit5);
		
		class6 = new JTextField();
		class6.setBounds(20, 240, 90, 30);
		
		grade6 = new JComboBox(gradeList);
		grade6.setBounds(110, 240, 90, 30);
		list.add(grade6);
		
		classUnit6 = new JComboBox(classUnitList);
		classUnit6.setBounds(200, 240, 90 ,30);
		unitList.add(classUnit6);
		
		//Make GPA calculator button
		gpaCalculator = new JButton("Get report card");
		gpaCalculator.setBounds(20, 400, 120,30);
		
		gpaCalculator.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//On button click: Calculate GPA
				double gpaFinal = 0.0;
				double gpaWeighted = 0.0;
				
				//Find non weighted sum
				gpaFinal = nonWeightedSum()/6.0;				
				
				gpaWeighted = weightedSum()/6.0;
				
//				System.out.println(gpaWeighted);
				//Find weighted sum
				//Instantiate Report Card frame
				reportCard = new JFrame("Student Report Card");

				//Instantiate GUI objects that go into report card frame
				fGpa = new JLabel("Non Weighted GPA: " + gpaFinal);
				fGpa.setBounds(100, 0, 150, 30);
				
				weightedGPA = new JLabel("Weighted GPA: " + gpaWeighted);
				weightedGPA.setBounds(250, 0, 120, 30);
				
				organizedClasses = new JLabel("Classes: ");
				organizedClasses.setBounds(20, 0, 80, 30);
				
				//Create organized list of classes with grades
				JLabel organizedClass1 = new JLabel(class1.getText() + " Grade: " + grade1.getSelectedItem());
				organizedClass1.setBounds(20, 50, 200, 30);
				
				JLabel organizedClass2 = new JLabel(class2.getText() + " Grade: " + grade2.getSelectedItem());
				organizedClass2.setBounds(20, 80, 200, 30);
				
				JLabel organizedClass3 = new JLabel(class3.getText() + " Grade: " + grade3.getSelectedItem());
				organizedClass3.setBounds(20, 110, 200, 30);
				
				JLabel organizedClass4 = new JLabel(class4.getText() + " Grade: " + grade4.getSelectedItem());
				organizedClass4.setBounds(20, 140, 200, 30);
				
				JLabel organizedClass5 = new JLabel(class5.getText() + " Grade: " + grade5.getSelectedItem());
				organizedClass5.setBounds(20, 170, 200, 30);
				
				JLabel organizedClass6 = new JLabel(class6.getText() + " Grade: " + grade6.getSelectedItem());
				organizedClass6.setBounds(20, 200, 200, 30);
				
				//Add GUI objects to report card frame
				reportCard.add(fGpa);
				reportCard.add(organizedClasses);
				reportCard.add(weightedGPA);
				reportCard.add(organizedClass1);
				reportCard.add(organizedClass2);
				reportCard.add(organizedClass3);
				reportCard.add(organizedClass4);
				reportCard.add(organizedClass5);
				reportCard.add(organizedClass6);
				
				//Set Report Card Frame settings
				reportCard.setLayout(null);
				reportCard.setSize(400, 400);
				reportCard.setVisible(true);
			}
		});
		
		//Add GUI items to the Frame
		mainFrame.add(title);
		mainFrame.add(instructions);
		mainFrame.add(classList);
		mainFrame.add(gradesCat);
		mainFrame.add(classType);
		mainFrame.add(class1);
		mainFrame.add(class2);
		mainFrame.add(class3);
		mainFrame.add(class4);
		mainFrame.add(class5);
		mainFrame.add(class6);
		mainFrame.add(grade1);
		mainFrame.add(grade2);
		mainFrame.add(grade3);
		mainFrame.add(grade4);
		mainFrame.add(grade5);
		mainFrame.add(grade6);
		mainFrame.add(gpaCalculator);
		mainFrame.add(classUnit1);
		mainFrame.add(classUnit2);
		mainFrame.add(classUnit3);
		mainFrame.add(classUnit4);
		mainFrame.add(classUnit5);
		mainFrame.add(classUnit6);
		
		//Set up Frame size and visibility and layout
		mainFrame.setLayout(null);
		mainFrame.setSize(500, 500);
		mainFrame.setVisible(true);
	}
	
	public int nonWeightedSum(){
		int sum = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getSelectedIndex() == 0){
				sum+=4;
			}
			else if(list.get(i).getSelectedIndex() == 1){
				sum+=3;
			}
			else if(list.get(i).getSelectedIndex() == 2){
				sum+=2;
			}
			else if(list.get(i).getSelectedIndex() == 3){
				sum+=1;
			}
			else if(list.get(i).getSelectedIndex() == 4){
				sum+=0;
			}
		}
		return sum;
	}
	
	public double weightedSum(){
		double sum = 0;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).getSelectedIndex() == 0){
				if(unitList.get(i).getSelectedIndex() == 0){
					sum+=5;
				}
				else if(unitList.get(i).getSelectedIndex() == 1){
					sum+=4.5;
				}
				else{
					sum+=4;
				}
			}
			else if(list.get(i).getSelectedIndex() == 1){
				if(unitList.get(i).getSelectedIndex() == 0){
					sum+=4;
				}
				else if(unitList.get(i).getSelectedIndex() == 1){
					sum+=3.5;
				}
				else{
					sum+=3;
				}
			}
			else if(list.get(i).getSelectedIndex() == 2){
				if(unitList.get(i).getSelectedIndex() == 0){
					sum+=3;
				}
				else if(unitList.get(i).getSelectedIndex() == 1){
					sum+=2.5;
				}
				else{
					sum+=2;
				}
			}
			else if(list.get(i).getSelectedIndex() == 3){
				if(unitList.get(i).getSelectedIndex() == 0){
					sum+=2;
				}
				else if(unitList.get(i).getSelectedIndex() == 1){
					sum+=1.5;
				}
				else{
					sum+=1;
				}
			}
			else if(list.get(i).getSelectedIndex() == 4){
				sum+=0;
			}
		}
		return sum;
	}
}
