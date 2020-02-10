/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapainteractivo;


import com.teamdev.jxmaps.MapReadyHandler;
import com.teamdev.jxmaps.MapStatus;
import com.teamdev.jxmaps.swing.MapView;
import javax.swing.JFrame;

public class MapaInteractivo extends MapView {   
 public MapaInteractivo (String nName){   //metodo constructor para trabajar con las librerias
  
  JFrame frame = new JFrame   (nName);//creamos JFrame para visualizar el mapa
   
   setOnMapReadyHandler(new MapReadyHandler() {

      @Override
      public void onMapReady(MapStatus status) {
          throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
      })
  
 }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
