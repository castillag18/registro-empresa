/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.empresaController;
import java.util.ArrayList;
import model.empresa;

public class empresaController {

    empresa e1 = new empresa();
    ArrayList<empresa> lista_empresa = new ArrayList();

    public void create(empresa e1) {
        lista_empresa.add(e1);
    }

    public void update(empresa e1, int index) {
        lista_empresa.set(index, e1);
    }

    public empresa read(int index) {
        return lista_empresa.get(index);
    }

    public void delete(int index) {
        lista_empresa.remove(index);

    }

    public ArrayList<empresa> getLista_empresa() {
        return lista_empresa;
    }

    public void admintabla(javax.swing.JTable jTable1) {
        Object[][] matriz = new Object[lista_empresa.size()][4];
        for (int i = 0; i < lista_empresa.size(); i++) {

            matriz[i][0] = lista_empresa.get(i).getNombre();
            matriz[i][1] = lista_empresa.get(i).getServicio();
            matriz[i][2] = lista_empresa.get(i).getNit();
            matriz[i][3] = lista_empresa.get(i).getDireccion();

        }
        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Servicio", "NIT", "Direccion"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }
    }   
        
 
    public void tabla2 (javax.swing.JTable jTable2) {
        Object[][] matriz = new Object[lista_empresa.size()][4];
        for (int i = 0; i < lista_empresa.size(); i++) {
            
            matriz[i][0] = lista_empresa.get(i).getNombre();
            matriz[i][1] = lista_empresa.get(i).getServicio();
            matriz[i][2] = lista_empresa.get(i).getNit();
            matriz[i][3] = lista_empresa.get(i).getDireccion();
            
        }
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
               matriz,
                new String[]{
                    "Nombre", "Servicio", "Direccion", "NIT"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

       

        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }
        
    }



}
