import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import java.applet.Applet;
import java.applet.AudioClip;
//import java.awt.BorderLayout;
import java.net.URL;
import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.sql.rowset.CachedRowSet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.xml.transform.OutputKeys;

public class Game extends JFrame {

	
  private JPanel buttonPanel;
  private JButton [] buttons;
  private JPanel panelLevel;
  
  private JLabel [] cars = new JLabel[57];
  private  boolean [][] isfilled = new boolean[6][6];
  private  Point [][] point = new Point[6][6];
 
  private int [] xy_point = {5,95,185,275,365,455};
  
  private int level;
  private int min = 5;

 
 
  
  private JLabel BG;
  @SuppressWarnings("deprecation")
private AudioClip Won;

  
	public Game(){
		
		super("RushHour");
		
		
		for(int i = 0;i < point.length;i++)
		{
			for(int j = 0;j < point.length;j++)
			{
				point[i][j] = new Point(xy_point[i], xy_point[j]);
				//System.out.println(point[i][j]);
			}
		}
		
		
		panelLevel = new JPanel();
		panelLevel.setBounds(0, 0, 550, 580);
		panelLevel.setOpaque(false);
		getContentPane().add(panelLevel);
		panelLevel.setLayout(null);
		
		
			Icon red = new ImageIcon("car_red_h.png");
			cars[0] = new JLabel(red);
			cars[0].setSize(170, 85);
			
			Icon aqua_h = new ImageIcon("car_aqua_h.png");
			cars[1] = new JLabel(aqua_h);
			cars[1].setSize(170, 85);
			
			Icon aqua_V = new ImageIcon(("car_aqua_v.png"));
			cars[2] = new JLabel(aqua_V);
			cars[2].setSize(85, 170);
			
			Icon black_h = new ImageIcon(("car_black_h.png"));
			cars[3] = new JLabel(black_h);
			cars[3].setSize(170, 85);
			
			Icon black_v = new ImageIcon(("car_black_v.png"));
			cars[4] = new JLabel(black_v);
			cars[4].setSize(85, 170);
				
			Icon blue_h = new ImageIcon(("car_blue_h.png"));
			cars[5] = new JLabel(blue_h);
			cars[5].setSize(170, 85);
			
			Icon blue_v = new ImageIcon(("car_blue_v.png"));
			cars[6] = new JLabel(blue_v);
			cars[6].setSize(85, 170);
				
			Icon camo_h = new ImageIcon(("car_camo_h.png"));
			cars[7] = new JLabel(camo_h);
			cars[7].setSize(170, 85);
			
			Icon camo_v = new ImageIcon(("car_camo_v.png"));
			cars[8] = new JLabel(camo_v);
			cars[8].setSize(85, 170);
				
			Icon green_h = new ImageIcon(("car_green_h.png"));
			cars[9] = new JLabel(green_h);
			cars[9].setSize(170, 85);
			
			Icon green_v = new ImageIcon(("car_green_v.png"));
			cars[10] = new JLabel(green_v);
			cars[10].setSize(85, 170);
				
			Icon grey_h = new ImageIcon(("car_grey_h.png"));
			cars[11] = new JLabel(grey_h);
			cars[11].setSize(170, 85);
			
			Icon grey_v = new ImageIcon(("car_grey_v.png"));
			cars[12] = new JLabel(grey_v);
			cars[12].setSize(85, 170);
			
			Icon LightBlue_h = new ImageIcon(("car_light_blue_h.png"));
			cars[13] = new JLabel(LightBlue_h);
			cars[13].setSize(170, 85);
			
			Icon LightBlue_v = new ImageIcon(("car_light_blue_v.png"));
			cars[14] = new JLabel(LightBlue_v);
			cars[14].setSize(85, 170);
				
			Icon Lime_h = new ImageIcon(("car_lime_h.png"));
			cars[15] = new JLabel(Lime_h);
			cars[15].setSize(170, 85);
			
			Icon Lime_v = new ImageIcon(("car_lime_v.png"));
			cars[16] = new JLabel(Lime_v);
			cars[16].setSize(85, 170);
				
			Icon orange_h = new ImageIcon(("car_orange_h.png"));
			cars[17] = new JLabel(orange_h);
			cars[17].setSize(170, 85);
			
			Icon orange_v = new ImageIcon(("car_orange_v.png"));
			cars[18] = new JLabel(orange_v);
			cars[18].setSize(85, 170);
				
			Icon pink_h = new ImageIcon(("car_pink_h.png"));
			cars[19] = new JLabel(pink_h);
			cars[19].setSize(170, 85);
			
			Icon pink_v = new ImageIcon(("car_pink_v.png"));
			cars[20] = new JLabel(pink_v);
			cars[20].setSize(85, 170);
				
			Icon purple_h = new ImageIcon(("car_purple_h.png"));
			cars[21] = new JLabel(purple_h);
			cars[21].setSize(170, 85);
			
			Icon purple_v = new ImageIcon(("car_purple_v.png"));
			cars[22] = new JLabel(purple_v);
			cars[22].setSize(85, 170);
				
			Icon violet_h = new ImageIcon(("car_violet_h.png"));
			cars[23] = new JLabel(violet_h);
			cars[23].setSize(170, 85);
			
			Icon violet_v = new ImageIcon(("car_violet_v.png"));
			cars[24] = new JLabel(violet_v);
			cars[24].setSize(85, 170);
			
			Icon white_h = new ImageIcon(("car_white_h.png"));
			cars[25] = new JLabel(white_h);
			cars[25].setSize(170, 85);
			
			Icon white_v = new ImageIcon(("car_white_v.png"));
			cars[26] = new JLabel(white_v);
			cars[26].setSize(85, 170);
				
			Icon yellow_h = new ImageIcon(("car_yellow_h.png"));
			cars[27] = new JLabel(yellow_h);
			cars[27].setSize(170, 85);
			
			Icon yellow_v = new ImageIcon(("car_yellow_v.png"));
			cars[28] = new JLabel(yellow_v);
			cars[28].setSize(85, 170);

			
			Icon aquaT_h = new ImageIcon(("truck_aqua_h.png"));
			cars[29] = new JLabel(aquaT_h);
			cars[29].setSize(255, 85);
			
			Icon aquaT_V = new ImageIcon(("truck_aqua_v.png"));
			cars[30] = new JLabel(aquaT_V);
			cars[30].setSize(85, 255);
			
			Icon blackT_h = new ImageIcon(("truck_black_h.png"));
			cars[31] = new JLabel(blackT_h);
			cars[31].setSize(255, 85);
			
			Icon blackT_v = new ImageIcon(("truck_black_v.png"));
			cars[32] = new JLabel(blackT_v);
			cars[32].setSize(85, 255);
				
			Icon blueT_h = new ImageIcon(("truck_blue_h.png"));
			cars[33] = new JLabel(blueT_h);
			cars[33].setSize(255, 85);
			
			Icon blueT_v = new ImageIcon(("truck_blue_v.png"));
			cars[34] = new JLabel(blueT_v);
			cars[34].setSize(85, 255);
				
			Icon camoT_h = new ImageIcon(("truck_camo_h.png"));
			cars[35] = new JLabel(camoT_h);
			cars[35].setSize(255, 85);
			
			Icon camoT_v = new ImageIcon(("truck_camo_v.png"));
			cars[36] = new JLabel(camoT_v);
			cars[36].setSize(85, 255);
				
			Icon greenT_h = new ImageIcon(("truck_green_h.png"));
			cars[37] = new JLabel(greenT_h);
			cars[37].setSize(255, 85);
			
			Icon greenT_v = new ImageIcon(("truck_green_v.png"));
			cars[38] = new JLabel(greenT_v);
			cars[38].setSize(85, 255);
				
			Icon greyT_h = new ImageIcon(("truck_grey_h.png"));
			cars[39] = new JLabel(greyT_h);
			cars[39].setSize(255, 85);
			
			Icon greyT_v = new ImageIcon(("truck_grey_v.png"));
			cars[40] = new JLabel(greyT_v);
			cars[40].setSize(85, 255);
			
			Icon LightBlueT_h = new ImageIcon(("truck_light_blue_h.png"));
			cars[41] = new JLabel(LightBlueT_h);
			cars[41].setSize(255, 85);
			
			Icon LightBlueT_v = new ImageIcon(("truck_light_blue_v.png"));
			cars[42] = new JLabel(LightBlueT_v);
			cars[42].setSize(85, 255);
			
			Icon LimeT_h = new ImageIcon(("truck_lime_h.png"));
			cars[43] = new JLabel(LimeT_h);
			cars[43].setSize(255, 85);
			
			Icon LimeT_v = new ImageIcon(("truck_lime_v.png"));
			cars[44] = new JLabel(LimeT_v);
			cars[44].setSize(85, 255);
			
			Icon orangeT_h = new ImageIcon(("truck_orange_h.png"));
			cars[45] = new JLabel(orangeT_h);
			cars[45].setSize(255, 85);
			
			Icon orangeT_v = new ImageIcon(("truck_orange_v.png"));
			cars[46] = new JLabel(orangeT_v);
			cars[46].setSize(85, 255);
				
			Icon pinkT_h = new ImageIcon(("truck_pink_h.png"));
			cars[47] = new JLabel(pinkT_h);
			cars[47].setSize(255, 85);
			
			Icon pinkT_v = new ImageIcon(("truck_pink_v.png"));
			cars[48] = new JLabel(pinkT_v);
			cars[48].setSize(85, 255);
				
			Icon purpleT_h = new ImageIcon(("truck_purple_h.png"));
			cars[49] = new JLabel(purpleT_h);
			cars[49].setSize(255, 85);
			
			Icon purpleT_v = new ImageIcon(("truck_purple_v.png"));
			cars[50] = new JLabel(purpleT_v);
			cars[50].setSize(85, 255);
				
			Icon violetT_h = new ImageIcon(("truck_violet_h.png"));
			cars[51] = new JLabel(violetT_h);
			cars[51].setSize(255, 85);
			
			Icon violetT_v = new ImageIcon(("truck_violet_v.png"));
			cars[52] = new JLabel(violetT_v);
			cars[52].setSize(85, 255);
				
			Icon whiteT_h = new ImageIcon(("truck_white_h.png"));
			cars[53] = new JLabel(whiteT_h);
			cars[53].setSize(255, 85);
			
			Icon whiteT_v = new ImageIcon(("truck_white_v.png"));
			cars[54] = new JLabel(whiteT_v);
			cars[54].setSize(85, 255);
				
			Icon yellowT_h = new ImageIcon(("truck_yellow_h.png"));
			cars[55] = new JLabel(yellowT_h);
			cars[55].setSize(255, 85);
			
			Icon yellowT_v = new ImageIcon(("truck_yellow_v.png"));
			cars[56] = new JLabel(yellowT_v);
			cars[56].setSize(85, 255);
			

			
			
			buttons = new JButton[4];
			buttonPanel = new JPanel();
			buttonPanel.setBounds(5, 546, 538, 38);
			
			for(int i = 0;i<buttons.length;i++)
			{
				buttons[i] = new JButton("Level " +(i+1));
				
				buttonPanel.add(buttons[i]);
			}
			
			getContentPane().add(buttonPanel, BorderLayout.SOUTH);
			
			
			
			buttons[0].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					level = 1;
					
						panelLevel.removeAll();
						resetPoint();
						
			cars[56].setLocation(point[0][0]);
			panelLevel.add(cars[56]);//yellowT_v
			
			cars[50].setLocation(point[3][0]);
			panelLevel.add(cars[50]);//purpleT_v
			
			cars[29].setLocation(point[2][5]);
			panelLevel.add(cars[29]);//aquaT_h
			
			cars[0].setLocation(point[1][2]);
			panelLevel.add(cars[0]);//red
			
			cars[33].setLocation(point[3][3]);
			panelLevel.add(cars[33]);//blueT_h
			
			cars[28].setLocation(point[5][4]);
			panelLevel.add(cars[28]);//yellow_v
			
			cars[10].setLocation(point[2][3]);
			panelLevel.add(cars[10]);//green_v
			
			
			panelLevel.revalidate();
			panelLevel.repaint();
			validate();
			
			
				}
			});
			
			cars[0].addMouseMotionListener(new MouseMotionListener() {
				//red
				private int S;

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
	
					isFilled(0);
				   
				        
				        
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 2;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        if(isfilled[1][xp])
				        	b1 = false;
				        
				        if(isfilled[2][xp])
				        	b2 = false;
				        
				        if(isfilled[3][xp])
				        	b3 = false;
				        
				        if(isfilled[4][xp])
				        	b4 = false;
				        
				        
				        if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(b2&&b1))	
						{
							jc.setLocation(point[0][xp]);
						}else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(b2&&b1))
						{
							jc.setLocation(point[1][xp]);
						}else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(b3&&b2))
						{
							jc.setLocation(point[2][xp]);
						}else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&(b3&&b2&&b4))
						{
							jc.setLocation(point[3][xp]);
						}else if((jc.getX()+e.getX() < point[5][xp].x)&&(jc.getX()+e.getX() >= point[4][xp].x)&&!isfilled[5][xp]&&(b3&&b2))
						{
							jc.setLocation(point[4][xp]);
						}
				        
				        
				        
				        if (jc.getX()+jc.getWidth() >= point[5][xp].x){		   
				        	Won.play();//Play the winning sound
							JOptionPane.showMessageDialog(null, "Congrats, you've Won");
							this.S = JOptionPane.showConfirmDialog(null, "Would you like to play again? If Yes, Select a level you want!", "", 0);

							if (S==1){
								System.exit(0);
							}
							else if(S==0){
								panelLevel.removeAll();
								panelLevel.revalidate();
								panelLevel.repaint();
								validate();
							}
						}
				}
			});	
			
			cars[10].addMouseMotionListener(new MouseMotionListener() {
				//green_v
				
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@SuppressWarnings("deprecation")
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        
				        
				        isFilled(10);
				        
				        
				       
				        
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 2;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,if4,up = false;
				        boolean d = true;
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        if(((b1&&!b2&&b3&&b4)&&(jc.getLocation().equals(point[xp][4])))||((b1&&b2&&!b3&&b4)&&(jc.getLocation().equals(point[xp][0]))))
				        {
				        	d = false;
				        }
				        
				        if0 = (b1&&!b4)||(b1&&!up)||(b1&&b2);
				        if1 = (b1&&b2&&!b4)||(b1&&b2&&!up)||(b1&&b2&&b3);
				        if2 = b2&&b3;
				        if3 = (!b1&&b3&&b4)||(b3&&up&&b4)||(b2&&b3&&b4);
				        if4 = (!b1&&b4)||(b4&&up)||(b3&&b4);
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0)&&d)	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}else if((jc.getY()+e.getY() < point[xp][5].y)&&(jc.getY()+e.getY() >= point[xp][4].y)&&!isfilled[xp][5]&&(if4)&&d)
						{
							jc.setLocation(point[xp][4]);
						}
				        
				        
				       
					
				}
			});
			

			cars[28].addMouseMotionListener(new MouseMotionListener() {
				//yellow_v
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        isFilled(28);
				        
				        
				      
					
					JComponent jc = (JComponent)e.getSource();
				        int xp;
				        if(level == 4)
				        	xp = 1;
				        else
				        	xp = 5;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,if4,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        
				        if0 = (b1&&!b4)||(b1&&!up)||(b1&&b2);
				        if1 = (b1&&b2&&!b4)||(b1&&b2&&!up)||(b1&&b2&&b3);
				        if2 = b2&&b3;
				        if3 = (!b1&&b3&&b4)||(b3&&up&&b4)||(b2&&b3&&b4);
				        if4 = (!b1&&b4)||(b4&&up)||(b3&&b4);
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0)/**/)	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}else if((jc.getY()+e.getY() < point[xp][5].y)&&(jc.getY()+e.getY() >= point[xp][4].y)&&!isfilled[xp][5]&&(if4))
						{
							jc.setLocation(point[xp][4]);
						}
					
				}
			});


			cars[29].addMouseMotionListener(new MouseMotionListener() {
				//aquaT_h
				@Override
				public void mouseMoved(MouseEvent arg0) {
		
					// TODO Auto-generated method stub
		
	            }
	
	
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
		
	        
					
	                isFilled(29);

					
					JComponent jc = (JComponent)e.getSource();
				       
			        int xp;
			        if(level == 4)
			        	xp = 3;
			        else
			        	xp = 5;
			        
			        boolean b1 = true;
			        boolean b2 = true;
			        boolean b3 = true;
			        boolean b4 = true;
			        
			        boolean if0,if1,if2,if3,up = false;
			        
			       
			        if(MOVE_CURSOR > e.getX())
			        {
			        	up = true;
			        }else
			        {
			        	up = false;
			        }
			        System.out.println(up);
			        
			        
			        if(isfilled[1][xp])
			        	b1 = false;
	        	 
	        	    if(isfilled[2][xp])
			        	b2 = false;
			        
			        if(isfilled[3][xp])
			        	b3 = false;
			        
			        if(isfilled[4][xp])
			        	b4 = false;
			         
			        
			        if0 = (b1&&b2);
			        if1 = (b1&&b2&&b3);
			        if2 = (b2&&b3&&b4);
			        if3 = (b3&&b4);
			        
			        if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(if0))	
					{
						jc.setLocation(point[0][xp]);
					}else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(if1))
					{
						jc.setLocation(point[1][xp]);
					}else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(if2))
					{
						jc.setLocation(point[2][xp]);
					}else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&!isfilled[5][xp]&&(if3))
					{
						jc.setLocation(point[3][xp]);
					}
	        
	        
	        
		}
				});

			
			cars[33].addMouseMotionListener(new MouseMotionListener() {
				//blueT_h
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				      
				        isFilled(33);
				        
				        
				        
						JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 3;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getX())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[1][xp])
				        	b1 = false;
		        	 
		        	    if(isfilled[1][xp])
				        	b2 = false;
				        
				        if(isfilled[2][xp])
				        	b3 = false;
				        
				        if(isfilled[4][xp])
				        	b4 = false;
				         
				        
				        if0 = (b1&&b2);
				        if1 = (b1&&b2&&b3);
				        if2 = (b2&&b3&&b4);
				        if3 = (b3&&b4);
				        
				        if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(if0))	
						{
							jc.setLocation(point[0][xp]);
						}else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(if1))
						{
							jc.setLocation(point[1][xp]);
						}else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(if2))
						{
							jc.setLocation(point[2][xp]);
						}else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&!isfilled[5][xp]&&(if3))
						{
							jc.setLocation(point[3][xp]);
						}
				        
				       
					
				}
			});
			

			cars[50].addMouseMotionListener(new MouseMotionListener() {
				//purpleT_v
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				       
				        
				        isFilled(50);
				        
				        
				        
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp;
				        if(level == 4)
				        	xp = 5;
				        else
				        	xp = 3;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        
				        if0 = (b1&&b2);
				        if1 = (b1&&b2&&b3);
				        if2 = (b2&&b3&&b4);
				        if3 = (b3&&b4);
				       
				        
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0))	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&!isfilled[xp][5]&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}
				        
				        
					
				}
			});
			

			cars[56].addMouseMotionListener(new MouseMotionListener() {
				//yellowT_v
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        
				        
				        isFilled(56);
				        
				        
				       
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 0;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        
				        if0 = (b1&&b2);
				        if1 = (b1&&b2&&b3);
				        if2 = (b2&&b3&&b4);
				        if3 = (b3&&b4);
				        
				        
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0))	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&!isfilled[xp][5]&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}
				        
				        
				       
					
				}
			});
			
			//end level1


buttons[1].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					level = 2;
					
					panelLevel.removeAll();
					resetPoint();
						
			cars[56].setLocation(point[0][0]);
			panelLevel.add(cars[56]);//yellowT_v
			
			cars[50].setLocation(point[3][0]);
			panelLevel.add(cars[50]);//purpleT_v
			
			cars[29].setLocation(point[2][5]);
			panelLevel.add(cars[29]);//aquaT_h
			
			cars[0].setLocation(point[1][2]);
			panelLevel.add(cars[0]);//red
			
			cars[33].setLocation(point[3][3]);
			panelLevel.add(cars[33]);//blueT_h
			
			cars[28].setLocation(point[5][4]);
			panelLevel.add(cars[28]);//yellow_v
			
			cars[10].setLocation(point[2][3]);
			panelLevel.add(cars[10]);//green_v
			
			cars[9].setLocation(point[1][0]);
			panelLevel.add(cars[9]);//green_h
			
			panelLevel.revalidate();
			panelLevel.repaint();
			validate();
			
			
				}
			});
             
            cars[9].addMouseMotionListener(new MouseMotionListener() {
            	//green_h
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
					isFilled(9);
					JComponent jc = (JComponent)e.getSource();
				       
			        int xp = 0;
			        
			        boolean b1 = true;
			        boolean b2 = true;
			        boolean b3 = true;
			        boolean b4 = true;
			        
			        boolean if0,if1,if2,if3,if4,r = false;
			        
			       
			        if(MOVE_CURSOR > e.getX())
			        {
			        	r = true;
			        }else
			        {
			        	r = false;
			        }
			        System.out.println(r);
			        
			        
			        if(isfilled[1][xp])
			        	b1 = false;

			     if(isfilled[2][xp])
			        	b2 = false;
			        
			        if(isfilled[3][xp])
			        	b3 = false;
			        
			        if(isfilled[4][xp])
			        	b4 = false;
			         
			        
			        if0 = (b1&&!b4)||(b1&&!r)||(b1&&b2);
			        if1 = (b1&&b2&&!b4)||(b1&&b2&&!r)||(b1&&b2&&b3);
			        if2 = b2&&b3;
			        if3 = (!b1&&b3&&b4)||(b3&&r&&b4)||(b2&&b3&&b4);
			        if4 = (!b1&&b4)||(b4&&r)||(b3&&b4);
			        
			    if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(if0))	
			    {
			    	jc.setLocation(point[0][xp]);
			    }else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(if1))
			    {
			    	jc.setLocation(point[1][xp]);
			    }else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(if2))
			    {
			    	jc.setLocation(point[2][xp]);
			    }else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&(if3))
			    {
			    	jc.setLocation(point[3][xp]);
			    }else if((jc.getX()+e.getX() < point[5][xp].x)&&(jc.getX()+e.getX() >= point[4][xp].x)&&!isfilled[5][xp]&&(if4))
			    {
			    	jc.setLocation(point[4][xp]);
					}
				}
			});
			


						
			//end level2

			
buttons[2].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					level = 3;
					
					panelLevel.removeAll();
					resetPoint();
					
			cars[56].setLocation(point[0][0]);
			panelLevel.add(cars[56]);//yellowT_v
			
			cars[50].setLocation(point[3][0]);
			panelLevel.add(cars[50]);//purpleT_v
			
			cars[29].setLocation(point[2][5]);
			panelLevel.add(cars[29]);//aquaT_h
			
			cars[0].setLocation(point[1][2]);
			panelLevel.add(cars[0]);//red
			
			cars[33].setLocation(point[3][3]);
			panelLevel.add(cars[33]);//blueT_h
			
			cars[28].setLocation(point[5][4]);
			panelLevel.add(cars[28]);//yellow_v
			
			cars[10].setLocation(point[2][3]);
			panelLevel.add(cars[10]);//green_v
			
			cars[9].setLocation(point[1][0]);
			panelLevel.add(cars[9]);//green_h
			
			cars[7].setLocation(point[4][0]);
			panelLevel.add(cars[7]);//camo_h
			
			panelLevel.revalidate();
			panelLevel.repaint();
			validate();
			
			
				}
			});
			

                 cars[7].addMouseMotionListener(new MouseMotionListener() {
                	//camo_h
	             @Override
	                    public void mouseMoved(MouseEvent arg0) {
		                // TODO Auto-generated method stub
		
	                      }
	
	                  @Override
	          public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	                	  isFilled(7);
		JComponent jc = (JComponent)e.getSource();
		
		int xp;
		if(level == 4)
            xp = 5;
		else
			xp = 0;
        
		 boolean b1 = true;
	        boolean b2 = true;
	        boolean b3 = true;
	        boolean b4 = true;
	        
	        boolean if0,if1,if2,if3,if4,r = false;
	        
	       
	        if(MOVE_CURSOR > e.getX())
	        {
	        	r = true;
	        }else
	        {
	        	r = false;
	        }
	        System.out.println(r);
	        
	        
	        if(isfilled[1][xp])
	        	b1 = false;
 	 
 	    if(isfilled[2][xp])
	        	b2 = false;
	        
	        if(isfilled[3][xp])
	        	b3 = false;
	        
	        if(isfilled[3][xp])
	        	b4 = false;
	         
	        
	        if0 = (b1&&!b4)||(b1&&!r)||(b1&&b2);
	        if1 = (b1&&b2&&!b4)||(b1&&b2&&!r)||(b1&&b2&&b3);
	        if2 = b2&&b3;
	        if3 = (!b1&&b3&&b4)||(b3&&r&&b4)||(b2&&b3&&b4);
	        if4 = (!b1&&b4)||(b4&&r)||(b3&&b4);
	        
        if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(if0))	
		{
			jc.setLocation(point[0][xp]);
		}else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(if1))
		{
			jc.setLocation(point[1][xp]);
		}else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(if2))
		{
			jc.setLocation(point[2][xp]);
		}else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&(if3))
		{
			jc.setLocation(point[3][xp]);
		}else if((jc.getX()+e.getX() < point[5][xp].x)&&(jc.getX()+e.getX() >= point[4][xp].x)&&!isfilled[5][xp]&&(if4))
		{
			jc.setLocation(point[4][xp]);
		}
	}
});
						//end level3
			
			
            buttons[3].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					level = 4;


					
					panelLevel.removeAll();
					resetPoint();
					
			cars[56].setLocation(point[0][0]);
			panelLevel.add(cars[56]);//yellowT_v
			
			cars[50].setLocation(point[5][1]);
			panelLevel.add(cars[50]);//purpleT_v
			
			cars[29].setLocation(point[0][3]);
			panelLevel.add(cars[29]);//aquaT_h
			
			cars[0].setLocation(point[3][2]);
			panelLevel.add(cars[0]);//red
			
			cars[28].setLocation(point[1][1]);
			panelLevel.add(cars[28]);//yellow_v
			
			cars[10].setLocation(point[2][1]);
			panelLevel.add(cars[10]);//green_v
			
			cars[12].setLocation(point[3][3]);
			panelLevel.add(cars[12]);//grey_v
			
			cars[14].setLocation(point[2][4]);
			panelLevel.add(cars[14]);//LightBlue_v
			
			cars[16].setLocation(point[4][0]);
			panelLevel.add(cars[16]);//Lime_v
			
			cars[9].setLocation(point[1][0]);
			panelLevel.add(cars[9]);//green_h
			
			cars[7].setLocation(point[3][5]);
			panelLevel.add(cars[7]);//camo_h
			
			cars[1].setLocation(point[0][5]);
			panelLevel.add(cars[1]);//aqua_h
			
			cars[3].setLocation(point[4][4]);
			panelLevel.add(cars[3]);//black_h
			
			
			panelLevel.revalidate();
			panelLevel.repaint();
			validate();
			
				}
			});
            
            
            cars[3].addMouseMotionListener(new MouseMotionListener() {
            	//black_h
             @Override
                    public void mouseMoved(MouseEvent arg0) {
	                // TODO Auto-generated method stub
	
                      }

                  @Override
          public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
                	  isFilled(3);
	JComponent jc = (JComponent)e.getSource();
       
    int xp = 4;
    
    boolean b1 = true;
    boolean b2 = true;
    boolean b3 = true;
    boolean b4 = true;
    
    boolean if0,if1,if2,if3,if4,r = false;
    
   
    if(MOVE_CURSOR > e.getX())
    {
    	r = true;
    }else
    {
    	r = false;
    }
    System.out.println(r);
    
    
    if(isfilled[1][xp])
    	b1 = false;

 if(isfilled[2][xp])
    	b2 = false;
    
    if(isfilled[3][xp])
    	b3 = false;
    
    if(isfilled[4][xp])
    	b4 = false;
     
    
    if0 = (b1&&!b4)||(b1&&!r)||(b1&&b2);
    if1 = (b1&&b2&&!b4)||(b1&&b2&&!r)||(b1&&b2&&b3);
    if2 = b2&&b3;
    if3 = (!b1&&b3&&b4)||(b3&&r&&b4)||(b2&&b3&&b4);
    if4 = (!b1&&b4)||(b4&&r)||(b3&&b4);
    
if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(if0))	
{
	jc.setLocation(point[0][xp]);
}else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(if1))
{
	jc.setLocation(point[1][xp]);
}else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(if2))
{
	jc.setLocation(point[2][xp]);
}else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&(if3))
{
	jc.setLocation(point[3][xp]);
}else if((jc.getX()+e.getX() < point[5][xp].x)&&(jc.getX()+e.getX() >= point[4][xp].x)&&!isfilled[5][xp]&&(if4))
{
	jc.setLocation(point[4][xp]);
	}
     }

            });
			
            cars[1].addMouseMotionListener(new MouseMotionListener() {
            	//aqua_h
             @Override
                    public void mouseMoved(MouseEvent arg0) {
	                // TODO Auto-generated method stub
	
                      }

                  @Override
          public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
                	  isFilled(1);
	JComponent jc = (JComponent)e.getSource();
       
    int xp = 5;
    
    boolean b1 = true;
    boolean b2 = true;
    boolean b3 = true;
    boolean b4 = true;
    
    boolean if0,if1,if2,if3,if4,r = false;
    
   
    if(MOVE_CURSOR > e.getX())
    {
    	r = true;
    }else
    {
    	r = false;
    }
    System.out.println(r);
    
    
    if(isfilled[1][xp])
    	b1 = false;

 if(isfilled[2][xp])
    	b2 = false;
    
    if(isfilled[3][xp])
    	b3 = false;
    
    if(isfilled[4][xp])
    	b4 = false;
     
    
    if0 = (b1&&!b4)||(b1&&!r)||(b1&&b2);
    if1 = (b1&&b2&&!b4)||(b1&&b2&&!r)||(b1&&b2&&b3);
    if2 = b2&&b3;
    if3 = (!b1&&b3&&b4)||(b3&&r&&b4)||(b2&&b3&&b4);
    if4 = (!b1&&b4)||(b4&&r)||(b3&&b4);
    
if((jc.getX()+e.getX() < min)&&(!isfilled[0][xp])&&(if0))	
{
	jc.setLocation(point[0][xp]);
}else if((jc.getX()+e.getX() < point[2][xp].x)&&(jc.getX()+e.getX() >= point[1][xp].x)&&(if1))
{
	jc.setLocation(point[1][xp]);
}else if((jc.getX()+e.getX() < point[3][xp].x)&&(jc.getX()+e.getX() >= point[2][xp].x)&&(if2))
{
	jc.setLocation(point[2][xp]);
}else if((jc.getX()+e.getX() < point[4][xp].x)&&(jc.getX()+e.getX() >= point[3][xp].x)&&(if3))
{
	jc.setLocation(point[3][xp]);
}else if((jc.getX()+e.getX() < point[5][xp].x)&&(jc.getX()+e.getX() >= point[4][xp].x)&&!isfilled[5][xp]&&(if4))
{
	jc.setLocation(point[4][xp]);
	}


     }

            });
            
            cars[12].addMouseMotionListener(new MouseMotionListener() {
				//grey_v
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        
				        
				        isFilled(12);
				        
				        
				       
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 3;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,if4,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        
				        if0 = (b1&&!b4)||(b1&&!up)||(b1&&b2);
				        if1 = (b1&&b2&&!b4)||(b1&&b2&&!up)||(b1&&b2&&b3);
				        if2 = b2&&b3;
				        if3 = (!b1&&b3&&b4)||(b3&&up&&b4)||(b2&&b3&&b4);
				        if4 = (!b1&&b4)||(b4&&up)||(b3&&b4);
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0)/**/)	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}else if((jc.getY()+e.getY() < point[xp][5].y)&&(jc.getY()+e.getY() >= point[xp][4].y)&&!isfilled[xp][5]&&(if4))
						{
							jc.setLocation(point[xp][4]);
						}
				        
				        
				        
					
				}
			});
            
            cars[14].addMouseMotionListener(new MouseMotionListener() {
				//LightBlue_v
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        
				        
				        isFilled(14);
				        
				        
				       
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 2;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,if4,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        
				        if0 = (b1&&!b4)||(b1&&!up)||(b1&&b2);
				        if1 = (b1&&b2&&!b4)||(b1&&b2&&!up)||(b1&&b2&&b3);
				        if2 = b2&&b3;
				        if3 = (!b1&&b3&&b4)||(b3&&up&&b4)||(b2&&b3&&b4);
				        if4 = (!b1&&b4)||(b4&&up)||(b3&&b4);
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0)/**/)	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}else if((jc.getY()+e.getY() < point[xp][5].y)&&(jc.getY()+e.getY() >= point[xp][4].y)&&!isfilled[xp][5]&&(if4))
						{
							jc.setLocation(point[xp][4]);
						}
				        
				     
					
				}
			});
            
            cars[16].addMouseMotionListener(new MouseMotionListener() {
				//Lime_v
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					
				        
				        
				        isFilled(16);
				        
				        
				        
				        JComponent jc = (JComponent)e.getSource();
					       
				        int xp = 4;
				        
				        boolean b1 = true;
				        boolean b2 = true;
				        boolean b3 = true;
				        boolean b4 = true;
				        
				        boolean if0,if1,if2,if3,if4,up = false;
				        
				       
				        if(MOVE_CURSOR > e.getY())
				        {
				        	up = true;
				        }else
				        {
				        	up = false;
				        }
				        System.out.println(up);
				        
				        
				        if(isfilled[xp][1])
				        	b1 = false;
		        	 
		        	    if(isfilled[xp][2])
				        	b2 = false;
				        
				        if(isfilled[xp][3])
				        	b3 = false;
				        
				        if(isfilled[xp][4])
				        	b4 = false;
				         
				        
				        if0 = (b1&&!b4)||(b1&&!up)||(b1&&b2);
				        if1 = (b1&&b2&&!b4)||(b1&&b2&&!up)||(b1&&b2&&b3);
				        if2 = b2&&b3;
				        if3 = (!b1&&b3&&b4)||(b3&&up&&b4)||(b2&&b3&&b4);
				        if4 = (!b1&&b4)||(b4&&up)||(b3&&b4);
				        
				        if((jc.getY()+e.getY() < min)&&(!isfilled[xp][0])&&(if0)/**/)	
						{
							jc.setLocation(point[xp][0]);
						}else if((jc.getY()+e.getY() < point[xp][2].y)&&(jc.getY()+e.getY() >= point[xp][1].y)&&(if1))
						{
							jc.setLocation(point[xp][1]);
						}else if((jc.getY()+e.getY() < point[xp][3].y)&&(jc.getY()+e.getY() >= point[xp][2].y)&&(if2))
						{
							jc.setLocation(point[xp][2]);
						}else if((jc.getY()+e.getY() < point[xp][4].y)&&(jc.getY()+e.getY() >= point[xp][3].y)&&(if3))
						{
							jc.setLocation(point[xp][3]);
						}else if((jc.getY()+e.getY() < point[xp][5].y)&&(jc.getY()+e.getY() >= point[xp][4].y)&&!isfilled[xp][5]&&(if4))
						{
							jc.setLocation(point[xp][4]);
						}
				        
				     
					
				}
			});

			//end level4
			
			
			
			getContentPane().setLayout(null);
			
			
			BG = new JLabel();
			BG.setBounds(5, 5, 538, 549);
			BG.setIcon(new ImageIcon("BG1.png"));
			getContentPane().add(BG);
			
			
			
			
			
            URL urlClick = Game.class.getResource("You-win-sound-effect-5.wav");
		    Won = Applet.newAudioClip(urlClick);
		    
			
			
				
			
			
			
	
			
			

			

			
			}//end the constructor
	
public void resetPoint()
{
	for(int i = 0;i <cars.length;i++)
		cars[i].setLocation(0,0);
	
}
	
	
public void isFilled(int index)
{
	
	for(int j =0;j<point.length;j++)
		for(int k =0;k<point.length;k++)
		   isfilled[j][k] = false;				
	
	for(int i = 0;i <cars.length;i++)
	{
		if(i == index)
		continue;
		
		//System.out.println(i);
		for(int j =0;j<point.length;j++)
		{//System.out.println(j);
			for(int k =0;k<point.length;k++)
			{//System.out.println(k);
				
				//isfilled[j][k] = false;
				
				if(cars[i].getLocation().equals(point[j][k]))
				{
					
					panelLevel.revalidate();
					panelLevel.repaint();
					validate();
					
					if(i>= 29)
					{
					       if(i%2 == 0)
					         {
						      isfilled[j][k] = true;
						      isfilled[j][k+1] = true;
						      isfilled[j][k+2] = true;
					         }else
					          {
					          	isfilled[j][k] = true;
						        isfilled[j+1][k] = true;
					         	isfilled[j+2][k] = true;
					          }
					}else
					  {
						if((i%2 == 0)&&(i != 0))
				         {
					      isfilled[j][k] = true;
					      isfilled[j][k+1] = true;
					      
				         }else
				          {
				          	isfilled[j][k] = true;
					        isfilled[j+1][k] = true;
				         	
				          }
					  }
						
					
				}
					//isfilled[j][k] = false;				
				
				//System.out.println("["+j+","+k+"]"+isfilled[j][k]);
				
			}
			}
	}
	
	
}


public static void main(String[] args) throws IOException {
	
		Game Frame = new Game();
	    //Frame.getContentPane().add(new JLabel(new ImageIcon(ImageIO.read(new File("card_mat.png")))));

		Frame.setSize(570,620);
		Frame.setLocationRelativeTo(null);
		Frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Frame.setResizable(false);
		Frame.setVisible(true);
	}
}//end Game class


//the width is 85 and height is 170 for vertical cars
// Width is 170 and height is 85 for Horizontal cars

//Width is 250 and Height is 100
//Width is 100 and Height is 250