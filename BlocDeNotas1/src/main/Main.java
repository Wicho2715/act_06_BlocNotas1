/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import models.Models_bloc;
import views.Views_bloc;
import controllers.Controllers_bloc;
/**
 *
 * @author LAB-1
 */
public class Main {
    private static Models_bloc models_bloc;
    private static Views_bloc views_bloc;
    private static Controllers_bloc controllers_bloc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        models_bloc = new Models_bloc();
        views_bloc = new Views_bloc();
        controllers_bloc = new Controllers_bloc(models_bloc, views_bloc);
    }
    
}
