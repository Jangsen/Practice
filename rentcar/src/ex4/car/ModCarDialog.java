package ex4.car;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class ModCarDialog  extends JDialog{
	JPanel jPanel;
	JLabel lCarNum,lCarName,lSize,lColor,lMaker;
	JTextField tfCarNum,tfCarName,tfSize,tfColor,tfMaker ;
    JButton btnMod;    
    Car carController;    
//    public ModCarDialog(String str){
//    	setTitle(str);
//    	init();
//    }    
    public ModCarDialog(String str, String carNo){
    	setTitle(str);
    	init(carNo);
    }    
    private void init(String carNo){
    	carController=new CarImpl();
    	lCarNum = new JLabel("차량번호");
    	lCarName = new JLabel("차량명");
    	lSize = new JLabel("배기량");
    	lColor = new JLabel("차색상");
    	lMaker = new JLabel("차제조사");    	
    	tfCarNum=new JTextField(carNo);
    	tfCarName=new JTextField(20);
    	tfSize=new JTextField(20);
    	tfColor=new JTextField(20);
    	tfMaker=new JTextField(20);    	
    	btnMod=new JButton("수정하기");    	
    	btnMod.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String carNum=tfCarNum.getText().trim();
				String carName=tfCarName.getText().trim();
				int carSize=Integer.parseInt(tfSize.getText().trim());
				String carColor=tfColor.getText().trim();
				String carMaker=tfMaker.getText().trim();				
				CarVo vo=new CarVo(carNum,carName,carColor,carSize,carMaker);
				try {
					carController.modCarInfo(vo);
					showMessage("차량을  수정했습니다.");
					tfCarNum.setText("");
					tfCarName.setText("");
					tfSize.setText("");
					tfColor.setText("");
					tfMaker.setText("");
					
				} catch (Exception e1) {
					e1.printStackTrace();
					showMessage("오류가 발생했습니다.\n다시 등록해 주세요.");
				}				
				//dispose();				
			}
        });    	
    	jPanel=new JPanel(new GridLayout(0,2));
    	jPanel.add(lCarNum);
    	jPanel.add(tfCarNum);
    	
    	jPanel.add(lCarName);
    	jPanel.add(tfCarName);
    	
    	jPanel.add(lSize);
    	jPanel.add(tfSize);
    	
    	jPanel.add(lColor);
    	jPanel.add(tfColor);
    	
    	jPanel.add(lMaker);
    	jPanel.add(tfMaker);
    	
    	add(jPanel,BorderLayout.NORTH);
    	add(btnMod,BorderLayout.SOUTH);
    	
        setLocation(400, 200);
        setSize(400,400);
        setModal(true); //항상 부모창 위에 보이게 한다.
        setVisible(true);
    }    
    private void showMessage(String msg){
    	JOptionPane.showMessageDialog(this,
    			msg, 
    			"메지지 박스",
               JOptionPane.INFORMATION_MESSAGE);
    }
}
