/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Rubén Hernández Hernández 5IM8
 */ 

public class Calcu extends JFrame implements ActionListener{
    private JLabel titulo;
    private JTextField field;
    private JButton n1;
    private JButton n2;
    private JButton n3;
    private JButton n4;
    private JButton n5;
    private JButton n6;
    private JButton n7;
    private JButton n8;
    private JButton n9;
    private JButton n0;
    private JButton np;
    private JPanel jp;
    private JButton conver;
    private JButton limp;
    
    
    public Calcu(){
        crearventana();
        inicializarcomponentes();
    }
    /** 
     *Aqui se crea la ventana 
     **/
    private void crearventana() {
       this.setVisible(true);
       this.setTitle("Convertidor de Persos a Dolares Con Swing");
       this.setSize(450,450);
       this.setLayout(null);
       this.setBackground(Color.gray);
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /** 
     *Aqui se inicializan los componentes como botones y cajas de texto
     **/
    private void inicializarcomponentes() {
        titulo = new JLabel();
        titulo.setText("Pesos a Dolar");
        titulo.setBounds(30,20,300,30);
        add(titulo);
        
        field= new JTextField();
        field.setBounds(20,70,400,50);
        add(field);
       
        n1= new JButton();
        n1.setText("1");
        n1.setBounds(20,160,50,50);
        add(n1);
        n1.addActionListener(this);
        
        n2= new JButton();
        n2.setText("2");
        n2.setBounds(80,160,50,50);
        add(n2);
        n2.addActionListener(this);
        
        n3= new JButton();
        n3.setText("3");
        n3.setBounds(140,160,50,50);
        add(n3);
        n3.addActionListener(this);
        
        n4= new JButton();
        n4.setText("4");
        n4.setBounds(20,220,50,50);
        add(n4);
        n4.addActionListener(this);
        
        n5= new JButton();
        n5.setText("5");
        n5.setBounds(80,220,50,50);
        add(n5);
        n5.addActionListener(this);
        
        n6= new JButton();
        n6.setText("6");
        n6.setBounds(140,220,50,50);
        add(n6);
        n6.addActionListener(this);
        
        n7= new JButton();
        n7.setText("7");
        n7.setBounds(20,280,50,50);
        add(n7);
        n7.addActionListener(this);
        
        n8= new JButton();
        n8.setText("8");
        n8.setBounds(80,280,50,50);
        add(n8);
        n8.addActionListener(this);
        
        n9= new JButton();
        n9.setText("9");
        n9.setBounds(140,280,50,50);
        add(n9);
        n9.addActionListener(this);
        
        n0= new JButton();
        n0.setText("0");
        n0.setBounds(20,340,50,50);
        add(n0);
        n0.addActionListener(this);
        
        np= new JButton();
        np.setText(".");
        np.setBounds(80,340,50,50);
        add(np);
        np.addActionListener(this);
        
        conver= new JButton();
        conver.setText("Convertir");
        conver.setBounds(300,160,100,50);
        conver.addActionListener(this);
        add(conver);
        
        limp= new JButton();
        limp.setText("Limpiar");
        limp.setBounds(300,240,100,50);
        limp.addActionListener(this);
        add(limp);
    }
    
    /** 
     * 
     * @param e Evento que se llama de botones
     **/
    //Se ejecutan los metodos
    @Override
    public void actionPerformed(ActionEvent e) {
        String text;
        double num;
        if(e.getSource()==n1){
            text=field.getText();
            field.setText(text+"1");
        }
        if(e.getSource()==n2){
            text=field.getText();
            field.setText(text+"2");
        }
        if(e.getSource()==n3){
            text=field.getText();
            field.setText(text+"3");
        }
        if(e.getSource()==n4){
            text=field.getText();
            field.setText(text+"4");
        }
        if(e.getSource()==n5){
            text=field.getText();
            field.setText(text+"5");
        }
        if(e.getSource()==n6){
            text=field.getText();
            field.setText(text+"6");
        }
        if(e.getSource()==n7){
            text=field.getText();
            field.setText(text+"7");
        }
        if(e.getSource()==n8){
            text=field.getText();
            field.setText(text+"8");
        }
        if(e.getSource()==n9){
            text=field.getText();
            field.setText(text+"9");
        }
        if(e.getSource()==n0){
            text=field.getText();
            field.setText(text+"0");
        }
        if(e.getSource()==np){
            text=field.getText();
            field.setText(text+".");
        }
        if(e.getSource()==limp){
            field.setText("");
        }
        if(e.getSource()==conver){
            text=field.getText();
            num=Double.parseDouble(text);
            field.setText("Dolares:"+(num/18.50));
        }
    }

    
    
    
}
