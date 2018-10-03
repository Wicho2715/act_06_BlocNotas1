/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Models_bloc;
import views.Views_bloc;

public class Controllers_bloc  {
    private final Models_bloc models_bloc;
    private final Views_bloc views_bloc;
    
       public Controllers_bloc(Models_bloc models_bloc, Views_bloc views_bloc){
        this.models_bloc = models_bloc;
        this.views_bloc = views_bloc;
        views_bloc.JMI_Read.addActionListener((ActionListener) this);
        views_bloc.JMI_Write.addActionListener((ActionListener) this);
        initView();
    }
     
       
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==views_bloc.JMenu){
            models_bloc.setPath("C:\\Users\\LAB-1\\Documents\\NetBeansProjects\\archivo.wrm");
            models_bloc.readFile(models_bloc.getPath());      
            views_bloc.JTA_Txt.setText(models_bloc.getMessage());
        }else if(e.getSource()==views_bloc.JMI_Write){
            models_bloc.setPath("C:\\Users\\LAB-1\\Documents\\NetBeansProjects\\archivo.wrm");
            models_bloc.setMessage(views_bloc.JTA_Txt.getText());
            models_bloc.writeFile(models_bloc.getPath(), models_bloc.getMessage());
        }
    }
     private void initView() {
        views_bloc.setTitle("Block de notas");
        views_bloc.setResizable(false);
        views_bloc.setLocationRelativeTo(null);
        views_bloc.setVisible(true);
    }   
}
