package pratmex;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RockPaperScissors {
	
	private Random random;
	
	private int number;
	
	private JFrame frame;
	
	private ImageIcon rockImage;
	private ImageIcon paperImage;
	private ImageIcon scissorsImage;
	
	private JButton rock;
	private JButton paper;
	private JButton scissors;
	
	private JLabel yourIcon;
	private JLabel compIcon;
	
	private JLabel you;
	private JLabel comp;
	private JLabel result;
	
	private int yourScore;
	private int compScore;
	
	public void rpsGame() {
		
		random = new Random();
		
		frame = new JFrame();
		
		rockImage = new ImageIcon("rock.jpg");
		paperImage = new ImageIcon("paper.jpg");
		scissorsImage = new ImageIcon("scissors.jpg");
		
		rock = new JButton(rockImage);
		paper = new JButton(paperImage);
		scissors = new JButton(scissorsImage);
		
		yourIcon = new JLabel(rockImage);
	    compIcon = new JLabel(rockImage);
	    
	    you = new JLabel();
	    comp = new JLabel();
	    result = new JLabel();
	   
	    yourScore = 0;
	    compScore = 0;
	    
	    yourIcon.setBounds(250,50,250,250);
	    
	    compIcon.setBounds(1050,50,250,250);
	    
	    you.setText("You : " + yourScore);
	    you.setFont(new Font("consolas",Font.BOLD,60));
	    you.setBounds(255,360,300,70);
	    you.setForeground(Color.BLUE);
		
	    comp.setText("Comp : " + compScore);
	    comp.setFont(new Font("consolas",Font.BOLD,60));
	    comp.setBounds(1050,360,300,70);
	    comp.setForeground(Color.BLUE);
	    
	    result.setFont(new Font("consolas",Font.BOLD,60));
	    
		rock.setBounds(250,550,250,250);
		rock.setBackground(Color.WHITE);
		rock.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		rock.setFocusable(false);
		rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				yourIcon.setIcon(rockImage);
				number = random.nextInt(1,4);
				if(number == 1) {
					compIcon.setIcon(rockImage);
					result.setText("It\'s a tie!");
					result.setForeground(Color.YELLOW);
					result.setBounds(600,150,400,70);
				}
				if(number == 2) {
					compIcon.setIcon(paperImage);
					compScore++;
					comp.setText("Comp : " + compScore);
					result.setText("You Lost!");
					result.setBounds(650,150,300,70);
					result.setForeground(Color.RED);
				}
				if(number == 3) {
					compIcon.setIcon(scissorsImage);
					yourScore++;
					you.setText("You : " + yourScore);
					result.setText("You Win!");
					result.setBounds(650,150,300,70);
					result.setForeground(Color.GREEN);
				}
			}
		});
		
		paper.setBounds(650,550,250,250);
		paper.setBackground(Color.WHITE);
		paper.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		paper.setFocusable(false);
		paper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yourIcon.setIcon(paperImage);
				number = random.nextInt(1,4);
				if(number == 1) {
					compIcon.setIcon(rockImage);
					yourScore++;
					you.setText("You : " + yourScore);
					result.setText("You Win!");
					result.setBounds(650,150,300,70);
					result.setForeground(Color.GREEN);
				}
				if(number == 2) {
					compIcon.setIcon(paperImage);
					result.setText("It\'s a tie!");
					result.setForeground(Color.YELLOW);
					result.setBounds(600,150,400,70);
				}
				if(number == 3) {
					compIcon.setIcon(scissorsImage);
					compScore++;
					comp.setText("Comp : " + compScore);
					result.setText("You Lost!");
					result.setBounds(650,150,300,70);
					result.setForeground(Color.RED);
				}
			}
		});
		
		scissors.setBounds(1050,550,250,250);
		scissors.setBackground(Color.WHITE);
		scissors.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		scissors.setFocusable(false);
		scissors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				yourIcon.setIcon(scissorsImage);
				number = random.nextInt(1,4);
				if(number == 1) {
					compIcon.setIcon(rockImage);
					compScore++;
					comp.setText("Comp : " + compScore);
					result.setText("You Lost!");
					result.setBounds(650,150,300,70);
					result.setForeground(Color.RED);
				}
				if(number == 2) {
					compIcon.setIcon(paperImage);
					yourScore++;
					you.setText("You : " + yourScore);
					result.setText("You Win!");
					result.setBounds(650,150,300,70);
					result.setForeground(Color.GREEN);
				}
				if(number == 3) {
					compIcon.setIcon(scissorsImage);
					result.setText("It\'s a tie!");
					result.setForeground(Color.YELLOW);
					result.setBounds(600,150,400,70);
				}
			}
		});
		
		frame.setTitle("Rock Paper Scissors");
		frame.setSize(1536,864);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		frame.add(rock);
		frame.add(paper);
		frame.add(scissors);
		frame.add(yourIcon);
		frame.add(compIcon);
		frame.add(you);
		frame.add(comp);
		frame.add(result);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		RockPaperScissors rps = new RockPaperScissors();
		rps.rpsGame();
	}

}
