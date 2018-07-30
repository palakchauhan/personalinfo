import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class personalinfo extends JFrame
{
	JLabel namelabel,agelabel,dadlabel,momlabel,collegelabel,sapidlabel,genderlabel;
	JTextField nametext,agetext,dadtext,momtext,collegetext,sapidtext;
	JButton savebutton,displaybutton; 
        JRadioButton[] gender = new JRadioButton[2];
        
       
	
	
	public static void main(String[] args)
	{
            personalinfo personalinfo = new personalinfo();
	}
	public personalinfo()
	{
		setSize(400,400);
		setTitle("Personal Information");
		setLocationRelativeTo(null);
		
                String[]
                        sexTexts={"male ","female                                  "};
                
                
                for(int i=0;i<gender.length;i++)
                {
                    gender[i]=new JRadioButton(sexTexts[i]);
                }
                
                
            
		JPanel panel=new JPanel();
		
		namelabel=new JLabel("Enter Name:");
		agelabel=new JLabel("Enter Age:");
                genderlabel=new JLabel("                                 gender:");
                
		dadlabel=new JLabel("Enter Dad Name:");
		momlabel=new JLabel("Enter Mom Name:");
		collegelabel=new JLabel("Enter College Name:");
                sapidlabel=new JLabel("Enter SAP ID :");
		
		savebutton =new JButton("Save");
		displaybutton =new JButton("Display");
		ListenForButton b=new ListenForButton();
		savebutton.addActionListener(b);
		displaybutton.addActionListener(b);
						
		nametext=new JTextField("",30);		
		agetext=new JTextField("",30);
		dadtext=new JTextField("",30);
		momtext=new JTextField("",30);
		collegetext=new JTextField("",30);
                sapidtext=new JTextField("",30);
		
		panel.add(namelabel);
		panel.add(nametext);
		
		panel.add(agelabel);
		panel.add(agetext);
                
                panel.add(genderlabel);
                ButtonGroup gp4 = new ButtonGroup();
                for(JRadioButton gender1:gender)
                {
                gp4.add(gender1);
                panel.add(gender1);
                }
           
		panel.add(dadlabel);
		panel.add(dadtext);
		
		panel.add(momlabel);
		panel.add(momtext);
		
		panel.add(collegelabel);
		panel.add(collegetext);
		
                panel.add(sapidlabel);
		panel.add(sapidtext);

		panel.add(savebutton);
		panel.add(displaybutton);
						
		add(panel);
		setVisible(true);
	}
	private class ListenForButton implements ActionListener
	{
		String name,age,dadname,momname,collegename,sapid;
                @Override
		public void actionPerformed(ActionEvent e)
		{
			
			if(e.getSource()==savebutton)
			{
				
				name=nametext.getText();
				age=agetext.getText();
				dadname=dadtext.getText();
				momname=momtext.getText();
				collegename=collegetext.getText();
                                sapid=sapidtext.getText();
			}
			if(e.getSource()==displaybutton)
			{
				String display="Name:"+name+"\nAge"+age+"\nDad Name:"+dadname+"\nMom Name:"+momname+"\nCollege Name:"+collegename+"\nSAP ID:"+sapid;
				JOptionPane.showMessageDialog(personalinfo.this,display,"Information",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
