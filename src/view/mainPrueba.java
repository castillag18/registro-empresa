/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.empresa;
import controller.empresaController;

public class mainPrueba {

    public static void main(String args[]) {

        //aqui hago instancia del controlador para hacer uso de sus metodos.
        empresaController emco = new empresaController();
        //aqui se crearon 4 empresas atravez del metodo create
        emco.create(new empresa("ath", "banco", "m4 lote 6 ", "1237894560"));
        emco.create(new empresa("carrefur", "super mercado", "manga", "0031648591"));
        emco.create(new empresa("futco", "universidad", "cuatro vientos", "1236548970"));
        emco.create(new empresa("fritos doña maria", "fritanga", "barrio españa", "1236555970"));
        //aqui mostramos con un ciclo los valores que estan en el array de empresas 
        for (int i = 0; i < emco.getLista_empresa().size(); i++) {
            System.out.println((i + 1) + ".)" + emco.read(i).getNombre());
        }
        //aqui actualizampos los valores de la empresa ubicada en el indice 1
        emco.update(new empresa("GMO", "Oftalmologia", "Bocagrande mz 20 lt 500", "5897416320"), 1);
        //aqui mostramos los valores actualizados de la tabla 
        System.out.println("===========================================");
        for (int i = 0; i < emco.getLista_empresa().size(); i++) {
            System.out.println((i + 1) + ".)" + emco.read(i).getNombre());
        }

        emco.delete(0);

        System.out.println("===========================================");
        for (int i = 0; i < emco.getLista_empresa().size(); i++) {
            System.out.println((i + 1) + ".)" + emco.read(i).getNombre());
        }

    }

}
